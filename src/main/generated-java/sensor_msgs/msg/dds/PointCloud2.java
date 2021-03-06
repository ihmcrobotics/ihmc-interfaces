package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "PointCloud2" defined in PointCloud2_.idl.
 *
 * This file was automatically generated from PointCloud2_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit PointCloud2_.idl instead.
 *
 */
public class PointCloud2
{
   private std_msgs.msg.dds.Header header_;
   private long height_;
   private long width_;
   private us.ihmc.idl.IDLSequence.Object<sensor_msgs.msg.dds.PointField> fields_;
   private boolean is_bigendian_;
   private long point_step_;
   private long row_step_;
   private us.ihmc.idl.IDLSequence.Byte data_;
   private boolean is_dense_;

   public PointCloud2()
   {
      header_ = new std_msgs.msg.dds.Header();
      fields_ = new us.ihmc.idl.IDLSequence.Object<sensor_msgs.msg.dds.PointField>(100, sensor_msgs.msg.dds.PointField.class,
                                                                                   new sensor_msgs.msg.dds.PointFieldPubSubType());

      data_ = new us.ihmc.idl.IDLSequence.Byte(100, "type_9");
   }

   public void set(PointCloud2 other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      height_ = other.height_;
      width_ = other.width_;
      fields_.set(other.fields_);
      is_bigendian_ = other.is_bigendian_;
      point_step_ = other.point_step_;
      row_step_ = other.row_step_;
      data_.set(other.data_);
      is_dense_ = other.is_dense_;
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

   public us.ihmc.idl.IDLSequence.Object<sensor_msgs.msg.dds.PointField> getFields()
   {
      return fields_;
   }

   public boolean getIs_bigendian()
   {
      return is_bigendian_;
   }

   public void setIs_bigendian(boolean is_bigendian)
   {
      is_bigendian_ = is_bigendian;
   }

   public long getPoint_step()
   {
      return point_step_;
   }

   public void setPoint_step(long point_step)
   {
      point_step_ = point_step;
   }

   public long getRow_step()
   {
      return row_step_;
   }

   public void setRow_step(long row_step)
   {
      row_step_ = row_step;
   }

   public us.ihmc.idl.IDLSequence.Byte getData()
   {
      return data_;
   }

   public boolean getIs_dense()
   {
      return is_dense_;
   }

   public void setIs_dense(boolean is_dense)
   {
      is_dense_ = is_dense;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof PointCloud2))
         return false;
      PointCloud2 otherMyClass = (PointCloud2) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.height_ == otherMyClass.height_;

      returnedValue &= this.width_ == otherMyClass.width_;

      returnedValue &= this.fields_.equals(otherMyClass.fields_);

      returnedValue &= this.is_bigendian_ == otherMyClass.is_bigendian_;

      returnedValue &= this.point_step_ == otherMyClass.point_step_;

      returnedValue &= this.row_step_ == otherMyClass.row_step_;

      returnedValue &= this.data_.equals(otherMyClass.data_);

      returnedValue &= this.is_dense_ == otherMyClass.is_dense_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("PointCloud2 {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("height=");
      builder.append(this.height_);

      builder.append(", ");
      builder.append("width=");
      builder.append(this.width_);

      builder.append(", ");
      builder.append("fields=");
      builder.append(this.fields_);

      builder.append(", ");
      builder.append("is_bigendian=");
      builder.append(this.is_bigendian_);

      builder.append(", ");
      builder.append("point_step=");
      builder.append(this.point_step_);

      builder.append(", ");
      builder.append("row_step=");
      builder.append(this.row_step_);

      builder.append(", ");
      builder.append("data=");
      builder.append(this.data_);

      builder.append(", ");
      builder.append("is_dense=");
      builder.append(this.is_dense_);

      builder.append("}");
      return builder.toString();
   }
}