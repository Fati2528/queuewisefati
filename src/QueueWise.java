public class QueueWise {
    public static void main(String[] args) {

        int peopleAhead = 5;
        int serviceTime = 3;

        int waitingTime = peopleAhead * serviceTime;

        System.out.println("QueueWise");
        System.out.println("People ahead: " + peopleAhead);
        System.out.println("Estimated waiting time: " + waitingTime + " minutes");
    }
}
