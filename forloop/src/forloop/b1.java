package forloop;

public class b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
for (int i = 1; i <5; i++) {
	int a=1;
	char ch='a';
	for (int j = 1; j <5; j++) {
		if (i%2==0) {
			System.out.print(ch++);
		}
		else {
			System.out.print(a++);
		}
	
}
	System.out.println();
	}
	}
}
	


