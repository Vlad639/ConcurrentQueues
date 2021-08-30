public class QueueRandPutter extends Thread{

    private int randValue(){
        int min = 0;
        int max = 50;
        return (int)(min + Math.random() * max);
    }

    public void run() {
        try{
            while (true)
                Store.blockingDeque.put(randValue());

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
