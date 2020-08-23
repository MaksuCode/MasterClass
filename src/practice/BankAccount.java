package practice;

public class BankAccount {

    private int accountNumber ;
    private int balance ;
    private String customerName ;
    private String email ;
    private String phoneNumber ;

    public BankAccount() { // Empty constructor.
        this(123456789 , 0, "Default name" , "Default email adress" , "111111111") ; //Calling another constructor inside a constructor.
        System.out.println("Empty constructor called.");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber) { //This one is my major constructor. I am calling it in other constructors to change the fields etc.
        System.out.println("Constructor wit parameters called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999,1000,customerName, email , phoneNumber) ;
    }

    public void depositFund (int fundAddedToAccount) {
        this.balance += fundAddedToAccount ;
        System.out.println(fundAddedToAccount + " TL added to account...");
        System.out.println("New balance is : " +balance + " TL");
    }

    public void withdrawFund(int fundWithdrawn) {
        System.out.println("Funds to be withdrawn :" + fundWithdrawn+ "TL");
        if (fundWithdrawn > this.balance) {
            System.out.println("You have insufficient funds to withdraw " +fundWithdrawn+ " TL.");
        }else{
            this.balance -= fundWithdrawn ;
            System.out.println("New balance is : " + balance + " TL");
        }
    }

    public int getAccountNumber() {
        return this.accountNumber ;
    }

    public int getBalance() {
        return this.balance ;
    }

    public String getCustomerName() {
        return this.customerName ;
    }

    public String getEmail() {
        return this.email ;
    }

    public String getPhoneNumber() {
        return this.phoneNumber ;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber ;
    }

    public void setBalance(int balance) {
        this.balance = balance ;
    }

    public void setCustomerName(String name){
        this.customerName = name ;
    }

    public void setEmail(String email) {
        this.email = email ;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber ;
    }























}
