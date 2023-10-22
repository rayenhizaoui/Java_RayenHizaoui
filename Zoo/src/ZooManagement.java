public class ZooManagement {


    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setname("simba");
        lion.setage(8);
        lion.setfamily("cats");
        lion.isMammal = true;

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

//        System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
//        System.out.println(myZoo.isZooFull());

//Animal dog = new Animal("Canine", "Snoopy", 2, true);

//Dauphin dauphin = new Dauphin();
//Terrestrial terrestrial = new Terrestrial();
//Pingouin pingouin = new Pingouin();
//Aquatic aquatic = new Aquatic();

        //Aquatic Aq = new Aquatic("AQD", "Snoo",1,false,"habita");

        //Dauphin Df = new Dauphin ("Ca", "Snooy", 2, true,"ho",1);

        //Terrestrial trr = new Terrestrial ("Ca", "Snooy", 2, true,"ho",1);

        //Pingouin Df = new Pingouin ("Ca", "Snooy", 2, true,"ho",1);



        System.out.println("-------------------------------------------------------");
        Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dauphin dolphin = new Dauphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Pingouin penguin = new Pingouin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);


        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);



        aquatic.swim();
        dolphin.swim();
        penguin.swim();

        //Zoo.addAquaticAnimal();

        //myZoo.addAquaticAnimal();
        myZoo.Affichage_aq_an();


    }





}


