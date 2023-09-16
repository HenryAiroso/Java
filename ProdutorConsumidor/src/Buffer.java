import java.util.LinkedList;
import java.util.Queue;

public class Buffer {

    private final Queue<Integer> queue;
    private final int capacity;

    public Buffer(int capacity){
        this.capacity = capacity;
        queue = new LinkedList<>();

    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public boolean isFull(){
        return queue.size() == capacity;
    }

    public void produce(int value){
        if(isFull()){
         System.out.println("Buffer Cheio - Aguardando");
        }
        while (isFull()) {
            try {
                Thread.sleep(10);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("Produzindo " + value);
        queue.offer(value);

    }

    public int consume(){
        if(isEmpty()){
            System.out.println("Buffer Vazio - Aguardando");
        }
        while (isEmpty()) {
            try {
                Thread.sleep(10);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        int value = queue.poll();
        System.out.println("Consumindo " + value);
        return value;
    }


}
