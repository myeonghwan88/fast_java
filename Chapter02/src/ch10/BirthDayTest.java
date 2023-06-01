package ch10;

public class BirthDayTest {

	public static void main(String[] args) {

		BirthDay date = new BirthDay();
		date.setYear(2019);
		date.setMonth(1);
		date.setDay(32);
		
		date.showDate();
		System.out.println(date.getIsVaild());
	}

}
