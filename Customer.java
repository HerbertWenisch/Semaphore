import java.util.concurrent.Semaphore;

public class Customer extends Thread{
    private String name;
    private Account account;
    private Semaphore mutex;
    
    public Customer(String name, Account account, Semaphore mutex){
        this.name = name;
        this.account = account;
        this.mutex = mutex;
    }
    
    public void transfer(){
        
        try {mutex.acquire();}
        catch (InterruptedException e) {};
        
           double value = account.read();
           value += 50;
           System.out.println(name + " überweist: 50 €");
           account.write(value);
           
        mutex.release();
    }
     
    @ Override
    public void run(){
        for(int i = 0; i < 5; i++)
          transfer();
    }
}


