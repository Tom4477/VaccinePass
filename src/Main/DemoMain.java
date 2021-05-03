package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Achiko
 */
public class DemoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        generateDemoData();

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        boolean exitCode = false;
        int role; // 1 for Nurse and 2 for officer

        while (!exitCode) {

            System.out.println("Please select a role [Nurse (nurse), Customs Officer(officer)]:");
            String inputLine = reader.readLine();

            if (inputLine.startsWith("exit")) {
                exitCode = true;
            }
            if (!(inputLine.startsWith("nurse") || inputLine.startsWith("officer"))) {
                System.out.println("Incorrect input: ");
            } else {

                if (inputLine.startsWith("nurse")) {
                    handleNurseInput();
                }

                if (inputLine.startsWith("officer")) {
                    handleOfficerInput();
                }
                System.out.println("This was your input: ");
                System.out.println(inputLine);
            }

        }

    }



    static void handleOfficerInput() throws IOException{
        System.out.println("Hello Mr.Officer!");
        System.out.println("Please type the passport id:");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String inputLine = reader.readLine();

    }

    static void handleNurseInput() throws IOException{
        System.out.println("Hello Nurse!");
        System.out.println("Are you vaccinating a person:");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String inputLine = reader.readLine();

    }

    private static void generateDemoData() {

        // populate model with data



    }

}
