public class Main {
    public static void main(String[] args) {

        Car car1=new Car("BMW",2025,"VME");

        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.engine); // Engine@2a84aee7 >> If we apply toString method it will print "VME"
        System.out.println(car1.engine.type);

        car1.engine.print();
    }
}