public class MathOperations {

    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("Hello Kate!!!");

       int a = 222;
       int b = 67;

       int minus = Math.abs(a-b);
       int plus = Math.abs(a+b);
       int mnojennia = Math.abs(a*b);
       int c = -7 % 4;

       System.out.println("result -: " + minus);
       System.out.println("result +: " + plus);
       System.out.println("result *: " + mnojennia);
//        System.out.printf("***:  %s", a*b);
       System.out.println(c);
        // int a = 5;
        // int b = a++;
        // System.out.println(b);

        // int x = 5;
        // x *= 2 + 3;
        // System.out.println(x);
    }
}
