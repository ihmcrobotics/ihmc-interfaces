package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "AccelWithCovarianceStamped" defined in AccelWithCovarianceStamped_.idl. 
*
* This file was automatically generated from AccelWithCovarianceStamped_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit AccelWithCovarianceStamped_.idl instead.
*
*/
public class AccelWithCovarianceStamped
{
    public AccelWithCovarianceStamped()
    {
        	header_ = new std_msgs.msg.dds.Header();accel_ = new geometry_msgs.msg.dds.AccelWithCovariance();        
        
    }

    public void set(AccelWithCovarianceStamped other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);geometry_msgs.msg.dds.AccelWithCovariancePubSubType.staticCopy(other.accel_, accel_);    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        

    public geometry_msgs.msg.dds.AccelWithCovariance getAccel()
    {
        return accel_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof AccelWithCovarianceStamped)) return false;
        AccelWithCovarianceStamped otherMyClass = (AccelWithCovarianceStamped)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.accel_.equals(otherMyClass.accel_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("AccelWithCovarianceStamped {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("accel=");
        builder.append(this.accel_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private geometry_msgs.msg.dds.AccelWithCovariance accel_; 

}