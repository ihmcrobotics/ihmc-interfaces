package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "Illuminance" defined in Illuminance_.idl.
 *
 * This file was automatically generated from Illuminance_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Illuminance_.idl instead.
 *
 */
public class Illuminance
{
   private std_msgs.msg.dds.Header header_;
   private double illuminance_;
   private double variance_;

   public Illuminance()
   {
      header_ = new std_msgs.msg.dds.Header();
   }

   public void set(Illuminance other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      illuminance_ = other.illuminance_;
      variance_ = other.variance_;
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public double getIlluminance()
   {
      return illuminance_;
   }

   public void setIlluminance(double illuminance)
   {
      illuminance_ = illuminance;
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
      if (!(other instanceof Illuminance))
         return false;
      Illuminance otherMyClass = (Illuminance) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.illuminance_ == otherMyClass.illuminance_;

      returnedValue &= this.variance_ == otherMyClass.variance_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Illuminance {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("illuminance=");
      builder.append(this.illuminance_);

      builder.append(", ");
      builder.append("variance=");
      builder.append(this.variance_);

      builder.append("}");
      return builder.toString();
   }
}