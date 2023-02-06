public class MultiDemo1 {
    public static void main(String[] args) {
       Thread thread = new Thread(new CustomThread("&", 10000));
        Thread thread2 = new Thread(new CustomThread("@", 100));
        Thread thread3 = new Thread(new CustomThread("#", 100));

        thread3.setName("#");
        thread.setName("&");
        thread2.setName("@");

        thread.setDaemon(true);
        thread.start();
        thread2.start();
        thread3.start();





    }
}
