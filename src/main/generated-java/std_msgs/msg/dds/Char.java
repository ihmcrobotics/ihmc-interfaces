package std_msgs.msg.dds;
/**
* 
* Definition of the class "Char" defined in Char_.idl. 
*
* This file was automatically generated from Char_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Char_.idl instead.
*
*/
public class Char
{
    public Char()
    {
        
        
    }

    public void set(Char other)
    {
        	data_ = other.data_;

    }

    public void setData(char data)
    {
        data_ = data;
    }

    public char getData()
    {
        return data_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Char)) return false;
        Char otherMyClass = (Char)other;
        boolean returnedValue = true;

        returnedValue &= this.data_ == otherMyClass.data_;

                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Char {");
        builder.append("data=");
        builder.append(this.data_);

                
        builder.append("}");
		return builder.toString();
    }

    private char data_; 

}