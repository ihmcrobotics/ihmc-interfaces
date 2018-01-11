package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "CompressedImage" defined in CompressedImage_.idl.
 *
 * This file was automatically generated from CompressedImage_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit CompressedImage_.idl instead.
 *
 */
public class CompressedImage
{
   public CompressedImage()
   {
      header_ = new std_msgs.msg.dds.Header();
      format_ = new java.lang.StringBuilder(255);
      data_ = new us.ihmc.idl.IDLSequence.Byte(100, "type_9");

   }

   public void set(CompressedImage other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      format_.setLength(0);
      format_.append(other.format_);
      data_.set(other.data_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public void setFormat(String format)
   {
      format_.setLength(0);
      format_.append(format);
   }

   public java.lang.String getFormatAsString()
   {
      return getFormat().toString();
   }

   public java.lang.StringBuilder getFormat()
   {
      return format_;
   }

   public us.ihmc.idl.IDLSequence.Byte getData()
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
      if (!(other instanceof CompressedImage))
         return false;
      CompressedImage otherMyClass = (CompressedImage) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.format_, otherMyClass.format_);

      returnedValue &= this.data_.equals(otherMyClass.data_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("CompressedImage {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("format=");
      builder.append(this.format_);

      builder.append(", ");
      builder.append("data=");
      builder.append(this.data_);

      builder.append("}");
      return builder.toString();
   }

   private std_msgs.msg.dds.Header header_;
   private java.lang.StringBuilder format_;
   private us.ihmc.idl.IDLSequence.Byte data_;

}