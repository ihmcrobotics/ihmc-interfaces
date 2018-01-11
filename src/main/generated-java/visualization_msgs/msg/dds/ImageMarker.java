package visualization_msgs.msg.dds;

/**
 *
 * Definition of the class "ImageMarker" defined in ImageMarker_.idl.
 *
 * This file was automatically generated from ImageMarker_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit ImageMarker_.idl instead.
 *
 */
public class ImageMarker
{
   public ImageMarker()
   {
      header_ = new std_msgs.msg.dds.Header();
      ns_ = new java.lang.StringBuilder(255);
      position_ = new us.ihmc.euclid.tuple3D.Point3D();
      outline_color_ = new std_msgs.msg.dds.ColorRGBA();
      fill_color_ = new std_msgs.msg.dds.ColorRGBA();
      lifetime_ = new builtin_interfaces.msg.dds.Duration();
      points_ = new us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.tuple3D.Point3D>(100, us.ihmc.euclid.tuple3D.Point3D.class,
                                                                                   new geometry_msgs.msg.dds.PointPubSubType());

      outline_colors_ = new us.ihmc.idl.IDLSequence.Object<std_msgs.msg.dds.ColorRGBA>(100, std_msgs.msg.dds.ColorRGBA.class,
                                                                                       new std_msgs.msg.dds.ColorRGBAPubSubType());

   }

   public void set(ImageMarker other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      ns_.setLength(0);
      ns_.append(other.ns_);
      id_ = other.id_;
      type_ = other.type_;
      action_ = other.action_;
      geometry_msgs.msg.dds.PointPubSubType.staticCopy(other.position_, position_);
      scale_ = other.scale_;
      std_msgs.msg.dds.ColorRGBAPubSubType.staticCopy(other.outline_color_, outline_color_);
      filled_ = other.filled_;
      std_msgs.msg.dds.ColorRGBAPubSubType.staticCopy(other.fill_color_, fill_color_);
      builtin_interfaces.msg.dds.DurationPubSubType.staticCopy(other.lifetime_, lifetime_);
      points_.set(other.points_);
      outline_colors_.set(other.outline_colors_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public void setNs(String ns)
   {
      ns_.setLength(0);
      ns_.append(ns);
   }

   public java.lang.String getNsAsString()
   {
      return getNs().toString();
   }

   public java.lang.StringBuilder getNs()
   {
      return ns_;
   }

   public void setId(int id)
   {
      id_ = id;
   }

   public int getId()
   {
      return id_;
   }

   public void setType(int type)
   {
      type_ = type;
   }

   public int getType()
   {
      return type_;
   }

   public void setAction(int action)
   {
      action_ = action;
   }

   public int getAction()
   {
      return action_;
   }

   public us.ihmc.euclid.tuple3D.Point3D getPosition()
   {
      return position_;
   }

   public void setScale(float scale)
   {
      scale_ = scale;
   }

   public float getScale()
   {
      return scale_;
   }

   public std_msgs.msg.dds.ColorRGBA getOutline_color()
   {
      return outline_color_;
   }

   public void setFilled(byte filled)
   {
      filled_ = filled;
   }

   public byte getFilled()
   {
      return filled_;
   }

   public std_msgs.msg.dds.ColorRGBA getFill_color()
   {
      return fill_color_;
   }

   public builtin_interfaces.msg.dds.Duration getLifetime()
   {
      return lifetime_;
   }

   public us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.tuple3D.Point3D> getPoints()
   {
      return points_;
   }

   public us.ihmc.idl.IDLSequence.Object<std_msgs.msg.dds.ColorRGBA> getOutline_colors()
   {
      return outline_colors_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof ImageMarker))
         return false;
      ImageMarker otherMyClass = (ImageMarker) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.ns_, otherMyClass.ns_);

      returnedValue &= this.id_ == otherMyClass.id_;

      returnedValue &= this.type_ == otherMyClass.type_;

      returnedValue &= this.action_ == otherMyClass.action_;

      returnedValue &= this.position_.equals(otherMyClass.position_);

      returnedValue &= this.scale_ == otherMyClass.scale_;

      returnedValue &= this.outline_color_.equals(otherMyClass.outline_color_);

      returnedValue &= this.filled_ == otherMyClass.filled_;

      returnedValue &= this.fill_color_.equals(otherMyClass.fill_color_);

      returnedValue &= this.lifetime_.equals(otherMyClass.lifetime_);

      returnedValue &= this.points_.equals(otherMyClass.points_);

      returnedValue &= this.outline_colors_.equals(otherMyClass.outline_colors_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ImageMarker {");
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
      builder.append("position=");
      builder.append(this.position_);

      builder.append(", ");
      builder.append("scale=");
      builder.append(this.scale_);

      builder.append(", ");
      builder.append("outline_color=");
      builder.append(this.outline_color_);

      builder.append(", ");
      builder.append("filled=");
      builder.append(this.filled_);

      builder.append(", ");
      builder.append("fill_color=");
      builder.append(this.fill_color_);

      builder.append(", ");
      builder.append("lifetime=");
      builder.append(this.lifetime_);

      builder.append(", ");
      builder.append("points=");
      builder.append(this.points_);

      builder.append(", ");
      builder.append("outline_colors=");
      builder.append(this.outline_colors_);

      builder.append("}");
      return builder.toString();
   }

   private std_msgs.msg.dds.Header header_;
   private java.lang.StringBuilder ns_;
   private int id_;
   private int type_;
   private int action_;
   private us.ihmc.euclid.tuple3D.Point3D position_;
   private float scale_;
   private std_msgs.msg.dds.ColorRGBA outline_color_;
   private byte filled_;
   private std_msgs.msg.dds.ColorRGBA fill_color_;
   private builtin_interfaces.msg.dds.Duration lifetime_;
   private us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.tuple3D.Point3D> points_;
   private us.ihmc.idl.IDLSequence.Object<std_msgs.msg.dds.ColorRGBA> outline_colors_;

}