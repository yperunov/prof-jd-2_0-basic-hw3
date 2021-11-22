package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //task1 = option1
        int clientOS = 1; // 0 — iOS, 1 — Android.
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Выберите ссылку для скачивания приложения вручную");
        }

        //task1 = option2
        //int clientOS = 1; // 0 — iOS, 1 — Android.
        if (clientOS==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS==1) {
        System.out.println("Установите версию приложения для Android по ссылке");
        }  else {
        System.out.println("Выберите ссылку для скачивания приложения вручную");
        }

        //task2
        int clientDeviceYear = 2015; //год выпуска устройства
        if (clientDeviceYear < 2015)
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Выберите ссылку для скачивания облегченной версии приложения вручную");
            }
        else
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Выберите ссылку для скачивания приложения вручную");
            }

        //task3
        int year = 2021;
        if (year%400==0){
        System.out.println(year+"г = високосный год");
        } else if (year%100==0) {
        System.out.println(year+"г = не високосный год");
        } else if (year%4==0) {
        System.out.println(year+"г = високосный год");
        } else {
        System.out.println(year+"г = не високосный год");
        }

        //task4
        int deliveryDistance = 95;
        int timeUpTo20Km = 1;
        int timeEachNewSegment = 1;
        int segmentDistance = 100-60;
        int segmentsQty = (int) Math.ceil ((deliveryDistance - 20)*1f / segmentDistance);
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + timeUpTo20Km);
        } else if (deliveryDistance >= 20) {
            System.out.println("Потребуется дней: " + (timeUpTo20Km + segmentsQty * timeEachNewSegment));
        }

        //task5
        int monthNumber = 12;
        switch (monthNumber){
            case (1):
                System.out.println("Месяц принадлежит к сезону Зима");
                break;
            case (2):
                System.out.println("Месяц принадлежит к сезону Зима");
                break;
            case (3):
                System.out.println("Месяц принадлежит к сезону Весна");
                break;
            case (4):
                System.out.println("Месяц принадлежит к сезону Весна");
                break;
            case (5):
                System.out.println("Месяц принадлежит к сезону Весна");
                break;
            case (6):
                System.out.println("Месяц принадлежит к сезону Лето");
                break;
            case (7):
                System.out.println("Месяц принадлежит к сезону Лето");
                break;
            case (8):
                System.out.println("Месяц принадлежит к сезону Лето");
                break;
            case (9):
                System.out.println("Месяц принадлежит к сезону Осень");
                break;
            case (10):
                System.out.println("Месяц принадлежит к сезону Осень");
                break;
            case (11):
                System.out.println("Месяц принадлежит к сезону Осень");
                break;
            case (12):
                System.out.println("Месяц принадлежит к сезону Зима");
                break;
            default:
                System.out.println("Проеврьте номер месяца. Допустимы значения от 1=Январь до 12=Декабрь");
        }
    }
}
