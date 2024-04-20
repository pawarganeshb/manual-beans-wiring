package wing_b;

import wing_c.WingC;

public class WingB {
	private String owner;
	private double monthlyIncome;
	private int totalRooms;
	private WingC c;

	public WingB(String owner, double monthlyIncome, int totalRooms, WingC c) {
		super();
		this.owner = owner;
		this.monthlyIncome = monthlyIncome;
		this.totalRooms = totalRooms;
		this.c = c;
	}

	public WingB() {
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

	public WingC getC() {
		return c;
	}

	public void setC(WingC c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "WingB [owner=" + owner + ", monthlyIncome=" + monthlyIncome + ", totalRooms=" + totalRooms + ", c=" + c
				+ "]";
	}
	
	

}
