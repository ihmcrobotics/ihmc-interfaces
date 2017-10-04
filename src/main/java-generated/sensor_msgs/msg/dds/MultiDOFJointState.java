package sensor_msgs.msg.dds;
/**
* 
* Definition of the class "MultiDOFJointState" defined in MultiDOFJointState_.idl. 
*
* This file was automatically generated from MultiDOFJointState_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit MultiDOFJointState_.idl instead.
*
*/
public class MultiDOFJointState
{
    public MultiDOFJointState()
    {
        	header_ = new std_msgs.msg.dds.Header();joint_names_ = new us.ihmc.idl.IDLSequence.StringBuilderHolder (100, "type_d");   transforms_ = new us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Transform> (100, geometry_msgs.msg.dds.Transform.class, new geometry_msgs.msg.dds.TransformPubSubType());

        	twist_ = new us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Twist> (100, geometry_msgs.msg.dds.Twist.class, new geometry_msgs.msg.dds.TwistPubSubType());

        	wrench_ = new us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Wrench> (100, geometry_msgs.msg.dds.Wrench.class, new geometry_msgs.msg.dds.WrenchPubSubType());


        
        
    }

    public void set(MultiDOFJointState other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);joint_names_.set(other.joint_names_);	transforms_.set(other.transforms_);	twist_.set(other.twist_);	wrench_.set(other.wrench_);	
    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        

    public us.ihmc.idl.IDLSequence.StringBuilderHolder  getJoint_names()
    {
        return joint_names_;
    }

        

    public us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Transform>  getTransforms()
    {
        return transforms_;
    }

        

    public us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Twist>  getTwist()
    {
        return twist_;
    }

        

    public us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Wrench>  getWrench()
    {
        return wrench_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof MultiDOFJointState)) return false;
        MultiDOFJointState otherMyClass = (MultiDOFJointState)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.joint_names_.equals(otherMyClass.joint_names_);
                
        returnedValue &= this.transforms_.equals(otherMyClass.transforms_);
                
        returnedValue &= this.twist_.equals(otherMyClass.twist_);
                
        returnedValue &= this.wrench_.equals(otherMyClass.wrench_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("MultiDOFJointState {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("joint_names=");
        builder.append(this.joint_names_);

                builder.append(", ");
        builder.append("transforms=");
        builder.append(this.transforms_);

                builder.append(", ");
        builder.append("twist=");
        builder.append(this.twist_);

                builder.append(", ");
        builder.append("wrench=");
        builder.append(this.wrench_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private us.ihmc.idl.IDLSequence.StringBuilderHolder  joint_names_; 
    private us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Transform>  transforms_; 
    private us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Twist>  twist_; 
    private us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Wrench>  wrench_; 

}