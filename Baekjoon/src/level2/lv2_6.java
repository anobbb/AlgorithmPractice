package level2;

import java.util.Scanner;

public class lv2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println((a+b)%c);
		System.out.println((a%c + b%c)%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c) * (b%c))%c);
	}

}
