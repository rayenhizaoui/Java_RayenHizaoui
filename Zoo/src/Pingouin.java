public class Pingouin extends Aquatic {

    private float swimmingDepth;

    public Pingouin() {
    }

    public Pingouin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }


    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth:" + swimmingDepth;
    }
}