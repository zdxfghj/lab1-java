package com.github.rsoi;


import java.util.ArrayList;

public class Person{
    int sum = 0;
    private String name;
    private int age;
    private int experience;

    private ArrayList<String> violation = new ArrayList<>();
    private ArrayList<String> violationDate = new ArrayList<>();
    private ArrayList<String> CostOfTravel = new ArrayList<>();
    private ArrayList<String> TravelDate = new ArrayList<>();


    public Person(String name, int age, int experience, ArrayList<String> violation,ArrayList<String> violationDate,ArrayList<String> CostOfTravel,ArrayList<String> TravelDate) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.violation = violation;
        this.violationDate = violationDate;
        this.CostOfTravel = CostOfTravel;
        this.TravelDate = TravelDate;
    }



    String getName(){
        return name;
    }
    Integer getAge(){
        return age;
    }

    Integer getExperience(){
        return experience;
    }

    Integer getTravelDate(){
        return TravelDate.size();
    }

    Integer getViolationRate(){
        return violation.size();
    }

    Integer getCostOfTravel(){

        for(String s : CostOfTravel ) {
            sum= sum+ Integer.parseInt(s);
        }

        return sum;
    }
}