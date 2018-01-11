package visualization_msgs.msg.dds;

/**
 *
 * Definition of the class "InteractiveMarkerUpdate" defined in InteractiveMarkerUpdate_.idl.
 *
 * This file was automatically generated from InteractiveMarkerUpdate_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit InteractiveMarkerUpdate_.idl instead.
 *
 */
public class InteractiveMarkerUpdate
{
   public InteractiveMarkerUpdate()
   {
      server_id_ = new java.lang.StringBuilder(255);
      markers_ = new us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.InteractiveMarker>(100, visualization_msgs.msg.dds.InteractiveMarker.class,
                                                                                                  new visualization_msgs.msg.dds.InteractiveMarkerPubSubType());

      poses_ = new us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.InteractiveMarkerPose>(100, visualization_msgs.msg.dds.InteractiveMarkerPose.class,
                                                                                                    new visualization_msgs.msg.dds.InteractiveMarkerPosePubSubType());

      erases_ = new us.ihmc.idl.IDLSequence.StringBuilderHolder(100, "type_d");

   }

   public void set(InteractiveMarkerUpdate other)
   {
      server_id_.setLength(0);
      server_id_.append(other.server_id_);
      seq_num_ = other.seq_num_;
      type_ = other.type_;
      markers_.set(other.markers_);
      poses_.set(other.poses_);
      erases_.set(other.erases_);
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

   public void setType(byte type)
   {
      type_ = type;
   }

   public byte getType()
   {
      return type_;
   }

   public us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.InteractiveMarker> getMarkers()
   {
      return markers_;
   }

   public us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.InteractiveMarkerPose> getPoses()
   {
      return poses_;
   }

   public us.ihmc.idl.IDLSequence.StringBuilderHolder getErases()
   {
      return erases_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof InteractiveMarkerUpdate))
         return false;
      InteractiveMarkerUpdate otherMyClass = (InteractiveMarkerUpdate) other;
      boolean returnedValue = true;

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.server_id_, otherMyClass.server_id_);

      returnedValue &= this.seq_num_ == otherMyClass.seq_num_;

      returnedValue &= this.type_ == otherMyClass.type_;

      returnedValue &= this.markers_.equals(otherMyClass.markers_);

      returnedValue &= this.poses_.equals(otherMyClass.poses_);

      returnedValue &= this.erases_.equals(otherMyClass.erases_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("InteractiveMarkerUpdate {");
      builder.append("server_id=");
      builder.append(this.server_id_);

      builder.append(", ");
      builder.append("seq_num=");
      builder.append(this.seq_num_);

      builder.append(", ");
      builder.append("type=");
      builder.append(this.type_);

      builder.append(", ");
      builder.append("markers=");
      builder.append(this.markers_);

      builder.append(", ");
      builder.append("poses=");
      builder.append(this.poses_);

      builder.append(", ");
      builder.append("erases=");
      builder.append(this.erases_);

      builder.append("}");
      return builder.toString();
   }

   private java.lang.StringBuilder server_id_;
   private long seq_num_;
   private byte type_;
   private us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.InteractiveMarker> markers_;
   private us.ihmc.idl.IDLSequence.Object<visualization_msgs.msg.dds.InteractiveMarkerPose> poses_;
   private us.ihmc.idl.IDLSequence.StringBuilderHolder erases_;

}