package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "RelativeHumidity" defined in RelativeHumidity_.idl.
 *
 * This file was automatically generated from RelativeHumidity_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit RelativeHumidity_.idl instead.
 *
 */
public class RelativeHumidity
{
   private std_msgs.msg.dds.Header header_;
   private double relative_humidity_;
   private double variance_;

   public RelativeHumidity()
   {
      header_ = new std_msgs.msg.dds.Header();
   }

   public void set(RelativeHumidity other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      relative_humidity_ = other.relative_humidity_;
      variance_ = other.variance_;
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public double getRelative_humidity()
   {
      return relative_humidity_;
   }

   public void setRelative_humidity(double relative_humidity)
   {
      relative_humidity_ = relative_humidity;
   }

   public double getVariance()
   {
      return variance_;
   }

   public void setVariance(double variance)
   {
      variance_ = variance;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof RelativeHumidity))
         return false;
      RelativeHumidity otherMyClass = (RelativeHumidity) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.relative_humidity_ == otherMyClass.relative_humidity_;

      returnedValue &= this.variance_ == otherMyClass.variance_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("RelativeHumidity {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("relative_humidity=");
      builder.append(this.relative_humidity_);

      builder.append(", ");
      builder.append("variance=");
      builder.append(this.variance_);

      builder.append("}");
      return builder.toString();
   }
}