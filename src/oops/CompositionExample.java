package oops;
class Engine {
    private int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    public void start() {
        System.out.println("Engine with horsepower " + horsepower + " "
        		+ "is starting...");
    }
}

class Lorry {
    private String model;
    private Engine engine;  // Composition: Lorry "has-a" Engine

    public Lorry(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void start() {
        System.out.println(model + " is starting...");
        engine.start();  
    }
}


public class CompositionExample {
    public static void main(String[] args) {
       
        Engine engine = new Engine(150);

        // Create a Lorry object with the Engine object
        Lorry lorry = new Lorry("AshokLeyland", engine);

        // Start the Lorry
        lorry.start();
    }
}
