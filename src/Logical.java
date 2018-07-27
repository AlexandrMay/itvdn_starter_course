public class Logical {

    public static void main(String[] args) {

        byte operand1, operand2;
        int result;

        operand1 = 127;
        operand2 = 1;
        result = operand1 & operand2;
        System.out.println(operand1 + " AND " + operand2 + " = " + result);

        operand1 = 2;
        operand2 = 1;
        result = operand1 | operand2;
        System.out.println(operand1 + " OR " + operand2 + " = " + result);

        operand1 = 3;
        operand2 = 1;
        result = operand1 ^ operand2;
        System.out.println(operand1 + " XOR " + operand2 + " = " + result);

        operand1 = 1;
        result = ~operand1;
        System.out.println(" NOT " + operand1 + " = " + result);

        operand1 = 1;
        result = ~operand1;
        result++;
        System.out.println(" NOT " + operand1 + " = " + result);

        System.out.println();

        byte port = 0b1110000;   //0111 0000
        byte mask = 0b0000010;   //0000 0010

        System.out.println("Port " + port);

        port = (byte)(port|mask);

        System.out.println("Port " + port);

        mask = 0b1111101;    //0111 1101
        port = (byte)(port&mask);
        System.out.println("Port " + port);

        System.out.println();

        short sekretKey = 0b0101;
        char character = 'A';
        System.out.println("Исходный символ: " + character + ", его код в кодовой таблице: " + (byte)(character));

        character = (char)(character^sekretKey);
        System.out.println("Зашифрованный символ: " + character + ", его код в кодовой таблице: " + (byte)(character));

        character = (char)(character^sekretKey);
        System.out.println("Расшифрованный символ: " + character + ", его код в кодовой таблице: " + (byte)(character));

        System.out.println();
        int a = 0, b = 3, c = 5;

        if (a<b && b<c) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        if (a<b && a<c) {
            System.out.println(a);
        }
        else if (b<a && b<c){
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }

        System.out.println();
        byte operand = 0b0000001;
        System.out.println("Число до сдвига: " + operand);

        operand = (byte)(operand<<2);  //сдвиг влево - это как умножить на двойку в степени 2 (в пэтом примере)

        System.out.println("Число после сдвига влево: " + operand);

        operand = (byte)(operand>>1); //сдвиг вправо - это как поделить на двойку в степени 1 (в пэтом примере)

        System.out.println("Число после сдвига вправо: " + operand);

        int number = -1 >>> 24;
        System.out.println(number);

    }

}
