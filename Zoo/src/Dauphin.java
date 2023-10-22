public class Dauphin extends Aquatic {

    private float swimmingSpeed;

    public Dauphin() {
    }

    public Dauphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed:" + swimmingSpeed;
    }
}






/*public class Dauphin extends Aquatic {
    float swimmingSpeed;

    public Dauphin(){
        super("a","g",1,true,"ha");
    }


    //this.swimmingSpeed = swimmingSpeed;
        //System.out.println("2nd Constructor B");
}
*/