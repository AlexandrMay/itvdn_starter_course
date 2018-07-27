import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        int counter1 = 0, counter2 = 0;

        while (counter1 < 3) {
            counter1++;
            System.out.println("counter = " + counter1);
        }

        System.out.println("Произведено " + counter1 + " операций");


        do {
            counter2++;
            System.out.println("counter2 = " + counter2);
        } while (counter2 < 3);
        System.out.println("Произведено " + counter2 + " операций");


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        char character;
        Scanner in = new Scanner(System.in);

        for (;;) {
            character = in.next().charAt(0);

            switch (character) {
                case 'l':
                    System.out.println("Go left");
                    continue;
                case 'r':
                    System.out.println("Go right");
                    continue;
            }
            break;
        }


    }

}
