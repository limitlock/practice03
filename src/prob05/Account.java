package prob05;

public class Account {

	private String accountNo;
	private int balance;

	public Account(String accountNo) {

		this.accountNo = accountNo;
		System.out.println(accountNo + " 계좌가 개설되었습니다.");
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getBalance() {
		return String.valueOf(balance);
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setBalance(String balance) {
		this.balance = Integer.parseInt(balance);
	}

	public void save(int input) {
		// TODO Auto-generated method stub
		balance += input;
		System.out.println(accountNo + " 계좌에 " + input + "만원이 입금되었습니다.");
	}

	public void deposit(int output) {
		// TODO Auto-generated method stub
		balance -= output;
		System.out.println(accountNo + " 계좌에 " + output + "만원이 출급되었습니다.");

	}

}