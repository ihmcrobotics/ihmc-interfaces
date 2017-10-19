package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "AccelWithCovariance" defined in AccelWithCovariance_.idl. 
*
* This file was automatically generated from AccelWithCovariance_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit AccelWithCovariance_.idl instead.
*
*/
public class AccelWithCovariance
{
    public AccelWithCovariance()
    {
        	accel_ = new geometry_msgs.msg.dds.Accel();covariance_ = new double[36];
        
        
    }

    public void set(AccelWithCovariance other)
    {
           	geometry_msgs.msg.dds.AccelPubSubType.staticCopy(other.accel_, accel_);for(int b = 0; b < covariance_.length; ++b)
        	{
        	    	covariance_[b] = other.covariance_[b];	

        	}
        	
    }


    public geometry_msgs.msg.dds.Accel getAccel()
    {
        return accel_;
    }

        

    public double[] getCovariance()
    {
        return covariance_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof AccelWithCovariance)) return false;
        AccelWithCovariance otherMyClass = (AccelWithCovariance)other;
        boolean returnedValue = true;

        returnedValue &= this.accel_.equals(otherMyClass.accel_);
                
                	for(int d = 0; d < covariance_.length; ++d)
                	{
                	    returnedValue &= this.covariance_[d] == otherMyClass.covariance_[d];

                	}        

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("AccelWithCovariance {");
        builder.append("accel=");
        builder.append(this.accel_);

                builder.append(", ");
        builder.append("covariance=");
        builder.append(java.util.Arrays.toString(this.covariance_));

                
        builder.append("}");
		return builder.toString();
    }

    private geometry_msgs.msg.dds.Accel accel_; 
    private double[] covariance_; 

}