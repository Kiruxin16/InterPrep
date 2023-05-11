package less3.locker;

import java.util.concurrent.locks.ReentrantLock;

public class TestCounter {
    public static void main(String[] args) {
        ReentrantLock lock =new ReentrantLock();
        ValueCounted counted = new ValueCounted();
        for (int i = 0; i < 4; i++) {
            Thread thread=new Thread(new SaveCounter(lock,counted));
            thread.setName("Tread "+(i+1));
            thread.start();
        }
    }


}
