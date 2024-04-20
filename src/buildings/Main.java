package buildings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import wing_a.WingA;
import wing_b.WingB;
import wing_c.WingC;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext bf = new FileSystemXmlApplicationContext("beans.xml");

		WingA a = (WingA) bf.getBean("winga");
		WingB b = a.getB();
		WingC c = b.getC();
		System.out.println("****Wing A****");
		System.out.println("Owner Name: " + a.getOwner());
		System.out.println("Monthly Income: " + a.getMonthlyIncome());
		System.out.println("Total Rooms: " + a.getTotalRooms());
		System.out.println("****Wing B****");
		System.out.println("Owner Name: " + b.getOwner());
		System.out.println("Monthly Income: " + b.getMonthlyIncome());
		System.out.println("Total Rooms: " + b.getTotalRooms());
		System.out.println("****Wing C****");
		System.out.println("Owaner Name: " + c.getOwner());
		System.out.println("Monthly Income: " + c.getMonthlyIncome());
		System.out.println("Total Rooms: " + c.getTotalRooms());
	}

}
//echo "# bean-wiring" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/pawarganeshb/bean-wiring.git
//git push -u origin main