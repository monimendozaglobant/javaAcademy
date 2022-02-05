package Exercise1;

import Exercise1.builder.MusicPlayerBuilder;
import Exercise1.director.Director;
import Exercise1.product.MusicPlayer;

public class Principal {
    public static void main(String[] args) {
        String color = "Blue";
        int batteryDuration = 5;
        int storageCapacity = 8;

        Director director = new Director();
        MusicPlayerBuilder musicPlayerBuilder = new MusicPlayerBuilder();

        if (color.equals("Blue")) {
            if (storageCapacity == 8) {
                if (batteryDuration == 5) {
                    director.constructMPBlueSmallStorageSmallBattery(musicPlayerBuilder);
                }else {
                    director.constructMPBlueSmallStorageBigBattery(musicPlayerBuilder);
                }
            }else {
                if (batteryDuration == 5) {
                    director.constructMPBlueLongStorageSmallBattery(musicPlayerBuilder);
                }else {
                    director.constructMPBlueLongStorageBigBattery(musicPlayerBuilder);
                }
            }
        } else if(color.equals("Greeen")) {
            if (storageCapacity == 8) {
                if (batteryDuration == 5) {
                    director.constructMPGreenSmallStorageSmallBattery(musicPlayerBuilder);
                }else {
                    director.constructMPGreenSmallStorageBigBattery(musicPlayerBuilder);
                }
            }else {
                if (batteryDuration == 5) {
                    director.constructMPGreenLongStorageSmallBattery(musicPlayerBuilder);
                }else {
                    director.constructMPGreenLongStorageBigBattery(musicPlayerBuilder);
                }
            }
        }

        MusicPlayer musicPlayer = musicPlayerBuilder.getResult();
        if (musicPlayer.getColor() != null) {
            System.out.println(musicPlayer.getColor().toString() + musicPlayer.getBatteryDuration().toString() + musicPlayer.getStorageCapacity().toString());
        } else {
            System.out.println("ingress a valid value");
        }

    }
}
