import java.util.Scanner;

public class Atm {

         private static Scanner scan = new Scanner(System.in);

   public static void main(String[] args){
         
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
                  account.withdraw(amount);
           }
                  
      } else {
         // quit
      }
                
         
   }


}