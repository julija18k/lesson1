package com.company;

public class BankService {
    public static void confirmPin(String pin) throws Exception {
        if (!pin.equals("1212")){
            //! =если пин коды равны получаем тру, если не правда фолсе, можно написать(pin.equals("1212")==false)
            throw new Exception("Неверный пин код");


        }}
        public static int balance=100000;
    public static int getBalance(){

            return balance;
        }
        public static void getCash (int sum)throws  Exception{
        if (sum>balance){
            throw new Exception("недостаточно средств"); // обработка исключения произойдет на уровне вызова
        }
        balance-=sum;// одно и то же с balance= balance-sum;
        }

}
