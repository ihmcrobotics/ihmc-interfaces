package std_msgs.msg.dds;
/**
* 
* Definition of the class "Int8MultiArray" defined in Int8MultiArray_.idl. 
*
* This file was automatically generated from Int8MultiArray_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Int8MultiArray_.idl instead.
*
*/
public class Int8MultiArray
{
    public Int8MultiArray()
    {
        	layout_ = new std_msgs.msg.dds.MultiArrayLayout();data_ = new us.ihmc.idl.IDLSequence.Byte (100, "type_9");
        
        
    }

    public void set(Int8MultiArray other)
    {
           	std_msgs.msg.dds.MultiArrayLayoutPubSubType.staticCopy(other.layout_, layout_);data_.set(other.data_);	
    }


    public std_msgs.msg.dds.MultiArrayLayout getLayout()
    {
        return layout_;
    }

        

    public us.ihmc.idl.IDLSequence.Byte  getData()
    {
        return data_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Int8MultiArray)) return false;
        Int8MultiArray otherMyClass = (Int8MultiArray)other;
        boolean returnedValue = true;

        returnedValue &= this.layout_.equals(otherMyClass.layout_);
                
        returnedValue &= this.data_.equals(otherMyClass.data_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Int8MultiArray {");
        builder.append("layout=");
        builder.append(this.layout_);

                builder.append(", ");
        builder.append("data=");
        builder.append(this.data_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.MultiArrayLayout layout_; 
    private us.ihmc.idl.IDLSequence.Byte  data_; 

}