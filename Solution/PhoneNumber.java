package Solution;

// PhoneNumber.java
public class PhoneNumber {
    private final String number;

    public PhoneNumber(String number) {
        if (!number.matches("\\d{10,15}")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return number;
    }
}
