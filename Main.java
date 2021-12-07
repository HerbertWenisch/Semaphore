import java.util.concurrent.Semaphore;

public class Main {
   private Account account;
   private Semaphore mutex;
   private Customer maier; 
   private Customer huber;
   
   public Main(){
     account = new Account(1000);
     mutex = new Semaphore(1);
     maier = new Customer("Maier", account, mutex);
     huber = new Customer("Huber", account, mutex);
     maier.start();
     huber.start();
   }
   
}
