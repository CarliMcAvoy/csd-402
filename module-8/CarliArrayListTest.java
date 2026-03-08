package csd402.Module8;
import java.util.ArrayList;
import java.util.Scanner;

public class CarliArrayListTest {

    public static Integer max(ArrayList list){

        int max_int = 0;
        for(int i = 0; i < list.size(); i++){
            if ((int) list.get(i) > max_int){
                max_int = (int)list.get(i);
            }
        }
        return max_int;
    }


    public static void displayResults(int max){
        System.out.println("The greatest number in the list is: " + max);
    }


    public static void main(String[] args){

        ArrayList <Integer> mainList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        Integer value = null;

        System.out.println("Enter integers to put in list: ");


            do{
                String inputValue = input.nextLine();
                if(inputValue.isEmpty()){
                    System.out.println("0");
                }
                value = Integer.valueOf(inputValue);
                mainList.add(value);
                if (value == 0) {
                    break;
                }
            }while (value >= 0);

        displayResults(max(mainList));
    }

}
