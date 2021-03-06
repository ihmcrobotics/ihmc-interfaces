package std_msgs.msg.dds;

/**
 *
 * Definition of the class "Float64MultiArray" defined in Float64MultiArray_.idl.
 *
 * This file was automatically generated from Float64MultiArray_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Float64MultiArray_.idl instead.
 *
 */
public class Float64MultiArray
{
   private std_msgs.msg.dds.MultiArrayLayout layout_;
   private us.ihmc.idl.IDLSequence.Double data_;

   public Float64MultiArray()
   {
      layout_ = new std_msgs.msg.dds.MultiArrayLayout();
      data_ = new us.ihmc.idl.IDLSequence.Double(100, "type_6");
   }

   public void set(Float64MultiArray other)
   {
      std_msgs.msg.dds.MultiArrayLayoutPubSubType.staticCopy(other.layout_, layout_);
      data_.set(other.data_);
   }

   public std_msgs.msg.dds.MultiArrayLayout getLayout()
   {
      return layout_;
   }

   public us.ihmc.idl.IDLSequence.Double getData()
   {
      return data_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof Float64MultiArray))
         return false;
      Float64MultiArray otherMyClass = (Float64MultiArray) other;
      boolean returnedValue = true;

      returnedValue &= this.layout_.equals(otherMyClass.layout_);

      returnedValue &= this.data_.equals(otherMyClass.data_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Float64MultiArray {");
      builder.append("layout=");
      builder.append(this.layout_);

      builder.append(", ");
      builder.append("data=");
      builder.append(this.data_);

      builder.append("}");
      return builder.toString();
   }
}