package Solution;

// Email.java
public class Email {
    private final String value;

    public Email(String value) {
        if (!value.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
