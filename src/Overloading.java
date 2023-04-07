public class Overloading {
    void add (int a, int b)
    {
        System.out.println(a + b);
    }
    void add (int maths, int eng, int sci)
    {
        System.out.println(maths + eng + sci);
    }
    void name (String Mack, String Jack, String Rack)
    {
        System.out.println(Mack + Jack + Rack);
    }
    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.add(30,20);
        overloading.add(75,89,80);
        overloading.name("M", "J", "R");
    }
}
//public class Overloading {
//
//
//    void add (int a, int b)
//    {
//        System.out.println(a + b);
//    }
//    void add (int a, int b, int c)
//    {
//        System.out.println(a + b + c);
//    }
//    public static void main(String[] args) {
//
//        Overloading overloading = new Overloading();
//        overloading.add(30,20);
//        overloading.add(75,89,80);
//
//    }
//}