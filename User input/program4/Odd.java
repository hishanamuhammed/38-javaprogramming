import java.util.Scanner;

public class Odd {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Size of array:");
		int a=s.nextInt();
		int[] arr=new int[a];
		
		System.out.println("Enter array Elements:");
		for(int i=0;i<a;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("Array elements in odd position are:");
		for(int i=0;i<a;i=i+2)
		{
			System.out.println(arr[i]);
		}
		
	}

}