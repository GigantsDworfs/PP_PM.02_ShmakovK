package shmakov_calculator1;
import java.util.Scanner;

public class CalculatorOtShmakova {
	
	public static void main(String[] args) {
		System.out.println("Введите операцию: ");
		System.out.println ("1. Сложение");
		System.out.println ("2. Вычитание");
		System.out.println ("3. Умножение");
		System.out.println ("4. Деление");
		//Шмаков_Кирилл_Андреевич
		Scanner scanner = new Scanner (System.in);
		int operation = scanner.nextInt();
		
		System.out.println ("Введите первое число: ");
		int x = scanner.nextInt();
		System.out.println ("Введите второе число: ");
		int y = scanner.nextInt();
		
		int result = 0;
		
		if (operation == 1)
			result = x + y;
		else if (operation == 2)
			result = x - y;
		else if (operation == 3)
			result = x * y;
		else if (operation == 4)
			result = x / y;
		System.out.println ("Результат = " + result);
		System.out.println ("Сделал: Шмаков Кирилл Андреевич");
	}
}
