package practice2;
import java.util.Scanner;

public class Time {
    public int hours;
    public int minutes;
    public int seconds;

    public Time(int hours, int minutes, int seconds) {

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        
        if (this.hours < 0 || this.hours >= 24) {
            this.hours += 24;
            this.hours %= 24;
        }

        
        if (this.minutes < 0 || this.minutes >= 60) {
            this.minutes += 60;
            this.minutes %= 60;
        }

       
        if (this.seconds < 0 || this.seconds >= 60) {
            this.seconds += 60;
            this.seconds %= 60;
        }
    }

    public String toReadable() {
        StringBuilder res = new StringBuilder();

        if (hours < 10) res.append("0");
        res.append(hours).append(":");

        if (minutes < 10) res.append("0");
        res.append(minutes).append(":");

        if (seconds < 10) res.append("0");
        res.append(seconds);

        return res.toString();
    }

    public String toUniversal() {
        return toReadable();
    }

    public String toStandard() {
        int h = hours;   
        String period;

        if (h >= 12) {
            period = " PM";
        } else {
            period = " AM";
        }

        if (h == 0) {
            h = 12;
        } else if (h > 12) {
            h -= 12;
        }

        StringBuilder res = new StringBuilder();

        if (h < 10) res.append("0");
        res.append(h).append(":");

        if (minutes < 10) res.append("0");
        res.append(minutes).append(":");

        if (seconds < 10) res.append("0");
        res.append(seconds);

        res.append(period);

        return res.toString();
    }

    public void add(Time t) {
        seconds += t.seconds;
        minutes += t.minutes + seconds / 60;
        hours += t.hours + minutes / 60;

        seconds %= 60;
        minutes %= 60;
        hours %= 24;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int h = in.nextInt();

        System.out.print("Enter minutes: ");
        int m = in.nextInt();

        System.out.print("Enter seconds: ");
        int s = in.nextInt();

        Time time = new Time(h, m, s);

        System.out.println(time.toUniversal());
        System.out.println(time.toStandard());

        Time t2 = new Time(4, 24, 33);
        time.add(t2);

        System.out.println(time.toUniversal());
    }
}
