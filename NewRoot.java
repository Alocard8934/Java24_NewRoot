package JAVA24;

public class NewRoot {
    public static void main(String[] args) {
        int number = 100;
        if(args.length > 0){
            number = Integer.parseInt(args[0]);
        }
        System.out.println("Square root of "
        + number 
                + " equals "
                + Math.sqrt(number)
        );
    }
}
