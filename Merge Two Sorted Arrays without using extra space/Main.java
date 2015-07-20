import java.util.Scanner;
public class Main {
	public static void main(String cla[]) {
		Scanner stdin = new Scanner(System.in );
		int m,n;
		System.out.print("Enter first array size : ");
		m = stdin.nextInt();
		System.out.print("Enter second array size : ");
		n = stdin.nextInt();
		int a[] = new int[m+n];
		int b[] = new int[n];
		for(int i=0;i<m;i++) {
			System.out.printf("Enter a[%d] = ",i);
			a[i] = stdin.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.printf("Enter b[%d] = ",i);
			b[i] = stdin.nextInt();
		}
		MergeArrays ma = new MergeArrays();
		a = ma.mergeSortedArrays(a,m,b);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
}
