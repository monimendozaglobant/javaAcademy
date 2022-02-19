package challenge2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Principal {

    public static String passwordCracker(List<String> passwords, String loginAttempt) {
        return "";

    }


    public static class Solution {
        public static void main(String[] args) throws IOException {

            String fileName = "src/inputChallengePC.txt";


            try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
                List<String> list = stream
                        .map(line -> line.replaceAll("\\s+$", ""))
                        .map(line -> line.toLowerCase())
                        .collect(Collectors.toList());

                int n = Integer.parseInt(list.get(0));
                list.remove(0);
                int listSize = list.size();
                int partSize = listSize / n;

                List<List<String>> listOfList =
                        IntStream.range(0, n)
                                .mapToObj(index -> list.subList(index * partSize, (index + 1) * partSize)).collect(Collectors.toList());


                for (List<String> subList:listOfList) {
                    Object number = subList.get(0);
                    Set<String> passwords = Arrays.asList(subList.get(1).split(" ")).stream().collect(Collectors.toSet());
                    String loginAttempt = subList.get(2);
                    Map<String,Boolean> map = new HashMap<String,Boolean>();
                    String path = "";

                    boolean result = passwordCracker(map, loginAttempt, passwords, path);

                    if (!result){
                        System.out.println("WRONG PASSWORD");
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean passwordCracker(Map<String,Boolean> map, String loginAttempt, Set<String> passwords, String path){

        if (loginAttempt.length() == 0 || loginAttempt == null){
            System.out.println(path.trim());
            return true;
        }

        if (map.containsKey(loginAttempt)){
            return map.get(loginAttempt);
        }

        List<String> passwordsFiltered = passwords.stream()
                .filter(word -> loginAttempt.startsWith(word))
                .collect(toList());

        for(String word : passwordsFiltered){
            if (passwordCracker(map, loginAttempt.substring(word.length()),passwords,path + word + " ")){
                map.put(loginAttempt,true);
                return true;
            }
        }

        map.put(loginAttempt,false);

        return false;
    }
}