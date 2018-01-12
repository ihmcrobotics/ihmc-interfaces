package std_msgs.msg.dds;

/**
 *
 * Definition of the class "UInt8" defined in UInt8_.idl.
 *
 * This file was automatically generated from UInt8_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit UInt8_.idl instead.
 *
 */
public class UInt8
{
   private byte data_;

   public UInt8()
   {

   }

   public void set(UInt8 other)
   {
      data_ = other.data_;
   }

   public byte getData()
   {
      return data_;
   }

   public void setData(byte data)
   {
      data_ = data;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof UInt8))
         return false;
      UInt8 otherMyClass = (UInt8) other;
      boolean returnedValue = true;

      returnedValue &= this.data_ == otherMyClass.data_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("UInt8 {");
      builder.append("data=");
      builder.append(this.data_);

      builder.append("}");
      return builder.toString();
   }
}