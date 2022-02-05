package Exercise1.product;

import Exercise1.components.BatteryDuration;
import Exercise1.components.Color;
import Exercise1.components.StorageCapacity;

public class MusicPlayer {
    private final Color color;
    private final StorageCapacity storageCapacity;
    private final BatteryDuration batteryDuration;

    public MusicPlayer(Color color, StorageCapacity storageCapacity, BatteryDuration batteryDuration) {
        this.color = color;
        this.storageCapacity = storageCapacity;
        this.batteryDuration = batteryDuration;
    }

    public Color getColor() {
        return color;
    }

    public StorageCapacity getStorageCapacity() {
        return storageCapacity;
    }

    public BatteryDuration getBatteryDuration() {
        return batteryDuration;
    }
}
