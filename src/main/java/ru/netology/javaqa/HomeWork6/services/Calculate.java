
package ru.netology.javaqa.HomeWork6.services;

public class Calculate {
    public int calculateVac(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + (income - expenses);
            }
        }
        return count;
    }
}