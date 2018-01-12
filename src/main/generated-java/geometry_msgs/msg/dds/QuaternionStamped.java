package geometry_msgs.msg.dds;

/**
 *
 * Definition of the class "QuaternionStamped" defined in QuaternionStamped_.idl.
 *
 * This file was automatically generated from QuaternionStamped_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit QuaternionStamped_.idl instead.
 *
 */
public class QuaternionStamped
{
   private std_msgs.msg.dds.Header header_;
   private us.ihmc.euclid.tuple4D.Quaternion quaternion_;

   public QuaternionStamped()
   {
      header_ = new std_msgs.msg.dds.Header();
      quaternion_ = new us.ihmc.euclid.tuple4D.Quaternion();
   }

   public void set(QuaternionStamped other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      geometry_msgs.msg.dds.QuaternionPubSubType.staticCopy(other.quaternion_, quaternion_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public us.ihmc.euclid.tuple4D.Quaternion getQuaternion()
   {
      return quaternion_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof QuaternionStamped))
         return false;
      QuaternionStamped otherMyClass = (QuaternionStamped) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.quaternion_.equals(otherMyClass.quaternion_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("QuaternionStamped {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("quaternion=");
      builder.append(this.quaternion_);

      builder.append("}");
      return builder.toString();
   }
}