package comcom.daemon;

public class DaemonRunner {
	public static void main(String[] args) {
		DaemonThread dt = new DaemonThread();
		dt.setDaemon(true);
		dt.start();

		int i = 0;
		while (i < 10) {
			System.out.println("inside main thread");
			i++;
		}
	}
}
