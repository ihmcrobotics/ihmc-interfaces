package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "Twist" defined in Twist_.idl. 
*
* This file was automatically generated from Twist_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Twist_.idl instead.
*
*/
public class Twist
{
    public Twist()
    {
        	linear_ = new us.ihmc.euclid.tuple3D.Vector3D();angular_ = new us.ihmc.euclid.tuple3D.Vector3D();        
        
    }

    public void set(Twist other)
    {
           	geometry_msgs.msg.dds.Vector3PubSubType.staticCopy(other.linear_, linear_);geometry_msgs.msg.dds.Vector3PubSubType.staticCopy(other.angular_, angular_);    }


    public us.ihmc.euclid.tuple3D.Vector3D getLinear()
    {
        return linear_;
    }

        

    public us.ihmc.euclid.tuple3D.Vector3D getAngular()
    {
        return angular_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Twist)) return false;
        Twist otherMyClass = (Twist)other;
        boolean returnedValue = true;

        returnedValue &= this.linear_.equals(otherMyClass.linear_);
                
        returnedValue &= this.angular_.equals(otherMyClass.angular_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Twist {");
        builder.append("linear=");
        builder.append(this.linear_);

                builder.append(", ");
        builder.append("angular=");
        builder.append(this.angular_);

                
        builder.append("}");
		return builder.toString();
    }

    private us.ihmc.euclid.tuple3D.Vector3D linear_; 
    private us.ihmc.euclid.tuple3D.Vector3D angular_; 

}