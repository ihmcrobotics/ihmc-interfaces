package std_msgs.msg.dds;

/**
 *
 * Definition of the class "Byte" defined in Byte_.idl.
 *
 * This file was automatically generated from Byte_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Byte_.idl instead.
 *
 */
public class Byte
{
   private byte data_;

   public Byte()
   {

   }

   public void set(Byte other)
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
      if (!(other instanceof Byte))
         return false;
      Byte otherMyClass = (Byte) other;
      boolean returnedValue = true;

      returnedValue &= this.data_ == otherMyClass.data_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Byte {");
      builder.append("data=");
      builder.append(this.data_);

      builder.append("}");
      return builder.toString();
   }
}