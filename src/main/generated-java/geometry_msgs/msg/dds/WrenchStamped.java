package geometry_msgs.msg.dds;

/**
 *
 * Definition of the class "WrenchStamped" defined in WrenchStamped_.idl.
 *
 * This file was automatically generated from WrenchStamped_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit WrenchStamped_.idl instead.
 *
 */
public class WrenchStamped
{
   private std_msgs.msg.dds.Header header_;
   private geometry_msgs.msg.dds.Wrench wrench_;

   public WrenchStamped()
   {
      header_ = new std_msgs.msg.dds.Header();
      wrench_ = new geometry_msgs.msg.dds.Wrench();
   }

   public void set(WrenchStamped other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      geometry_msgs.msg.dds.WrenchPubSubType.staticCopy(other.wrench_, wrench_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public geometry_msgs.msg.dds.Wrench getWrench()
   {
      return wrench_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof WrenchStamped))
         return false;
      WrenchStamped otherMyClass = (WrenchStamped) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.wrench_.equals(otherMyClass.wrench_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("WrenchStamped {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("wrench=");
      builder.append(this.wrench_);

      builder.append("}");
      return builder.toString();
   }
}