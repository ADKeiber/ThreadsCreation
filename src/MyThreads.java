
public class MyThreads extends Thread{
	
	public void run() {
		System.out.print("concurrent thread started running..");
	}
	
	public static void main(String[] args) {
		MyThreads mt = new MyThreads();
		
		mt.start();
	}
}
