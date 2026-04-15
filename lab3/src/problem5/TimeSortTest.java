package problem5;

public class TimeSortTest {
    public static void main(String[] args) {
        Time[] times = {
            new Time(15, 30, 0),
            new Time(9, 15, 45),
            new Time(15, 10, 30),
            new Time(12, 0, 0)
        };

        System.out.println("До сортировки: " + java.util.Arrays.toString(times));

        Sort.mergeSort(times);

        System.out.println("После сортировки: " + java.util.Arrays.toString(times));
    }
}
