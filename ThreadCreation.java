package module2_Strings;

public class ThreadCreation {

	public static void main(String[] args) {
		
//		Using Thread Class
		
		
		
//		MyThread thread1=new MyThread();
//		MyThread thread2=new MyThread();
//		thread1.setName("Harsha");
//		thread2.setName("Sai");
////		Thread.currentThread().setName("main");
//		thread1.start();
//		thread2.start();
		
		
//		By Runnable Interface
		
		
//		MyThread thread=new MyThread();
//		Thread t1=new Thread(thread,"Harshi");
//		t1.start();
//		Thread t2=new Thread(thread,"Sai");
//		t2.start();
		
		
//		Using Lambda Function
		Runnable run=()->
		{
			for(int x=0;x<=10;x++)
			{
				System.out.println("Thread1");
			}
		};
		Runnable run1=new Runnable()
		{
			public void run()
			{
				for(int x=0;x<=10;x++)
				{
					System.out.println("Thread2");
				}
			}
		};
		Thread r=new Thread(run);
		Thread r1=new Thread(run1);
		r.start();
		r1.start();
	}

}



//Using thread Class




//class MyThread extends Thread
//{
//	public void run()
//	{
//		for(int x=1;x<=10;x++)
//		{
//			System.out.println(Thread.currentThread().getName());
//		}
//	}
//}




//Using Runnable Interface

//class MyThread implements Runnable
//{
//
//	@Override
//	public void run(){
//		for(int x=0;x<=10;x++)
//		{
//			System.out.println(Thread.currentThread().getName());
//		}
//		
//	}
//	
//	
//}
