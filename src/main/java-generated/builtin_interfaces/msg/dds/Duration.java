package builtin_interfaces.msg.dds;
/**
* 
* Definition of the class "Duration" defined in Duration_.idl. 
*
* This file was automatically generated from Duration_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Duration_.idl instead.
*
*/
public class Duration
{
    public Duration()
    {
        
        
    }

    public void set(Duration other)
    {
        	sec_ = other.sec_;
        	nanosec_ = other.nanosec_;

    }

    public void setSec(int sec)
    {
        sec_ = sec;
    }

    public int getSec()
    {
        return sec_;
    }

        
    public void setNanosec(long nanosec)
    {
        nanosec_ = nanosec;
    }

    public long getNanosec()
    {
        return nanosec_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Duration)) return false;
        Duration otherMyClass = (Duration)other;
        boolean returnedValue = true;

        returnedValue &= this.sec_ == otherMyClass.sec_;

                
        returnedValue &= this.nanosec_ == otherMyClass.nanosec_;

                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Duration {");
        builder.append("sec=");
        builder.append(this.sec_);

                builder.append(", ");
        builder.append("nanosec=");
        builder.append(this.nanosec_);

                
        builder.append("}");
		return builder.toString();
    }

    private int sec_; 
    private long nanosec_; 

}