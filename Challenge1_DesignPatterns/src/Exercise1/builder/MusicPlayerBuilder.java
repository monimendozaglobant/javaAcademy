package Exercise1.builder;

import Exercise1.components.BatteryDuration;
import Exercise1.components.Color;
import Exercise1.components.StorageCapacity;
import Exercise1.product.MusicPlayer;

public class MusicPlayerBuilder implements Builder{

    private Color color;
    private StorageCapacity storageCapacity;
    private BatteryDuration batteryDuration;

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setStorageCapacity(StorageCapacity storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void setBatteryDuration(BatteryDuration batteryDuration) {
        this.batteryDuration = batteryDuration;
    }

    public MusicPlayer getResult() {
        return new MusicPlayer(color, storageCapacity, batteryDuration);
    }
}
