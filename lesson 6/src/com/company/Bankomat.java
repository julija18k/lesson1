package com.company;

import java.util.Scanner;

public class Bankomat {
    public static void showBankServiceMenu(){
        System.out.println("справочная информация");
        System.out.println("Для возврата в главное меню тнажмите любую кнопку");
        Scanner s = new Scanner(System.in);
        s.next();//то что введено не сохраняем и переходим в главное меню
        s.nextLine();
        ShowMenu();
    }
    public static void ShowMenu() {
        Scanner s = new Scanner(System.in);
        System.out.println("Hello");
        while (true) {
            System.out.println("1.Вставить карточку");
            System.out.println("2.Услуги банка");
            System.out.print("Ваш выбор:");
            int item;
            try {
                item = s.nextInt();
                s.nextLine();//  введенные данные преобразовываются к инт, если нет прогр вылетит
            } catch (Exception e) {
                System.out.println("Неверный выбор, повторите попытку");
                s.nextLine();
                continue;// выполнение произойдет(перекинется) к началу цикла
            }
            switch (item) {
                case 1:
                    System.out.println("Введите пин код");
                    String pin = s.next(); // читаем пин код с клавиатуры
                    if (checPin(pin)){
                        showCardActionsMenu();
                        return;// прервет весь цикл, а не только свич
                    }


                case 2:
                    showBankServiceMenu();
                    return;
                default:
                    System.out.println("Неверный выбор, повторите попытку");
            }
        }

    }

    public static void showCardActionsMenu() {
        Scanner s = new Scanner(System.in);
        int item=0;
        while (true) {

            if (item==0){
                System.out.println("1.показать текущий счет");
                System.out.println("2.выдача наличных");
                System.out.println("3.назад");
                System.out.print("Ваш выбор:");

                try {
                    item = s.nextInt();//  введенные данные преобразовываются к инт, если нет прогр вылетит
                    s.nextLine();
                } catch (Exception e) {
                    System.out.println("Неверный выбор, повторите попытку");
                    s.nextLine();
                    continue;
                }
            }

            switch (item) {
                case 1: int balance=BankService.getBalance();
                System.out.print("Ваш баланс составляет");
                System.out.println(balance);
                break;// обнуляет свич
                case 2: System.out.println("Введите суму");
                int sum;
                try{
                    sum= s.nextInt();
                    s.nextLine();
                } catch (Exception e){
                    System.out.println("введена некоректная сумма");
                    s.nextLine();
                    continue;// прерываем свич, но не обнуляем

                }
                    try {
                        BankService.getCash(sum);
                        System.out.println(" ваш баланс");
                        System.out.println(BankService.getBalance());
                    } catch (Exception e) {
                        //e.printStackTrace();
                        System.out.println(e.getMessage());
                        break;
                    } break;
                case 3: ShowMenu();
                return;
            } item=0;

        }
    }
    public static boolean checPin(String pin){
        try {
            BankService.confirmPin(pin);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        } return true;

    }
}