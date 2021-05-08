package VaccineAuth;

import AuthenID.*;
import InventoryManagement.Vaccine;

public class AuthenTest {


    public static void main(String[] args) {

        InonculateAuth inonculateAuth=new InonculateAuth();

        //imagine the jackson not inonculated
        People jackson=new People("Jackson","622323",'m');
        inonculateAuth.runAuthenticate(jackson);

        //imagine the helen inonculated
        People helen=new People("helen","622324",'f');
        Vaccine vaccine_1=new Vaccine("A class covid-19","China Factory");
        Patient patient_helen=new Patient(helen);
        inonculateAuth.patientManage.inocute(patient_helen,vaccine_1);
        inonculateAuth.runAuthenticate(helen);

    }
}
