package Exercise1.components;

public class StorageCapacity {
    private int capacity;

    public StorageCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "StorageCapacity{" +
                "capacity=" + capacity +
                "GB}";
    }
}
