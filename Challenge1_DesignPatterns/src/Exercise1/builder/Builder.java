package Exercise1.builder;

import Exercise1.components.BatteryDuration;
import Exercise1.components.Color;
import Exercise1.components.StorageCapacity;

public interface Builder {
    void setColor(Color color);
    void setStorageCapacity(StorageCapacity storageCapacity);
    void setBatteryDuration(BatteryDuration batteryDuration);
}
