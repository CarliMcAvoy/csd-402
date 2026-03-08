package csd402.Module10;

abstract class Division {

    //Fields
    private String divisionName;
    private int accountNumber;

    //Abstract method
    public abstract void display();

    //Constructor
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    //Setters and getters
    public void setDivisionName(String name) {
        this.divisionName = name;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getDivisionName(){
        return this.divisionName;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
}
