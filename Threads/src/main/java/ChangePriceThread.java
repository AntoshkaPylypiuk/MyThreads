import java.time.LocalDateTime;

public class ChangePriceThread extends Thread {

    public void run() {
        LocalDateTime timeOfStart = LocalDateTime.now();
        timeOfStart = timeOfStart.plusMinutes(1);

        int i;
        for (; ; ) {
            for (i = 0; i < 3; i++) {

                int priceAfterChange;
                int priceAfterChange1;
                int priceAfterChange2;


                try {
                    Thread.sleep(30000);

                } catch (
                        InterruptedException e) {
                    throw new RuntimeException(e);
                }

                int randomNumber;
                randomNumber = (int) (Math.random() * 2);

                if (randomNumber == 0) {
                    int price = 141;
                    priceAfterChange = (int) (price + 4.23);
                } else {
                    int price = 141;
                    priceAfterChange = (int) (price - 4.23);
                }

                int randomNumber1;
                randomNumber1 = (int) (Math.random() * 2);

                if (randomNumber1 == 0) {
                    int price1 = 387;
                    priceAfterChange1 = (int) (price1 + 11.61);
                } else {
                    int price1 = 387;
                    priceAfterChange1 = (int) (price1 - 11.61);
                }

                int randomNumber2;
                randomNumber2 = (int) (Math.random() * 2);

                if (randomNumber2 == 0) {
                    int price1 = 137;
                    priceAfterChange2 = (int) (price1 + 4.23);
                } else {
                    int price1 = 137;
                    priceAfterChange2 = (int) (price1 - 4.23);
                }

                System.out.println("The current price of COKE : " + priceAfterChange1 + "," + timeOfStart);
                System.out.println("The current price of APPL : " + priceAfterChange + "," + timeOfStart);
                System.out.println("The current price of IBM : " + priceAfterChange2 + "," + timeOfStart);

                LocalDateTime timeOfEnd = LocalDateTime.now();

                if (timeOfEnd.isAfter(timeOfStart)) {
                    interrupt();
                }
            }
        }
    }
}
