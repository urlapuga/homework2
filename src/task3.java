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
        int nameToNumber = Arrays.asList(ownerNames).indexOf(name);
        int balance = balances[nameToNumber];
        int check = withdraw(balance,name,withdrawAmount);
        if(check!=-1) balances[nameToNumber] = check;
    }

    static int withdraw(int balance, String name, int withdraw)
    {
        int percent = 5;
        int comission = (withdraw * percent) / 100;
        int result = balance - withdraw - comission;

        if (result >= 0) {

            System.out.println(name + " " + withdraw + " " + result);
            return result;
        }
        else {
            System.out.println(name + " NO");
            return -1;
        }
        }


}
