import java.time.LocalDateTime;
import java.util.Date;

public class DataOfCustomers extends Thread {
    public void run() {

        LocalDateTime start = LocalDateTime.now();

        start = start.plusMinutes(1);

        int i;
        for (; ; ) {
            for (i = 0; i < 3; i++) {
                try {
                    Thread.sleep(5000);

                } catch (
                        InterruptedException e) {
                    throw new RuntimeException(e);
                }

                int randomNumber3;
                String name = "APPL";
                randomNumber3 = (int) (Math.random() * 2);

                if (randomNumber3 == 0) {
                    System.out.println("The purchase attempt of " + name + " was unsuccessful for Alice");
                } else {
                    System.out.println("The purchase attempt was successful" + "," + "Alice bought 10 shares of " + name);
                }

                String name1 = "COKE";
                if (randomNumber3 == 0) {
                    System.out.println("The purchase attempt of " + name1 + " was unsuccessful for Alice");
                } else {
                    System.out.println("The purchase attempt was successful" + "," + "Alice bought 20 shares of " + name1);
                }

                int randomNumber4;
                randomNumber4 = (int) (Math.random() * 2);

                if (randomNumber4 == 0) {
                    System.out.println("The purchase attempt of " + name + " was unsuccessful for Bob");
                } else {
                    System.out.println("The purchase attempt was successful" + "," + "Bob bought 10 shares of " + name);
                }

                String name2 = "IBM";
                if (randomNumber4 == 0) {
                    System.out.println("The purchase attempt of " + name2 + " was unsuccessful for Bob");
                } else {
                    System.out.println("The purchase attempt was successful" + "," + "Bob bought 20 shares of " + name2);
                }


                int randomNumber5;
                randomNumber5 = (int) (Math.random() * 2);

                if (randomNumber5 == 0) {
                    System.out.println("The purchase attempt of " + name1 + " was unsuccessful for Charlie");
                } else {
                    System.out.println("The purchase attempt was successful" + "," + "Charlie bought 300 shares of " + name2);
                }

                LocalDateTime end = LocalDateTime.now();

                if (end.isAfter(start)) {
                    interrupt();
                }
            }
        }
    }
}
