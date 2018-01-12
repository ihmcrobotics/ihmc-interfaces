package std_msgs.msg.dds;

/**
 *
 * Definition of the class "UInt64MultiArray" defined in UInt64MultiArray_.idl.
 *
 * This file was automatically generated from UInt64MultiArray_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit UInt64MultiArray_.idl instead.
 *
 */
public class UInt64MultiArray
{
   private std_msgs.msg.dds.MultiArrayLayout layout_;
   private us.ihmc.idl.IDLSequence.Long data_;

   public UInt64MultiArray()
   {
      layout_ = new std_msgs.msg.dds.MultiArrayLayout();
      data_ = new us.ihmc.idl.IDLSequence.Long(100, "type_12");
   }

   public void set(UInt64MultiArray other)
   {
      std_msgs.msg.dds.MultiArrayLayoutPubSubType.staticCopy(other.layout_, layout_);
      data_.set(other.data_);
   }

   public std_msgs.msg.dds.MultiArrayLayout getLayout()
   {
      return layout_;
   }

   public us.ihmc.idl.IDLSequence.Long getData()
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
      if (!(other instanceof UInt64MultiArray))
         return false;
      UInt64MultiArray otherMyClass = (UInt64MultiArray) other;
      boolean returnedValue = true;

      returnedValue &= this.layout_.equals(otherMyClass.layout_);

      returnedValue &= this.data_.equals(otherMyClass.data_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("UInt64MultiArray {");
      builder.append("layout=");
      builder.append(this.layout_);

      builder.append(", ");
      builder.append("data=");
      builder.append(this.data_);

      builder.append("}");
      return builder.toString();
   }
}