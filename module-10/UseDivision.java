package csd402.Module10;

public class UseDivision{
    public static void main(String[] args){

        InternationalDivision regionOne = new InternationalDivision("Scofield",
                55567, "Germany", "German");
        regionOne.setDivisionName("Scofield");
        regionOne.setAccountNumber(555678);
        regionOne.setCountry("Germany");
        regionOne.setLanguage("German");

        InternationalDivision regionTwo = new InternationalDivision("Austerz",
                555876, "Sweden", "Swedish");
        regionTwo.setDivisionName("Austerz");
        regionTwo.setAccountNumber(555876);
        regionTwo.setCountry("Sweden");
        regionTwo.setLanguage("Swedish");

        DomesticDivision regionThree = new DomesticDivision("Cradle", 222345, "Ohio");
        regionThree.setDivisionName("Cradle");
        regionThree.setAccountNumber(222345);
        regionThree.setState("Ohio");

        DomesticDivision regionFour = new DomesticDivision("Mantle", 222543, "California");
        regionFour.setDivisionName("Mantle");
        regionFour.setAccountNumber(222543);
        regionFour.setState("California");

        regionOne.display();
        regionTwo.display();
        regionThree.display();
        regionFour.display();
    }
}
