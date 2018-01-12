package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "Image" defined in Image_.idl.
 *
 * This file was automatically generated from Image_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Image_.idl instead.
 *
 */
public class Image
{
   private std_msgs.msg.dds.Header header_;
   private long height_;
   private long width_;
   private java.lang.StringBuilder encoding_;
   private byte is_bigendian_;
   private long step_;
   private us.ihmc.idl.IDLSequence.Byte data_;

   public Image()
   {
      header_ = new std_msgs.msg.dds.Header();
      encoding_ = new java.lang.StringBuilder(255);
      data_ = new us.ihmc.idl.IDLSequence.Byte(100, "type_9");
   }

   public void set(Image other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      height_ = other.height_;
      width_ = other.width_;
      encoding_.setLength(0);
      encoding_.append(other.encoding_);
      is_bigendian_ = other.is_bigendian_;
      step_ = other.step_;
      data_.set(other.data_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public long getHeight()
   {
      return height_;
   }

   public void setHeight(long height)
   {
      height_ = height;
   }

   public long getWidth()
   {
      return width_;
   }

   public void setWidth(long width)
   {
      width_ = width;
   }

   public java.lang.String getEncodingAsString()
   {
      return getEncoding().toString();
   }

   public java.lang.StringBuilder getEncoding()
   {
      return encoding_;
   }

   public void setEncoding(String encoding)
   {
      encoding_.setLength(0);
      encoding_.append(encoding);
   }

   public byte getIs_bigendian()
   {
      return is_bigendian_;
   }

   public void setIs_bigendian(byte is_bigendian)
   {
      is_bigendian_ = is_bigendian;
   }

   public long getStep()
   {
      return step_;
   }

   public void setStep(long step)
   {
      step_ = step;
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
      if (!(other instanceof Image))
         return false;
      Image otherMyClass = (Image) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.height_ == otherMyClass.height_;

      returnedValue &= this.width_ == otherMyClass.width_;

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.encoding_, otherMyClass.encoding_);

      returnedValue &= this.is_bigendian_ == otherMyClass.is_bigendian_;

      returnedValue &= this.step_ == otherMyClass.step_;

      returnedValue &= this.data_.equals(otherMyClass.data_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Image {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("height=");
      builder.append(this.height_);

      builder.append(", ");
      builder.append("width=");
      builder.append(this.width_);

      builder.append(", ");
      builder.append("encoding=");
      builder.append(this.encoding_);

      builder.append(", ");
      builder.append("is_bigendian=");
      builder.append(this.is_bigendian_);

      builder.append(", ");
      builder.append("step=");
      builder.append(this.step_);

      builder.append(", ");
      builder.append("data=");
      builder.append(this.data_);

      builder.append("}");
      return builder.toString();
   }
}