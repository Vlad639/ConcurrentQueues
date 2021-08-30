import java.math.BigInteger;

public class QueueFactorialTaker extends Thread{

    private BigInteger facrorail(int x){
        BigInteger result = new BigInteger("1");
        for (int i = 2; i <= x; i++) {
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }
        return result;
    }

    public void run() {
        try{
            while(true) {
                int taked = Store.blockingDeque.take();
                System.out.println(taked+"! = "+facrorail(taked));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
