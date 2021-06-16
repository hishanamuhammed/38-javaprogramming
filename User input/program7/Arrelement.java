import java.util.Scanner;

public class Arrelement {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int  a=s.nextInt();
		int[] arr=new int[a];
		
		System.out.println("Enter array Elements:");
		for(int i=0;i<a;i++)
		{
			arr[i]=s.nextInt();
		}
			
        System.out.println("number of element:"+arr.length);
		}

}