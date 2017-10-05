package visualization_msgs.msg.dds;
/**
* 
* Definition of the class "InteractiveMarkerFeedback" defined in InteractiveMarkerFeedback_.idl. 
*
* This file was automatically generated from InteractiveMarkerFeedback_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit InteractiveMarkerFeedback_.idl instead.
*
*/
public class InteractiveMarkerFeedback
{
    public InteractiveMarkerFeedback()
    {
        	header_ = new std_msgs.msg.dds.Header();client_id_ = new java.lang.StringBuilder(255); 
        	marker_name_ = new java.lang.StringBuilder(255); 
        	control_name_ = new java.lang.StringBuilder(255); 
        	pose_ = new us.ihmc.euclid.geometry.Pose3D();mouse_point_ = new us.ihmc.euclid.tuple3D.Point3D();        
        
    }

    public void set(InteractiveMarkerFeedback other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);client_id_.setLength(0);
        	client_id_.append(other.client_id_);
        	marker_name_.setLength(0);
        	marker_name_.append(other.marker_name_);
        	control_name_.setLength(0);
        	control_name_.append(other.control_name_);
        	event_type_ = other.event_type_;
           	geometry_msgs.msg.dds.PosePubSubType.staticCopy(other.pose_, pose_);menu_entry_id_ = other.menu_entry_id_;
           	geometry_msgs.msg.dds.PointPubSubType.staticCopy(other.mouse_point_, mouse_point_);mouse_point_valid_ = other.mouse_point_valid_;

    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        
        public void setClient_id(String client_id)
        {
        	client_id_.setLength(0);
        	client_id_.append(client_id);
        }
        
        public java.lang.String getClient_idAsString()
        {
        	return getClient_id().toString();
        }

    public java.lang.StringBuilder getClient_id()
    {
        return client_id_;
    }

        
        public void setMarker_name(String marker_name)
        {
        	marker_name_.setLength(0);
        	marker_name_.append(marker_name);
        }
        
        public java.lang.String getMarker_nameAsString()
        {
        	return getMarker_name().toString();
        }

    public java.lang.StringBuilder getMarker_name()
    {
        return marker_name_;
    }

        
        public void setControl_name(String control_name)
        {
        	control_name_.setLength(0);
        	control_name_.append(control_name);
        }
        
        public java.lang.String getControl_nameAsString()
        {
        	return getControl_name().toString();
        }

    public java.lang.StringBuilder getControl_name()
    {
        return control_name_;
    }

        
    public void setEvent_type(byte event_type)
    {
        event_type_ = event_type;
    }

    public byte getEvent_type()
    {
        return event_type_;
    }

        

    public us.ihmc.euclid.geometry.Pose3D getPose()
    {
        return pose_;
    }

        
    public void setMenu_entry_id(long menu_entry_id)
    {
        menu_entry_id_ = menu_entry_id;
    }

    public long getMenu_entry_id()
    {
        return menu_entry_id_;
    }

        

    public us.ihmc.euclid.tuple3D.Point3D getMouse_point()
    {
        return mouse_point_;
    }

        
    public void setMouse_point_valid(boolean mouse_point_valid)
    {
        mouse_point_valid_ = mouse_point_valid;
    }

    public boolean getMouse_point_valid()
    {
        return mouse_point_valid_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof InteractiveMarkerFeedback)) return false;
        InteractiveMarkerFeedback otherMyClass = (InteractiveMarkerFeedback)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= us.ihmc.idl.IDLTools.equals(this.client_id_, otherMyClass.client_id_);
                
        returnedValue &= us.ihmc.idl.IDLTools.equals(this.marker_name_, otherMyClass.marker_name_);
                
        returnedValue &= us.ihmc.idl.IDLTools.equals(this.control_name_, otherMyClass.control_name_);
                
        returnedValue &= this.event_type_ == otherMyClass.event_type_;

                
        returnedValue &= this.pose_.equals(otherMyClass.pose_);
                
        returnedValue &= this.menu_entry_id_ == otherMyClass.menu_entry_id_;

                
        returnedValue &= this.mouse_point_.equals(otherMyClass.mouse_point_);
                
        returnedValue &= this.mouse_point_valid_ == otherMyClass.mouse_point_valid_;

                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("InteractiveMarkerFeedback {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("client_id=");
        builder.append(this.client_id_);

                builder.append(", ");
        builder.append("marker_name=");
        builder.append(this.marker_name_);

                builder.append(", ");
        builder.append("control_name=");
        builder.append(this.control_name_);

                builder.append(", ");
        builder.append("event_type=");
        builder.append(this.event_type_);

                builder.append(", ");
        builder.append("pose=");
        builder.append(this.pose_);

                builder.append(", ");
        builder.append("menu_entry_id=");
        builder.append(this.menu_entry_id_);

                builder.append(", ");
        builder.append("mouse_point=");
        builder.append(this.mouse_point_);

                builder.append(", ");
        builder.append("mouse_point_valid=");
        builder.append(this.mouse_point_valid_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private java.lang.StringBuilder client_id_; 
    private java.lang.StringBuilder marker_name_; 
    private java.lang.StringBuilder control_name_; 
    private byte event_type_; 
    private us.ihmc.euclid.geometry.Pose3D pose_; 
    private long menu_entry_id_; 
    private us.ihmc.euclid.tuple3D.Point3D mouse_point_; 
    private boolean mouse_point_valid_; 

}