package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "TransformStamped" defined in TransformStamped_.idl. 
*
* This file was automatically generated from TransformStamped_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit TransformStamped_.idl instead.
*
*/
public class TransformStamped
{
    public TransformStamped()
    {
        	header_ = new std_msgs.msg.dds.Header();child_frame_id_ = new java.lang.StringBuilder(255); 
        	transform_ = new geometry_msgs.msg.dds.Transform();        
        
    }

    public void set(TransformStamped other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);child_frame_id_.setLength(0);
        	child_frame_id_.append(other.child_frame_id_);
           	geometry_msgs.msg.dds.TransformPubSubType.staticCopy(other.transform_, transform_);    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        
        public void setChild_frame_id(String child_frame_id)
        {
        	child_frame_id_.setLength(0);
        	child_frame_id_.append(child_frame_id);
        }
        
        public java.lang.String getChild_frame_idAsString()
        {
        	return getChild_frame_id().toString();
        }

    public java.lang.StringBuilder getChild_frame_id()
    {
        return child_frame_id_;
    }

        

    public geometry_msgs.msg.dds.Transform getTransform()
    {
        return transform_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof TransformStamped)) return false;
        TransformStamped otherMyClass = (TransformStamped)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= us.ihmc.idl.IDLTools.equals(this.child_frame_id_, otherMyClass.child_frame_id_);
                
        returnedValue &= this.transform_.equals(otherMyClass.transform_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("TransformStamped {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("child_frame_id=");
        builder.append(this.child_frame_id_);

                builder.append(", ");
        builder.append("transform=");
        builder.append(this.transform_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private java.lang.StringBuilder child_frame_id_; 
    private geometry_msgs.msg.dds.Transform transform_; 

}