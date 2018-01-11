package geometry_msgs.msg.dds;

/**
 *
 * Definition of the class "PoseWithCovariance" defined in PoseWithCovariance_.idl.
 *
 * This file was automatically generated from PoseWithCovariance_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit PoseWithCovariance_.idl instead.
 *
 */
public class PoseWithCovariance
{
   private us.ihmc.euclid.geometry.Pose3D pose_;
   private double[] covariance_;

   public PoseWithCovariance()
   {
      pose_ = new us.ihmc.euclid.geometry.Pose3D();
      covariance_ = new double[36];

   }

   public void set(PoseWithCovariance other)
   {
      geometry_msgs.msg.dds.PosePubSubType.staticCopy(other.pose_, pose_);
      for (int b = 0; b < covariance_.length; ++b)
      {
         covariance_[b] = other.covariance_[b];

      }

   }

   public us.ihmc.euclid.geometry.Pose3D getPose()
   {
      return pose_;
   }

   public double[] getCovariance()
   {
      return covariance_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof PoseWithCovariance))
         return false;
      PoseWithCovariance otherMyClass = (PoseWithCovariance) other;
      boolean returnedValue = true;

      returnedValue &= this.pose_.equals(otherMyClass.pose_);

      for (int d = 0; d < covariance_.length; ++d)
      {
         returnedValue &= this.covariance_[d] == otherMyClass.covariance_[d];

      }

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("PoseWithCovariance {");
      builder.append("pose=");
      builder.append(this.pose_);

      builder.append(", ");
      builder.append("covariance=");
      builder.append(java.util.Arrays.toString(this.covariance_));

      builder.append("}");
      return builder.toString();
   }

}