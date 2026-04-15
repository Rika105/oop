package problem5;

public class Time implements Comparable<Time> {
    public int hours;
    public int minutes;
    public int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = ((hours % 24) + 24) % 24;
        this.minutes = ((minutes % 60) + 60) % 60;
        this.seconds = ((seconds % 60) + 60) % 60;
    }
    @Override
    public int compareTo(Time other) {
        if (this.hours != other.hours) {
            return Integer.compare(this.hours, other.hours);
        }
        if (this.minutes != other.minutes) {
            return Integer.compare(this.minutes, other.minutes);
        }
        return Integer.compare(this.seconds, other.seconds);
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    @Override
    public String toString() {
        return toUniversal();
    }
}
