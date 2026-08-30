package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to factorize: ");
        int theNumber = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= theNumber; i++) {
            while(theNumber % i == 0){
                numbers.add(i);
                theNumber = theNumber / i;
            }
        }

        for (int i : numbers) {
            if (!primeNumbers.contains(i)){
                primeNumbers.add(i);
            }
        }
        System.out.print("Prime factors are: " + primeNumbers);
    }
}

