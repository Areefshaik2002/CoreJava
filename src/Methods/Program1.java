package Methods;

public class Program1 {
	public static void count(String s,int ...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
			System.out.println(a[i]);
			}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1.count("10",20,30,40,50);
	}

}
