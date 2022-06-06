package evaluation3m;
import java.util.Scanner;

public class Masai {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int num=sc.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the elements in the array");
			arr[i]=sc.nextInt();
		}
		try {
			System.out.println("Enter the index of the array element you want to access");
			int j=sc.nextInt();
			System.out.println(arr[j]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(NumberFormatException nf) {
			System.out.println(nf);
		}
	}
		}



