package ru.netology.service;

public class Main {
    public static void main(String[] args) {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;
        int actual = service.remain(amount);

        System.out.println("Для получения максимального кэшбека необходимо купить еще на " + actual + " рублей.");
    }
}