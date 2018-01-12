package stereo_msgs.msg.dds;

/**
 *
 * Definition of the class "DisparityImage" defined in DisparityImage_.idl.
 *
 * This file was automatically generated from DisparityImage_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit DisparityImage_.idl instead.
 *
 */
public class DisparityImage
{
   private std_msgs.msg.dds.Header header_;
   private sensor_msgs.msg.dds.Image image_;
   private float f_;
   private float t_;
   private sensor_msgs.msg.dds.RegionOfInterest valid_window_;
   private float min_disparity_;
   private float max_disparity_;
   private float delta_d_;

   public DisparityImage()
   {
      header_ = new std_msgs.msg.dds.Header();
      image_ = new sensor_msgs.msg.dds.Image();
      valid_window_ = new sensor_msgs.msg.dds.RegionOfInterest();
   }

   public void set(DisparityImage other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      sensor_msgs.msg.dds.ImagePubSubType.staticCopy(other.image_, image_);
      f_ = other.f_;
      t_ = other.t_;
      sensor_msgs.msg.dds.RegionOfInterestPubSubType.staticCopy(other.valid_window_, valid_window_);
      min_disparity_ = other.min_disparity_;
      max_disparity_ = other.max_disparity_;
      delta_d_ = other.delta_d_;
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public sensor_msgs.msg.dds.Image getImage()
   {
      return image_;
   }

   public float getF()
   {
      return f_;
   }

   public void setF(float f)
   {
      f_ = f;
   }

   public float getT()
   {
      return t_;
   }

   public void setT(float t)
   {
      t_ = t;
   }

   public sensor_msgs.msg.dds.RegionOfInterest getValid_window()
   {
      return valid_window_;
   }

   public float getMin_disparity()
   {
      return min_disparity_;
   }

   public void setMin_disparity(float min_disparity)
   {
      min_disparity_ = min_disparity;
   }

   public float getMax_disparity()
   {
      return max_disparity_;
   }

   public void setMax_disparity(float max_disparity)
   {
      max_disparity_ = max_disparity;
   }

   public float getDelta_d()
   {
      return delta_d_;
   }

   public void setDelta_d(float delta_d)
   {
      delta_d_ = delta_d;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof DisparityImage))
         return false;
      DisparityImage otherMyClass = (DisparityImage) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.image_.equals(otherMyClass.image_);

      returnedValue &= this.f_ == otherMyClass.f_;

      returnedValue &= this.t_ == otherMyClass.t_;

      returnedValue &= this.valid_window_.equals(otherMyClass.valid_window_);

      returnedValue &= this.min_disparity_ == otherMyClass.min_disparity_;

      returnedValue &= this.max_disparity_ == otherMyClass.max_disparity_;

      returnedValue &= this.delta_d_ == otherMyClass.delta_d_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("DisparityImage {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("image=");
      builder.append(this.image_);

      builder.append(", ");
      builder.append("f=");
      builder.append(this.f_);

      builder.append(", ");
      builder.append("t=");
      builder.append(this.t_);

      builder.append(", ");
      builder.append("valid_window=");
      builder.append(this.valid_window_);

      builder.append(", ");
      builder.append("min_disparity=");
      builder.append(this.min_disparity_);

      builder.append(", ");
      builder.append("max_disparity=");
      builder.append(this.max_disparity_);

      builder.append(", ");
      builder.append("delta_d=");
      builder.append(this.delta_d_);

      builder.append("}");
      return builder.toString();
   }
}