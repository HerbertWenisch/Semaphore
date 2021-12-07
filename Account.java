public class Account {
   private double value; 
   
   public Account (double value){
       this.value = value;
   }
   
   public double read(){
       return value;
   }
   
   public void write(double value){
       this.value = value;
       System.out.println(value);
   }
}
