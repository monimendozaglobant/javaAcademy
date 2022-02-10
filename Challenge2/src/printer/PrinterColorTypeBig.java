package printer;

public class PrinterColorTypeBig implements PrinterColor{

    private String name;
    private String type;

    @Override
    public void print() {
        System.out.println("Print in Black and White in a Big Colour Printer!!!! ...............");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
