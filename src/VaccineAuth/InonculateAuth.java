package VaccineAuth;

import AuthenID.Patient;
import AuthenID.People;
import AuthenID.patientManage;

import java.util.ArrayList;

import static Storage.instanceStore.render_queue;

public class InonculateAuth {

    patientManage patientManage=new patientManage();
    String Detail="";
   public void runAuthenticate(People people)
    {
        System.out.println("\n######################################Inonculate Authentication start###########################");

        ArrayList<Patient> tmp=render_queue;
        int len=tmp.size();
        String IDnum=people.getNumber();
        //query from render Array
        boolean flag= queryForInoculate(len,tmp,IDnum);

        printInoculateInfo(flag,people);
        Detail="";// set Detail as empty string
        System.out.println("###############################################Authentication End#############################\n");
    }

    public boolean queryForInoculate(int len,ArrayList<Patient> tmp,String IDnum)
    {
        for(int i=0;i<len;i++)
        {
            String vaccineNum=tmp.get(i).getPersonInfo().getNumber();
            if(vaccineNum==IDnum)
            {
                Detail=tmp.get(i).showInoculateInfo();
                return true;
            }
        }
        return false;
    }

    public void printInoculateInfo(Boolean flag,People people)
    {
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
