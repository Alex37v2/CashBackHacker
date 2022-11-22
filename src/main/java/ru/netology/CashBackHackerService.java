package ru.netology;

public class CashBackHackerService {
    public final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}

