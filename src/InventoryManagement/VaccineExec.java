package InventoryManagement;

import java.util.Scanner;

public class VaccineExec {

    VaccineFactory vaccineFactory=new VaccineFactory();

    public void daemon()
    {
        System.out.println("Vaccine Inventory Management");
        Scanner scanner = new Scanner(System.in);
        System.out.println("press '1' to add Vaccines, '2' to query Vaccines if exist,'3' to count by name and stage");
        String state=scanner.nextLine();

            if(state.equals("1"))
            {
                System.out.println("please  input the vName：[Press Enter to continue]");
                String vName = scanner.nextLine();
                System.out.println("please  input the vManu：[Press Enter to continue]");
                String vManu = scanner.nextLine();
                System.out.println("please  input the vStage(1 or 2)：[Press Enter to continue]");
                String vStage = scanner.nextLine();

                vaccineFactory.addVaccines(vName,vManu, Integer.parseInt(vStage));
                System.out.println("[System Notice] "+vName+"/"+vStage+" added sucessfully!");
            }
            else if(state.equals("2"))
            {
                System.out.println("please input the vName：[Press Enter to continue]");
                String vName = scanner.nextLine();
                System.out.println("please  input the vManu：[Press Enter to continue]");
                String vManu = scanner.nextLine();
                System.out.println("please  input the vStage(1 or 2)：[Press Enter to continue]");
                String vStage = scanner.nextLine();

                Boolean ifexist= vaccineFactory.queryVaccines(vName,vManu, Integer.parseInt(vStage));
                System.out.println("[System Notice] "+vName+"/"+vStage+" is "+ifexist);
            }
            else if(state.equals("3"))
            {
                System.out.println("please input the vName：[Press Enter to continue]");
                String vName = scanner.nextLine();

                System.out.println("please  input the vStage(1 or 2)：[Press Enter to continue]");
                String vStage = scanner.nextLine();

                int count=vaccineFactory.countByVnameStage(vName,Integer.parseInt(vStage));
                System.out.println("[System Notice] "+vName+"/"+vStage+" has "+count);
            }



        scanner.close();
    }
}
