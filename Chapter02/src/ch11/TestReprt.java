package ch11;

public class TestReprt {

	public static void main(String[] args) {

		MakeReport builder = new MakeReport();
		String report = builder.getReport();
		
		System.out.println(report);

	}

}
