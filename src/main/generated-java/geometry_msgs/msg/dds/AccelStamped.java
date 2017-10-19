package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "AccelStamped" defined in AccelStamped_.idl. 
*
* This file was automatically generated from AccelStamped_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit AccelStamped_.idl instead.
*
*/
public class AccelStamped
{
    public AccelStamped()
    {
        	header_ = new std_msgs.msg.dds.Header();accel_ = new geometry_msgs.msg.dds.Accel();        
        
    }

    public void set(AccelStamped other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);geometry_msgs.msg.dds.AccelPubSubType.staticCopy(other.accel_, accel_);    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        

    public geometry_msgs.msg.dds.Accel getAccel()
    {
        return accel_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof AccelStamped)) return false;
        AccelStamped otherMyClass = (AccelStamped)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.accel_.equals(otherMyClass.accel_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("AccelStamped {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("accel=");
        builder.append(this.accel_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private geometry_msgs.msg.dds.Accel accel_; 

}