package Exercise1.director;

import Exercise1.builder.Builder;
import Exercise1.components.BatteryDuration;
import Exercise1.components.Color;
import Exercise1.components.StorageCapacity;

public class Director {

    public void constructMPBlueLongStorageBigBattery(Builder builder) {
        Color color = new Color("Blue");
        StorageCapacity storageCapacity = new StorageCapacity(16);
        BatteryDuration batteryDuration = new BatteryDuration(8);
        builder.setColor(color);
        builder.setStorageCapacity(storageCapacity);
        builder.setBatteryDuration(batteryDuration);
    }

    public void constructMPBlueLongStorageSmallBattery(Builder builder) {
        Color color = new Color("Blue");
        StorageCapacity storageCapacity = new StorageCapacity(16);
        BatteryDuration batteryDuration = new BatteryDuration(5);
        builder.setColor(color);
        builder.setStorageCapacity(storageCapacity);
        builder.setBatteryDuration(batteryDuration);
    }

    public void constructMPBlueSmallStorageBigBattery(Builder builder) {
        Color color = new Color("Blue");
        StorageCapacity storageCapacity = new StorageCapacity(8);
        BatteryDuration batteryDuration = new BatteryDuration(8);
        builder.setColor(color);
        builder.setStorageCapacity(storageCapacity);
        builder.setBatteryDuration(batteryDuration);
    }

    public void constructMPBlueSmallStorageSmallBattery(Builder builder) {
        Color color = new Color("Blue");
        StorageCapacity storageCapacity = new StorageCapacity(8);
        BatteryDuration batteryDuration = new BatteryDuration(5);
        builder.setColor(color);
        builder.setStorageCapacity(storageCapacity);
        builder.setBatteryDuration(batteryDuration);
    }
    public void constructMPGreenLongStorageBigBattery(Builder builder) {
        Color color = new Color("Green");
        StorageCapacity storageCapacity = new StorageCapacity(16);
        BatteryDuration batteryDuration = new BatteryDuration(8);
        builder.setColor(color);
        builder.setStorageCapacity(storageCapacity);
        builder.setBatteryDuration(batteryDuration);
    }

    public void constructMPGreenLongStorageSmallBattery(Builder builder) {
        Color color = new Color("Green");
        StorageCapacity storageCapacity = new StorageCapacity(16);
        BatteryDuration batteryDuration = new BatteryDuration(5);
        builder.setColor(color);
        builder.setStorageCapacity(storageCapacity);
        builder.setBatteryDuration(batteryDuration);
    }

    public void constructMPGreenSmallStorageBigBattery(Builder builder) {
        Color color = new Color("Green");
        StorageCapacity storageCapacity = new StorageCapacity(8);
        BatteryDuration batteryDuration = new BatteryDuration(8);
        builder.setColor(color);
        builder.setStorageCapacity(storageCapacity);
        builder.setBatteryDuration(batteryDuration);
    }

    public void constructMPGreenSmallStorageSmallBattery(Builder builder) {
        Color color = new Color("Green");
        StorageCapacity storageCapacity = new StorageCapacity(8);
        BatteryDuration batteryDuration = new BatteryDuration(5);
        builder.setColor(color);
        builder.setStorageCapacity(storageCapacity);
        builder.setBatteryDuration(batteryDuration);
    }
}
