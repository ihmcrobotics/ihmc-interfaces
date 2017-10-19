package std_msgs.msg.dds;
/**
* 
* Definition of the class "Int16" defined in Int16_.idl. 
*
* This file was automatically generated from Int16_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Int16_.idl instead.
*
*/
public class Int16
{
    public Int16()
    {
        
        
    }

    public void set(Int16 other)
    {
        	data_ = other.data_;

    }

    public void setData(short data)
    {
        data_ = data;
    }

    public short getData()
    {
        return data_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Int16)) return false;
        Int16 otherMyClass = (Int16)other;
        boolean returnedValue = true;

        returnedValue &= this.data_ == otherMyClass.data_;

                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Int16 {");
        builder.append("data=");
        builder.append(this.data_);

                
        builder.append("}");
		return builder.toString();
    }

    private short data_; 

}