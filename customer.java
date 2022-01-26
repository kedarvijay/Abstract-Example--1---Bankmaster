package abs;

public class customer extends BankMaster {

	@Override
	public int credit(int amount) {
		setDepAmount(getDepAmount()+amount);
		return getDepAmount();
	}

	@Override
	public int debit(int amount) {
		if(amount>getDepAmount()) {
			System.out.println("Insufficient Balance : "+getDepAmount());
			return getDepAmount();
		}
		else {
			setDepAmount(getDepAmount()-amount);
			return getDepAmount();
		}
	}

	public static void main(String[] args) {
		customer pera=new customer();
		pera.openAccount("Vijay", 1000);

		IntrestCalculator fd=new IntrestCalculator(pera.getDepAmount(),4.95f,3);
		pera.viewDetails();
		pera.debit(0);
		pera.viewDetails();
		System.out.println(fd.intrAmount());
		DiscountCalc d = new DiscountCalc(10,5,10);
		System.out.println(d.CalcDis());

		


	}

}
