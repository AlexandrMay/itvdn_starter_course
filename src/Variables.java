import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ввести целое число: ");

        int a = input.nextInt();

        System.out.println("Ввести дробное число: ");

        float b = input.nextFloat();

        System.out.println("Ввести строку: ");

        String c = input.next(); //введет до пробела

        input = new Scanner(System.in);

        System.out.println("Ввести строку: ");

        String s = input.nextLine();

        System.out.println(a + "\n" + b + "\n" + c + "\n" + s);

    }

}
