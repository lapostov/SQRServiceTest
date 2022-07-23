package ru.netology.sqr.HowManySquares.services;

public class SQRService {
    public int calcSQRService;

    public int calcSQRService(int low, int high) {
        int x = 0;
        for (int i = 10; i <=99; i++){
            if (i * i >= low && i * i <= high) {
                x++;
            }
        }
        return x;
    }
}
