public class Test {
    public static void main(String[] args) {
        Address[] addresses = new Address[2];
        addresses[0] = new Address("Queen", 48, "K1P1N2");
        addresses[1] = new Address("King Edward", 800, "K1N6N5");

        Employee emp = new Employee("Falcao", 40, 15.50, addresses);
        System.out.println(emp);
        System.out.println(addresses[0]);
        System.out.println(addresses[1]);
    }
}