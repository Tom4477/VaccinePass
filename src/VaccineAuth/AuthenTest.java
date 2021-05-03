package VaccineAuth;

import AuthenID.*;
import StockControl.Vaccine;

public class AuthenTest {


    public static void main(String[] args) {

        InonculateAuth inonculateAuth=new InonculateAuth();

        //imagine the jackson not inonculated
        People jackson=new People("Jackson","622323",'m');
        inonculateAuth.render(jackson);

        //imagine the helen inonculated
        People helen=new People("helen","622324",'f');
        Vaccine vaccine=new Vaccine("A class covid-19","China Factory",1);
        Patient patient_helen=new Patient(helen,false);
        inonculateAuth.patientManage.inocute(patient_helen,vaccine);
        inonculateAuth.render(helen);

    }
}
