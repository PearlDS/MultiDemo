public class CustomThread implements  Runnable{

    private String sign;
    private int times;

    public CustomThread(String sign, int times) {
        this.sign = sign;
        this.times = times;
    }



    @Override
    public void run() {
        for (int i = 0; i<times; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //put runtime exception here if you want to stop the Thread
                System.out.println(Thread.currentThread().getName()+ " was interupted");
            }
            System.out.println(i+ " "+ sign);
            Thread.yield();
        }
    }
}
