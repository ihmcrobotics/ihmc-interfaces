package std_msgs.msg.dds;

/**
 *
 * Definition of the class "Int64" defined in Int64_.idl.
 *
 * This file was automatically generated from Int64_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Int64_.idl instead.
 *
 */
public class Int64
{
   private long data_;

   public Int64()
   {

   }

   public void set(Int64 other)
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
      if (!(other instanceof Int64))
         return false;
      Int64 otherMyClass = (Int64) other;
      boolean returnedValue = true;

      returnedValue &= this.data_ == otherMyClass.data_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Int64 {");
      builder.append("data=");
      builder.append(this.data_);

      builder.append("}");
      return builder.toString();
   }
}