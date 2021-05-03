package VaccineAuth;

import AuthenID.*;
import InventoryManagement.Vaccine;

public class AuthenTest {


    public static void main(String[] args) {

        InonculateAuth inonculateAuth=new InonculateAuth();

        //imagine the jackson not inonculated
        People jackson=new People("Jackson","622323",'m');
        inonculateAuth.render(jackson);

        //imagine the helen inonculated
        People helen=new People("helen","622324",'f');
        Vaccine vaccine_1=new Vaccine("A class covid-19","China Factory",1);
        Patient patient_helen=new Patient(helen);
        inonculateAuth.patientManage.inocute(patient_helen,vaccine_1);
        inonculateAuth.render(helen);

        //imagine the tony inonculated two stages
        People tony=new People("tony","622325",'m');
        Vaccine vaccine_2=new Vaccine("A class covid-19","China Factory",2);
        Patient patient_tony=new Patient(tony);
        inonculateAuth.patientManage.inocute(patient_tony,vaccine_1);
        inonculateAuth.patientManage.inocute(patient_tony,vaccine_2);
        inonculateAuth.render(tony);
    }
}
