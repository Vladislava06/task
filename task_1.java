import java.util.Scanner;

public class task_1 {

public static void main(String[] args) {
float number = readFloatFromUser();
System.out.println("Введенное число: " + number);
}

public static float readFloatFromUser() {
Scanner scanner = new Scanner(System.in);
float number = 0;
boolean isValidInput = false;

while (!isValidInput) {
System.out.print("Введите дробное число: ");
String input = scanner.nextLine();

try {
number = Float.parseFloat(input);
isValidInput = true;
} catch (NumberFormatException e) {
System.out.println("Ошибка: введено некорректное значение. Пожалуйста, введите число.");
}
}

return number;
}
}