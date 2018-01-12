package std_msgs.msg.dds;

/**
 *
 * Definition of the class "UInt64" defined in UInt64_.idl.
 *
 * This file was automatically generated from UInt64_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit UInt64_.idl instead.
 *
 */
public class UInt64
{
   private long data_;

   public UInt64()
   {

   }

   public void set(UInt64 other)
   {
      data_ = other.data_;
   }

   public long getData()
   {
      return data_;
   }

   public void setData(long data)
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
      if (!(other instanceof UInt64))
         return false;
      UInt64 otherMyClass = (UInt64) other;
      boolean returnedValue = true;

      returnedValue &= this.data_ == otherMyClass.data_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("UInt64 {");
      builder.append("data=");
      builder.append(this.data_);

      builder.append("}");
      return builder.toString();
   }
}