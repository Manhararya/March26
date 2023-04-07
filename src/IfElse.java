public class IfElse {
    public static void main(String[] args) {
        int percentage = 65;

        if(percentage>=70) {
            System.out.println("grade Dist.");
        } else if (percentage>=60) {
                System.out.println("grade First");
            } else if (percentage>=50){
            System.out.println("grade Second");
        } else if (percentage>=35){
            System.out.println("grade Pass");
        } else {
            System.out.println("grade Fail");
        }
    }
}
