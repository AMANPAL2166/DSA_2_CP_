package OOPs;

public class Car {
    String name;
    String model;
    //make year encapsulate so that no one ka use it---
    private int year;
    public void setYear(int year){
       this.year = year;
    }
    public int getYear(){
        return year;
    }

}
