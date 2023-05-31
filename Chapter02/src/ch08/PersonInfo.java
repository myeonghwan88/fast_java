package ch08;

public class PersonInfo {
	
	public int height;
	public int weight;
	public String personName;
	public int personAge;
	
	public PersonInfo(int heigth, int weigth, String personName, int personAge) {
		this.height = heigth;
		this.weight =weigth;
		this.personName = personName;
		this.personAge = personAge;
	}
	
	public String showPersonInfo() {
		return "키가 " + height + " 이고 몸무게가 " + weight + " 킬로인 남성이 있습니다. 이름은 "
				+ personName + " 이고 나이는 " + personAge + "세 입니다.";
	}
	
//	public static void main(String[] args) {
//		
//		PersonInfo personTomas = new PersonInfo(181,78,"Tomas",37);
//		
//		System.out.println(personTomas.showPersonInfo());
//	}
}
