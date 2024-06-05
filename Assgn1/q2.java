class q2 {
    // Class to hold two values
    static class ValueHolder {
        int value;

        ValueHolder(int value) {
            this.value = value;
        }
    }

    // Method to swap values using object references
    public static void swap(ValueHolder a, ValueHolder b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {
        // Create two ValueHolder objects
        ValueHolder val1 = new ValueHolder(10);
        ValueHolder val2 = new ValueHolder(20);

        // Print values before swapping
        System.out.println("Before swap:");
        System.out.println("val1: " + val1.value);
        System.out.println("val2: " + val2.value);

        // Swap the values
        swap(val1, val2);

        // Print values after swapping
        System.out.println("After swap:");
        System.out.println("val1: " + val1.value);
        System.out.println("val2: " + val2.value);
    }
}