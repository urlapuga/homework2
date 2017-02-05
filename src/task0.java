/**
 * Created by Андрей on 05.02.2017.
 */
public class task0 {
    public static void main(String[] args) {

        //Задание 1 В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком.
        int q = 23;
        int w = 4;
        System.out.println("результат деления " +(double)q/w);
        System.out.println("Остаток " +q%w);

        //Задание 2 и 4 В переменной n хранится натуральное трёхзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
        int n = 211;
        int sum = 0;
        while(n != 0){
            sum = sum + (n % 10);
            n/=10;
        }
        System.out.println("Сумма цифр = "+sum);


        //Задание 3 В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
        float notint = 2.1f;
        System.out.println(Math.ceil(notint));
        System.out.println(Math.floor(notint));
        System.out.println(Math.round(notint));
    }
}
