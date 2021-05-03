package VaccineAuth;

import AuthenID.Patient;
import AuthenID.People;
import AuthenID.patientManage;

import java.util.ArrayList;

public class InonculateAuth {

    patientManage patientManage=new patientManage();
   public void render(People people)
    {
        String Detail="";
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
               Detail=tmp.get(i).getInoculateRecord().get(tmp.get(i)).toString();
                break;
            }else
            {
                flag=false;
            }
        }

        if(flag)
        {
            System.out.println(people.getName()+" "+people.getNumber()+"\nHave been vaccinated"+Detail);
        }
        else
        {
            System.out.println(people.getName()+" "+people.getNumber()+"\nHave not been vaccinated");
        }

    }
}
