public class HelloWorld {
    public static void main(String[] args) {
        int counter = 0;
        int maxCount = 5;

        while (counter < maxCount) {
            System.out.println("Hello, World18!");
            counter++;
            try {
                Thread.sleep(10000); // Sleep for 10 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                break;
            }
        }

        System.out.println("Finished printing 'Hello, World!' 5 times.");
    }
}
