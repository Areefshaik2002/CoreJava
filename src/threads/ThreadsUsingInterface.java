package threads;
class T1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
                e.printStackTrace();
            }
			
		}
	}
}
public class ThreadsUsingInterface {
	public static void main(String[] args) {
	T1 obj1  = new T1();
	T1 obj2 = new T1();
	T1 obj3 = new T1();
	
 	Thread t1 = new Thread(obj1);
	Thread t2 = new Thread(obj2);
	Thread t3 = new Thread(obj3);
	t1.setName("1st Thread");
	t1.setPriority(1);
	t1.start();
	
	t2.setName("2nd thread");
	t2.setPriority(2);
	t2.start();
	
	t3.setName("3rd thread");
	t3.setPriority(3);
	t3.start();
	try {
		t1.join();
		t2.join();
		t3.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("finished");
	
	
}
}
