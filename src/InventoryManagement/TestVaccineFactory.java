package InventoryManagement;


public class TestVaccineFactory {


    public static void main(String[] args) {

        VaccineFactory vaccineFactory=new VaccineFactory();
        // Add three vaccines
        vaccineFactory.addVaccines("WuHan","WuSheng",1);
        vaccineFactory.addVaccines("WuHan","WuSheng",1);
        vaccineFactory.addVaccines("WuHan","WuSheng",1);
怎么调整一下
        System.out.println(vaccineFactory.getNumberVacc());

        //consume one vaccine
        vaccineFactory.consumeVaccines("WuHan","WuSheng",1);
        System.out.println(vaccineFactory.getNumberVacc());

        //consume another  one vaccine
        vaccineFactory.consumeVaccines("WuHan","WuSheng",1);
        System.out.println(vaccineFactory.getNumberVacc());

        //query one vaccine if exist
        vaccineFactory.addVaccines("BeiJingVacc","BeiJing",1);
        System.out.println(vaccineFactory.queryVaccines("BeiJingVacc","BeiJing",1));
        System.out.println(vaccineFactory.queryVaccines("BeiJingVacc","BeiJing",2));

        //add some quantities of Vaccine
        vaccineFactory.addBatch("AmericaVacc","ABC",1,10);
        System.out.println(vaccineFactory.getNumberVacc());
        System.out.println(vaccineFactory.countByVnameStage("AmericaVacc",1));
    }
}
