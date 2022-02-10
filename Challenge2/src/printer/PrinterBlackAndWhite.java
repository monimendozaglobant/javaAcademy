package printer;

public class PrinterBlackAndWhite implements Printer{

    private String name;

    @Override
    public void print() {
        System.out.println("Print in Black and White in a Black and White Printer!!!! ...............");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}