package std_msgs.msg.dds;

/**
 *
 * Definition of the class "Int16MultiArray" defined in Int16MultiArray_.idl.
 *
 * This file was automatically generated from Int16MultiArray_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Int16MultiArray_.idl instead.
 *
 */
public class Int16MultiArray
{
   private std_msgs.msg.dds.MultiArrayLayout layout_;
   private us.ihmc.idl.IDLSequence.Short data_;

   public Int16MultiArray()
   {
      layout_ = new std_msgs.msg.dds.MultiArrayLayout();
      data_ = new us.ihmc.idl.IDLSequence.Short(100, "type_1");
   }

   public void set(Int16MultiArray other)
   {
      std_msgs.msg.dds.MultiArrayLayoutPubSubType.staticCopy(other.layout_, layout_);
      data_.set(other.data_);
   }

   public std_msgs.msg.dds.MultiArrayLayout getLayout()
   {
      return layout_;
   }

   public us.ihmc.idl.IDLSequence.Short getData()
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
      if (!(other instanceof Int16MultiArray))
         return false;
      Int16MultiArray otherMyClass = (Int16MultiArray) other;
      boolean returnedValue = true;

      returnedValue &= this.layout_.equals(otherMyClass.layout_);

      returnedValue &= this.data_.equals(otherMyClass.data_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Int16MultiArray {");
      builder.append("layout=");
      builder.append(this.layout_);

      builder.append(", ");
      builder.append("data=");
      builder.append(this.data_);

      builder.append("}");
      return builder.toString();
   }
}