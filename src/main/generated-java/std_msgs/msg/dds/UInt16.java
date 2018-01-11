package std_msgs.msg.dds;

/**
 *
 * Definition of the class "UInt16" defined in UInt16_.idl.
 *
 * This file was automatically generated from UInt16_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit UInt16_.idl instead.
 *
 */
public class UInt16
{
   public UInt16()
   {

   }

   public void set(UInt16 other)
   {
      data_ = other.data_;

   }

   public void setData(int data)
   {
      data_ = data;
   }

   public int getData()
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
      if (!(other instanceof UInt16))
         return false;
      UInt16 otherMyClass = (UInt16) other;
      boolean returnedValue = true;

      returnedValue &= this.data_ == otherMyClass.data_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("UInt16 {");
      builder.append("data=");
      builder.append(this.data_);

      builder.append("}");
      return builder.toString();
   }

   private int data_;

}