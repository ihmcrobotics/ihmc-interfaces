package visualization_msgs.msg.dds;

/**
 *
 * Definition of the class "MarkerArray" defined in MarkerArray_.idl.
 *
 * This file was automatically generated from MarkerArray_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit MarkerArray_.idl instead.
 *
 */
public class MarkerArray
{
   private us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.Marker> markers_;

   public MarkerArray()
   {
      markers_ = new us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.Marker>(100, visualization_msgs.msg.dds.Marker.class,
                                                                                       new visualization_msgs.msg.dds.MarkerPubSubType());

   }

   public void set(MarkerArray other)
   {
      markers_.set(other.markers_);
   }

   public us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.Marker> getMarkers()
   {
      return markers_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof MarkerArray))
         return false;
      MarkerArray otherMyClass = (MarkerArray) other;
      boolean returnedValue = true;

      returnedValue &= this.markers_.equals(otherMyClass.markers_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("MarkerArray {");
      builder.append("markers=");
      builder.append(this.markers_);

      builder.append("}");
      return builder.toString();
   }

}