import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        //Тернарный оператор:

        int a = 11;
        int b = 2;
        int c = 0;

        c = (a > b) ? a : b;
        System.out.println(c);


        //Switch-case:

        int day;
        Scanner in = new Scanner(System.in);

        day = in.nextInt();

        switch (day) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Wtf?");
                break;
        }
    }

}
