package Storage;

import AuthenID.Patient;
import InventoryManagement.Vaccine;

import java.util.ArrayList;
import java.util.HashMap;

public class instanceStore {

    //All the object data used in the system are managed uniformly here
 //   public static volatile HashMap<Vaccine, Integer> vaccineList;
    public static volatile  ArrayList<Vaccine> vaccines;
    public static volatile ArrayList<Patient> wait_queue;
    public  static volatile ArrayList<Patient> render_queue;

}
