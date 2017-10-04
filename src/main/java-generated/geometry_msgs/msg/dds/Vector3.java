package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "Vector3" defined in Vector3_.idl. 
*
* This file was automatically generated from Vector3_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Vector3_.idl instead.
*
*/
public class Vector3
{
    public Vector3()
    {
        
        
    }

    public void set(Vector3 other)
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
        if(!(other instanceof Vector3)) return false;
        Vector3 otherMyClass = (Vector3)other;
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
		
      	builder.append("Vector3 {");
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