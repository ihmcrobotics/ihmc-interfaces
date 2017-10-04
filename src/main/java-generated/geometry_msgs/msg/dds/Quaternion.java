package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "Quaternion" defined in Quaternion_.idl. 
*
* This file was automatically generated from Quaternion_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Quaternion_.idl instead.
*
*/
public class Quaternion
{
    public Quaternion()
    {
        
        
    }

    public void set(Quaternion other)
    {
        	x_ = other.x_;
        	y_ = other.y_;
        	z_ = other.z_;
        	w_ = other.w_;

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

        
    public void setW(double w)
    {
        w_ = w;
    }

    public double getW()
    {
        return w_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Quaternion)) return false;
        Quaternion otherMyClass = (Quaternion)other;
        boolean returnedValue = true;

        returnedValue &= this.x_ == otherMyClass.x_;

                
        returnedValue &= this.y_ == otherMyClass.y_;

                
        returnedValue &= this.z_ == otherMyClass.z_;

                
        returnedValue &= this.w_ == otherMyClass.w_;

                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Quaternion {");
        builder.append("x=");
        builder.append(this.x_);

                builder.append(", ");
        builder.append("y=");
        builder.append(this.y_);

                builder.append(", ");
        builder.append("z=");
        builder.append(this.z_);

                builder.append(", ");
        builder.append("w=");
        builder.append(this.w_);

                
        builder.append("}");
		return builder.toString();
    }

    private double x_; 
    private double y_; 
    private double z_; 
    private double w_; 

}