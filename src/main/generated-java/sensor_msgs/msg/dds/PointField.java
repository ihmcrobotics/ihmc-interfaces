package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "PointField" defined in PointField_.idl.
 *
 * This file was automatically generated from PointField_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit PointField_.idl instead.
 *
 */
public class PointField
{
   public PointField()
   {
      name_ = new java.lang.StringBuilder(255);

   }

   public void set(PointField other)
   {
      name_.setLength(0);
      name_.append(other.name_);
      offset_ = other.offset_;
      datatype_ = other.datatype_;
      count_ = other.count_;

   }

   public void setName(String name)
   {
      name_.setLength(0);
      name_.append(name);
   }

   public java.lang.String getNameAsString()
   {
      return getName().toString();
   }

   public java.lang.StringBuilder getName()
   {
      return name_;
   }

   public void setOffset(long offset)
   {
      offset_ = offset;
   }

   public long getOffset()
   {
      return offset_;
   }

   public void setDatatype(byte datatype)
   {
      datatype_ = datatype;
   }

   public byte getDatatype()
   {
      return datatype_;
   }

   public void setCount(long count)
   {
      count_ = count;
   }

   public long getCount()
   {
      return count_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof PointField))
         return false;
      PointField otherMyClass = (PointField) other;
      boolean returnedValue = true;

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.name_, otherMyClass.name_);

      returnedValue &= this.offset_ == otherMyClass.offset_;

      returnedValue &= this.datatype_ == otherMyClass.datatype_;

      returnedValue &= this.count_ == otherMyClass.count_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("PointField {");
      builder.append("name=");
      builder.append(this.name_);

      builder.append(", ");
      builder.append("offset=");
      builder.append(this.offset_);

      builder.append(", ");
      builder.append("datatype=");
      builder.append(this.datatype_);

      builder.append(", ");
      builder.append("count=");
      builder.append(this.count_);

      builder.append("}");
      return builder.toString();
   }

   private java.lang.StringBuilder name_;
   private long offset_;
   private byte datatype_;
   private long count_;

}