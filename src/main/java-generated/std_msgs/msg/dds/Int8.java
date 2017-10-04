package std_msgs.msg.dds;
/**
* 
* Definition of the class "Int8" defined in Int8_.idl. 
*
* This file was automatically generated from Int8_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Int8_.idl instead.
*
*/
public class Int8
{
    public Int8()
    {
        
        
    }

    public void set(Int8 other)
    {
        	data_ = other.data_;

    }

    public void setData(byte data)
    {
        data_ = data;
    }

    public byte getData()
    {
        return data_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Int8)) return false;
        Int8 otherMyClass = (Int8)other;
        boolean returnedValue = true;

        returnedValue &= this.data_ == otherMyClass.data_;

                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Int8 {");
        builder.append("data=");
        builder.append(this.data_);

                
        builder.append("}");
		return builder.toString();
    }

    private byte data_; 

}