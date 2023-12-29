public class HomeWork5 {
    public void run() {
        Philosopher philosopher1 = new Philosopher("Аристотель");
        Philosopher philosopher2 = new Philosopher("Платон");
        Philosopher philosopher3 = new Philosopher("Конфуций");
        Philosopher philosopher4 = new Philosopher("Сократ");
        Philosopher philosopher5 = new Philosopher("Никколо Макиавелли");
        try {
            philosopher1.join();
            philosopher2.join();
            philosopher3.join();
            philosopher4.join();
            philosopher5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Все философы поели и подумали");
    }
}
