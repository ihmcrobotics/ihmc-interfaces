package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "NavSatStatus" defined in NavSatStatus_.idl.
 *
 * This file was automatically generated from NavSatStatus_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit NavSatStatus_.idl instead.
 *
 */
public class NavSatStatus
{
   private byte status_;
   private int service_;

   public NavSatStatus()
   {

   }

   public void set(NavSatStatus other)
   {
      status_ = other.status_;
      service_ = other.service_;

   }

   public byte getStatus()
   {
      return status_;
   }

   public void setStatus(byte status)
   {
      status_ = status;
   }

   public int getService()
   {
      return service_;
   }

   public void setService(int service)
   {
      service_ = service;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof NavSatStatus))
         return false;
      NavSatStatus otherMyClass = (NavSatStatus) other;
      boolean returnedValue = true;

      returnedValue &= this.status_ == otherMyClass.status_;

      returnedValue &= this.service_ == otherMyClass.service_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("NavSatStatus {");
      builder.append("status=");
      builder.append(this.status_);

      builder.append(", ");
      builder.append("service=");
      builder.append(this.service_);

      builder.append("}");
      return builder.toString();
   }

}