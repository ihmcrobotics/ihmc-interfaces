package geometry_msgs.msg.dds;

/**
 *
 * Definition of the class "TwistWithCovarianceStamped" defined in TwistWithCovarianceStamped_.idl.
 *
 * This file was automatically generated from TwistWithCovarianceStamped_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit TwistWithCovarianceStamped_.idl instead.
 *
 */
public class TwistWithCovarianceStamped
{
   public TwistWithCovarianceStamped()
   {
      header_ = new std_msgs.msg.dds.Header();
      twist_ = new geometry_msgs.msg.dds.TwistWithCovariance();

   }

   public void set(TwistWithCovarianceStamped other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      geometry_msgs.msg.dds.TwistWithCovariancePubSubType.staticCopy(other.twist_, twist_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public geometry_msgs.msg.dds.TwistWithCovariance getTwist()
   {
      return twist_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof TwistWithCovarianceStamped))
         return false;
      TwistWithCovarianceStamped otherMyClass = (TwistWithCovarianceStamped) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.twist_.equals(otherMyClass.twist_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("TwistWithCovarianceStamped {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("twist=");
      builder.append(this.twist_);

      builder.append("}");
      return builder.toString();
   }

   private std_msgs.msg.dds.Header header_;
   private geometry_msgs.msg.dds.TwistWithCovariance twist_;

}