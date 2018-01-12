package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "Joy" defined in Joy_.idl.
 *
 * This file was automatically generated from Joy_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Joy_.idl instead.
 *
 */
public class Joy
{
   private std_msgs.msg.dds.Header header_;
   private us.ihmc.idl.IDLSequence.Float axes_;
   private us.ihmc.idl.IDLSequence.Integer buttons_;

   public Joy()
   {
      header_ = new std_msgs.msg.dds.Header();
      axes_ = new us.ihmc.idl.IDLSequence.Float(100, "type_5");
      buttons_ = new us.ihmc.idl.IDLSequence.Integer(100, "type_2");
   }

   public void set(Joy other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      axes_.set(other.axes_);
      buttons_.set(other.buttons_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public us.ihmc.idl.IDLSequence.Float getAxes()
   {
      return axes_;
   }

   public us.ihmc.idl.IDLSequence.Integer getButtons()
   {
      return buttons_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof Joy))
         return false;
      Joy otherMyClass = (Joy) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.axes_.equals(otherMyClass.axes_);

      returnedValue &= this.buttons_.equals(otherMyClass.buttons_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Joy {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("axes=");
      builder.append(this.axes_);

      builder.append(", ");
      builder.append("buttons=");
      builder.append(this.buttons_);

      builder.append("}");
      return builder.toString();
   }
}