package service;

import printer.Printer;
import printer.PrinterBlackAndWhite;
import printer.PrinterColor;
import printer.PrinterColorTypeCompact;

import java.util.ArrayList;
import java.util.List;

public class PrinterService {

    List<Printer> printersAvailable;

    public PrinterService(List<Printer> printersAvailable) {
        this.printersAvailable = printersAvailable;
    }

    public void printPrintersAvailable() {
        List<PrinterBlackAndWhite> printersBWAvailable = new ArrayList<>();
        List<PrinterColor> printersColourAvailable = new ArrayList<>();

        for (Printer printer:printersAvailable) {
            if (printer instanceof PrinterBlackAndWhite) {
                printersBWAvailable.add((PrinterBlackAndWhite) printer);
            } else if (printer instanceof PrinterColor) {
                printersColourAvailable.add((PrinterColor) printer);
            }
        }

        System.out.println("Black and White printers available: " + printersBWAvailable.size());
        for (PrinterBlackAndWhite printer:printersBWAvailable) {
            System.out.println("name: " + printer.getName());
        }

        System.out.println("Color printers available: " + printersColourAvailable.size());
        for (PrinterColor printer:printersColourAvailable) {
            System.out.println("name: " + printer.getName());
            System.out.println("type: " + printer.getType());
        }
    }

    public void callPrinter(String name) {
        boolean printerFound = false;
        for (Printer printer:printersAvailable) {
            if (printer.getName().equals(name)){
                printer.print();
                printerFound = true;
                break;
            }
        }

        if (! printerFound) {
            System.out.println("This Printer:" + name + " does not exists");
        }
    }
}
