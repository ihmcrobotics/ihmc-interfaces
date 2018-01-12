package visualization_msgs.msg.dds;

/**
 *
 * Definition of the class "Marker" defined in Marker_.idl.
 *
 * This file was automatically generated from Marker_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Marker_.idl instead.
 *
 */
public class Marker
{
   private std_msgs.msg.dds.Header header_;
   private java.lang.StringBuilder ns_;
   private int id_;
   private int type_;
   private int action_;
   private us.ihmc.euclid.geometry.Pose3D pose_;
   private us.ihmc.euclid.tuple3D.Vector3D scale_;
   private std_msgs.msg.dds.ColorRGBA color_;
   private builtin_interfaces.msg.dds.Duration lifetime_;
   private boolean frame_locked_;
   private us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.tuple3D.Point3D> points_;
   private us.ihmc.idl.IDLSequence.Object<std_msgs.msg.dds.ColorRGBA> colors_;
   private java.lang.StringBuilder text_;
   private java.lang.StringBuilder mesh_resource_;
   private boolean mesh_use_embedded_materials_;

   public Marker()
   {
      header_ = new std_msgs.msg.dds.Header();
      ns_ = new java.lang.StringBuilder(255);
      pose_ = new us.ihmc.euclid.geometry.Pose3D();
      scale_ = new us.ihmc.euclid.tuple3D.Vector3D();
      color_ = new std_msgs.msg.dds.ColorRGBA();
      lifetime_ = new builtin_interfaces.msg.dds.Duration();
      points_ = new us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.tuple3D.Point3D>(100, us.ihmc.euclid.tuple3D.Point3D.class,
                                                                                   new geometry_msgs.msg.dds.PointPubSubType());

      colors_ = new us.ihmc.idl.IDLSequence.Object<std_msgs.msg.dds.ColorRGBA>(100, std_msgs.msg.dds.ColorRGBA.class,
                                                                               new std_msgs.msg.dds.ColorRGBAPubSubType());

      text_ = new java.lang.StringBuilder(255);
      mesh_resource_ = new java.lang.StringBuilder(255);
   }

   public void set(Marker other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      ns_.setLength(0);
      ns_.append(other.ns_);
      id_ = other.id_;
      type_ = other.type_;
      action_ = other.action_;
      geometry_msgs.msg.dds.PosePubSubType.staticCopy(other.pose_, pose_);
      geometry_msgs.msg.dds.Vector3PubSubType.staticCopy(other.scale_, scale_);
      std_msgs.msg.dds.ColorRGBAPubSubType.staticCopy(other.color_, color_);
      builtin_interfaces.msg.dds.DurationPubSubType.staticCopy(other.lifetime_, lifetime_);
      frame_locked_ = other.frame_locked_;
      points_.set(other.points_);
      colors_.set(other.colors_);
      text_.setLength(0);
      text_.append(other.text_);
      mesh_resource_.setLength(0);
      mesh_resource_.append(other.mesh_resource_);
      mesh_use_embedded_materials_ = other.mesh_use_embedded_materials_;
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public java.lang.String getNsAsString()
   {
      return getNs().toString();
   }

   public java.lang.StringBuilder getNs()
   {
      return ns_;
   }

   public void setNs(String ns)
   {
      ns_.setLength(0);
      ns_.append(ns);
   }

   public int getId()
   {
      return id_;
   }

   public void setId(int id)
   {
      id_ = id;
   }

   public int getType()
   {
      return type_;
   }

   public void setType(int type)
   {
      type_ = type;
   }

   public int getAction()
   {
      return action_;
   }

   public void setAction(int action)
   {
      action_ = action;
   }

   public us.ihmc.euclid.geometry.Pose3D getPose()
   {
      return pose_;
   }

   public us.ihmc.euclid.tuple3D.Vector3D getScale()
   {
      return scale_;
   }

   public std_msgs.msg.dds.ColorRGBA getColor()
   {
      return color_;
   }

   public builtin_interfaces.msg.dds.Duration getLifetime()
   {
      return lifetime_;
   }

   public boolean getFrame_locked()
   {
      return frame_locked_;
   }

   public void setFrame_locked(boolean frame_locked)
   {
      frame_locked_ = frame_locked;
   }

   public us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.tuple3D.Point3D> getPoints()
   {
      return points_;
   }

   public us.ihmc.idl.IDLSequence.Object<std_msgs.msg.dds.ColorRGBA> getColors()
   {
      return colors_;
   }

   public java.lang.String getTextAsString()
   {
      return getText().toString();
   }

   public java.lang.StringBuilder getText()
   {
      return text_;
   }

   public void setText(String text)
   {
      text_.setLength(0);
      text_.append(text);
   }

   public java.lang.String getMesh_resourceAsString()
   {
      return getMesh_resource().toString();
   }

   public java.lang.StringBuilder getMesh_resource()
   {
      return mesh_resource_;
   }

   public void setMesh_resource(String mesh_resource)
   {
      mesh_resource_.setLength(0);
      mesh_resource_.append(mesh_resource);
   }

   public boolean getMesh_use_embedded_materials()
   {
      return mesh_use_embedded_materials_;
   }

   public void setMesh_use_embedded_materials(boolean mesh_use_embedded_materials)
   {
      mesh_use_embedded_materials_ = mesh_use_embedded_materials;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof Marker))
         return false;
      Marker otherMyClass = (Marker) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.ns_, otherMyClass.ns_);

      returnedValue &= this.id_ == otherMyClass.id_;

      returnedValue &= this.type_ == otherMyClass.type_;

      returnedValue &= this.action_ == otherMyClass.action_;

      returnedValue &= this.pose_.equals(otherMyClass.pose_);

      returnedValue &= this.scale_.equals(otherMyClass.scale_);

      returnedValue &= this.color_.equals(otherMyClass.color_);

      returnedValue &= this.lifetime_.equals(otherMyClass.lifetime_);

      returnedValue &= this.frame_locked_ == otherMyClass.frame_locked_;

      returnedValue &= this.points_.equals(otherMyClass.points_);

      returnedValue &= this.colors_.equals(otherMyClass.colors_);

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.text_, otherMyClass.text_);

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.mesh_resource_, otherMyClass.mesh_resource_);

      returnedValue &= this.mesh_use_embedded_materials_ == otherMyClass.mesh_use_embedded_materials_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Marker {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("ns=");
      builder.append(this.ns_);

      builder.append(", ");
      builder.append("id=");
      builder.append(this.id_);

      builder.append(", ");
      builder.append("type=");
      builder.append(this.type_);

      builder.append(", ");
      builder.append("action=");
      builder.append(this.action_);

      builder.append(", ");
      builder.append("pose=");
      builder.append(this.pose_);

      builder.append(", ");
      builder.append("scale=");
      builder.append(this.scale_);

      builder.append(", ");
      builder.append("color=");
      builder.append(this.color_);

      builder.append(", ");
      builder.append("lifetime=");
      builder.append(this.lifetime_);

      builder.append(", ");
      builder.append("frame_locked=");
      builder.append(this.frame_locked_);

      builder.append(", ");
      builder.append("points=");
      builder.append(this.points_);

      builder.append(", ");
      builder.append("colors=");
      builder.append(this.colors_);

      builder.append(", ");
      builder.append("text=");
      builder.append(this.text_);

      builder.append(", ");
      builder.append("mesh_resource=");
      builder.append(this.mesh_resource_);

      builder.append(", ");
      builder.append("mesh_use_embedded_materials=");
      builder.append(this.mesh_use_embedded_materials_);

      builder.append("}");
      return builder.toString();
   }
}