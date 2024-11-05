import java.util.Scanner;

/**
 * Клас Lab4 містить виконавчий метод для обробки тексту.
 */
public class Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть текст: ");
        // Заміна послідовності пробілів і табуляцій одним пробілом
        String inputText = scanner.nextLine().replaceAll("\\s+", " ");

        // Створення об'єкта тексту
        Text text = new Text(inputText);

        // Виведення обробленого тексту
        System.out.println("Оновлений текст: " + text.processText());
    }
}
