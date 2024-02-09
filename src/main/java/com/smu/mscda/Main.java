package com.smu.mscda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("This program will capitalize the input string and Generate MD5 hex\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input string: \n");
        String userInput = scanner.nextLine();
        System.out.println();

        StringCapitalizer stringCapitalizer = new StringCapitalizer();
        stringCapitalizer.capitalize(userInput);
        System.out.println();

        MD5Generator md5Generator = new MD5Generator();
        md5Generator.GenerateMD5(userInput);


    }
}