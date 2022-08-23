import java.time.LocalDate;

public class Loops {
    public static void main(String[] args) {

        System.out.println("\nTask 1:");
        task1();

        System.out.println("\nTask 2:");
        task2();

        System.out.println("\nTask 3:");
        task3();

        System.out.println("\nTask 4:");
        task4();

        System.out.println("\nTask 5:");
        task5();
    }

    private static void task1() {
        int  i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task2() {
        int friday = (int) (Math.random() * 8);

        while (friday <= 31) {
            System.out.println("Today is friday the " + friday + "th. Need to prepare a report.");
            friday += 7;
        }
    }

    private static void task3() {
        int lastYear = LocalDate.now().getYear() - 200;

        while (true) {
            if (lastYear%79 == 0) {
                break;
            } else {
                lastYear++;
            }
        }

        while (lastYear <= LocalDate.now().getYear()+100) {
            System.out.println(lastYear);
            lastYear += 79;
        }
    }

    private static void task4() {
        for (int i = 1; i < 31; i++) {
            System.out.print(i + ":");

            if (i % 3 == 0) {
                System.out.print(" ping");
            }
            if (i % 5 == 0) {
                System.out.print(" pong");
            }

            System.out.println();
        }
    }

    private static void task5() {
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second);

        for (int i = 1; i < 9; i++) {
            if (first > second) {
                second += first;
                System.out.print(" " + second);
            } else {
                first += second;
                System.out.print(" " + first);
            }
        }
    }
}