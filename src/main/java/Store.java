import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Store {
    private static final int queueSize = 1000;
    public static BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>(queueSize);
}
