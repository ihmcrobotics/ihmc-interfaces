package sensor_msgs.msg.dds;
/**
* 
* Definition of the class "JointState" defined in JointState_.idl. 
*
* This file was automatically generated from JointState_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit JointState_.idl instead.
*
*/
public class JointState
{
    public JointState()
    {
        	header_ = new std_msgs.msg.dds.Header();name_ = new us.ihmc.idl.IDLSequence.StringBuilderHolder (100, "type_d");   position_ = new us.ihmc.idl.IDLSequence.Double (100, "type_6");
        	velocity_ = new us.ihmc.idl.IDLSequence.Double (100, "type_6");
        	effort_ = new us.ihmc.idl.IDLSequence.Double (100, "type_6");
        
        
    }

    public void set(JointState other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);name_.set(other.name_);	position_.set(other.position_);	velocity_.set(other.velocity_);	effort_.set(other.effort_);	
    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        

    public us.ihmc.idl.IDLSequence.StringBuilderHolder  getName()
    {
        return name_;
    }

        

    public us.ihmc.idl.IDLSequence.Double  getPosition()
    {
        return position_;
    }

        

    public us.ihmc.idl.IDLSequence.Double  getVelocity()
    {
        return velocity_;
    }

        

    public us.ihmc.idl.IDLSequence.Double  getEffort()
    {
        return effort_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof JointState)) return false;
        JointState otherMyClass = (JointState)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.name_.equals(otherMyClass.name_);
                
        returnedValue &= this.position_.equals(otherMyClass.position_);
                
        returnedValue &= this.velocity_.equals(otherMyClass.velocity_);
                
        returnedValue &= this.effort_.equals(otherMyClass.effort_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("JointState {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("name=");
        builder.append(this.name_);

                builder.append(", ");
        builder.append("position=");
        builder.append(this.position_);

                builder.append(", ");
        builder.append("velocity=");
        builder.append(this.velocity_);

                builder.append(", ");
        builder.append("effort=");
        builder.append(this.effort_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private us.ihmc.idl.IDLSequence.StringBuilderHolder  name_; 
    private us.ihmc.idl.IDLSequence.Double  position_; 
    private us.ihmc.idl.IDLSequence.Double  velocity_; 
    private us.ihmc.idl.IDLSequence.Double  effort_; 

}