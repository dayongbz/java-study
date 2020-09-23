package c.exception;

public class ExecptionSample {
    public static void main(String[] args) {
        ExecptionSample sample = new ExecptionSample();
        sample.arrayOutOfBoundsTryCatch();
    }
    public void arrayOutOfBounds() {
        int[] intArray = new int[5];
        System.out.println(intArray[5]);
    }
    public void arrayOutOfBoundsTryCatch() {
        try {
            int[] intArray = new int[5];
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.err.println("Exception occured.");
        }
    }
}
