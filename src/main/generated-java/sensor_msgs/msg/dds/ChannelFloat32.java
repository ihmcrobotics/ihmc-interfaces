package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "ChannelFloat32" defined in ChannelFloat32_.idl.
 *
 * This file was automatically generated from ChannelFloat32_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit ChannelFloat32_.idl instead.
 *
 */
public class ChannelFloat32
{
   private java.lang.StringBuilder name_;
   private us.ihmc.idl.IDLSequence.Float values_;

   public ChannelFloat32()
   {
      name_ = new java.lang.StringBuilder(255);
      values_ = new us.ihmc.idl.IDLSequence.Float(100, "type_5");
   }

   public void set(ChannelFloat32 other)
   {
      name_.setLength(0);
      name_.append(other.name_);
      values_.set(other.values_);
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

   public us.ihmc.idl.IDLSequence.Float getValues()
   {
      return values_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof ChannelFloat32))
         return false;
      ChannelFloat32 otherMyClass = (ChannelFloat32) other;
      boolean returnedValue = true;

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.name_, otherMyClass.name_);

      returnedValue &= this.values_.equals(otherMyClass.values_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ChannelFloat32 {");
      builder.append("name=");
      builder.append(this.name_);

      builder.append(", ");
      builder.append("values=");
      builder.append(this.values_);

      builder.append("}");
      return builder.toString();
   }
}