public class Main {
    public static void main(String[] args) {

        int peopleAhead1 = 5;
        int serviceTime1 = 3;
        int waitingTime1 = 0;

        int peopleAhead2 = 3;
        int serviceTime2 = 4;
        int waitingTime2 = 0;

        // Calculate waiting time using for loop
        for (int i = 1; i <= peopleAhead1; i++) {
            waitingTime1 = waitingTime1 + serviceTime1;
        }

        for (int i = 1; i <= peopleAhead2; i++) {
            waitingTime2 = waitingTime2 + serviceTime2;
        }

        // Display project heading
        System.out.println("QueueWise - Queue Wait-Time Intelligence");
        System.out.println();

        // Display queue details side by side
        System.out.print("QUEUE 1");
        System.out.println("                    QUEUE 2");

        System.out.print("People ahead: " + peopleAhead1);
        System.out.println("          People ahead: " + peopleAhead2);

        System.out.print("Service time: " + serviceTime1 + " min");
        System.out.println("       Service time: " + serviceTime2 + " min");

        System.out.print("Waiting time: " + waitingTime1 + " min");
        System.out.println("      Waiting time: " + waitingTime2 + " min");

        // Compare queues using if-else
        System.out.println();
        System.out.println("Queue Comparison:");

        if (waitingTime1 < waitingTime2) {
            System.out.println("Queue 1 is faster.");
        } else if (waitingTime2 < waitingTime1) {
            System.out.println("Queue 2 is faster.");
        } else {
            System.out.println("Both queues have equal waiting time.");
        }

        System.out.println();
        System.out.println("Thank you for using QueueWise!");
    }
}
