public class Car {

    String model;
    int year;
    Engine engine;

    Car(String model,int year,String engine_type)
    {
        this.model=model;
        this.year=year;
        this.engine=new Engine(engine_type); // Composition "Part_Of" >> The engine is part of car
        // If we remove the Car the engine will be removed
    }
}
