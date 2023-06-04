package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {

		Person person = new Person("Edward", 20000);
		Taxi taxi = new Taxi("잘 간다 운수");
		
		person.takeTaxi(taxi);
		person.showInfo();
		taxi.showTaxiinfo();
		
	}

}
