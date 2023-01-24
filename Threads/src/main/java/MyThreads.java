class MyThreads  {

    public static void main(String[] args) {

        ChangePriceThread changePriceThread = new ChangePriceThread();
        changePriceThread.start();

        if (changePriceThread.interrupted()) {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        DataOfCustomers dataOfCustomers = new DataOfCustomers();
        dataOfCustomers.start();

        if (DataOfCustomers.interrupted()) {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}