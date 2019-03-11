
public class Triangle extends Shape
{
	public Triangle(double dim1, double dim2)
	{
		super(dim1, dim2);
		this.dim1=dim1;
		this.dim2=dim2;
	}
	void Area() 
	{
		Area=0.5*dim1*dim2;
		System.out.println("Area of Triangle is "+Area);
	}

}
