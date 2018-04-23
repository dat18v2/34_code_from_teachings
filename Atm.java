import java.util.Scanner;

public class Atm {

   private static Scanner scan = new Scanner(System.in);

   public static void main(String[] args){
       
      // TODO: Kode til:  
      // Insert ATM card
      // Ask for pin
      // type pin  
              
      Accounts accounts = new Accounts();
      Account account = accounts.getAccount(1);
              
      if(!account == null) { 
         
         boolean ok = account.verifyPin(1, 1234);
           
         if (ok == true){
            // spørg efter beløb
            // Kunde indtaster beløb
            int amount = scan.nextInt();
            int result = account.withdraw(amount);
            
            // giv kort tilbage
            
            if (result != -1) {
                  System.out.println("Her er dine penge: " + result);
            } else {
                  System.out.println("Du har ikke nok penge !! Buuhhh");
            }
            
         }
                  
      } else {
         // quit
      }
                
         
   }


}