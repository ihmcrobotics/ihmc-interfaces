package std_msgs.msg.dds;

/**
 *
 * Definition of the class "Float64" defined in Float64_.idl.
 *
 * This file was automatically generated from Float64_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Float64_.idl instead.
 *
 */
public class Float64
{
   public Float64()
   {

   }

   public void set(Float64 other)
   {
      data_ = other.data_;

   }

   public void setData(double data)
   {
      data_ = data;
   }

   public double getData()
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
      if (!(other instanceof Float64))
         return false;
      Float64 otherMyClass = (Float64) other;
      boolean returnedValue = true;

      returnedValue &= this.data_ == otherMyClass.data_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Float64 {");
      builder.append("data=");
      builder.append(this.data_);

      builder.append("}");
      return builder.toString();
   }

   private double data_;

}