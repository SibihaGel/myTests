package org.example;

public class Polymorphism {

        public static void main(String[] args) {
            Lion lion = new Lion();
            Eagle eagle = new Eagle();

            Pigeon pigeon = new Pigeon(lion, eagle);
            pigeon.run(); // Вывод: Лев бежит
            pigeon.fly(); // Вывод: Орел летит
        }

}
// Интерфейс для бегающих животных
interface Runner {
    void run();
}

// Интерфейс для летающих животных
interface Flyer {
    void fly();
}

// Класс Лев, реализующий интерфейс Runner
class Lion implements Runner {
    @Override
    public void run() {
        System.out.println("Лев бежит");
    }
}

// Класс Орел, реализующий интерфейс Flyer
class Eagle implements Flyer {
    @Override
    public void fly() {
        System.out.println("Орел летит");
    }
}

// Класс Голубь, реализующий интерфейсы Runner и Flyer
class Pigeon implements Runner, Flyer {
    private Runner runner;
    private Flyer flyer;

    public Pigeon(Runner runner, Flyer flyer) {
        this.runner = runner;
        this.flyer = flyer;
    }

    @Override
    public void run() {
        runner.run();
        System.out.println("Голубь бежит");
    }

    @Override
    public void fly() {
        flyer.fly();
        System.out.println("Голубь летит");
    }
}



