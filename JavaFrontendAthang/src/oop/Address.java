package oop;

public class Address {
    String village;
    String gewog;
    String country;
    String dzongkhag;

    public Address(String village, String gewog, String country, String dzongkhag) {
        this.village = village;
        this.gewog = gewog;
        this.country = country;
        this.dzongkhag = dzongkhag;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "village='" + village + '\'' +
                ", gewog='" + gewog + '\'' +
                ", country='" + country + '\'' +
                ", dzongkhag='" + dzongkhag + '\'' +
                '}';
    }
}
