package less3;

public class Launch {



    public static void main(String[] args) {
        SynchClass sc =new SynchClass();

            new Thread(() -> {


                try {
                    sc.makePing();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }).start();

            new Thread(() -> {
                try {
                    sc.makePong();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();

    }
}
