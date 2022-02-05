package challenge0.process;

import java.util.Random;

public class Process {

    Random r = new Random();
    public int id;
    public int memorySize;
    public String name;
    public char type;

    public Process(String command, int id) {
        char processType = command.charAt(1);

        if (processType == 's') {
            this.memorySize = r.nextInt(15-5) + 5;
        }else if (processType == 'a') {
            this.memorySize = r.nextInt(20-10) + 10;
        }
        this.name = processType + String.format("%03d", id);;
        this.id = id;
        this.type = processType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
