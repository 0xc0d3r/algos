import java.util.Scanner;
public class Main {
	public static void main(String cla[]) {
		Scanner stdin = new Scanner(System.in);
		int size,max=-10000;
		System.out.print("Enter array size = ");
		size = stdin.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.printf("Enter arr[%d] = ",i);
			arr[i] = stdin.nextInt();
			if(arr[i] >  max) max = arr[i];
		}
		SortByFrequency sf = new SortByFrequency(arr);
		sf.sortByFrequency(max);
	}
}
