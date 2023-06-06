package ch18;

public class Company {
	private static Company instance = new Company();
//	프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴 private 사용
	private Company() {}
	
	public static Company getInstance() {		
		if( instance == null) {
			instance = new Company();
		}
		return instance;			
	}
	
}
