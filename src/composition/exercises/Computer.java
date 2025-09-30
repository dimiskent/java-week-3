package composition.exercises;

/**
 TODO:
 1. Create class Processor with method processData().
 2. Create class Computer that HAS-A Processor.
 3. In main(), create a Computer and call processData() through it.
*/
class Processor {
    public void processData() {
        System.out.println("Processing");
    }
}

class Computer {
    private final Processor processor;
    public Computer() {
        processor = new Processor();
    }
    public void processData() {
        processor.processData();
    }
}
