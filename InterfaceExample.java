interface Account{
    public static String accountOpenMessage="Account created successfully";
    
    default public  void calculateInterest(){
        System.out.println("Inside calculateInterest");
    }
    public  void calculateMinBalance();
}
class JandhanAccount implements Account{
    JandhanAccount(){
        System.out.println("JandhanAccount is created");
    }
    public  void calculateMinBalance(){
        System.out.println("Inside calculateMinBalance of JandhanAccount");
    }
}
class CorporateAccount implements Account{
    CorporateAccount(){
        System.out.println("CorporateAccount is created");
    }
    public  void calculateMinBalance(){
        System.out.println("Inside calculateMinBalance of CorporateAccount");
    }
}

public class InterfaceExample{
    public static void main(String[] ar){
        JandhanAccount ja1=new JandhanAccount();
      
        JandhanAccount ja2=new JandhanAccount();
        
         CorporateAccount ca=new CorporateAccount();
         System.out.println(Account.accountOpenMessage);
         ja1.calculateMinBalance();
         ca.calculateMinBalance(); 
         ja1.calculateInterest();
         ca.calculateInterest();        
    }
}