package multiThreading;

public class MyThread extends Thread{
	@Override
	public  void run() {
		System.out.println(Thread.currentThread());
		for(int i=1;i<=10;i++) {
			System.out.println(i+" Mythread");
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				System.out.println("Handled");
			}
		}
		
	}
public static void main(String[] args) {
	MyThread t1 = new MyThread();
	t1.start();
	t1.setName("A1Thread");
	t1.setPriority(3);
	System.out.println(t1.getName());
	MyThread t2 = new MyThread();
	t2.start();
	t2.setName("A2Thread");
	t2.setPriority(4);
	System.out.println(t2.getName());
//	System.out.println(t.currentThread().getName());
}
}
