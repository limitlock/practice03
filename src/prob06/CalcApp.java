package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while (true) {
			String input = scanner.nextLine();
			String[] input_arr = input.split(" ");
			i++;
			/* 코드를 완성 합니다 */
			if (input_arr[1].equals("+")) {
				Add add = new Add();
				add.setValue(Integer.parseInt(input_arr[0]), Integer.parseInt(input_arr[2]));
				System.out.println(add.calculate());
				System.out.println("quit");
				break;
			} else if (input_arr[1].equals("-")) {
				Sub sub = new Sub();
				sub.setValue(Integer.parseInt(input_arr[0]), Integer.parseInt(input_arr[2]));
				System.out.println(sub.calculate());
				System.out.println("quit");
				break;
			} else if (input_arr[1].equals("*")) {
				Mul mul = new Mul();
				mul.setValue(Integer.parseInt(input_arr[0]), Integer.parseInt(input_arr[2]));
				System.out.println(mul.calculate());
				System.out.println("quit");
				break;
			} else if (input_arr[1].equals("/")) {
				Div div = new Div();
				div.setValue(Integer.parseInt(input_arr[0]), Integer.parseInt(input_arr[2]));
				System.out.println(div.calculate());
				System.out.println("quit");
				break;
			}

		}

	}

}
