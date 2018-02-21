package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = null;

		Goods[] goods = new Goods[COUNT_GOODS];

		for (int i = 0; i < COUNT_GOODS; i++) {
			scanner = new Scanner(System.in);
			String ex = scanner.nextLine();
			String[] ex_num = ex.split(" ");

			goods[i] = new Goods(ex_num[0], Integer.parseInt(ex_num[1]), Integer.parseInt(ex_num[2]));

		}

		for (int i = 0; i < COUNT_GOODS; i++) {
			System.out.println(
					goods[i].getJuice() + "(가격:" + goods[i].getPrice() + "원)이 " + goods[i].getNum() + "개 입고 되었습니다.");
		}

		scanner.close();
	}
}
