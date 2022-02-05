package Exercise1.components;

public class BatteryDuration {
    private int duration;

    public BatteryDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "BatteryDuration{" +
                "duration=" + duration +
                "Hours}";
    }
}
