public class Main {
    public static void main(String[] args) {
        int currentBalance = 200;
        int deposit = 1300;
        int minimalDeposit = 1000;
        int spentForBonus = 100;
        int bonusPerHundred = 1;
        if (deposit >= minimalDeposit) {
            int finalBonus = deposit / spentForBonus * bonusPerHundred;
            System.out.println(finalBonus);
        }
    }
}
