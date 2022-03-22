package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Convertor {

    public static void main(String[] args)throws IOException {
        int baseSystem, targetSystem, numFromDecimalSystem;
        String numToDecimalSystem, number1, number2, choose;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          do {
              System.out.println((" "));
              System.out.println("------------------------------------");
              System.out.println("Choose what operation you want to Perform");
              System.out.println(" ");
              System.out.println("A. Convert from any system to the decimal system");
              System.out.println("B. Convert from decimal system to another system");
              System.out.println("C. Summing up numbers from different systems ");
              System.out.println("D. Subtracting number from different Systems ");
              System.out.println("E. Multiplying numbers from different system");
              System.out.println("F. Dividing numbers from different system ");
              System.out.println(" ");
              System.out.println("G. Exit the program");

              choose = br.readLine();

              if (choose.equals("A")) {
                  System.out.println("enter the value you want to convert to the decimal system");
                  numToDecimalSystem = br.readLine();

                  System.out.println("what system is the number from ");
                  baseSystem = Integer.parseInt(br.readLine());

                  System.out.println((numToDecimalSystem, baseSystem));

              } else if (choose.equals("B")) ;
              {
                  System.out.println("Enter a decimal value");
                  numFromDecimalSystem = Integer.parseInt(br.readLine());

                  System.out.println("To which system do you want to convert:");
                  targetSystem = Integer.parseInt(br.readLine());
              }

          }
}
