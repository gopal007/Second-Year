
public class Circle extends Shape
{
	public Circle(double dim1) 
	{
		super(dim1,dim1);
		this.dim1=dim1;
	}

	void Area()
	{
		Area=3.14*dim1*dim1;
		System.out.println("Area of Circle is "+Area);
		
	}

}
