package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Choose NBA players to start/bench/cut");

        System.out.println("Choose the players to start: \n" +
                "1 - Zion \n" +
                "2 - Morant \n" +
                "3 - Tatum");

        System.out.println("Choose player to start: ");
        int firstChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Choose player to bench: ");
        int secondChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Choose player to cut: ");
        int thirdChioice = scanner.nextInt();
        scanner.nextLine();

        getChoices(firstChoice,secondChoice,thirdChioice);

    }

    public static void getChoices(int firstChoice, int secondChoice, int thirdChoice) {
        int firstDigit = firstChoice * 100;
        int secondDigit = secondChoice * 10;
        int thirdDigit = thirdChoice;

        //1 = 100 + 20 + 3
        // = 123;
        int total = firstDigit + secondDigit + thirdDigit;

            firstDigit = total / 100; //123
            total %= 100;

            secondDigit = total / 10; //23 /10
            total %= 10;

            thirdDigit = total;


            switch (firstDigit) {
                case 1:
                    System.out.println("Start Zion");
                    break;
                case 2:
                    System.out.println("Start Morant");
                    break;
                case 3:
                    System.out.println("Start Tatum");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            switch (secondDigit) {

                case 1:
                    System.out.println("Bench Zion");
                    break;
                case 2:
                    System.out.println("Bench Morant");
                    break;
                case 3:
                    System.out.println("Bench Tatum");
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }

            switch (thirdDigit) {

                case 1:
                    System.out.println("Cut Zion");
                    break;
                case 2:
                    System.out.println("Cut Morant");
                    break;
                case 3:
                    System.out.println("Cut Tatum");
                    break;

                default:
                    System.out.println("Invalid input!");
                    break;

            }
        }
    }
