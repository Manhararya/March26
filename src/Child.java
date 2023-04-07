import java.util.Spliterator;
public class Child extends Parent{
        float bonus = 10000;
        public static void main(String[] args) {
            Child child = new Child();
           System.out.println("Grandparent Deposit is "+ child.deposit/2);
           System.out.println("Parent salary is " +child.salary/2);
           System.out.println("Child Bonus is "+child.bonus);
           System.out.println("Child total gets "+(child.bonus+child.salary+child.deposit));
        }
}
