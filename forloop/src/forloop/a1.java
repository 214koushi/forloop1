package forloop;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		char ch ='a';
for (int i = 0; i < 4; i++) {
	
	for (int j = 0; j < 4; j++) {
	if (j%2==0) {
		System.out.print(a++);
	}
	else {
		System.out.print(ch++);
	}
	
	}
	System.out.println(" ");
}
	}

}
