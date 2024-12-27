public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println();

        System.out.println("Задача 1");
        int[] rack = {26000, 35000, 42000, 18000, 21000};
        int sum = 0;
        for (int element : rack) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        System.out.println("Задача 2");
        int maxRack = -1;
        for (int j : rack) {
            if (j > maxRack) {
                maxRack = j;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxRack + " рублей");
        int minRack = 100000;
        for (int j : rack) {
            if (j < minRack) {
                minRack = j;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minRack + " рублей");
        System.out.println();

        System.out.println("Задача 3");
        int average = 0;
        {
            for (int i = 0; i < rack.length; i++) {
                average += rack[i];
            }
            average = average / rack.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println();

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.printf("%s", reverseFullName[i]);
        }
    }


}