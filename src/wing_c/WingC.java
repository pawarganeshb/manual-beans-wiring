package wing_c;

public class WingC {
	private String owner;
	private double monthlyIncome;
	private int totalRooms;
	
	public WingC(String owner, double monthlyIncome, int totalRooms) {
		super();
		this.owner = owner;
		this.monthlyIncome = monthlyIncome;
		this.totalRooms = totalRooms;
	}
	public WingC() {
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
	@Override
	public String toString() {
		return "WingC [owner=" + owner + ", monthlyIncome=" + monthlyIncome + ", totalRooms=" + totalRooms + "]";
	}
	
	
}
