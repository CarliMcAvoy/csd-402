package csd402.Module6;

import java.util.ArrayList;
import java.util.List;

/* Contains public class Fan and the second class UseFan */

public class Fan {

        //Constants
        final static int STOPPED = 0;
        final static int SLOW = 1;
        final static int MEDIUM = 2;
        final static int FAST = 3;

        //Defaults
        private int speed = STOPPED;
        private boolean on = false;
        private int radius = 6;
        String color = "White";

        //Setters and Getters
        public int  getSpeed(){
            return speed;
        }
        public void setSpeed(int speed){
            this.speed = speed;
        }

        public boolean isOn(){
            return on;
        }
        public void setOn(boolean on){
            this.on = on;
        }

        public int getRadius(){
            return radius;
        }
        public void setRadius(int radius){
            this.radius = radius;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }

        //No arg constructor
        public Fan(){
            this.speed =  STOPPED;
            this.on =  false;
            this.radius = 6;
            this.color = "White";
        }

        //Constructor
        public Fan(int speed, boolean on, int radius, String color){
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        //toString Method
        public String toString(){
            return "Fan Speed: " + this.speed + "\nFan Is On? " + this.on + "\nFan Radius: " + this.radius +
                    "\nFan Color: " + this.color;
        }

    //Main Method
    public static void main(String[] args){
        Fan defaultFan = new Fan();
        System.out.println(defaultFan.toString());

        System.out.println();

        Fan fastFan = new Fan(FAST, true, 8, "Brown");
        System.out.println(fastFan.toString());
    }
}


class UseFan {

    private String brand;
    private double price;

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public UseFan(String brand, double price){
        this.brand = brand;
        this.price = price;
    }


    public void display(){
        System.out.println("Brand: " + this.brand + " | Price: " + this.price);
    }

    public static void main(String[] args) {

        List<UseFan> fanList = new ArrayList<UseFan>();
        fanList.add(new UseFan("Coolio", 49.99));
        fanList.add(new UseFan("Morton", 34.99));
        fanList.add(new UseFan("Trifect", 50.49));
        
        for (UseFan fan : fanList){
            fan.display();
        }
    }

}
