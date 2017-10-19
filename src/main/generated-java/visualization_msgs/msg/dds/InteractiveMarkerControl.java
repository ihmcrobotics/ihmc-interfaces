package visualization_msgs.msg.dds;
/**
* 
* Definition of the class "InteractiveMarkerControl" defined in InteractiveMarkerControl_.idl. 
*
* This file was automatically generated from InteractiveMarkerControl_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit InteractiveMarkerControl_.idl instead.
*
*/
public class InteractiveMarkerControl
{
    public InteractiveMarkerControl()
    {
        	name_ = new java.lang.StringBuilder(255); 
        	orientation_ = new us.ihmc.euclid.tuple4D.Quaternion();markers_ = new us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.Marker> (100, visualization_msgs.msg.dds.Marker.class, new visualization_msgs.msg.dds.MarkerPubSubType());

        	description_ = new java.lang.StringBuilder(255); 

        
        
    }

    public void set(InteractiveMarkerControl other)
    {
        	name_.setLength(0);
        	name_.append(other.name_);
           	geometry_msgs.msg.dds.QuaternionPubSubType.staticCopy(other.orientation_, orientation_);orientation_mode_ = other.orientation_mode_;
        	interaction_mode_ = other.interaction_mode_;
        	always_visible_ = other.always_visible_;
            markers_.set(other.markers_);	independent_marker_orientation_ = other.independent_marker_orientation_;
        	description_.setLength(0);
        	description_.append(other.description_);

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

        

    public us.ihmc.euclid.tuple4D.Quaternion getOrientation()
    {
        return orientation_;
    }

        
    public void setOrientation_mode(byte orientation_mode)
    {
        orientation_mode_ = orientation_mode;
    }

    public byte getOrientation_mode()
    {
        return orientation_mode_;
    }

        
    public void setInteraction_mode(byte interaction_mode)
    {
        interaction_mode_ = interaction_mode;
    }

    public byte getInteraction_mode()
    {
        return interaction_mode_;
    }

        
    public void setAlways_visible(boolean always_visible)
    {
        always_visible_ = always_visible;
    }

    public boolean getAlways_visible()
    {
        return always_visible_;
    }

        

    public us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.Marker>  getMarkers()
    {
        return markers_;
    }

        
    public void setIndependent_marker_orientation(boolean independent_marker_orientation)
    {
        independent_marker_orientation_ = independent_marker_orientation;
    }

    public boolean getIndependent_marker_orientation()
    {
        return independent_marker_orientation_;
    }

        
        public void setDescription(String description)
        {
        	description_.setLength(0);
        	description_.append(description);
        }
        
        public java.lang.String getDescriptionAsString()
        {
        	return getDescription().toString();
        }

    public java.lang.StringBuilder getDescription()
    {
        return description_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof InteractiveMarkerControl)) return false;
        InteractiveMarkerControl otherMyClass = (InteractiveMarkerControl)other;
        boolean returnedValue = true;

        returnedValue &= us.ihmc.idl.IDLTools.equals(this.name_, otherMyClass.name_);
                
        returnedValue &= this.orientation_.equals(otherMyClass.orientation_);
                
        returnedValue &= this.orientation_mode_ == otherMyClass.orientation_mode_;

                
        returnedValue &= this.interaction_mode_ == otherMyClass.interaction_mode_;

                
        returnedValue &= this.always_visible_ == otherMyClass.always_visible_;

                
        returnedValue &= this.markers_.equals(otherMyClass.markers_);
                
        returnedValue &= this.independent_marker_orientation_ == otherMyClass.independent_marker_orientation_;

                
        returnedValue &= us.ihmc.idl.IDLTools.equals(this.description_, otherMyClass.description_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("InteractiveMarkerControl {");
        builder.append("name=");
        builder.append(this.name_);

                builder.append(", ");
        builder.append("orientation=");
        builder.append(this.orientation_);

                builder.append(", ");
        builder.append("orientation_mode=");
        builder.append(this.orientation_mode_);

                builder.append(", ");
        builder.append("interaction_mode=");
        builder.append(this.interaction_mode_);

                builder.append(", ");
        builder.append("always_visible=");
        builder.append(this.always_visible_);

                builder.append(", ");
        builder.append("markers=");
        builder.append(this.markers_);

                builder.append(", ");
        builder.append("independent_marker_orientation=");
        builder.append(this.independent_marker_orientation_);

                builder.append(", ");
        builder.append("description=");
        builder.append(this.description_);

                
        builder.append("}");
		return builder.toString();
    }

    private java.lang.StringBuilder name_; 
    private us.ihmc.euclid.tuple4D.Quaternion orientation_; 
    private byte orientation_mode_; 
    private byte interaction_mode_; 
    private boolean always_visible_; 
    private us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.Marker>  markers_; 
    private boolean independent_marker_orientation_; 
    private java.lang.StringBuilder description_; 

}