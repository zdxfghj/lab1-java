package com.github.rsoi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList <Person> listOfPersons = new ArrayList();


		ArrayList<String> listViolation1 = new ArrayList<>(Arrays.asList("something", "something"));
		ArrayList<String> listViolationData1 = new ArrayList<>(Arrays.asList("01/01/2010", "16/09/2010"));
		ArrayList<String> listCostOfTravel1 = new ArrayList<>(Arrays.asList("3", "4"));
		ArrayList<String> listTravelDate1 = new ArrayList<>(Arrays.asList("01/01/2010", "16/09/2010"));

		ArrayList<String> listViolation2 = new ArrayList<>(Arrays.asList("something", "something"));
		ArrayList<String> listViolationData2 = new ArrayList<>(Arrays.asList("01/01/2010", "16/09/2010"));
		ArrayList<String> listCostOfTravel2 = new ArrayList<>(Arrays.asList("5", "2"));
		ArrayList<String> listTravelDate2 = new ArrayList<>(Arrays.asList("01/01/2010", "16/09/2010"));

		ArrayList<String> listViolation3 = new ArrayList<>(Arrays.asList("something", "something"));
		ArrayList<String> listViolationData3 = new ArrayList<>(Arrays.asList("01/01/2010", "16/09/2010"));
		ArrayList<String> listCostOfTravel3 = new ArrayList<>(Arrays.asList("5", "6"));
		ArrayList<String> listTravelDate3 = new ArrayList<>(Arrays.asList("01/01/2010", "16/09/2010"));

		ArrayList<String> listViolation4 = new ArrayList<>(Arrays.asList("something", "something"));
		ArrayList<String> listViolationData4 = new ArrayList<>(Arrays.asList("01/01/2010", "16/09/2010"));
		ArrayList<String> listCostOfTravel4 = new ArrayList<>(Arrays.asList("7", "9"));
		ArrayList<String> listTravelDate4 = new ArrayList<>(Arrays.asList("15/02/2023", "16/09/2022"));


		Person person1 = new Person("Stefania", 20,3, listViolation1,listViolationData1,listCostOfTravel1,listTravelDate1);
		listOfPersons.add(person1);
		Person person2 = new Person("Vladislau", 22,3, listViolation2,listViolationData2,listCostOfTravel2,listTravelDate2);
		listOfPersons.add(person2);
		Person person3 = new Person("Alexandr", 43,10, listViolation3,listViolationData3,listCostOfTravel3,listTravelDate3);
		listOfPersons.add(person3);
		Person person4 = new Person("Sergei", 55,20, listViolation4,listViolationData4,listCostOfTravel4,listTravelDate4);
		listOfPersons.add(person4);



		System.out.print("Введите параметры поиска человека:\n");
		System.out.print("Введите стаж\n");
		Scanner experience = new Scanner(System.in);
		int experienceYear = experience.nextInt();

		for (var listOfPerson: listOfPersons) {
			if(listOfPerson.getExperience() == experienceYear)
				System.out.println(listOfPerson.getName()); // вывод элементов

		}

		System.out.print("Введите количество поездок за последние N месяцев\n");
		Scanner experienceTime = new Scanner(System.in);
		int experienceTimes = experienceTime.nextInt();

		for (var listOfPerson: listOfPersons) {
			if(listOfPerson.getTravelDate() == experienceTimes)
				System.out.println(listOfPerson.getName()); // вывод элементов

		}


		System.out.print("Введите количество нарушений с определённой даты\n");
		Scanner violationRate = new Scanner(System.in);
		int violationRates = violationRate.nextInt();

		for (var listOfPerson: listOfPersons) {
			if(listOfPerson.getViolationRate() == violationRates)
				System.out.println(listOfPerson.getName()); // вывод элементов

		}


		System.out.print("Введите общая сумма потраченных средств\n");
		Scanner spentMoney = new Scanner(System.in);
		int spentMoneys = spentMoney.nextInt();

		for (var listOfPerson: listOfPersons) {
			if(listOfPerson.getCostOfTravel() == spentMoneys)
				System.out.println(listOfPerson.getName()); // вывод элементов

		}

	}
}


