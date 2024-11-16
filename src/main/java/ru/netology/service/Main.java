package ru.netology.service;

public class Main {
    public static void main(String[] args) {
        CashBackHackService service = new CashBackHackService();

        int amount = 1000;

        int remain = service.remain(amount);

        System.out.println("Для получения максимального кэшбека купите еще на " + remain + " рублей.");
    }
}