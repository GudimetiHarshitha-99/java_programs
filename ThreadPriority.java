package module2_Strings;

public class ThreadPriority {

	public static void main(String[] args) {
		Sample1 s=new Sample1();
		Thread t1=new Thread(s,"Harshi");
		Thread t2=new Thread(s,"Sai");
		Thread t3=new Thread(s,"Arthi");
		t1.start();
		t2.start();
		t3.start();
		t1.setPriority(10);
		t2.setPriority(5);
		t3.setPriority(2);
	}
}
class Sample1 implements Runnable
{
	int counter=0;
	@Override
	public void run() {
		for(int x=1;x<=10;x++)
		{
			System.out.println(Thread.currentThread().getName()+" "+(counter++));
		}
	}
}