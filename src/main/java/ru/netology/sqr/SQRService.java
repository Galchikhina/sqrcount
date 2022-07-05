package ru.netology.sqr;

public class SQRService {
    public int calcNumberSqr(int minRangeFigure, int maxRangeFigure) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minRangeFigure && i * i <= maxRangeFigure)
                count++;
        }
        return count;
    }
}


