package Storage;

import AuthenID.Patient;
import StockControl.Vaccine;

import java.util.ArrayList;

public class instanceStore {

    //All the object data used in the system are managed uniformly here
    public static volatile  ArrayList<Vaccine> vaccines;
    public static volatile ArrayList<Patient> wait_queue;
    public  static volatile ArrayList<Patient> render_queue;

}
