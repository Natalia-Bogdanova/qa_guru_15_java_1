package org.example;

public class HelloWord {
    public static void main(String[] args) {
        String result = "Результат выполнения ";

        //  + - * / % (Математические)
        int first = 15;
        int second = 5;
        int third = 200;
        double fourth = 15.5;
        System.out.println(result + "сложения,деления и умножения равен" + (third/(first+second)-fourth));
        System.out.println(result + "получения остатка от деления " + ('-' ) + (third%first));
        //  > < >= <= == != ! (сравнения)
        System.out.println(result + "сравнения больше/меньше " + ('-' ) + false);
        System.out.println(result + "сравнения равенства/не равенства " + ('-' ) + (first!=second || third>=fourth));

        //   && || (Логические) и if else
        if (first>second && third==fourth){
            System.out.println(result + "логического оператора " + ('-' ) + "Условие выполнено");
        }
        else if(first>second && third<fourth) {
            System.out.println(result + "логического оператора " + ('-' ) + "Условие выполнено");
        }
        else {
            System.out.println(result + "логического оператора " + ('-' ) + "Условие не выполнено");
        }

        // switch/case
        int number = 10;
        switch (number){
            case 2:
                System.out.println(result + ('-' ) +"2");
                break;
            case 5:
                System.out.println(result + ('-' ) + "5");
                break;
            case 10:
                System.out.println(result + ('-' ) + "10");
                break;
            default:
                System.out.println(result + "switch/case " + ('-' ) + "Число не равно 2, 5, 10");
        }

        //переполнение с выводом в консоль
            byte numberOne = (byte) (Byte.MAX_VALUE + 1);
            byte numberTwo = (byte) (Byte.MAX_VALUE + 2);
        System.out.println(result + "переполнения равен " + numberOne + " = Max_byte + 1");
        System.out.println(result + "переполнения равен " + numberTwo + " = Max_byte + 2");

        //Вычисления комбинаций типов данных (int и double)
            int firstValue=100;
            int secondValue=30;
            double thirdValue=30;
                System.out.println("Деление int=100 на int=30 дает целочисленный результат " + (firstValue/secondValue));
                System.out.println("Деление int=100 на double=30 дает дробный результат " + (firstValue/thirdValue));


    }
}