/****************************************************************************
*
* Created by: Patrick Nguyen
* Created on: October 2016
* This Class Calculates And Displays Properties of a Triangle
*
****************************************************************************/
import java.math.*;

public class Triangle {
	
	private double _area;
	private double _length1;
	private double _length2;
	private double _length3;
	private double _semiPerimeter;
	private double _circumcentreArea;	
	private String _height;
	private String _name;
	
	// constructor for the triangle class
	public Triangle(double length1, double length2, double length3)
	{
		this._length1 = length1;
		this._length2 = length2;
		this._length3 = length3;	
	}
	
	// determines and returns lengths of the triangle
	public double getLength1()
	{
		return this._length1;
	}
	public double getLength2()
	{
		return this._length2;
	}
	public double getLength3()
	{
		return this._length3;
	}
	
	// determines & returns the type of the triangle
	public String getName()
	{	
		if((this.getLength1() == this.getLength2()) && (this.getLength2() == this.getLength3()))
		{
			this._name = "Equilateral";		
		}
		else if((this.getLength1() != this.getLength2()) && (this.getLength2() != getLength3()))
		{
			this._name = "Scalene";
		}
		else
		{
			this._name = "Isosceles";
		}
		
		return this._name;
	}

	// determines & returns semiperimeter of the triangle
	public double getSemiPerimeter()
	{		
		this._semiPerimeter = 0.5 * (this.getLength1() + this.getLength2() + this.getLength3());
		return this._semiPerimeter;		
	}
	
	// determines & returns the area of the triangle
	public double getArea()
	{
		this._area = Math.sqrt(this.getSemiPerimeter() * (this.getSemiPerimeter() - this.getLength1()) * 
				(this.getSemiPerimeter() - this.getLength2()) *	(this.getSemiPerimeter() - this.getLength3()));
		return this._area;
	}
	
	// determines & returns the radius of largest inscribed circle that can
	// fit inside the triangle
	public double getRadius()
	{
		double radius;
		radius = (this.getArea()/this.getSemiPerimeter());
		return radius;
	}
	
	// determines & returns the area of the circumcircle of the triangle
	public double getCircumcircleArea()
	{
		double radius;
		radius = (this.getLength1() * this.getLength2() * this.getLength3()) / (4 * this.getSemiPerimeter());
		this._circumcentreArea = Math.PI * (Math.pow(radius, 2));
		
		return this._circumcentreArea;
	}
	
	// string b/c there is more than 1 possible height
	// determines & returns the 3 possible heights in a string format
	public String getHeight()
	{
		// reverse 1/2(Base * Height)
		// for the three possible heights
		double height1 = (2 * this.getArea()) / this.getLength1();
		double height2 = (2 * this.getArea()) / this.getLength2();
		double height3 = (2 * this.getArea()) / this.getLength3();
		
		this._height = ("If Base = (Length 1) Then Height = " + height1 + ", If Base = (Length 2) Then Height =  " 
				+ height2 + ", If Base = (Length 3) Then Height = " + height3);
		
		return this._height;
	}
	
    // function that checks to see if any two sides add up together & is greater than the third side
	// if yes, it is a triangle & if no, it is not a triangle
	protected Boolean isValid()
	{
		Boolean validState;
		
		if (((this.getLength1() + this.getLength2()) > this.getLength3()) && ((this.getLength1() + this.getLength3()) > this.getLength2())
				&& ((this.getLength2() + this.getLength3()) > this.getLength1()))
		{
			validState = true;
		}
		else
		{
			validState = false;
		}
				
		return validState;	
	}
	
	// procedure to show all the properties of the triangle
	public void showProperties()
	{
		System.out.println("Length 1 = " + this.getLength1() + ", Length 2 = " + this.getLength2() + 
				", Length 3 = " + this.getLength3() + ", Semiperimeter = " + this.getSemiPerimeter() +
				", Area = " + this.getArea() + ", Radius = " + this.getRadius() + ", Type = " + this.getName() 
				+ ", Area of Circumcircle = " + this.getCircumcircleArea());		
		System.out.println("Height: " + this.getHeight());		
		System.out.println();
	}
}
