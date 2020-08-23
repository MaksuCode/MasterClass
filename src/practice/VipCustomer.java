package practice;

public class VipCustomer {

    private String name ;
    private double creditLimit ;
    private String emailAddress ;


    public VipCustomer() {
        this("Default name",50000,"defaultmailaddress@gmail.com") ;
        System.out.println("Calling constructor without parameters.");
    }

    public VipCustomer(String name , String emailAddress) {
        this(name , 38000 ,"maksu@innova.com.tr") ;
        System.out.println("Calling constructor with 2 parameters.");
    }

    public VipCustomer(String name , double creditLimit , String emailAddress) {
        this.name = name ;
        this.creditLimit = creditLimit ;
        this.emailAddress = emailAddress ;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
