package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "PoseStamped" defined in PoseStamped_.idl. 
*
* This file was automatically generated from PoseStamped_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit PoseStamped_.idl instead.
*
*/
public class PoseStamped
{
    public PoseStamped()
    {
        	header_ = new std_msgs.msg.dds.Header();pose_ = new us.ihmc.euclid.geometry.Pose3D();        
        
    }

    public void set(PoseStamped other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);geometry_msgs.msg.dds.PosePubSubType.staticCopy(other.pose_, pose_);    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        

    public us.ihmc.euclid.geometry.Pose3D getPose()
    {
        return pose_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof PoseStamped)) return false;
        PoseStamped otherMyClass = (PoseStamped)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.pose_.equals(otherMyClass.pose_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("PoseStamped {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("pose=");
        builder.append(this.pose_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private us.ihmc.euclid.geometry.Pose3D pose_; 

}