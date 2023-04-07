public class Overriding{
    static int a = 20;
    static int b = 10;
    static int m1(){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(m1());
    }

}
