public class Methods {

    static byte addition (byte arg) {
        arg++;
        return arg;
    }


    public static void main(String[] args) {

        int a = 676; int b = 3676;

        System.out.println("a = " + a + ", b = " + b + ", NOD = " + calculate(a, b) + ";");

        System.out.println();

        System.out.println(addition((byte) 1));

        reloadMethod();
        reloadMethod("Абырвалг!");
        reloadMethod(5);

        int bb = 3;
        int r = method(b);
        System.out.println(r);

        System.out.println();

        int aaa = 1, bbb = 2;
        mymethod(aaa, bbb);
        System.out.println(aaa + " " + bbb);


    }



    //Перегрузка

  static void reloadMethod() {
        System.out.println("Абыр!");
    }

    static void reloadMethod(String word) {
        System.out.println("word = " + word);
    }

    static void reloadMethod(int index) {
        System.out.println("index = " + index);
    }


    //Рекурсия

    static int calculate(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return calculate(b, a % b);
        }
    }


    static int method(int a) {
        a=2;
        return a*2;
    }

    private static void mymethod(int a, int b) {
        int c = a;
        a = b;
         b = c;
    }





    }


