public class Animal {

    private String family, name;

    public String getfamily() {
        return family;
    }

    public String getname() {
        return name;
    }

    public void setfamily(String family) {
        this.family = family;
    }

    public void setname(String name) {
        this.name = name;
    }


    private int age;

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    boolean verif_age(Animal animal) {

        if (getage() < 0)
            return false;

        return true;
}
 boolean isMammal;


    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
