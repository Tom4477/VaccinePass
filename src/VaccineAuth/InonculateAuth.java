package VaccineAuth;

import AuthenID.Patient;
import AuthenID.People;
import AuthenID.patientManage;

import java.util.ArrayList;

public class InonculateAuth {

    patientManage patientManage=new patientManage();
   public void render(People people)
    {
        String timestamp="";
        boolean flag=false;
        ArrayList<Patient> tmp=patientManage.render_queue;
        int len=tmp.size();
        String IDnum=people.getNumber();
        //query from render Array
        for(int i=0;i<len;i++)
        {
            String vaccineNum=tmp.get(i).getPersonInfo().getNumber();
            if(vaccineNum==IDnum)
            {
               flag=true;
               timestamp=tmp.get(i).getInoculateRecord().toString();
                break;
            }else
            {
                flag=false;
            }
        }

        if(flag)
        {
            System.out.println(people.getName()+" "+people.getNumber()+"\nHave been vaccinated"+timestamp);
        }
        else
        {
            System.out.println(people.getName()+" "+people.getNumber()+"\nHave not been vaccinated");
        }

    }
}
