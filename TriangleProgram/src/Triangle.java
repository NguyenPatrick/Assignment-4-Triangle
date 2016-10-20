/****************************************************************************
*
* Created by: Patrick Nguyen
* Created on: October 2016
* This Program Sorts Uses the Vehicle Class For Testing
*
****************************************************************************/
import java.math.*;

public class Triangle {
	
	private double _area;
	private double _length1;
	private double _length2;
	private double _length3;
	private double _semiPerimeter;
	
	
	public Triangle(double length1, double length2, double length3)
	{
		this._length1 = length1;
		this._length2 = length2;
		this._length3 = length3;	
		this._semiPerimeter = 0.5 * (this._length1 + this._length2 + this._length3);
		this._area = Math.sqrt(this._semiPerimeter * (this._semiPerimeter - this._length1) * (this._semiPerimeter - this._length2) *
				(this._semiPerimeter - this._length3), 2);
	}
	
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
	
	public String getName()
	{
		String nameOfTriangle;
		
		if((this._length1 == this._length2) && (this._length2 == this._length3))
		{
			nameOfTriangle = "Equalateral";		
		}
		else if((this._length1 != this._length2) && (this._length2 != _length3))
		{
			nameOfTriangle = "Scalene";
		}
		else
		{
			nameOfTriangle = "Isoscles";
		}
		
		return nameOfTriangle;
	}

	
	public double getSemiPerimeter()
	{		
		return this._semiPerimeter;		
	}
	public double getArea()
	{
		return this._area;
	}
	
	public double getRadius()
	{
		double radius;
		radius = (this.getArea()/this.getSemiPerimeter());
		return radius;
	}
	public Boolean isTriangleValid()
	{
		Boolean valid = true;
		return valid;
		
	}
	
}
