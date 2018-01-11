package std_msgs.msg.dds;

/**
 *
 * Definition of the class "String" defined in String_.idl.
 *
 * This file was automatically generated from String_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit String_.idl instead.
 *
 */
public class String
{
   public String()
   {
      data_ = new java.lang.StringBuilder(255);

   }

   public void set(String other)
   {
      data_.setLength(0);
      data_.append(other.data_);
   }

   public void setData(String data)
   {
      data_.setLength(0);
      data_.append(data);
   }

   public java.lang.String getDataAsString()
   {
      return getData().toString();
   }

   public java.lang.StringBuilder getData()
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
      if (!(other instanceof String))
         return false;
      String otherMyClass = (String) other;
      boolean returnedValue = true;

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.data_, otherMyClass.data_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("String {");
      builder.append("data=");
      builder.append(this.data_);

      builder.append("}");
      return builder.toString();
   }

   private java.lang.StringBuilder data_;

}