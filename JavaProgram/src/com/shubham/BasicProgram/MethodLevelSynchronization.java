package com.shubham.BasicProgram;
class Table  
{
  public synchronized   void printTable(int num) 
  {
    for(int i=1; i<=10; i++)
    {
      System.out.println(num+" X "+i+" = "+(num*i));
      try
      {
    	  Thread.sleep(1000);
      }
      catch(Exception e) {}
    }
    System.out.println(".........................");
  }
}

public class MethodLevelSynchronization 
{
	public static void main(String[] args)
	{
		Table obj = new Table(); //obj has a lock
		
		Thread t1 = new Thread()
		{
			@Override
			public void run()
			{
				obj.printTable(5);
			}
		};
		
		Thread t2 = new Thread()
		{
			@Override
			public void run()
			{
				obj.printTable(10);
			}
		};	
		
		t1.start(); t2.start();
	}
}
