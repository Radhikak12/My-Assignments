package week1day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =25;
		System.out.println("prime number :");
	    for(int i=2; i<=n;i++)
	    {
	     int count =1;
	     for(int j=2; j<n;j++) {
	    	 if(i%j==0) { count++;}
	     }
	     if(count<=2) { 
	     System.out.println(i);}
	  }

	}

}
    		 
    
	



	



