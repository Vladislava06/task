import java.util.Scanner;

public class task_4 {

public static void main(String[] args) {
try {
String input = readNonEmptyStringFromUser();
System.out.println("Введенная строка: " + input);
} catch (Exception e) {
System.out.println("Ошибка: пустые строки не разрешены.");
}
}

public static String readNonEmptyStringFromUser() throws Exception {
Scanner scanner = new Scanner(System.in);
System.out.print("Введите строку: ");
String input = scanner.nextLine();

if (input.isEmpty()) {
throw new Exception("Пустая строка!");
}

return input;
}
}