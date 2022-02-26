package comcom.daemon;

public class DaemonThread extends Thread {

	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println("Daemon thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}

}
