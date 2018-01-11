package visualization_msgs.msg.dds;

/**
 *
 * Definition of the class "InteractiveMarkerInit" defined in InteractiveMarkerInit_.idl.
 *
 * This file was automatically generated from InteractiveMarkerInit_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit InteractiveMarkerInit_.idl instead.
 *
 */
public class InteractiveMarkerInit
{
   public InteractiveMarkerInit()
   {
      server_id_ = new java.lang.StringBuilder(255);
      markers_ = new us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.InteractiveMarker>(100, visualization_msgs.msg.dds.InteractiveMarker.class,
                                                                                                  new visualization_msgs.msg.dds.InteractiveMarkerPubSubType());

   }

   public void set(InteractiveMarkerInit other)
   {
      server_id_.setLength(0);
      server_id_.append(other.server_id_);
      seq_num_ = other.seq_num_;
      markers_.set(other.markers_);
   }

   public void setServer_id(String server_id)
   {
      server_id_.setLength(0);
      server_id_.append(server_id);
   }

   public java.lang.String getServer_idAsString()
   {
      return getServer_id().toString();
   }

   public java.lang.StringBuilder getServer_id()
   {
      return server_id_;
   }

   public void setSeq_num(long seq_num)
   {
      seq_num_ = seq_num;
   }

   public long getSeq_num()
   {
      return seq_num_;
   }

   public us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.InteractiveMarker> getMarkers()
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
      if (!(other instanceof InteractiveMarkerInit))
         return false;
      InteractiveMarkerInit otherMyClass = (InteractiveMarkerInit) other;
      boolean returnedValue = true;

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.server_id_, otherMyClass.server_id_);

      returnedValue &= this.seq_num_ == otherMyClass.seq_num_;

      returnedValue &= this.markers_.equals(otherMyClass.markers_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("InteractiveMarkerInit {");
      builder.append("server_id=");
      builder.append(this.server_id_);

      builder.append(", ");
      builder.append("seq_num=");
      builder.append(this.seq_num_);

      builder.append(", ");
      builder.append("markers=");
      builder.append(this.markers_);

      builder.append("}");
      return builder.toString();
   }

   private java.lang.StringBuilder server_id_;
   private long seq_num_;
   private us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.InteractiveMarker> markers_;

}