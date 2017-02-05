/**
 * Created by Андрей on 05.02.2017.
 */
public class task1 {

    public static void main(String[] args) {
        double[] myArray = {4, 2, 3, 4.55, 5.61, 6, 7, 8.12, 9, 0.1};
        double max1 = max(myArray);

        //Вывод результатов
        System.out.println("Сумма - " + sum(myArray));
        System.out.println("Минимальный " + min(myArray));
        System.out.println("Максимальный " + max1 );
        System.out.println("Максимальный Позитивный " + maxPositive(myArray));
        System.out.println("Модуль первого - " + modulus(myArray));
        System.out.println("Модуль последнего - " + modulusLast(myArray));
        System.out.println("Второй по величине элемент  - " + secondLargest(myArray,max1));
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

    static double max(double arr[]) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) if (max < arr[i]) max = arr[i];
        return max;
    }

    static double maxPositive(double arr[]) {
        double maxPositive = 0;
        for (int i = 0; i < arr.length; i++) if (maxPositive < arr[i] && arr[i]>0) maxPositive = arr[i];
        return maxPositive;
    }

    static double multiplication(double arr[]) {
        double multiplication = 1;
        for (int i = 0; i < arr.length; i++) multiplication*=arr[i];
        return multiplication;
    }

    static double modulus(double arr[]) {
        int modulus = 1;
        for (int i = 1; i < arr[0]; i++) modulus*=i;
        return modulus;
    }

    static double modulusLast(double arr[]) {
        int modulus = 1;
        for (int i = 1; i < arr[arr.length-1]; i++) modulus*=i;
        return modulus;
    }


    static double secondLargest(double arr[],double max1) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) if (max < arr[i] && arr[i]!=max1) max = arr[i];
        return max;
    }




}
