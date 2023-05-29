import java.util.Arrays;

public class Employee {
    private String name;
    private int hours;
    private double rate;
    private Address[] address;

    public Employee(String name, int hours, double rate, Address[] address) {
        this.name = name;
        this.hours = hours;
        this.rate = rate;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Address[] getAddress() {
        return address;
    }

    public void setAddress(Address[] address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee:" +
                "name: " + name +
                ", hours: " + hours +
                ", rate: " + rate +
                ", address: " + Arrays.toString(address) ;
    }
}