package wing_a;

import wing_b.WingB;

public class WingA {
	private String owner;
	private double monthlyIncome;
	private int totalRooms;
	private WingB b;

	public WingA(String owner, double monthlyIncome, int totalRooms, WingB b) {
		super();
		this.owner = owner;
		this.monthlyIncome = monthlyIncome;
		this.totalRooms = totalRooms;
		this.b = b;
	}

	public WingA() {
		super();
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public int getTotalRooms() {
		return totalRooms;
	}

	public void setTotalRooms(int totalRooms) {
		this.totalRooms = totalRooms;
	}

	public WingB getB() {
		return b;
	}

	public void setB(WingB b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "WingA [owner=" + owner + ", monthlyIncome=" + monthlyIncome + ", totalRooms=" + totalRooms + ", b=" + b
				+ "]";
	}

}
