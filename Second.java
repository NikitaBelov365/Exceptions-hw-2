public class Second {
    public static void main(String[] args) {
        int[] intArray = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        try {
            int d = 0;
            if (d != 0) {
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}