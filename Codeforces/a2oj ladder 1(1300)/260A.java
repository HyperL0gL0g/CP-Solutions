import java.util.*;
public class addnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int b=sc.nextInt();
		int n=sc.nextInt();
		int count=0;
		int notpossible=0;
		for (int i=0;i<10;i++) {
			if (Integer.parseInt(a+String.valueOf(i))%b==0) {
				a=a+String.valueOf(i);
				count+=1;
				break;
			}
		}
		if (count==1) {
			for (int i=0;i<n-1;i++) {
				a=a+"0";
			}
			System.out.println(a);
		}else {
			System.out.println(-1);
		}
	}

}
