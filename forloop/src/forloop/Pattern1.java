package forloop;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int a=1;
for (int i = 1; i <=n; i++) {
	
	for (int j = 1; j<=n-i; j++) {
		System.out.print(" ");
	}
	for (int j = 0; j <2*i-1; j++) {
		
		System.out.print(a%2);
		a++;
	}
	System.out.println();
}
	}

}
