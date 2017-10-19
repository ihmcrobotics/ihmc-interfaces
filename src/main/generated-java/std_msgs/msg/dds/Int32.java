package std_msgs.msg.dds;
/**
* 
* Definition of the class "Int32" defined in Int32_.idl. 
*
* This file was automatically generated from Int32_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Int32_.idl instead.
*
*/
public class Int32
{
    public Int32()
    {
        
        
    }

    public void set(Int32 other)
    {
        	data_ = other.data_;

    }

    public void setData(int data)
    {
        data_ = data;
    }

    public int getData()
    {
        return data_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Int32)) return false;
        Int32 otherMyClass = (Int32)other;
        boolean returnedValue = true;

        returnedValue &= this.data_ == otherMyClass.data_;

                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Int32 {");
        builder.append("data=");
        builder.append(this.data_);

                
        builder.append("}");
		return builder.toString();
    }

    private int data_; 

}