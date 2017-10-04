package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "InertiaStamped" defined in InertiaStamped_.idl. 
*
* This file was automatically generated from InertiaStamped_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit InertiaStamped_.idl instead.
*
*/
public class InertiaStamped
{
    public InertiaStamped()
    {
        	header_ = new std_msgs.msg.dds.Header();inertia_ = new geometry_msgs.msg.dds.Inertia();        
        
    }

    public void set(InertiaStamped other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);geometry_msgs.msg.dds.InertiaPubSubType.staticCopy(other.inertia_, inertia_);    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        

    public geometry_msgs.msg.dds.Inertia getInertia()
    {
        return inertia_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof InertiaStamped)) return false;
        InertiaStamped otherMyClass = (InertiaStamped)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.inertia_.equals(otherMyClass.inertia_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("InertiaStamped {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("inertia=");
        builder.append(this.inertia_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private geometry_msgs.msg.dds.Inertia inertia_; 

}