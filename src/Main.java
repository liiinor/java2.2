public class Main {
    public static void main(String[] args) {

        int initialAccount = 0; //начальный счёт
        int replenishmentAmount = 1300; //сумма пополнения
        int rublesPerRuble = 100; //количество рублей для одного бонусного рубля

        int bonus;
        int account;
        if (replenishmentAmount > 1000) {
            bonus = (replenishmentAmount / 100);
            account = (initialAccount + replenishmentAmount + bonus);
        } else {
            bonus = 0;
            account = initialAccount + replenishmentAmount;
        }

        System.out.println("Количество бонусных рублей:" + bonus);
        System.out.println("Итоговый счёт:" + account);

    }
}