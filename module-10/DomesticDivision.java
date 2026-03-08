package csd402.Module10;

public class DomesticDivision extends Division{

    private String state;

    public DomesticDivision(String divisionName, int accountNumber, String state){
        super(divisionName, accountNumber);
        this.state = state;
    }

    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return this.state;
    }

    public void display(){
        System.out.println("DOMESTIC -- Division Name: " + getDivisionName() + " | Account Number: " + getAccountNumber() +
                " | State: " + getState());
    }
}
