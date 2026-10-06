//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

    public static void main(String[] args) {


    }
}