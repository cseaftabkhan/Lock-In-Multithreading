package main;
/*Object Level Locking
 
class RunnerService implements Runnable {

	public synchronized void display() {
		try {
			System.out.println(Thread.currentThread().getName() + " entered display method");
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " leaving display method");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		display();

	}

}

public class Main {
	public static void main(String[] args) {

		RunnerService r1 = new RunnerService();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);

		t1.start();
		t2.start();

	}

}
*/

//Class Level Locking

class RunnerService implements Runnable {

	public static synchronized void display() {
		try {
			System.out.println(Thread.currentThread().getName() + " entered display method");
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " leaving display method");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		display();

	}

}

public class Main {
	public static void main(String[] args) {

		RunnerService r1 = new RunnerService();
		RunnerService r2 = new RunnerService();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();

	}

}
