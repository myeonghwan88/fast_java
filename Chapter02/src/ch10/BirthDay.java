package ch10;

public class BirthDay {

	private int day; // 기본 0
	private int month;  // 기본 0
	private int year;  // 기본 0
	
	private boolean isVaild; // 기본 false
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		switch(this.month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			if(day > 31) {
				isVaild = false;				
			} else {
				isVaild = true;
				this.day = day;
			}			
			break;
		case 2: 
			if(day > 28) {
				isVaild = false;				
			} else {
				isVaild = true;
				this.day = day;
			}	
			break;
		case 4: case 6: case 9: case 11:
			if(day > 30) {
				isVaild = false;				
			} else {
				isVaild = true;
				this.day = day;
			}	
			break;
		default:
			break;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month >12) {
			isVaild = false;
		} else {
			isVaild = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isVaild) {
			System.out.println(year + "년 " + month +"월 " + day + "일 입니다.");
		} else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
	public boolean getIsVaild() {
		return isVaild;
	}
	
}
