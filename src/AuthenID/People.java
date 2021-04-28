package AuthenID;

public class People {
    String name;
    String number;
    char sex;
    int age;
    double weight;

    public People(String name, String number, char sex) {
        this.name = name;
        this.number = number;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
