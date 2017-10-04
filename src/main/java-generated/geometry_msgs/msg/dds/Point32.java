package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "Point32" defined in Point32_.idl. 
*
* This file was automatically generated from Point32_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Point32_.idl instead.
*
*/
public class Point32
{
    public Point32()
    {
        
        
    }

    public void set(Point32 other)
    {
        	x_ = other.x_;
        	y_ = other.y_;
        	z_ = other.z_;

    }

    public void setX(float x)
    {
        x_ = x;
    }

    public float getX()
    {
        return x_;
    }

        
    public void setY(float y)
    {
        y_ = y;
    }

    public float getY()
    {
        return y_;
    }

        
    public void setZ(float z)
    {
        z_ = z;
    }

    public float getZ()
    {
        return z_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Point32)) return false;
        Point32 otherMyClass = (Point32)other;
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
		
      	builder.append("Point32 {");
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

    private float x_; 
    private float y_; 
    private float z_; 

}