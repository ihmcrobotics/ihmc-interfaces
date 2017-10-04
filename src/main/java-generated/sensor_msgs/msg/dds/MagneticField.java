package sensor_msgs.msg.dds;
/**
* 
* Definition of the class "MagneticField" defined in MagneticField_.idl. 
*
* This file was automatically generated from MagneticField_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit MagneticField_.idl instead.
*
*/
public class MagneticField
{
    public MagneticField()
    {
        	header_ = new std_msgs.msg.dds.Header();magnetic_field_ = new geometry_msgs.msg.dds.Vector3();magnetic_field_covariance_ = new double[9];
        
        
    }

    public void set(MagneticField other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);geometry_msgs.msg.dds.Vector3PubSubType.staticCopy(other.magnetic_field_, magnetic_field_);for(int b = 0; b < magnetic_field_covariance_.length; ++b)
        	{
        	    	magnetic_field_covariance_[b] = other.magnetic_field_covariance_[b];	

        	}
        	
    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        

    public geometry_msgs.msg.dds.Vector3 getMagnetic_field()
    {
        return magnetic_field_;
    }

        

    public double[] getMagnetic_field_covariance()
    {
        return magnetic_field_covariance_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof MagneticField)) return false;
        MagneticField otherMyClass = (MagneticField)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.magnetic_field_.equals(otherMyClass.magnetic_field_);
                
                	for(int d = 0; d < magnetic_field_covariance_.length; ++d)
                	{
                	    returnedValue &= this.magnetic_field_covariance_[d] == otherMyClass.magnetic_field_covariance_[d];

                	}        

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("MagneticField {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("magnetic_field=");
        builder.append(this.magnetic_field_);

                builder.append(", ");
        builder.append("magnetic_field_covariance=");
        builder.append(java.util.Arrays.toString(this.magnetic_field_covariance_));

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private geometry_msgs.msg.dds.Vector3 magnetic_field_; 
    private double[] magnetic_field_covariance_; 

}