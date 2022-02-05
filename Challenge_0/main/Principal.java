package challenge0.main;

import challenge0.exception.MemoryOverflowException;
import challenge0.process.Process;

import java.util.*;

public class Principal {


    public static List<Process> memoryList = new ArrayList<>();
    public static int id = 0;

    public static void main(String[] args) {

        fillNullMemory();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("++ Input your command ");
            System.out.println("** c to create plus  a:application or s:system ---- Example ca to create an application process");
            System.out.println("** d to delete ---- plus processId ---- Example d0 to delete process with id 0\"");
            String inputCommand = scanner.nextLine().toLowerCase();

            if (validateInput(inputCommand)) continue;

            if (inputCommand.charAt(0) == 'c' && inputCommand.length() == 2 ) {
                Process newProcess = createProcess(inputCommand);
                try {
                    insertProcess(newProcess);
                    printMemoryState();
                } catch (MemoryOverflowException e) {
                    System.out.println(e.getMessage());
                }
            }

            if (inputCommand.charAt(0) == 'd') {
                String possibleId = inputCommand.substring(1);
                try{
                    int idProcessToDelete = Integer.parseInt(possibleId);
                    boolean processNotRemoved = removeProcess(idProcessToDelete);
                    if (processNotRemoved) {
                        System.out.println("This idProcess does not exist");
                        continue;
                    }
                    System.out.println("******* Memory After to delete and before to Reorganize ************");
                    printMemoryState();
                    reOrderMemoryList();
                    System.out.println("\n****** Memory Before to reorganize *******************************");
                    printMemoryState();
                }
                catch (NumberFormatException ex){
                    System.out.println("Please insert a valid id process to delete: have to be a Number --- your insert was: " + possibleId);
                    continue;
                }
            }

            System.out.println("insert a valid command");
        }
    }

    private static boolean validateInput(String inputCommand) {
        if (inputCommand.length() <= 1 || (inputCommand.charAt(0) != 'c' && inputCommand.charAt(0) != 'd')) {
            System.out.println("Please insert a valid operation: c or d --- your insert was: " + inputCommand.charAt(0));
            return true;
        }

        if (inputCommand.charAt(0) == 'c' && ((inputCommand.charAt(1) != 's' && inputCommand.charAt(1) != 'a'))) {
            System.out.println("Please insert a valid process to create: a or s --- your insert was: " + inputCommand.charAt(1));
            return true;
        }
        return false;
    }

    private static void fillNullMemory() {
        for (int i = 0; i < 200; i++) {
            memoryList.add(i, null);
        }
    }

    private static Process createProcess(String typeProcess) {
        Process processToInsert =  new Process(typeProcess, id);
        id++;
        return processToInsert;
    }

    public static boolean existSpace(int needMemorySize) {
        int freeBlockSpace = Collections.frequency(memoryList, null);
        System.out.println("Free block: " + freeBlockSpace);
        return freeBlockSpace >= needMemorySize;
    }

    public static void insertProcess(Process process) throws MemoryOverflowException {
        boolean spaceAvailable = existSpace(process.memorySize);
        if (spaceAvailable) {
            int initPosition = memoryList.indexOf(null);
            int endPosition = initPosition + process.memorySize;
            for (int i = initPosition; i < endPosition ; i++) {
                memoryList.set(i, process);
            }
        } else {
            throw new MemoryOverflowException("No Memory available : " + process.getName() );
        }
    }

    public static boolean removeProcess(int idProcessToRemove)  {
        boolean idNotFound = true;
        for (int i = 0; i < memoryList.size(); i++) {
            if (memoryList.get(i) != null && memoryList.get(i).getId() == idProcessToRemove) {
                memoryList.set(i, null);
                idNotFound = false;
            }
        }

        return idNotFound;
    }

    public static void reOrderMemoryList() {
        if (Collections.frequency(memoryList, null) < 200){
            List<Process> memoryListAux = new ArrayList<>();
            for (Process processInMemory:memoryList) {
                if (processInMemory != null) {
                    memoryListAux.add(processInMemory);
                }
            }
            if (memoryListAux.size() > 0) {
                fillNullMemory();
                for (int i = 0; i < 200; i++) {
                    try {
                        memoryList.add(i, memoryListAux.get(i));
                    }catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        break;
                    }
                }
            }
        }
    }

    public static void printMemoryState() {
        String[][] memoryPrint = new String[20][10];
        int indexMemoryList = 0;
        for (int i = 0; i < memoryPrint.length; i++) {
            for (int j = 0; j < memoryPrint[0].length ; j++) {
                Process processInMemoryList = memoryList.get(indexMemoryList);
                if (processInMemoryList == null) {
                    memoryPrint[i][j] = "****";
                }
                else {
                    memoryPrint[i][j] = processInMemoryList.getName();
                }
                indexMemoryList++;
            }
        }

        for (int i = 0; i < memoryPrint.length; i++) {
            for (int j = 0; j < memoryPrint[0].length ; j++) {
                System.out.print(memoryPrint[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
