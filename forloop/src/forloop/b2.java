package forloop;

public class b2 {
public static void main(String[] args) {
	int a=1;
	char ch='a';
	for (int i = 1; i < 5; i++) {
		
		for (int j = 1; j <5; j++) {
			if (j%2==0) {
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
