/**
 * Created by Андрей on 05.02.2017.
 */
public class task1 {

    public static void main(String[] args) {
        double[] myArray = {4, 2, 3, 4.55, 5.61, 6, 7, 8.12, 9, 0.1};
        int[] myIntArray = {4, 2, 3, 5, 6, 7, 7, 8, 9, 10};
        double max1 = max(myArray);

        //Вывод результатов
        System.out.println("Сумма - " + sum(myIntArray));
        System.out.println("Сумма ИНТ - " + sum(myArray));

        System.out.println("Минимальный " + min(myArray));
        System.out.println("Минимальный ИНТ " + min(myIntArray));

        System.out.println("Максимальный " + max1 );
        System.out.println("Максимальный Инт" + max(myIntArray) );


        double maxPos = maxPositive(myArray);
        if(maxPos==0)System.out.println("Максимальный Позитивный не найден" );
        else System.out.println("Максимальный Позитивный - " + maxPos );

        int maxPosInt = maxPositive(myIntArray);
        if(maxPosInt==0)System.out.println("Максимальный Позитивный ИНТ не найден" );
        else System.out.println("Максимальный Позитивный ИНТ - " + maxPosInt );


        System.out.println("Модуль первого - " + modulus(myArray[0]));
        System.out.println("Модуль последнего - " + modulus(myArray[myArray.length - 1]));

        System.out.println("Модуль первого ИНТ - " + modulus(myIntArray[0]));
        System.out.println("Модуль последнего - " + modulus(myIntArray[myIntArray.length - 1]));

        System.out.println("Второй по величине элемент  - " + secondLargest(myArray));
        System.out.println("Второй по величине элемент ИНТ - " + secondLargest(myIntArray));

        System.out.println("Мультипликация  - " + multiplication(myArray));
        System.out.println("Мультипликация ИНТ- " + multiplication(myIntArray));
    }

    static int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static double sum(double arr[]) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static double min(double arr[]) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) if (min > arr[i]) min = arr[i];
        return min;
    }

    static int min(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) if (min > arr[i]) min = arr[i];
        return min;
    }


    public static double max(double arr[]) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) if (max < arr[i]) max = arr[i];
        return max;
    }

    static int max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) if (max < arr[i]) max = arr[i];
        return max;
    }

    static double maxPositive(double arr[]) {
        double maxPositive = 0;
        for (int i = 0; i < arr.length; i++) if (maxPositive < arr[i] && arr[i]>0) maxPositive = arr[i];
        return maxPositive;
    }

    static int maxPositive(int arr[]) {
        int maxPositive = 0;
        for (int i = 0; i < arr.length; i++) if (maxPositive < arr[i] && arr[i]>0) maxPositive = arr[i];
        return maxPositive;
    }


    static double multiplication(double arr[]) {
        double multiplication = 1;
        for (int i = 0; i < arr.length; i++) multiplication*=arr[i];
        return multiplication;
    }

    static int multiplication(int arr[]) {
        int multiplication = 1;
        for (int i = 0; i < arr.length; i++) multiplication*=arr[i];
        return multiplication;
    }

    static double modulus(double value) {
        return Math.abs(value);
    }

    static int modulus(int value) {
        return Math.abs(value);
    }

    static double secondLargest(double arr[]) {
        double max1 = max(arr);
        double max2 = arr[0];
        for (int i = 0; i < arr.length; i++) if (max2 < arr[i] && arr[i]!=max1) max2 = arr[i];
        return max2;
    }

    static int secondLargest(int arr[]) {
        int max1 = max(arr);
        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) if (max2 < arr[i] && arr[i]!=max1) max2 = arr[i];
        return max2;
    }

}
