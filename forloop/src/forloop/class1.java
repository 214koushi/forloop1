package forloop;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7;
for (int i = 0; i <n; i++) {
char ch='a';
int a=n-i;
for (int j = 0; j <n; j++) {
	if (i<=j) {
		if (i%2==0) {
			System.out.print(a--);
		}
		else {
			System.out.print(ch++);
		}
	}
}
System.out.println(" ");
}
	}

}
