package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "TwistStamped" defined in TwistStamped_.idl. 
*
* This file was automatically generated from TwistStamped_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit TwistStamped_.idl instead.
*
*/
public class TwistStamped
{
    public TwistStamped()
    {
        	header_ = new std_msgs.msg.dds.Header();twist_ = new geometry_msgs.msg.dds.Twist();        
        
    }

    public void set(TwistStamped other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);geometry_msgs.msg.dds.TwistPubSubType.staticCopy(other.twist_, twist_);    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        

    public geometry_msgs.msg.dds.Twist getTwist()
    {
        return twist_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof TwistStamped)) return false;
        TwistStamped otherMyClass = (TwistStamped)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.twist_.equals(otherMyClass.twist_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("TwistStamped {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("twist=");
        builder.append(this.twist_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private geometry_msgs.msg.dds.Twist twist_; 

}