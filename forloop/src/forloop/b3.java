package forloop;

public class b3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
for (int i = 1; i < 4; i++) {
	for (int j = 1; j <4; j++) {
		if (a==10) {
			a=1;
			System.out.print(a++);
		}
	}
	System.out.println();
}
	}

}
