package forloop;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int a=1;
		for (int i = 1;i<=n; i++) {
		for (int j = 1; j<=n-i; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=2*i-1; j++) {
			if (i%2==0) {
				System.out.print(0);
			}
			else 
				System.out.print(a);
			
		}
		System.out.println();
		}
	}



	}


