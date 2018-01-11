package geometry_msgs.msg.dds;

/**
 *
 * Definition of the class "PolygonStamped" defined in PolygonStamped_.idl.
 *
 * This file was automatically generated from PolygonStamped_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit PolygonStamped_.idl instead.
 *
 */
public class PolygonStamped
{
   public PolygonStamped()
   {
      header_ = new std_msgs.msg.dds.Header();
      polygon_ = new geometry_msgs.msg.dds.Polygon();

   }

   public void set(PolygonStamped other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      geometry_msgs.msg.dds.PolygonPubSubType.staticCopy(other.polygon_, polygon_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public geometry_msgs.msg.dds.Polygon getPolygon()
   {
      return polygon_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof PolygonStamped))
         return false;
      PolygonStamped otherMyClass = (PolygonStamped) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.polygon_.equals(otherMyClass.polygon_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("PolygonStamped {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("polygon=");
      builder.append(this.polygon_);

      builder.append("}");
      return builder.toString();
   }

   private std_msgs.msg.dds.Header header_;
   private geometry_msgs.msg.dds.Polygon polygon_;

}