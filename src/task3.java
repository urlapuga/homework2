import java.util.Arrays;

/**
 * Created by Андрей on 05.02.2017.
 */
public class task3 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int withdrawAmount = 100;
        String name = "Ann";
        int[] check = withdrawArrayed(balances, ownerNames, withdrawAmount,name);
         if ( check[0]!= -1) balances[check[1]] = check[0];

    }

    static int[] withdrawArrayed(int[] balances, String[] ownerNames, int withdraw, String name) {
        int percent = 5;

        int nameToNumber = Arrays.asList(ownerNames).indexOf(name);
        if (nameToNumber == -1) {
            System.out.println("Не найдено пользователя с таким именем");
            return new int[]{-1, -1};
        }
        else {
            int balance = balances[nameToNumber];
            int comission = (withdraw * percent) / 100;
            int result = balance - withdraw - comission;
            if (result >= 0) {
                System.out.println(name + " " + withdraw + " " + result);
                return new int[] {result,nameToNumber};
            } else {
                System.out.println(name + " NO");
                return new int[]{-1, -1};
            }
        }

    }




}
