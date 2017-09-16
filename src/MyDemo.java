class Demo
{
	static int a;
	static int b;
	Demo()
	{
		a=0;
		b=0;
		
	}
	Demo(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	static void method1()
	{
		System.out.println("the addition of a and b:"+(a+b));
	}
	static void method2()
	{
		System.out.println("the subtraction of a and b:"+(a-b));
	}
	static
	{
		System.out.println("Executing static block");
	}
	}
	class MyDemo
	{
		public static void main(String args[])
		{
			Demo obj= new Demo(50,40);
			Demo.method1();
			Demo.method2();
		}
	}