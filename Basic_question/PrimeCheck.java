public class PrimeCheck {
    public static void main(String[] args) {
        int num = 50;
        boolean isItPrime = false;

        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isItPrime = true;
                break;
            }
        }
        
        if (!isItPrime) {
            System.out.println("A Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
