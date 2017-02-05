/**
 * Created by Андрей on 05.02.2017.
 */
public class task2 {
    public static void main(String[] args) {
        withdraw(100, 10);

    }

    static void withdraw(int balance, double withdraw) {
        double percent = 5;
        double comission = (withdraw * percent) / 100;
        double result = balance - withdraw - comission;
        if (result >= 0) System.out.println("OK" + comission + " " + result);
        else System.out.println("Not enough money");
    }
}
