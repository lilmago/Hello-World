import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // Вендинговый аппарат - это автоматическое устройство для торговли без участия продавца
        int twixPrice = 540;
        int marsPrice = 520;
        int snickersPrice = 550;
        int bonAquaPrice = 300;

        boolean isCanBuy = false;

        System.out.println("Введите кол-во ваших денег: ");
        int moneyAmount = new Scanner(System.in).nextInt();

        if (moneyAmount >= twixPrice) {
            System.out.println("Вы можете купить Твикс!");
            isCanBuy = true;
        }
        if (moneyAmount >= marsPrice) {
            System.out.println("Вы можете купить Марс!");
            isCanBuy = true;
        }
        if (moneyAmount >= snickersPrice) {
            System.out.println("Вы можете купить Сникерс!");
            isCanBuy = true;
        }
        if (moneyAmount >= bonAquaPrice) {
            System.out.println("Вы можете купить Бонакву!");
            isCanBuy = true;
        }
        if (isCanBuy == false) {
            System.out.println("У вас не достаточно денег!");
        }

    }

}


