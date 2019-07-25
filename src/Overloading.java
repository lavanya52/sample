
public class Overloading {
	
	int x;
	int a,b;
	Overloading(int x)
	{
		this.x=x;
		int sq=x*x;
		System.out.println("Area of square="+sq);
	}
	Overloading(int a,int b)
	{
		this.a=a;
		this.b=b;
		int sq1=a*b;
		System.out.println("Area of square="+sq1);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading o1=new Overloading(40);
		Overloading o2=new Overloading(30,40);
		
	}

}
