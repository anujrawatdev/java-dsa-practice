package Src;

public class bitwiseOperator {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 6;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~b);

        int n = 11;
        if((n&1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
