package Mounica;

public class TryCatchs {

	public static void main(String[] args) {
		int a[][]= {{1,2,3,4,5,6},{7,8,9,0,1,2},{3,4,5,6,7,8},{9,1,2,3,4,6}};
		int i=0,j=0;
		int count=4;
		int t;
		try {
			
			t=a[i-1][j];
		}
		catch(Exception e)
		{
			count--;
		}
		try {
			t=a[i][j-1];
		}
		catch(Exception e) {
			count--;
		}
		try {
			t=a[i][j+1];
		}
		catch(Exception e) {
			count--;
		}
	try
	{
		t=a[i+1][j];
	}
	catch(Exception e){
		count--;
	}
	finally {
		System.out.println(count);
	}

}
}
	


