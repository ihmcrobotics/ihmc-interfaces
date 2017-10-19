package std_msgs.msg.dds;
/**
* 
* Definition of the class "Float32" defined in Float32_.idl. 
*
* This file was automatically generated from Float32_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Float32_.idl instead.
*
*/
public class Float32
{
    public Float32()
    {
        
        
    }

    public void set(Float32 other)
    {
        	data_ = other.data_;

    }

    public void setData(float data)
    {
        data_ = data;
    }

    public float getData()
    {
        return data_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Float32)) return false;
        Float32 otherMyClass = (Float32)other;
        boolean returnedValue = true;

        returnedValue &= this.data_ == otherMyClass.data_;

                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Float32 {");
        builder.append("data=");
        builder.append(this.data_);

                
        builder.append("}");
		return builder.toString();
    }

    private float data_; 

}