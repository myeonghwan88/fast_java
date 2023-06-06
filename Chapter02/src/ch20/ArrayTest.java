package ch20;

public class ArrayTest {

	public static void main(String[] args) {

//		int[] arr = new int[10]; // 길이 표시
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10}; // 길이 표시
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++) {
			arr[i] = num++;
//			System.out.println(arr[i]);
		}
		//향상된 for
		for(int num: arr) {
			total += num;
		}			
		System.out.println(total);
		
		double[] dArr = new double[5];
		int count = 0;
		dArr[0] = 1.1; count++; 
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
				
		double mtotal = 1;
		for(int i = 0; i< count; i++) {
			mtotal *= dArr[i];
		}
				
		System.out.println(mtotal);
		
	}

}
