public class Main {
    public static void main(String[] args) {
        EnergyСonsumer consumer = new Company();
        consumer.payBills();
        System.out.println();
        consumer = new Individual();
        consumer.payBills();
    }
}
