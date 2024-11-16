package oop.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("잔액은: " + balance);
    }

    void withdraw(int amount) {
        if (balance - amount < 0) {
            System.out.println("잔액 부족");
            return;
        }
        balance -= amount;
        System.out.println("잔액은: " + balance);
    }
}
