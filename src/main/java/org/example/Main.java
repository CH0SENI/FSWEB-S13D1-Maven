package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false; // geçersiz saat..
        }
        if (!isBarking) {
            return false; // köpek havlamıyor
        }
        return (clock >= 20 || clock < 8);
    }

    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    private static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return temp >= 25 && temp <= 45;
        } else {
            return temp >= 25 && temp <= 35;
        }
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}