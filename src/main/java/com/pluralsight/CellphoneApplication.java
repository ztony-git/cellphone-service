package com.pluralsight;

import java.util.Scanner;

public class CellphoneApplication {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        cellphone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        cellphone.setModel(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        cellphone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        cellphone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        cellphone.setOwner(scanner.nextLine());

        System.out.println("\nSerial number: " + cellphone.getSerialNumber());
        System.out.println("Model: " + cellphone.getModel());
        System.out.println("Carrier: " + cellphone.getCarrier());
        System.out.println("Phone number: " + cellphone.getPhoneNumber());
        System.out.println("Owner: " + cellphone.getOwner());
    }
}
