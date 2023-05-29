public class Address {
    private String street;
    private int number;
    private String postal;


    //Constructor
    public Address(String street, int number, String postal) {
        this.street = street;
        this.number = number;
        this.postal = postal;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    @Override
    public String toString() {
        return "street: " + street  +
                ", number: " + number +
                ", postal: " + postal  ;
    }
}
