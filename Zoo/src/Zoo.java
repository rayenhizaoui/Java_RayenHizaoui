public class Zoo {

    static final int NUMBER_OF_CAGES = 25;
    Animal[] animals;
    private String name, city;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    boolean verif_name_zoo(Zoo zoo) {

        if (getname() == "")
            return false;

        return true;
    }

    public String getcity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }

    private int nbrAnimals;

    public int get_nbr_animals() {
        return nbrAnimals;
    }

    public void setname(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getname() == animals[i].getname())
                return i;
        }
        return index;
    }

    boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }




    Aquatic[] aquaticAnimals = new Aquatic[10];

    // Méthode pour ajouter un animal aquatique au tableau
    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                System.out.println("Animal aquatique ajouté avec succès.");
                return; // Sortir de la boucle après avoir ajouté l'animal
            }
        }
        System.out.println("Le tableau d'animaux aquatiques est plein. Impossible d'ajouter l'animal.");

        aquaticAnimals [0] = new Dauphin ("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        aquaticAnimals[1] = new Pingouin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);
        aquaticAnimals [2] = new Dauphin ("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        aquaticAnimals[3] = new Pingouin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);
        aquaticAnimals [4] = new Dauphin ("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        aquaticAnimals[5] = new Pingouin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);
        aquaticAnimals [6] = new Dauphin ("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        aquaticAnimals[7] = new Pingouin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);
        aquaticAnimals [0] = new Dauphin ("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        aquaticAnimals[9] = new Pingouin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);

    }


    public void Affichage_aq_an(){
        for(int i = 0; i < aquaticAnimals.length; i++){
            aquaticAnimals[i].swim();
        }
    }
    //aquaticAnimals.addAquaticAnimal(Dauphin);

    // Méthode swim pour afficher tous les animaux aquatiques dans le zoo
    public void swim() {
        for (Aquatic animal : aquaticAnimals) {
            if (animal != null) {
                animal.swim();
            }
        }
    }
   /* public abstract void swim() {

    }*/


/*
    Aquatic[] aquaticAnimals = new Aquatic[10];
    aquaticAnimals [0] = new Dauphin ("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
    aquaticAnimals[1] = new Pingouin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);
   // aquaticAnimals[1]=new Dauphin();
   // aquaticAnimals[2]=new Dauphin();
    //Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
/*public void addAquaticAnimal(Aquatic aquatic){
}
*/
    // Méthode pour ajouter un animal aquatique au tableau
 /*   public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                System.out.println("Animal aquatique ajouté avec succès.");
                return; // Sortir de la boucle après avoir ajouté l'animal
            }
        }
        System.out.println("Le tableau d'animaux aquatiques est plein. Impossible d'ajouter l'animal.");
    }*/
    // Autres méthodes pour gérer les animaux aquatiques dans le zoo







    public float maxPenguinSwimmingDepth(){
        float maxDepth=-1;
        for(int i = 0; i < aquaticAnimals.length; i++){
            if(aquaticAnimals[i] instanceof Pingouin){
                Pingouin pingouin = (Pingouin) aquaticAnimals[i];
                if((pingouin.getSwimmingDepth() > maxDepth)) {
                    maxDepth = ((Pingouin) aquaticAnimals[i]).getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }



    public void displayNumberOfAquaticsByType(){
        int nbrDolphin=0;
        int nbrPenguin=0;
        for(int i = 0; i < aquaticAnimals.length; i++){
            if (aquaticAnimals[i] instanceof Dauphin){
                nbrDolphin++;
            }else {
                nbrPenguin++;
            }
        }
        System.out.println("le nombre des Dolphin est :"+nbrDolphin);
        System.out.println("le nombre des penguins est :"+nbrPenguin);
    }
}




