public class Main {
    public static void main(String[] args) {

        int startBalance = 150;
        int upBalance = 2_300;
        int allBalance = startBalance + upBalance;

        int bonus;
        if (upBalance > 1000) {
            bonus = upBalance / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
        System.out.println(allBalance);

    }
}