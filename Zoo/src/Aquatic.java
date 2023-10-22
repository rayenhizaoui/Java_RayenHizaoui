public class Aquatic extends Animal {

    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

/*
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
*/


    public void swim(){
        if (this instanceof Pingouin){
            System.out.println("This Penguin animal is swimming.");
        } else if (this instanceof Dauphin) {
            System.out.println("This Dolphin animal is swimming.");
        } else {
            System.out.println("This Aquatic animal is swimming.");
        }

    }


    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }
}





/*public class Aquatic extends Animal {
    String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        this();
        this.habitat = habitat;
    }
}*/