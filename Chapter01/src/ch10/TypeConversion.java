package ch10;

public class TypeConversion {

	public static void main(String[] args) {

//		byte bnum = 125;
//		int inum = bnum;
//		System.out.println(inum);
		
//		int inum = 255;
//		byte bNum = (byte)inum;		
//
//		System.out.println(bNum);
		
//		double dNum = 3.14;
//		int inum = (int)dNum;
//		
//		System.out.println(inum);
		
		double dNum = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		int myNum = 10;
		int yourNum = 20;
		
//		myNum = myNum + yourNum;
		myNum += yourNum; // 복합 연산자
		System.out.println(myNum);
	}
}
