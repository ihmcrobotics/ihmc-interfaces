package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "Range" defined in Range_.idl.
 *
 * This file was automatically generated from Range_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Range_.idl instead.
 *
 */
public class Range
{
   public Range()
   {
      header_ = new std_msgs.msg.dds.Header();

   }

   public void set(Range other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      radiation_type_ = other.radiation_type_;
      field_of_view_ = other.field_of_view_;
      min_range_ = other.min_range_;
      max_range_ = other.max_range_;
      range_ = other.range_;

   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public void setRadiation_type(byte radiation_type)
   {
      radiation_type_ = radiation_type;
   }

   public byte getRadiation_type()
   {
      return radiation_type_;
   }

   public void setField_of_view(float field_of_view)
   {
      field_of_view_ = field_of_view;
   }

   public float getField_of_view()
   {
      return field_of_view_;
   }

   public void setMin_range(float min_range)
   {
      min_range_ = min_range;
   }

   public float getMin_range()
   {
      return min_range_;
   }

   public void setMax_range(float max_range)
   {
      max_range_ = max_range;
   }

   public float getMax_range()
   {
      return max_range_;
   }

   public void setRange(float range)
   {
      range_ = range;
   }

   public float getRange()
   {
      return range_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof Range))
         return false;
      Range otherMyClass = (Range) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.radiation_type_ == otherMyClass.radiation_type_;

      returnedValue &= this.field_of_view_ == otherMyClass.field_of_view_;

      returnedValue &= this.min_range_ == otherMyClass.min_range_;

      returnedValue &= this.max_range_ == otherMyClass.max_range_;

      returnedValue &= this.range_ == otherMyClass.range_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Range {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("radiation_type=");
      builder.append(this.radiation_type_);

      builder.append(", ");
      builder.append("field_of_view=");
      builder.append(this.field_of_view_);

      builder.append(", ");
      builder.append("min_range=");
      builder.append(this.min_range_);

      builder.append(", ");
      builder.append("max_range=");
      builder.append(this.max_range_);

      builder.append(", ");
      builder.append("range=");
      builder.append(this.range_);

      builder.append("}");
      return builder.toString();
   }

   private std_msgs.msg.dds.Header header_;
   private byte radiation_type_;
   private float field_of_view_;
   private float min_range_;
   private float max_range_;
   private float range_;

}