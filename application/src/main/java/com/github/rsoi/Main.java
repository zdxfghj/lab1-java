package com.github.rsoi;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList <Person> listOfPersons = new ArrayList<Person>();


//		ArrayList<String> listViolation1 = new ArrayList<>(Arrays.asList("something", "something"));
//		ArrayList<String> listViolationData1 = new ArrayList<>(Arrays.asList("01/01/2010", "16/09/2010"));
//		ArrayList<String> listCostOfTravel1 = new ArrayList<>(Arrays.asList("3", "4"));
//		ArrayList<String> listTravelDate1 = new ArrayList<>(Arrays.asList("01/01/2010", "16/09/2010"));
//
//		ArrayList<String> listViolation2 = new ArrayList<>(Arrays.asList("something", "something"));
//		ArrayList<String> listViolationData2 = new ArrayList<>(Arrays.asList("01/01/2010", "16/09/2010"));
//		ArrayList<String> listCostOfTravel2 = new ArrayList<>(Arrays.asList("5", "2"));
//		ArrayList<String> listTravelDate2 = new ArrayList<>(Arrays.asList("01/01/2010", "16/09/2010"));
//
//		ArrayList<String> listViolation3 = new ArrayList<>(Arrays.asList("something", "something"));
//		ArrayList<String> listViolationData3 = new ArrayList<>(Arrays.asList("01/01/2010", "16/09/2010"));
//		ArrayList<String> listCostOfTravel3 = new ArrayList<>(Arrays.asList("5", "6"));
//		ArrayList<String> listTravelDate3 = new ArrayList<>(Arrays.asList("01/01/2010", "16/09/2010"));
//
//		ArrayList<String> listViolation4 = new ArrayList<>(Arrays.asList("something", "something"));
//		ArrayList<String> listViolationData4 = new ArrayList<>(Arrays.asList("01/01/2010", "16/09/2010"));
//		ArrayList<String> listCostOfTravel4 = new ArrayList<>(Arrays.asList("7", "9"));
//		ArrayList<String> listTravelDate4 = new ArrayList<>(Arrays.asList("15/02/2023", "16/09/2022"));


		Person person1 = new Person("Stefania", 20,3);

		ArrayList <Violation> listOfViolation1 = new ArrayList<>();
		ArrayList <Travel> listOfTravels1 = new ArrayList<>();

			listOfViolation1.add(new Violation("violation1", new Date()));
			listOfViolation1.add(new Violation("violation2", new Date()));
			listOfViolation1.add(new Violation("violation3", new Date()));
			listOfViolation1.add(new Violation("violation3", new Date()));
			listOfViolation1.add(new Violation("violation4", new Date()));
			listOfViolation1.add(new Violation("violation5", new Date()));
			listOfViolation1.add(new Violation("violation6", new Date()));
			listOfViolation1.add(new Violation("violation7", new Date()));

			listOfTravels1.add(new Travel(10.0, new Date()));
			listOfTravels1.add(new Travel(11.0, new Date()));
			listOfTravels1.add(new Travel(10.0, new Date()));
			listOfTravels1.add(new Travel(15.0, new Date()));

		person1.setViolations(listOfViolation1);
		person1.setTravels(listOfTravels1);
		listOfPersons.add(person1);

		Person person2 = new Person("Stefania", 20,3);

		ArrayList <Violation> listOfViolation2 = new ArrayList<>();
		ArrayList <Travel> listOfTravels2 = new ArrayList<>();

			listOfViolation2.add(new Violation("violation1", new Date()));
			listOfViolation2.add(new Violation("violation2", new Date()));
			listOfViolation2.add(new Violation("violation3", new Date()));
			listOfViolation2.add(new Violation("violation3", new Date()));
			listOfViolation2.add(new Violation("violation4", new Date()));
			listOfViolation2.add(new Violation("violation5", new Date()));
			listOfViolation2.add(new Violation("violation6", new Date()));
			listOfViolation2.add(new Violation("violation7", new Date()));

			listOfTravels2.add(new Travel(10.0, new Date()));
			listOfTravels2.add(new Travel(11.0, new Date()));
			listOfTravels2.add(new Travel(10.0, new Date()));
			listOfTravels2.add(new Travel(15.0, new Date()));

		person2.setViolations(listOfViolation2);
		person2.setTravels(listOfTravels2);
		listOfPersons.add(person2);

		//System.out.println(person1);

		//количество поездок (за последние N месяцев
		System.out.print("Введите количество поездок за последние N месяцев\n");
   		Scanner experienceTime = new Scanner(System.in);
		int experienceTimes = experienceTime.nextInt();
		int N = 1;

		for (var person: listOfPersons) {
			for (var  travel: person.getTravels()) {
				Calendar cal = Calendar.getInstance();
				cal.setTime(travel.getTravel_date());
				if (cal.get(Calendar.MONTH) == N){
					System.out.println(person);
				}

			}

		}










//		person1.
//
//		listOfPersons.add(person1);

//		Violation violation = new Violation("dfg");


//
//		Person person2 = new Person("Vladislau", 22,3);
//		listOfPersons.add(person2);
//		Person person3 = new Person("Alexandr", 43,10);
//		listOfPersons.add(person3);
//		Person person4 = new Person("Sergei", 55,20);
//		listOfPersons.add(person4);


//
//		System.out.print("Введите параметры поиска человека:\n");
//		System.out.print("Введите стаж\n");
//		Scanner experience = new Scanner(System.in);
//		int experienceYear = experience.nextInt();
//
//		for (var listOfPerson: listOfPersons) {
//			if(listOfPerson.getExperience() == experienceYear)
//				System.out.println(listOfPerson.getName()); // вывод элементов
//
//		}
//
//		System.out.print("Введите количество поездок за последние N месяцев\n");
//		Scanner experienceTime = new Scanner(System.in);
//		int experienceTimes = experienceTime.nextInt();
//
//		for (var listOfPerson: listOfPersons) {
//			if(listOfPerson.getTravelDate() == experienceTimes)
//				System.out.println(listOfPerson.getName()); // вывод элементов
//
//		}


//		System.out.print("Введите количество нарушений с определённой даты\n");
//		Scanner violationRate = new Scanner(System.in);
//		int violationRates = violationRate.nextInt();
//
//		for (var listOfPerson: listOfPersons) {
//			if(listOfPerson.getViolationRat
//			e() == violationRates)
//				System.out.println(listOfPerson.getName()); // вывод элементов
//
//		}

//
//		System.out.print("Введите общая сумма потраченных средств\n");
//		Scanner spentMoney = new Scanner(System.in);
//		int spentMoneys = spentMoney.nextInt();

//		for (var listOfPerson: listOfPersons) {
//			if(listOfPerson.getCostOfTravel() == spentMoneys)
//				System.out.println(listOfPerson.getName()); // вывод элементов
//
//		}

	}
}


