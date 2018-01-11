package trajectory_msgs.msg.dds;

/**
 *
 * Definition of the class "JointTrajectory" defined in JointTrajectory_.idl.
 *
 * This file was automatically generated from JointTrajectory_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit JointTrajectory_.idl instead.
 *
 */
public class JointTrajectory
{
   private std_msgs.msg.dds.Header header_;
   private us.ihmc.idl.IDLSequence.StringBuilderHolder joint_names_;
   private us.ihmc.idl.IDLSequence.Object<trajectory_msgs.msg.dds.JointTrajectoryPoint> points_;

   public JointTrajectory()
   {
      header_ = new std_msgs.msg.dds.Header();
      joint_names_ = new us.ihmc.idl.IDLSequence.StringBuilderHolder(100, "type_d");
      points_ = new us.ihmc.idl.IDLSequence.Object<trajectory_msgs.msg.dds.JointTrajectoryPoint>(100, trajectory_msgs.msg.dds.JointTrajectoryPoint.class,
                                                                                                 new trajectory_msgs.msg.dds.JointTrajectoryPointPubSubType());

   }

   public void set(JointTrajectory other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      joint_names_.set(other.joint_names_);
      points_.set(other.points_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public us.ihmc.idl.IDLSequence.StringBuilderHolder getJoint_names()
   {
      return joint_names_;
   }

   public us.ihmc.idl.IDLSequence.Object<trajectory_msgs.msg.dds.JointTrajectoryPoint> getPoints()
   {
      return points_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof JointTrajectory))
         return false;
      JointTrajectory otherMyClass = (JointTrajectory) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.joint_names_.equals(otherMyClass.joint_names_);

      returnedValue &= this.points_.equals(otherMyClass.points_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("JointTrajectory {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("joint_names=");
      builder.append(this.joint_names_);

      builder.append(", ");
      builder.append("points=");
      builder.append(this.points_);

      builder.append("}");
      return builder.toString();
   }

}