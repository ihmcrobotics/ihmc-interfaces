package geometry_msgs.msg.dds;

/**
 *
 * Definition of the class "TwistWithCovariance" defined in TwistWithCovariance_.idl.
 *
 * This file was automatically generated from TwistWithCovariance_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit TwistWithCovariance_.idl instead.
 *
 */
public class TwistWithCovariance
{
   private geometry_msgs.msg.dds.Twist twist_;
   private double[] covariance_;

   public TwistWithCovariance()
   {
      twist_ = new geometry_msgs.msg.dds.Twist();
      covariance_ = new double[36];

   }

   public void set(TwistWithCovariance other)
   {
      geometry_msgs.msg.dds.TwistPubSubType.staticCopy(other.twist_, twist_);
      for (int b = 0; b < covariance_.length; ++b)
      {
         covariance_[b] = other.covariance_[b];

      }

   }

   public geometry_msgs.msg.dds.Twist getTwist()
   {
      return twist_;
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
      if (!(other instanceof TwistWithCovariance))
         return false;
      TwistWithCovariance otherMyClass = (TwistWithCovariance) other;
      boolean returnedValue = true;

      returnedValue &= this.twist_.equals(otherMyClass.twist_);

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

      builder.append("TwistWithCovariance {");
      builder.append("twist=");
      builder.append(this.twist_);

      builder.append(", ");
      builder.append("covariance=");
      builder.append(java.util.Arrays.toString(this.covariance_));

      builder.append("}");
      return builder.toString();
   }

}