package std_msgs.msg.dds;

/**
 *
 * Definition of the class "UInt16MultiArray" defined in UInt16MultiArray_.idl.
 *
 * This file was automatically generated from UInt16MultiArray_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit UInt16MultiArray_.idl instead.
 *
 */
public class UInt16MultiArray
{
   private std_msgs.msg.dds.MultiArrayLayout layout_;
   private us.ihmc.idl.IDLSequence.Integer data_;

   public UInt16MultiArray()
   {
      layout_ = new std_msgs.msg.dds.MultiArrayLayout();
      data_ = new us.ihmc.idl.IDLSequence.Integer(100, "type_3");
   }

   public void set(UInt16MultiArray other)
   {
      std_msgs.msg.dds.MultiArrayLayoutPubSubType.staticCopy(other.layout_, layout_);
      data_.set(other.data_);
   }

   public std_msgs.msg.dds.MultiArrayLayout getLayout()
   {
      return layout_;
   }

   public us.ihmc.idl.IDLSequence.Integer getData()
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
      if (!(other instanceof UInt16MultiArray))
         return false;
      UInt16MultiArray otherMyClass = (UInt16MultiArray) other;
      boolean returnedValue = true;

      returnedValue &= this.layout_.equals(otherMyClass.layout_);

      returnedValue &= this.data_.equals(otherMyClass.data_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("UInt16MultiArray {");
      builder.append("layout=");
      builder.append(this.layout_);

      builder.append(", ");
      builder.append("data=");
      builder.append(this.data_);

      builder.append("}");
      return builder.toString();
   }
}