public class Main {
    public static void main(String[] args) {

        // "UPCASTING"

        // Animal refer to animal
        Animal animal=new Animal();
        System.out.println(animal);
        animal.eat();
        animal.sleep();

        System.out.println();

        // Animal refer to Mammal
        Animal animal2=new Mammal(); // Upcasting
        System.out.println(animal2);
        animal2.eat();
        animal2.sleep();
        //animal2.control(); >>Error animal2 can see only his methods and the "Sharing methods between 2 classes only"

        System.out.println();

        // Animal refer to Lion
        Animal animal3=new Lion(); // Upcasting
        System.out.println(animal3);
        animal3.eat(); // >>"Method Overriding" so will print lion not animal
        animal3.sleep();
        //animal3.roar(); >>Can't see this method because it do'nt sharing between 2 classes and don't behavior of Animal

        System.out.println();

        /// /////////////////////////////////////////////////////////////////////////////////////////////////

        // Mammal refering to Animal
        // Mammal mammal=new Animal(); >>"java: incompatible types: Animal cannot be converted to Mammal"
                                     // Child can't refer to parent
        Mammal mammal2=new Mammal();
        System.out.println(mammal2);
        mammal2.eat(); // Can see methods of his Parent but can't Refer to parent only Childs
        mammal2.sleep(); // Can see methods of his Parent but can't Refer to parent only Childs
        mammal2.control();

        System.out.println();

        // Mammal refering to lion
        Mammal mammal3=new Lion(); // Upcasting
        System.out.println(mammal3);
        mammal3.eat(); // Will print Lion Because it from Lion class
        mammal3.sleep(); // It from Animal Class
        mammal3.control();
        //mammal3.roar(); >> Can't see it because it not common between these 2 classes

        System.out.println();

        /// ////////////////////////////////////////////////////////////////////////////////////////////////

        // Lion refering to Animal
        //Lion lion=new Animal(); >>"java: incompatible types: Animal cannot be converted to Lion"
        // Child can't refer to parent

        // Lion refering to Mammal
        //Lion lion2=new Mammal(); >>"java: incompatible types: Mammal cannot be converted to Lion2"
        // Child can't refer to parent

        // >> "So child can't refrences to it's Parent" only refer to him self

        //Lion referring to Lion
        Lion lion3=new Lion();
        System.out.println(lion3);
        lion3.eat(); // Override from Animal class
        lion3.sleep(); // See it because it inheritance Animal class
        lion3.control(); // See it because it inheritance Mammal class
        lion3.roar();

        System.out.println();

        //////////*************************************///////////////////////////////////////////
        /// /////////////////////////////////////////////////////////////////////////////////////

        //DOWN CASTING

        Animal animal5=new Lion();
        //Lion lion5=animal5; >> ERROR
        Lion lion5=(Lion)animal5; //DownCasting and it True We convert th animal Type to Lion Type "But it must refer to Lion Type Object"
        lion5.eat();
        lion5.sleep();
        lion5.control();
        lion5.roar();




    }
}