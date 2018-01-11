package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "Imu" defined in Imu_.idl.
 *
 * This file was automatically generated from Imu_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Imu_.idl instead.
 *
 */
public class Imu
{
   public Imu()
   {
      header_ = new std_msgs.msg.dds.Header();
      orientation_ = new us.ihmc.euclid.tuple4D.Quaternion();
      orientation_covariance_ = new double[9];
      angular_velocity_ = new us.ihmc.euclid.tuple3D.Vector3D();
      angular_velocity_covariance_ = new double[9];
      linear_acceleration_ = new us.ihmc.euclid.tuple3D.Vector3D();
      linear_acceleration_covariance_ = new double[9];

   }

   public void set(Imu other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      geometry_msgs.msg.dds.QuaternionPubSubType.staticCopy(other.orientation_, orientation_);
      for (int b = 0; b < orientation_covariance_.length; ++b)
      {
         orientation_covariance_[b] = other.orientation_covariance_[b];

      }

      geometry_msgs.msg.dds.Vector3PubSubType.staticCopy(other.angular_velocity_, angular_velocity_);
      for (int d = 0; d < angular_velocity_covariance_.length; ++d)
      {
         angular_velocity_covariance_[d] = other.angular_velocity_covariance_[d];

      }

      geometry_msgs.msg.dds.Vector3PubSubType.staticCopy(other.linear_acceleration_, linear_acceleration_);
      for (int f = 0; f < linear_acceleration_covariance_.length; ++f)
      {
         linear_acceleration_covariance_[f] = other.linear_acceleration_covariance_[f];

      }

   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public us.ihmc.euclid.tuple4D.Quaternion getOrientation()
   {
      return orientation_;
   }

   public double[] getOrientation_covariance()
   {
      return orientation_covariance_;
   }

   public us.ihmc.euclid.tuple3D.Vector3D getAngular_velocity()
   {
      return angular_velocity_;
   }

   public double[] getAngular_velocity_covariance()
   {
      return angular_velocity_covariance_;
   }

   public us.ihmc.euclid.tuple3D.Vector3D getLinear_acceleration()
   {
      return linear_acceleration_;
   }

   public double[] getLinear_acceleration_covariance()
   {
      return linear_acceleration_covariance_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof Imu))
         return false;
      Imu otherMyClass = (Imu) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.orientation_.equals(otherMyClass.orientation_);

      for (int h = 0; h < orientation_covariance_.length; ++h)
      {
         returnedValue &= this.orientation_covariance_[h] == otherMyClass.orientation_covariance_[h];

      }
      returnedValue &= this.angular_velocity_.equals(otherMyClass.angular_velocity_);

      for (int j = 0; j < angular_velocity_covariance_.length; ++j)
      {
         returnedValue &= this.angular_velocity_covariance_[j] == otherMyClass.angular_velocity_covariance_[j];

      }
      returnedValue &= this.linear_acceleration_.equals(otherMyClass.linear_acceleration_);

      for (int l = 0; l < linear_acceleration_covariance_.length; ++l)
      {
         returnedValue &= this.linear_acceleration_covariance_[l] == otherMyClass.linear_acceleration_covariance_[l];

      }

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Imu {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("orientation=");
      builder.append(this.orientation_);

      builder.append(", ");
      builder.append("orientation_covariance=");
      builder.append(java.util.Arrays.toString(this.orientation_covariance_));

      builder.append(", ");
      builder.append("angular_velocity=");
      builder.append(this.angular_velocity_);

      builder.append(", ");
      builder.append("angular_velocity_covariance=");
      builder.append(java.util.Arrays.toString(this.angular_velocity_covariance_));

      builder.append(", ");
      builder.append("linear_acceleration=");
      builder.append(this.linear_acceleration_);

      builder.append(", ");
      builder.append("linear_acceleration_covariance=");
      builder.append(java.util.Arrays.toString(this.linear_acceleration_covariance_));

      builder.append("}");
      return builder.toString();
   }

   private std_msgs.msg.dds.Header header_;
   private us.ihmc.euclid.tuple4D.Quaternion orientation_;
   private double[] orientation_covariance_;
   private us.ihmc.euclid.tuple3D.Vector3D angular_velocity_;
   private double[] angular_velocity_covariance_;
   private us.ihmc.euclid.tuple3D.Vector3D linear_acceleration_;
   private double[] linear_acceleration_covariance_;

}