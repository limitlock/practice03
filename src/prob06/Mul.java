package prob06;

public class Mul extends Arith {

	void setValue(int a, int b) {

		this.a = a;
		this.b = b;

	}

	@Override
	int calculate() {
		return a * b;
	}
}
