package nav_msgs.msg.dds;

/**
 *
 * Definition of the class "Odometry" defined in Odometry_.idl.
 *
 * This file was automatically generated from Odometry_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Odometry_.idl instead.
 *
 */
public class Odometry
{
   public Odometry()
   {
      header_ = new std_msgs.msg.dds.Header();
      child_frame_id_ = new java.lang.StringBuilder(255);
      pose_ = new geometry_msgs.msg.dds.PoseWithCovariance();
      twist_ = new geometry_msgs.msg.dds.TwistWithCovariance();

   }

   public void set(Odometry other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      child_frame_id_.setLength(0);
      child_frame_id_.append(other.child_frame_id_);
      geometry_msgs.msg.dds.PoseWithCovariancePubSubType.staticCopy(other.pose_, pose_);
      geometry_msgs.msg.dds.TwistWithCovariancePubSubType.staticCopy(other.twist_, twist_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public void setChild_frame_id(String child_frame_id)
   {
      child_frame_id_.setLength(0);
      child_frame_id_.append(child_frame_id);
   }

   public java.lang.String getChild_frame_idAsString()
   {
      return getChild_frame_id().toString();
   }

   public java.lang.StringBuilder getChild_frame_id()
   {
      return child_frame_id_;
   }

   public geometry_msgs.msg.dds.PoseWithCovariance getPose()
   {
      return pose_;
   }

   public geometry_msgs.msg.dds.TwistWithCovariance getTwist()
   {
      return twist_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof Odometry))
         return false;
      Odometry otherMyClass = (Odometry) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.child_frame_id_, otherMyClass.child_frame_id_);

      returnedValue &= this.pose_.equals(otherMyClass.pose_);

      returnedValue &= this.twist_.equals(otherMyClass.twist_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Odometry {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("child_frame_id=");
      builder.append(this.child_frame_id_);

      builder.append(", ");
      builder.append("pose=");
      builder.append(this.pose_);

      builder.append(", ");
      builder.append("twist=");
      builder.append(this.twist_);

      builder.append("}");
      return builder.toString();
   }

   private std_msgs.msg.dds.Header header_;
   private java.lang.StringBuilder child_frame_id_;
   private geometry_msgs.msg.dds.PoseWithCovariance pose_;
   private geometry_msgs.msg.dds.TwistWithCovariance twist_;

}