package razaAccount;
/**
 * This file defines the Account class.  It provides the basis for a
 * series of improvements you'll need to make as you progress through
 * the lessons in Module 6.
 */
public
class Account {

    /**
     * Name of the account holder.
     */
    private String name;
    /**
     * Number of the account.
     */
    private int number;
    /**
     * Current balance in the account.
     */
    private double balance;


    /**
     * Constructor initializes the field
     */


    public Account( String newName , int newNumber ) {
        name=newName;
        number=newNumber;
    }

    public
    Account ( String newName , int newnNumber , double initialBalance ) {
        this( newName , newnNumber);
        balance=initialBalance;
    }

    public
    Account () {

    }

    public static
    void tripleIt ( Account x ) {
        x.deposit(x.getBalance()*2);
    }

    public
    String getName () {
        return name;
    }

    public
    void setName ( String name ) {
        this.name=name;
    }

    public
    int getNumber () {
        return number;
    }

    public
    void setNumber ( int number ) {
        this.number=number;
    }

    public
    double getBalance () {
        return balance;
    }

    public
    void setBalance ( double balance ) {
        this.balance=balance;
    }

    public void makeCopyOf(Account original){

        this.name = original.name;        //this.setName = original.name;
        this.number = original.number;    //this.setNumber = original.number;   lecture basis.
        this.deposit(original.getBalance());
    }

    /**
     * Deposit @a amount into the account.
     */
    public
    void deposit ( double amount ) {
        balance+=amount;
    }

    /**
     * Withdraw @a amount from the account.  Prints "Insufficient
     * Funds" if there's not enough money in the account.
     */
    public
    void withdrawal ( double amount ) {
        if (balance>amount)
            balance-=amount;
        else
            System.out.println("Insufficient Funds");
    }

    /**
     * Display the current @a amount in the account.
     */
    public
    void displayBalance () {
        System.out.println("The balance on account "
                +number
                +" is "
                +balance);
    }



    @Override
    public
    String toString () {
        return "Account{"+
                "name='"+name+'\''+
                ", number="+number+
                ", balance="+balance+
                '}';
    }
}
