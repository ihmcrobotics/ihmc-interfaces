package visualization_msgs.msg.dds;

/**
 *
 * Definition of the class "InteractiveMarker" defined in InteractiveMarker_.idl.
 *
 * This file was automatically generated from InteractiveMarker_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit InteractiveMarker_.idl instead.
 *
 */
public class InteractiveMarker
{
   private std_msgs.msg.dds.Header header_;
   private us.ihmc.euclid.geometry.Pose3D pose_;
   private java.lang.StringBuilder name_;
   private java.lang.StringBuilder description_;
   private float scale_;
   private us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.MenuEntry> menu_entries_;
   private us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.InteractiveMarkerControl> controls_;

   public InteractiveMarker()
   {
      header_ = new std_msgs.msg.dds.Header();
      pose_ = new us.ihmc.euclid.geometry.Pose3D();
      name_ = new java.lang.StringBuilder(255);
      description_ = new java.lang.StringBuilder(255);
      menu_entries_ = new us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.MenuEntry>(100, visualization_msgs.msg.dds.MenuEntry.class,
                                                                                               new visualization_msgs.msg.dds.MenuEntryPubSubType());

      controls_ = new us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.InteractiveMarkerControl>(100,
                                                                                                          visualization_msgs.msg.dds.InteractiveMarkerControl.class,
                                                                                                          new visualization_msgs.msg.dds.InteractiveMarkerControlPubSubType());
   }

   public void set(InteractiveMarker other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      geometry_msgs.msg.dds.PosePubSubType.staticCopy(other.pose_, pose_);
      name_.setLength(0);
      name_.append(other.name_);
      description_.setLength(0);
      description_.append(other.description_);
      scale_ = other.scale_;
      menu_entries_.set(other.menu_entries_);
      controls_.set(other.controls_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public us.ihmc.euclid.geometry.Pose3D getPose()
   {
      return pose_;
   }

   public java.lang.String getNameAsString()
   {
      return getName().toString();
   }

   public java.lang.StringBuilder getName()
   {
      return name_;
   }

   public void setName(String name)
   {
      name_.setLength(0);
      name_.append(name);
   }

   public java.lang.String getDescriptionAsString()
   {
      return getDescription().toString();
   }

   public java.lang.StringBuilder getDescription()
   {
      return description_;
   }

   public void setDescription(String description)
   {
      description_.setLength(0);
      description_.append(description);
   }

   public float getScale()
   {
      return scale_;
   }

   public void setScale(float scale)
   {
      scale_ = scale;
   }

   public us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.MenuEntry> getMenu_entries()
   {
      return menu_entries_;
   }

   public us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.InteractiveMarkerControl> getControls()
   {
      return controls_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof InteractiveMarker))
         return false;
      InteractiveMarker otherMyClass = (InteractiveMarker) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.pose_.equals(otherMyClass.pose_);

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.name_, otherMyClass.name_);

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.description_, otherMyClass.description_);

      returnedValue &= this.scale_ == otherMyClass.scale_;

      returnedValue &= this.menu_entries_.equals(otherMyClass.menu_entries_);

      returnedValue &= this.controls_.equals(otherMyClass.controls_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("InteractiveMarker {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("pose=");
      builder.append(this.pose_);

      builder.append(", ");
      builder.append("name=");
      builder.append(this.name_);

      builder.append(", ");
      builder.append("description=");
      builder.append(this.description_);

      builder.append(", ");
      builder.append("scale=");
      builder.append(this.scale_);

      builder.append(", ");
      builder.append("menu_entries=");
      builder.append(this.menu_entries_);

      builder.append(", ");
      builder.append("controls=");
      builder.append(this.controls_);

      builder.append("}");
      return builder.toString();
   }
}