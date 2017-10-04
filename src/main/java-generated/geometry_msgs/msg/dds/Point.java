package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "Point" defined in Point_.idl. 
*
* This file was automatically generated from Point_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Point_.idl instead.
*
*/
public class Point
{
    public Point()
    {
        
        
    }

    public void set(Point other)
    {
        	x_ = other.x_;
        	y_ = other.y_;
        	z_ = other.z_;

    }

    public void setX(double x)
    {
        x_ = x;
    }

    public double getX()
    {
        return x_;
    }

        
    public void setY(double y)
    {
        y_ = y;
    }

    public double getY()
    {
        return y_;
    }

        
    public void setZ(double z)
    {
        z_ = z;
    }

    public double getZ()
    {
        return z_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Point)) return false;
        Point otherMyClass = (Point)other;
        boolean returnedValue = true;

        returnedValue &= this.x_ == otherMyClass.x_;

                
        returnedValue &= this.y_ == otherMyClass.y_;

                
        returnedValue &= this.z_ == otherMyClass.z_;

                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Point {");
        builder.append("x=");
        builder.append(this.x_);

                builder.append(", ");
        builder.append("y=");
        builder.append(this.y_);

                builder.append(", ");
        builder.append("z=");
        builder.append(this.z_);

                
        builder.append("}");
		return builder.toString();
    }

    private double x_; 
    private double y_; 
    private double z_; 

}