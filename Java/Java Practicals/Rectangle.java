
public class Rectangle extends Shape
{
	public Rectangle(double dim1, double dim2)
	{
		super(dim1,dim2);
		this.dim1=dim1;
		this.dim2=dim2;
	}

	void Area()
	{
		Area=dim1*dim2;
		System.out.println("Area of Rectangle is "+Area);
	}
	
}
