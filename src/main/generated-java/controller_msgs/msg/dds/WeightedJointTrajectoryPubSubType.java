package controller_msgs.msg.dds;

/**
 *
 * Topic data type of the struct "WeightedJointTrajectory" defined in "WeightedJointTrajectory_.idl". Use this class to provide the TopicDataType to a Participant.
 *
 * This file was automatically generated from WeightedJointTrajectory_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit WeightedJointTrajectory_.idl instead.
 *
 */
public class WeightedJointTrajectoryPubSubType implements us.ihmc.pubsub.TopicDataType<controller_msgs.msg.dds.WeightedJointTrajectory>
{
   public static final java.lang.String name = "controller_msgs::msg::dds_::WeightedJointTrajectory_";
   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   public WeightedJointTrajectoryPubSubType()
   {

   }

   public static int getMaxCdrSerializedSize()
   {
      return getMaxCdrSerializedSize(0);
   }

   public static int getMaxCdrSerializedSize(int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += std_msgs.msg.dds.HeaderPubSubType.getMaxCdrSerializedSize(current_alignment);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      for (int a = 0; a < 100; ++a)
      {
         current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4) + 255 + 1;
      }
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      for (int a = 0; a < 100; ++a)
      {
         current_alignment += controller_msgs.msg.dds.WeightedJointTrajectoryPointPubSubType.getMaxCdrSerializedSize(current_alignment);
      }

      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(controller_msgs.msg.dds.WeightedJointTrajectory data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(controller_msgs.msg.dds.WeightedJointTrajectory data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += std_msgs.msg.dds.HeaderPubSubType.getCdrSerializedSize(data.getHeader(), current_alignment);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      for (int a = 0; a < data.getJoint_names().size(); ++a)
      {
         current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4) + data.getJoint_names().get(a).length() + 1;
      }
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      for (int a = 0; a < data.getPoints().size(); ++a)
      {
         current_alignment += controller_msgs.msg.dds.WeightedJointTrajectoryPointPubSubType.getCdrSerializedSize(data.getPoints().get(a), current_alignment);
      }

      return current_alignment - initial_alignment;
   }

   public static void write(controller_msgs.msg.dds.WeightedJointTrajectory data, us.ihmc.idl.CDR cdr)
   {

      std_msgs.msg.dds.HeaderPubSubType.write(data.getHeader(), cdr);

      if (data.getJoint_names().size() <= 100)
         cdr.write_type_e(data.getJoint_names());
      else
         throw new RuntimeException("joint_names field exceeds the maximum length");

      if (data.getPoints().size() <= 100)
         cdr.write_type_e(data.getPoints());
      else
         throw new RuntimeException("points field exceeds the maximum length");
   }

   public static void read(controller_msgs.msg.dds.WeightedJointTrajectory data, us.ihmc.idl.CDR cdr)
   {

      std_msgs.msg.dds.HeaderPubSubType.read(data.getHeader(), cdr);

      cdr.read_type_e(data.getJoint_names());

      cdr.read_type_e(data.getPoints());
   }

   public static void staticCopy(controller_msgs.msg.dds.WeightedJointTrajectory src, controller_msgs.msg.dds.WeightedJointTrajectory dest)
   {
      dest.set(src);
   }

   @Override
   public void serialize(controller_msgs.msg.dds.WeightedJointTrajectory data, us.ihmc.pubsub.common.SerializedPayload serializedPayload)
         throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, controller_msgs.msg.dds.WeightedJointTrajectory data)
         throws java.io.IOException
   {
      deserializeCDR.deserialize(serializedPayload);
      read(data, deserializeCDR);
      deserializeCDR.finishDeserialize();
   }

   @Override
   public final void serialize(controller_msgs.msg.dds.WeightedJointTrajectory data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_a("header", new std_msgs.msg.dds.HeaderPubSubType(), data.getHeader());

      ser.write_type_e("joint_names", data.getJoint_names());

      ser.write_type_e("points", data.getPoints());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, controller_msgs.msg.dds.WeightedJointTrajectory data)
   {
      ser.read_type_a("header", new std_msgs.msg.dds.HeaderPubSubType(), data.getHeader());

      ser.read_type_e("joint_names", data.getJoint_names());

      ser.read_type_e("points", data.getPoints());
   }

   @Override
   public controller_msgs.msg.dds.WeightedJointTrajectory createData()
   {
      return new controller_msgs.msg.dds.WeightedJointTrajectory();
   }

   @Override
   public int getTypeSize()
   {
      return us.ihmc.idl.CDR.getTypeSize(getMaxCdrSerializedSize());
   }

   @Override
   public java.lang.String getName()
   {
      return name;
   }

   public void serialize(controller_msgs.msg.dds.WeightedJointTrajectory data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(controller_msgs.msg.dds.WeightedJointTrajectory data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }

   public void copy(controller_msgs.msg.dds.WeightedJointTrajectory src, controller_msgs.msg.dds.WeightedJointTrajectory dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public WeightedJointTrajectoryPubSubType newInstance()
   {
      return new WeightedJointTrajectoryPubSubType();
   }
}