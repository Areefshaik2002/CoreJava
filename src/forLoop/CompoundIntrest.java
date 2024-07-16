package forLoop;

public class CompoundIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int p = 1000;
double r = 0.05;
for(int time=1;time<=10;time++) {
double d = Math.pow((1+r),time);
double CI = p*d;
System.out.println(CI);

}
	}

}
