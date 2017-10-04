package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "Pose2D" defined in Pose2D_.idl. 
*
* This file was automatically generated from Pose2D_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Pose2D_.idl instead.
*
*/
public class Pose2D
{
    public Pose2D()
    {
        
        
    }

    public void set(Pose2D other)
    {
        	x_ = other.x_;
        	y_ = other.y_;
        	theta_ = other.theta_;

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

        
    public void setTheta(double theta)
    {
        theta_ = theta;
    }

    public double getTheta()
    {
        return theta_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Pose2D)) return false;
        Pose2D otherMyClass = (Pose2D)other;
        boolean returnedValue = true;

        returnedValue &= this.x_ == otherMyClass.x_;

                
        returnedValue &= this.y_ == otherMyClass.y_;

                
        returnedValue &= this.theta_ == otherMyClass.theta_;

                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Pose2D {");
        builder.append("x=");
        builder.append(this.x_);

                builder.append(", ");
        builder.append("y=");
        builder.append(this.y_);

                builder.append(", ");
        builder.append("theta=");
        builder.append(this.theta_);

                
        builder.append("}");
		return builder.toString();
    }

    private double x_; 
    private double y_; 
    private double theta_; 

}