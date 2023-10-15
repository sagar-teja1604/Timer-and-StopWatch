
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Timer and 2 for Stopwatch: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter the number of seconds: ");
            int seconds = scanner.nextInt();
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Time's up!");
                }
            };
            timer.schedule(task, seconds * 1000);
        } else if (choice == 2) {
            Stopwatch stopwatch = new Stopwatch();
            System.out.println("Stopwatch started. Press enter to stop.");
            scanner.nextLine();
            stopwatch.stop();
            System.out.println("Elapsed time: " + stopwatch.getElapsedTime() + " seconds");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

class Stopwatch {
    private long startTime;
    private long stopTime;
    private boolean running;

    public Stopwatch() {
        this.startTime = 0;
        this.stopTime = 0;
        this.running = false;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }

    public long getElapsedTime() {
        long elapsed;
        if (this.running) {
            elapsed = (System.currentTimeMillis() - this.startTime) / 1000;
        } else {
            elapsed = (this.stopTime - this.startTime) / 1000;
        }
        return time;
    }
}
