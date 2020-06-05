
public class MyRunnable implements Runnable {
	
	public static int threadCount = 0;
	
	public MyRunnable() {
		
	}
	
	public void run() {
		while(MyRunnable.threadCount <=10) {
			
				
				try {
					System.out.println("Expl Thread: "+ (++MyRunnable.threadCount));
					Thread.sleep(110);
				} catch (InterruptedException e) {
					System.out.println("Exception in thread: " + e.getMessage());
				}
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Starting Main Thread...");
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		
		t.start();
		while(MyRunnable.threadCount <= 10) {
			try {
				System.out.println("Main Thread: " + (++MyRunnable.threadCount));
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Exception in main thread: " + e.getMessage());
			}
		}
		
		System.out.println("End of main thread");
		
	}
}
