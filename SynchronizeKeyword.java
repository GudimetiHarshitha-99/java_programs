package module2_Strings;

public class SynchronizeKeyword {

	public static void main(String[] args) {
		Sample sample1=new Sample();
		Thread t1=new Thread(sample1,"Harshi");
		Thread t2=new Thread(sample1,"Sai");
		Thread t3=new Thread(sample1,"Arthi");
		t1.start();
		t2.start();
		t3.start();
	}

}
class Sample implements Runnable
{
	int counter=1;

	@Override
	public void run() {
		m1();	
	}
	public synchronized void m1()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println(Thread.currentThread().getName()+" "+(counter++));
		}
	}
	
}