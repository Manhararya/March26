public class Child2 extends Parent{
    float bonus = 25000;
    public static void main(String[] args) {
        Child2 child2 = new Child2();
        System.out.println("Grandparent Deposit is "+ child2.deposit/2);
        System.out.println("Parent salary is " +child2.salary/2);
        System.out.println("Child Bonus is "+child2.bonus);
        System.out.println("Child total gets "+(child2.bonus+child2.salary+child2.deposit));
    }
}
