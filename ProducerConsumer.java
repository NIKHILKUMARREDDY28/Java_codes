import java.io.*;
import java.util.Scanner;
class ProducerConsumer
{
	static int top=-1,size,n;
	static int stack[];
	public void produce()
	{
		if(top==size-1)
		{
			System.out.println("We cannot able to produce data into buffer:");
		}
		else
		{
			System.out.print("Enter no:");
			Scanner sc=new Scanner(System.in);
			stack[++top]=sc.nextInt();
			System.out.println("Element "+stack[top]+" is produced into buffer");
		}
	}
	public void consume()
	{
		if(top==-1)
		{
			System.out.println("No data in the buffer:");
		}
		else
		{
			System.out.println("Element " + stack[top]+" is consumed from buffer");
			--top;
		}
	}
	public void display()
	{
		int t;
		if(top==-1)
		{
			System.out.println("Buffer is empty");
		}
		else
		{
			System.out.println("Data in Buffer are:");
			for(t=0;t<=top;t++)
			{
				System.out.println(stack[t]);
			}
			System.out.println();
		}
	}
	public static void main(String args[])throws IOException
	{
		ProducerConsumer obj=new ProducerConsumer();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of buffer:");
		size=sc.nextInt();
		stack=new int[size];
		while(true)
		{
			System.out.print("\n1.produce\n2.consume\n3.display\n4.exit\nEnter your choice:");
			n=sc.nextInt();
			switch(n)
			{
				case 1: obj.produce();
				              break;
				case 2: obj.consume();
				              break;
				case 3: obj.display();
				              break;
				case 4: System.exit(0);
				default: System.out.print("Enter your valid choice:\n");
			}
		}
	}
		
}
