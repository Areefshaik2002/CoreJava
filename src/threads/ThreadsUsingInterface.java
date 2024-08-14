package threads;
class T1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}
public class ThreadsUsingInterface {
	public static void main(String[] args) {
	T1 obj  = new T1();
	Thread t1 = new Thread(obj);
	Thread t2 = new Thread(obj);
	Thread t3 = new Thread(obj);
	t1.setName("1st Thread");
	t1.setPriority(9);
	t1.start();
	try {
		t1.join();
		t1.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
//	Thread t2 = new Thread(obj);
	t2.setName("2nd thread");
	t2.setPriority(8);
	t2.start();
	try {
		t2.join();
		t2.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
//	Thread t3 = new Thread(obj);
	t3.setName("3nd thread");
	t3.setPriority(7);
	t3.start();
	try {
		t3.join();
		t3.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	
}
}
