package week1day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int firstNum = 0;
		int secNum = 1;
		int n = 11;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=1;i<=n; i++) {
			sum = secNum+firstNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}

	}

}