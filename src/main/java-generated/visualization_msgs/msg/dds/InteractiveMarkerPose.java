package visualization_msgs.msg.dds;
/**
* 
* Definition of the class "InteractiveMarkerPose" defined in InteractiveMarkerPose_.idl. 
*
* This file was automatically generated from InteractiveMarkerPose_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit InteractiveMarkerPose_.idl instead.
*
*/
public class InteractiveMarkerPose
{
    public InteractiveMarkerPose()
    {
        	header_ = new std_msgs.msg.dds.Header();pose_ = new geometry_msgs.msg.dds.Pose();name_ = new java.lang.StringBuilder(255); 
        
        
    }

    public void set(InteractiveMarkerPose other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);geometry_msgs.msg.dds.PosePubSubType.staticCopy(other.pose_, pose_);name_.setLength(0);
        	name_.append(other.name_);
    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        

    public geometry_msgs.msg.dds.Pose getPose()
    {
        return pose_;
    }

        
        public void setName(String name)
        {
        	name_.setLength(0);
        	name_.append(name);
        }
        
        public java.lang.String getNameAsString()
        {
        	return getName().toString();
        }

    public java.lang.StringBuilder getName()
    {
        return name_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof InteractiveMarkerPose)) return false;
        InteractiveMarkerPose otherMyClass = (InteractiveMarkerPose)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.pose_.equals(otherMyClass.pose_);
                
        returnedValue &= us.ihmc.idl.IDLTools.equals(this.name_, otherMyClass.name_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("InteractiveMarkerPose {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("pose=");
        builder.append(this.pose_);

                builder.append(", ");
        builder.append("name=");
        builder.append(this.name_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private geometry_msgs.msg.dds.Pose pose_; 
    private java.lang.StringBuilder name_; 

}