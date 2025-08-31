package passBy;

public class ValueExample {

    private int value;

    public ValueExample(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ValueExample{value=" + value + "}";
    }
}
