package std_msgs.msg.dds;
/**
* 
* Definition of the class "Bool" defined in Bool_.idl. 
*
* This file was automatically generated from Bool_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Bool_.idl instead.
*
*/
public class Bool
{
    public Bool()
    {
        
        
    }

    public void set(Bool other)
    {
        	data_ = other.data_;

    }

    public void setData(boolean data)
    {
        data_ = data;
    }

    public boolean getData()
    {
        return data_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Bool)) return false;
        Bool otherMyClass = (Bool)other;
        boolean returnedValue = true;

        returnedValue &= this.data_ == otherMyClass.data_;

                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Bool {");
        builder.append("data=");
        builder.append(this.data_);

                
        builder.append("}");
		return builder.toString();
    }

    private boolean data_; 

}