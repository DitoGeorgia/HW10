import java.util.Scanner;

public class Main {
    static String booksInfo = "";


    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            double bookPrice = inputBookPrice();
            System.out.println();
            addBook(name);
            addBook(name, pageCount);
            addBook(name, pageCount, bookPrice);
            printInfo();
            System.out.println();
        }
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }

    public static double inputBookPrice() {
        System.out.println("Введите цену: ");
        return new Scanner(System.in).nextDouble();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0);
    }

    public static void addBook(String bookName, int pageCount) {
        addBook(bookName, pageCount, 0);
    }

    public static void addBook(String bookName, int pageCount, double bookPrice) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр. " +
                (bookPrice > 0 ? bookPrice + " руб." : "не установлено") + "\n";
    }

    public static void printInfo() {
        String[] lines = booksInfo.toString().split("\n"); // Разбиваем на строки
        System.out.println("Список книг:");

        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]); // Вывод строки
            if ((i + 1) % 3 == 0) {       // После каждой третьей строки
                System.out.println();     // Пустая строка
            }
        }
    }
}