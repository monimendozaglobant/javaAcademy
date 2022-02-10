import printer.*;
import service.PrinterService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        PrinterBlackAndWhite printerOne = new PrinterBlackAndWhite();
        printerOne.setName("PrinterOneBW");

        PrinterColor printerTwo = new PrinterColorTypeCompact();
        printerTwo.setName("PrinterTwoColour");
        printerTwo.setType("Compact");

        PrinterColor printerThree = new PrinterColorTypeBig();
        printerThree.setName("PrinterThreeColour");
        printerThree.setType("Big");

        List<Printer> printerList = new ArrayList<>();
        printerList.add(printerOne);
        printerList.add(printerTwo);
        printerList.add(printerThree);

        Scanner scanner = new Scanner(System.in);
        PrinterService printerService = new PrinterService(printerList);

        System.out.println("Printers Available:     ");
        printerService.printPrintersAvailable();

        System.out.println("Enter the name of printer that you want use");

        String printerName = scanner.nextLine();
        printerService.callPrinter(printerName);

    }
}
