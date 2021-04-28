package StockControl;

import java.util.ArrayList;

public class VaccineStock {

    ArrayList<Vaccine> vaccines;

    public VaccineStock()
    {
       vaccines=new ArrayList<>();
    }

    public void addVaccines(String vname,String vmanu,int vstage)
    {
        Vaccine instance=new Vaccine(vname,vmanu,vstage);
        vaccines.add(instance);
    }

    public Vaccine consumeVaccines(String vname,String vmanu,int vstage)
    {
        Vaccine instance=new Vaccine(vname,vmanu,vstage);
        if (vaccines.contains(instance))
        {
            vaccines.remove(instance);
        }
        return instance;
    }

    public Boolean queryVaccines(String vname,String vmanu,int vstage)
    {
        Vaccine instance=new Vaccine(vname,vmanu,vstage);
        if (vaccines.contains(instance))
        {
            return true;
        }
        return false;
    }

    public void ListAllVaccine()
    {
        int len=vaccines.size();
        System.out.println("+++++++++++All Vaccine List+++++++++++");
        for(int i=0;i<len;i++)
        {
            System.out.println("+++++++++++New  Vaccine+++++++++++");
            Vaccine tmp=vaccines.get(i);
            System.out.println(tmp.toString());
        }
    }
    public int getNumberVacc()
    {
        return vaccines.size();
    }

    public int countByVnameStage(String  vname,int stage)
    {
        int num=0;
        int len=vaccines.size();
        for(int i=0;i<len;i++)
        {
            Vaccine tmp=vaccines.get(i);
           if((vname.equalsIgnoreCase(tmp.getName()))&&(tmp.getStage()==stage))
           {
               num++;
           }

        }

        return num;
    }

}
