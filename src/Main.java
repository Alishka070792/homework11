//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
public class Main {


    // Метод для 1 задачи
    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год.");
        } else {
            System.out.println(year + " год - невисокосный год.");
        }
    }

    // Метод для 2 задачи
    public static void softwareType(int clientDeviceYear, int clientOS) {
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите обычную версию для iOS");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите обычную версию для Android");
        }
    }

    // Метод для 3 задачи
    public static int calculationOfDelivery(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 100) {
            return -1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays += 1;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays += 2;
        }
        return deliveryDays;
    }


    public static void main(String[] args) {

        System.out.println("Task 1");
        Main.checkLeapYear(2025);
        System.out.println();

        System.out.println("Task 2");
        softwareType(2014, 0);
        System.out.println();

        System.out.println("Task 3");
        int days = calculationOfDelivery(105);
        if (days == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + days);
        }

    }
}
