package less3.locker;

import java.util.concurrent.locks.ReentrantLock;

public class SaveCounter implements Runnable {

    private ReentrantLock lock;
    private ValueCounted value;

    public SaveCounter(ReentrantLock lock, ValueCounted value) {
        this.lock = lock;
        this.value = value;
    }

    @Override
    public void run() {

        try {
            while (true) {
                lock.lock();
                value.x++;
                System.out.println(Thread.currentThread().getName() + ": " + value.x);
                lock.unlock();
                Thread.sleep(300);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
