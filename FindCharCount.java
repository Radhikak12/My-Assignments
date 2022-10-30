package week1day3;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="cognizant";
		char ch='c';
		int count=0;
		char[] array=str.toCharArray();
		int length = array.length;

		for (int i=0;i<length;i++) 
				{
			if(array[i]==ch) 
			{
				count++;
			}
				}
		System.out.println("Length of the array is "+length);
		System.out.println("Charactor is displayed "+ count +" times");
			}
		}