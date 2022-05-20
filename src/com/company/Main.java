package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person[] flat = {new Person("Datka"),new Person("Gulzhan"),new Person("Nurzhan")};

        Person[] dormitory = {new Person("Zhaulnbek"),new Person("Nurdin"),new Person("Dastan")};

        Person[] hotel = {new Person("Aizada"),new Person("Aiperi")};

        Payable flatPayable = new Flat(" flat, 7mkr");

        Payable dormitoryPayable = new Dormitory(" dormitory, Archa-beshik");

        Payable hotelPayable = new Hotel(" hotel, Bishkek");

        System.out.println("~~~~~~~~~~~~~~~~FLAT~~~~~~~~~~~~~~~~~~");
        flatPayable.payable();
        int count1 = 0;
        for(Person a: flat){
            System.out.println(a);
            count1++;
        }
        System.out.println("Number of people: "+count1);


        System.out.println("~~~~~~~~~~~~~~~DORMITORY~~~~~~~~~~~~~~~");
        dormitoryPayable.payable();
        int count2 = 0;
        for(Person b: dormitory){
            System.out.println(b);
        count2++;
        }
        System.out.println("Number of people: " +count2);

        System.out.println("~~~~~~~~~~~~~~~HOTEL~~~~~~~~~~~~~~~~~~");
        hotelPayable.payable();
        int count3 = 0;
        for(Person c:hotel){
            System.out.println(c);
            count3++;
        }
        System.out.println("Number of people: "+count3);
    }

}
