package sensor_msgs.msg.dds;
/**
* 
* Definition of the class "FluidPressure" defined in FluidPressure_.idl. 
*
* This file was automatically generated from FluidPressure_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit FluidPressure_.idl instead.
*
*/
public class FluidPressure
{
    public FluidPressure()
    {
        	header_ = new std_msgs.msg.dds.Header();        
        
    }

    public void set(FluidPressure other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);fluid_pressure_ = other.fluid_pressure_;
        	variance_ = other.variance_;

    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        
    public void setFluid_pressure(double fluid_pressure)
    {
        fluid_pressure_ = fluid_pressure;
    }

    public double getFluid_pressure()
    {
        return fluid_pressure_;
    }

        
    public void setVariance(double variance)
    {
        variance_ = variance;
    }

    public double getVariance()
    {
        return variance_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof FluidPressure)) return false;
        FluidPressure otherMyClass = (FluidPressure)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.fluid_pressure_ == otherMyClass.fluid_pressure_;

                
        returnedValue &= this.variance_ == otherMyClass.variance_;

                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("FluidPressure {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("fluid_pressure=");
        builder.append(this.fluid_pressure_);

                builder.append(", ");
        builder.append("variance=");
        builder.append(this.variance_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private double fluid_pressure_; 
    private double variance_; 

}