public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println( s1 == s2);
        System.out.println( s3 == s4);
        System.out.println( s1 == s3);
        System.out.println("s1.equals(s3) " + s1.equals(s3));
        System.out.println("s1.equals(s2) " + s1.equals(s2));
        System.out.println("Hello world!");

        var deborah = "0123456 Ogundipe";
        var debiSub = deborah.substring(7);
        System.out.println(debiSub);
        var debiSub2 = deborah.substring( 1, 6);
        System.out.println(debiSub2);
    }
}