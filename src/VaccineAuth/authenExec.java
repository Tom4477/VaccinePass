package VaccineAuth;

import AuthenID.People;

import java.util.Scanner;

public class authenExec {

    public void daemon() {
        Scanner scanner = new Scanner(System.in);
        InonculateAuth inonculateAuth = new InonculateAuth();

        System.out.println("Inonculate Authentication");
        System.out.println("please  input your name：[Press Enter to contnue]");
        String userName = scanner.nextLine();
        System.out.println("please  input your ID  Number ：[Press Enter to contnue]");
        String idNum = scanner.nextLine();
        System.out.println("please  input your Gender (male or female)：[Press Enter to contnue]");
        String gd = scanner.nextLine();

        People newInstance = new People(userName, idNum, gd.charAt(0));

        inonculateAuth.render(newInstance);

    }

}
