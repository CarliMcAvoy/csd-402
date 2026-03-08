package csd402.Module10;

public class InternationalDivision extends Division{

    private String country;
    private String language;

    public InternationalDivision(String divisionName, int accountNumber, String country, String language){
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    public void setCountry(String country){
        this.country = country;
    }
    public void setLanguage(String language){
        this.language = language;
    }
    public String getCountry(){
        return country;
    }
    public String getLanguage(){
        return language;
    }

    public void display(){
        System.out.println("INTERNATIONAL -- Division Name: " + getDivisionName() + " | Account Number: " + getAccountNumber() +
                " | Country: " + getCountry() + " | Language: " + getLanguage());
    }
}
