package shape_msgs.msg.dds;
/**
* 
* Definition of the class "SolidPrimitive" defined in SolidPrimitive_.idl. 
*
* This file was automatically generated from SolidPrimitive_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SolidPrimitive_.idl instead.
*
*/
public class SolidPrimitive
{
    public SolidPrimitive()
    {
        	dimensions_ = new us.ihmc.idl.IDLSequence.Double (3, "type_6");
        
        
    }

    public void set(SolidPrimitive other)
    {
        	type_ = other.type_;
            dimensions_.set(other.dimensions_);	
    }

    public void setType(byte type)
    {
        type_ = type;
    }

    public byte getType()
    {
        return type_;
    }

        

    public us.ihmc.idl.IDLSequence.Double  getDimensions()
    {
        return dimensions_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof SolidPrimitive)) return false;
        SolidPrimitive otherMyClass = (SolidPrimitive)other;
        boolean returnedValue = true;

        returnedValue &= this.type_ == otherMyClass.type_;

                
        returnedValue &= this.dimensions_.equals(otherMyClass.dimensions_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("SolidPrimitive {");
        builder.append("type=");
        builder.append(this.type_);

                builder.append(", ");
        builder.append("dimensions=");
        builder.append(this.dimensions_);

                
        builder.append("}");
		return builder.toString();
    }

    private byte type_; 
    private us.ihmc.idl.IDLSequence.Double  dimensions_; 

}