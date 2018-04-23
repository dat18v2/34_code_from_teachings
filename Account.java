public class Account {

   private int accountNumber;
   private int balance;

   public Account(int accountNumber){
      this.accountNumber = accountNumber;
   }
   
   public boolean verifyPin(int cardnumber, int pin){
     
     // TODO: implementer Kode!!!!
      return true;
   } 
   
   public int withdraw(int amount){   
         
         int result = debit(amount);
         return amount;
   }
   
   private int debit(int amount){
        
        if(balance - amount >= 0){
            return amount;      
        }else {
           
           return -1;
         
        }      
   }
   

}