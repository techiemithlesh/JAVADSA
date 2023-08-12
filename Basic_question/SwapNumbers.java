public class SwapNumbers {
    public static void main(String []args){
        int a =5, b =15;
        System.out.println("Before Swap Numbers \n");
        System.out.println("a is = " +a);        
        System.out.println("b is = " +b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Number After Swapping \n");
        System.out.println("a is = " +a);        
        System.out.println("b is = " +b);

    }
}
