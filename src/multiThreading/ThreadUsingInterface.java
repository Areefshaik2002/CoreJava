package multiThreading;
class T1 implements Runnable{
	
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}
public class ThreadUsingInterface {

	public static void main(String[] args) {
		Runnable r;
		r = new T1();
		Thread t = new Thread(r);
		t.start();
		
	}

}
