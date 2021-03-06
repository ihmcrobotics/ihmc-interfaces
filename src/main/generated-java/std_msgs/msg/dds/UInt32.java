package std_msgs.msg.dds;

/**
 *
 * Definition of the class "UInt32" defined in UInt32_.idl.
 *
 * This file was automatically generated from UInt32_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit UInt32_.idl instead.
 *
 */
public class UInt32
{
   private long data_;

   public UInt32()
   {

   }

   public void set(UInt32 other)
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
      if (!(other instanceof UInt32))
         return false;
      UInt32 otherMyClass = (UInt32) other;
      boolean returnedValue = true;

      returnedValue &= this.data_ == otherMyClass.data_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("UInt32 {");
      builder.append("data=");
      builder.append(this.data_);

      builder.append("}");
      return builder.toString();
   }
}