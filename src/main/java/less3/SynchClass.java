package less3;

public class SynchClass {



    private Object monitor = new Object();

    public void makePing() throws InterruptedException {
        synchronized (monitor){
            while (true){
                System.out.println("Ping");
                monitor.notify();
                monitor.wait();
            }

        }
    }

    public void makePong() throws InterruptedException {
        synchronized (monitor){
            while (true){
                System.out.println("Pong");
                monitor.notify();
                monitor.wait();
            }
        }
    }

}
