public class DataTypes {
    public static void main(String[] args) {
        System.out.println("DATA TYPES");

        // ARITHMETIC DATA TYPES
        int a = 10;
        int b = 6;

        // Addition
        int resultAdd = a + b;
        System.out.println("a + b = " + resultAdd);

        // Subtraction
        int resultSub = a - b;
        System.out.println("a - b = " + resultSub);

        // Multiplication
        int resultMul = a * b;
        System.out.println("a * b = " + resultMul);

        // Division
        int resultDiv = a / b;
        System.out.println("a / b = " + resultDiv);

        // Modulus (Remainder)
        int resultMod = a % b;
        System.out.println("a % b = " + resultMod);

        // Increment / Decrement Operators
        int num = 5;

        System.out.println("\nPre Increment or Decrement:");
        System.out.println("Initial num: " + num);
        System.out.println("Pre-increment: " + (++num)); // Increment before using
        System.out.println("After pre-increment: " + num);
        System.out.println("Pre-decrement: " + (--num)); // Decrement before using
        System.out.println("After pre-decrement: " + num);

        System.out.println("\nPost Increment or Decrement:");
        System.out.println("Initial num: " + num);
        System.out.println("Post-increment: " + (num++)); // Use value, then increment
        System.out.println("After post-increment: " + num);
        System.out.println("Post-decrement: " + (num--)); // Use value, then decrement
        System.out.println("After post-decrement: " + num);


        // ASSIGBMENT OPERATOR

        int assign  = 5;

        System.out.println(assign);
        System.out.println("Value after using +=: " + (assign+=1));
        System.out.println("Value after using -=: " + (assign-=1));
        System.out.println("Value after using *=: " + (assign*=5));
        System.out.println("Value after using /=: " + (assign/=5));
        System.out.println("Value after using %=: " + (assign%=3));

        // Comparison Operators
        int x = 5;
        int y = 8;

        System.out.println("\nComparison Operators:");
        System.out.println("x == x: " + (x == x));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

    }
}
