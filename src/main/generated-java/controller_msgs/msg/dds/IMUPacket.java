package controller_msgs.msg.dds;

/**
 *
 * Definition of the class "IMUPacket" defined in IMUPacket_.idl.
 *
 * This file was automatically generated from IMUPacket_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit IMUPacket_.idl instead.
 *
 */
public class IMUPacket
{
   private us.ihmc.euclid.tuple3D.Vector3D linear_acceleration_;
   private us.ihmc.euclid.tuple4D.Quaternion orientation_;
   private us.ihmc.euclid.tuple3D.Vector3D angular_velocity_;
   private double time_;

   public IMUPacket()
   {
      linear_acceleration_ = new us.ihmc.euclid.tuple3D.Vector3D();
      orientation_ = new us.ihmc.euclid.tuple4D.Quaternion();
      angular_velocity_ = new us.ihmc.euclid.tuple3D.Vector3D();
   }

   public void set(IMUPacket other)
   {
      geometry_msgs.msg.dds.Vector3PubSubType.staticCopy(other.linear_acceleration_, linear_acceleration_);
      geometry_msgs.msg.dds.QuaternionPubSubType.staticCopy(other.orientation_, orientation_);
      geometry_msgs.msg.dds.Vector3PubSubType.staticCopy(other.angular_velocity_, angular_velocity_);
      time_ = other.time_;
   }

   public us.ihmc.euclid.tuple3D.Vector3D getLinear_acceleration()
   {
      return linear_acceleration_;
   }

   public us.ihmc.euclid.tuple4D.Quaternion getOrientation()
   {
      return orientation_;
   }

   public us.ihmc.euclid.tuple3D.Vector3D getAngular_velocity()
   {
      return angular_velocity_;
   }

   public double getTime()
   {
      return time_;
   }

   public void setTime(double time)
   {
      time_ = time;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof IMUPacket))
         return false;
      IMUPacket otherMyClass = (IMUPacket) other;
      boolean returnedValue = true;

      returnedValue &= this.linear_acceleration_.equals(otherMyClass.linear_acceleration_);

      returnedValue &= this.orientation_.equals(otherMyClass.orientation_);

      returnedValue &= this.angular_velocity_.equals(otherMyClass.angular_velocity_);

      returnedValue &= this.time_ == otherMyClass.time_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("IMUPacket {");
      builder.append("linear_acceleration=");
      builder.append(this.linear_acceleration_);

      builder.append(", ");
      builder.append("orientation=");
      builder.append(this.orientation_);

      builder.append(", ");
      builder.append("angular_velocity=");
      builder.append(this.angular_velocity_);

      builder.append(", ");
      builder.append("time=");
      builder.append(this.time_);

      builder.append("}");
      return builder.toString();
   }
}