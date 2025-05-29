package module2_Strings;

public class SleepMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 s=new Sample2();
		Thread t1=new Thread(s,"Harshi");
		for(int x=1;x<=10;x++)
		{
			System.out.println(Thread.currentThread().getName());
		}
		t1.start();
		t1.interrupt();
	}

}
class Sample2 implements Runnable
{
	int counter=0;
	@Override
	public void run() {
		try
		{
			Thread.currentThread().sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}