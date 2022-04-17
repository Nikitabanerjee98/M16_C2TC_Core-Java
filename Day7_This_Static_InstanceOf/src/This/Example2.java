package This;

public class Example2 {
int x,y;
	
	void display(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void print()
	{
		System.out.println("value of a: "+x);
		System.out.println("value of b: "+y);
	}

	public static void main(String[] args) {
		Example2 e=new Example2();
		e.display(12, 30);
		e.print();
		
	}

}
