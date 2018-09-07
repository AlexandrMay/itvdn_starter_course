public class Arrays {

    public static void main(String[] args) {

        int int32[][] = new int[4][];
        System.out.println(int32.length);


    int[] array = new int[]{1, 2, 3, 4, 5};

    for (int i: array) {
        System.out.print(i);
    }
        System.out.println();


    int sizeI = 3;

    int sizeJ = 3;

    int arr[][] = new int[sizeI][sizeJ];

//Заполнение массива
        for(int i = 0; i < sizeI; i++) {
            for (int j = 0; j < sizeJ; j++){
                arr[i][j] = i * j + 1;
            }
        }
//Вывод на экран
    for(int i = 0; i < sizeI; i++) {
        for (int j = 0; j < sizeJ; j++){
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }

        System.out.println();


    int mas[] = new int[5];

        for (int i = 0; i <mas.length ; i++) {
            mas[i] = (int)((Math.random() * 10) - 5);
        }

        for (int i = 0; i <mas.length ; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        int min  = mas[0];
        int max = mas[0];
        int indexMax = 0;
        int indexMin = 0;


        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
                indexMin = i;
            }
            if (mas[i] > max) {
                max = mas[i];
                indexMax = i;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            if (i == indexMin) mas[i] = max;
            else if (i == indexMax) mas[i] = min;
        }
        for (int a : mas) {
            System.out.print(a + " ");
        }


    }


}
