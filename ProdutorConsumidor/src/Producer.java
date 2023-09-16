import javax.swing.plaf.TableHeaderUI;
import java.util.Random;

public class Producer  extends Thread{
    private Buffer buffer;

    public Producer(Buffer buffer){
        this.buffer = buffer;

    }

    private static Random random = new Random();

    public void run(){
        while(true){
            int value = Math.abs(random.nextInt()) % 1000;
            buffer.produce(value);
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }

}
