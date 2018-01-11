package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "Temperature" defined in Temperature_.idl.
 *
 * This file was automatically generated from Temperature_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Temperature_.idl instead.
 *
 */
public class Temperature
{
   private std_msgs.msg.dds.Header header_;
   private double temperature_;
   private double variance_;

   public Temperature()
   {
      header_ = new std_msgs.msg.dds.Header();

   }

   public void set(Temperature other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      temperature_ = other.temperature_;
      variance_ = other.variance_;

   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public double getTemperature()
   {
      return temperature_;
   }

   public void setTemperature(double temperature)
   {
      temperature_ = temperature;
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
      if (!(other instanceof Temperature))
         return false;
      Temperature otherMyClass = (Temperature) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.temperature_ == otherMyClass.temperature_;

      returnedValue &= this.variance_ == otherMyClass.variance_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Temperature {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("temperature=");
      builder.append(this.temperature_);

      builder.append(", ");
      builder.append("variance=");
      builder.append(this.variance_);

      builder.append("}");
      return builder.toString();
   }

}