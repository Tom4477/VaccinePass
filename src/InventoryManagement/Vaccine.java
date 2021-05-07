package InventoryManagement;

public class Vaccine {
    private String name;
    private String manufacture;
    private int stage;
    private String vaccineSerNum;
    private String instruct;
    private int amount;

    public Vaccine(String name, String manufacture, int stage) {
        this.name=name;
        this.manufacture=manufacture;
        this.stage=stage;
    }

    public Vaccine(String vaccineSerNum) {
        this.vaccineSerNum = vaccineSerNum;
    }

    public String getVaccineSerNum() {
        return vaccineSerNum;
    }

    public void setVaccineSerNum(String vaccineSerNum) {
        this.vaccineSerNum = vaccineSerNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public String getInstruct() {
        return instruct;
    }

    public void setInstruct(String instruct) {
        this.instruct = instruct;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount += amount;
    }

    public void addAmount()
    {
        this.amount++;  +1的操作 
    }


    @Override
    public String toString() {
        return "\nVaccine name is "+name+" , manufacture is "+manufacture+" , stage is "+stage+"\n";           换行
    }
}
