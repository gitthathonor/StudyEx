package thread;

public class Main {
	public static void main(String[] args) {
		ThreadEx01 threadEx = new ThreadEx01();
		threadEx.start();
		Runnable t1 = new RunnableEx01();
		Runnable t2 = new RunnableEx01();
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
	}
}
