import java.util.Arrays;

/**
 * Created by Андрей on 05.02.2017.
 */
public class task4 {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        int nameToNumber = Arrays.asList(ownerNames).indexOf(ownerName);
        if (nameToNumber == -1) System.out.println("Пользователь не найден");
        else {
            double fund = 100;
            balances[nameToNumber] += fund;
            System.out.println(ownerName + " " + balances[nameToNumber]);
        }
    }

}
