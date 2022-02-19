package challenge1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {

        String fileName = "src/lines.txt";

        List<Double> lines = readFile(fileName);
        if ( !lines.isEmpty()) {
            Double N =  lines.get(0);
            if (1 <= N || N <= 50 ) {
                IntStream.range(0, lines.size()).filter(i -> i != 0)
                        .filter(j -> -20.00 <= lines.get(j) && lines.get(j) <= 20.00 )
                        .forEach(x -> exponential(lines.get(x)));

            } else {
                System.out.println("N is out of range");
            }
        } else {
            System.out.println("No lines to read");
        }

    }

    static void exponential(double x)
    {
        // Expansion for the first 10 terms.
        var result =  IntStream.range(0, 10).asDoubleStream()
                .map(i -> 10 - i)
                .reduce(0, (subtotal, element) -> 1 + ( x * (subtotal/element) ));


        System.out.println("e^"+ x +" = " + result);
    }

    static List<Double> readFile(String fileName) {
        List<Double> list = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            list = stream.
                    map(s -> Double.parseDouble(s)).
                    collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

}
