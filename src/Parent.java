public class Parent extends GrantParent{
    float salary = 40000;

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Grandparent Deposit is "+ parent.deposit);
        System.out.println("Parent salary is " +parent.salary);

    }

}
