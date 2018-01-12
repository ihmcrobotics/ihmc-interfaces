package std_msgs.msg.dds;

/**
 *
 * Definition of the class "MultiArrayLayout" defined in MultiArrayLayout_.idl.
 *
 * This file was automatically generated from MultiArrayLayout_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit MultiArrayLayout_.idl instead.
 *
 */
public class MultiArrayLayout
{
   private us.ihmc.idl.IDLSequence.Object<std_msgs.msg.dds.MultiArrayDimension> dim_;
   private long data_offset_;

   public MultiArrayLayout()
   {
      dim_ = new us.ihmc.idl.IDLSequence.Object<std_msgs.msg.dds.MultiArrayDimension>(100, std_msgs.msg.dds.MultiArrayDimension.class,
                                                                                      new std_msgs.msg.dds.MultiArrayDimensionPubSubType());
   }

   public void set(MultiArrayLayout other)
   {
      dim_.set(other.dim_);
      data_offset_ = other.data_offset_;
   }

   public us.ihmc.idl.IDLSequence.Object<std_msgs.msg.dds.MultiArrayDimension> getDim()
   {
      return dim_;
   }

   public long getData_offset()
   {
      return data_offset_;
   }

   public void setData_offset(long data_offset)
   {
      data_offset_ = data_offset;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof MultiArrayLayout))
         return false;
      MultiArrayLayout otherMyClass = (MultiArrayLayout) other;
      boolean returnedValue = true;

      returnedValue &= this.dim_.equals(otherMyClass.dim_);

      returnedValue &= this.data_offset_ == otherMyClass.data_offset_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("MultiArrayLayout {");
      builder.append("dim=");
      builder.append(this.dim_);

      builder.append(", ");
      builder.append("data_offset=");
      builder.append(this.data_offset_);

      builder.append("}");
      return builder.toString();
   }
}