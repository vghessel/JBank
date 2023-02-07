public class Account {

    private double balance;
    private int agency;
    private int number;
    private Client holder;
    private static int total = 0;

    public Account(int agency, int number) {
        Account.total++;
        this.agency = agency;
        this.number = number;
        System.out.println("Account " + this.number + " created!" );
        
    }

    public void deposit(double value) { 
        this.balance += value;   
    }

    public boolean withdraw(double value) {  
        if(this.balance >= value) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(double value, Account destination) {
        if(this.balance >= value) {
            this.balance -= value;
            destination.deposit(value);
            return true;
        }
        return false;
    }

    //Getters
    public double getBalance() {
        return this.balance;
    }

    public int getAgency() {
        return this.agency;
    }

    public int getNumber() {
        return this.number;
    }
    
    public Client getHolder() {
        return holder;
    }

    public static int getTotal() {
        return Account.total;
    }


    //Setters
    public void setNumber(int number) {
        if(number <= 0) {
            System.out.println("Account number must be greater than zero");
            return;
        }
        this.number = number;
    }

    public void setAgency(int agency) {
        if(agency <= 0) {
            System.out.println("Agency number must be greater than zero");
            return;
        }
        this.agency = agency;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }
   
}

    