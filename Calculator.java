import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.ArithmeticException;

class Calculator {
	static void operations(int input) {
		if (input>4 ) {
			System.out.println("Input cannot exceed 4");
			return;
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of digits (Press 0 to exit):");
		int n = scanner.nextInt();

		if (n == 0 ) {
			System.out.println("Input cannot be 0");
			return;
		}
		double[] arr = new double[n];

		System.out.println("Enter the numbers");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextDouble();
		}

		double result = arr[0];
		for (int i = 1; i < n; i++) {
			switch (input) {
			case 1:
				result += arr[i];
				break;
			case 2:
				result -= arr[i];
				break;
			case 3:
				result *= arr[i];
				break;
			case 4:
				try {
					if(Double.isInfinite(result/= arr[i]))
					{
						throw new ArithmeticException();
					}
				} catch (ArithmeticException e) {
					System.out.println("Error: Not able to divide by Zero");
					return;
				}
				break;
			}
		}
		System.out.println("The Output for the Operation " + input + " is " + result + "\n");
	}

	public static void main(String[] args) {

		Calculator main=new Calculator();
		int n;
		int input = 0;
		Scanner s = new Scanner(System.in);
		double result = 0;

		do {
			System.out.println("What do you wanna do ?\n 1.ADD\n 2.SUBTRACT\n 3.MULTIPLY\n 4.DIVISION\n 0.EXIT");
			System.out.println("Enter the operation no:");
			try {
			input = s.nextInt();

				if (input != 0) {
					operations(input);
				} else {
					System.out.println("Exiteddd");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Mismatched Input");
				s.nextLine();
				input = -1;
			}

		} while (input != 0);

		s.close();
	}
}