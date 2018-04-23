import java.util.*;
public class Accounts {

   private ArrayList<Account> accounts = new ArrayList<Account>();

   public Accounts(){            
      accounts.add(new Account(0));
      accounts.add(new Account(1));
      accounts.add(new Account(2));
   }

   public Account getAccount(int accountNumber){
      
      Account account = retrieveAccount();  
      return account;
   }
   
   private Account retrieveAccount(){
      // get henter på index nummer
      Account account = accounts.get(accountNumber);
      return account;
   }


}