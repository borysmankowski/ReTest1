package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        zadanie1();
        System.out.println(zadanie_2());

    }

    public static void zadanie1() {
        System.out.println(" Enter numbers into the scanner");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] numbersInput = input.split(" ");
        int[] numbersInt = new int[numbersInput.length];

        List<Integer> listOfNumbers = new ArrayList<>();

        for (int i = 0; i < numbersInput.length; i++) {
            numbersInt[i] = Integer.parseInt(numbersInput[i]);
            listOfNumbers.add(numbersInt[i]);
        }

        System.out.println(listOfNumbers);
        System.out.println();

        System.out.println("Zadanie 1_1");
        System.out.println(zadanie1_1(listOfNumbers));
        System.out.println();
        System.out.println("Zadanie 1_2");
        System.out.println(zadanie1_2(listOfNumbers));
        System.out.println();
        System.out.println("Zadanie 1_3");
        System.out.println(zadanie1_3(listOfNumbers));


    }

    private static Integer zadanie1_1(List<Integer> listOfNumbers) {
        return Collections.max(listOfNumbers);
    }

    private static Integer zadanie1_2(List<Integer> listOfNumbers) {
        return Collections.min(listOfNumbers);
    }

    private static Integer zadanie1_3(List<Integer> listOfNumbers) {
        int count = 0;
        for (int i = 2; i < listOfNumbers.size(); i++){
            if(listOfNumbers.size() % 2 != 0){
                count++;
            }
        }
        return count;
    }
    private static long zadanie_2() {
        System.out.println("Insert Names");
        Scanner scanner = new Scanner(System.in);
        String names = scanner.nextLine();

        String[] arrayOfNames = names.split(" ");

        return Arrays.stream(arrayOfNames).distinct().count();
    }

}
