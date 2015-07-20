import java.util.Scanner;
public class Main {
	public static void main(String cla[]) {
		Scanner stdin = new Scanner(System.in);
		int size;
		System.out.print("Enter array size = ");
		size = stdin.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.printf("Enter arr[%d] = ",i);
			arr[i] = stdin.nextInt();
		}
		LargeDifference ld = new LargeDifference();
		System.out.println("Large difference = "+ld.getLargeDiff(arr));
	}
}
