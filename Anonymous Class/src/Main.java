public class Main {
    public static void main(String[] args) {

        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        // Add custom behavior without having to create a new class.
        // Often used for one time uses (TimerTask, Runnable, callbacks)

        // 1-> - Anonymous inner class that extends a class (maybe abstract or concrete).
        Dog dog =new Dog();
        dog.Sound();

        // The German dog have another Sound so instead of make another Class for German dog That inherit the Dog
        // Class and Override the Sound method we can do Anonymous Class

        Dog german=new Dog(){  // We make override her instead of do another Class
            @Override
            public void Sound() {
                System.out.println("Rar Rar Rar");
            }
        };
        german.Sound();

        System.out.println();
        System.out.println(dog.getClass()); //class Dog >> Because it has Class
        System.out.println(german.getClass()); //class Main$1 >> If it has a class it will be class Main$class_name

        System.out.println();

        // 2-> - Anonymous inner class that implements an interface.
        // Cat cat=new Cat(); >> It will be ERROR Because u can't make object from interface

        Cat cat=new Cat() { // Insted of making a new Class that implement this interface we can do this
            @Override
            public void meaw() {
                System.out.println("Meaw Meaw Meaw");
            }
        };
        cat.meaw();

        System.out.println();

        // 3-> - Anonymous inner class that defined as arguments of method / constructor.
        // disply(new cat2); Will be wrong
        disply(new Cat() {
            @Override
            public void meaw() {
                System.out.println("Hey Meaw Meaw Meaw");
            }
        });
    }
    static void disply(Cat e)
    {
        e.meaw();
    }
}