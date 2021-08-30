public class Main {
    private static int putters = 10;
    private static int takers = 1;
    private static QueueRandPutter[] queueRandPutters = new QueueRandPutter[putters];
    private static QueueFactorialTaker[] queueFactorialTakers = new QueueFactorialTaker[takers];

    private static void fillPuttersAndTakersArrays(){
        for (int i = 0; i < putters; i++) {
            queueRandPutters[i] = new QueueRandPutter();
            queueRandPutters[i].setDaemon(true);
        }

        for (int i = 0; i < takers; i++) {
            queueFactorialTakers[i] = new QueueFactorialTaker();
            queueFactorialTakers[i].setDaemon(true);
        }
    }

    private static void startPuttersAndTakers(){
        for (QueueRandPutter elem: queueRandPutters)
            elem.start();

        for (QueueFactorialTaker elem:queueFactorialTakers)
            elem.start();
    }


    public static void main(String[] args) throws InterruptedException {
        fillPuttersAndTakersArrays();
        startPuttersAndTakers();
        Thread.sleep(5000);

    }
}
