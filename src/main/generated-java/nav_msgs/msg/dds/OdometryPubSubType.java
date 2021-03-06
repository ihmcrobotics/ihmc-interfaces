package nav_msgs.msg.dds;

/**
 *
 * Topic data type of the struct "Odometry" defined in "Odometry_.idl". Use this class to provide the TopicDataType to a Participant.
 *
 * This file was automatically generated from Odometry_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Odometry_.idl instead.
 *
 */
public class OdometryPubSubType implements us.ihmc.pubsub.TopicDataType<nav_msgs.msg.dds.Odometry>
{
   public static final java.lang.String name = "nav_msgs::msg::dds_::Odometry_";
   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   public OdometryPubSubType()
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
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4) + 255 + 1;

      current_alignment += geometry_msgs.msg.dds.PoseWithCovariancePubSubType.getMaxCdrSerializedSize(current_alignment);
      current_alignment += geometry_msgs.msg.dds.TwistWithCovariancePubSubType.getMaxCdrSerializedSize(current_alignment);

      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(nav_msgs.msg.dds.Odometry data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(nav_msgs.msg.dds.Odometry data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += std_msgs.msg.dds.HeaderPubSubType.getCdrSerializedSize(data.getHeader(), current_alignment);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4) + data.getChild_frame_id().length() + 1;

      current_alignment += geometry_msgs.msg.dds.PoseWithCovariancePubSubType.getCdrSerializedSize(data.getPose(), current_alignment);
      current_alignment += geometry_msgs.msg.dds.TwistWithCovariancePubSubType.getCdrSerializedSize(data.getTwist(), current_alignment);

      return current_alignment - initial_alignment;
   }

   public static void write(nav_msgs.msg.dds.Odometry data, us.ihmc.idl.CDR cdr)
   {

      std_msgs.msg.dds.HeaderPubSubType.write(data.getHeader(), cdr);

      if (data.getChild_frame_id().length() <= 255)
         cdr.write_type_d(data.getChild_frame_id());
      else
         throw new RuntimeException("child_frame_id field exceeds the maximum length");

      geometry_msgs.msg.dds.PoseWithCovariancePubSubType.write(data.getPose(), cdr);

      geometry_msgs.msg.dds.TwistWithCovariancePubSubType.write(data.getTwist(), cdr);
   }

   public static void read(nav_msgs.msg.dds.Odometry data, us.ihmc.idl.CDR cdr)
   {

      std_msgs.msg.dds.HeaderPubSubType.read(data.getHeader(), cdr);

      cdr.read_type_d(data.getChild_frame_id());

      geometry_msgs.msg.dds.PoseWithCovariancePubSubType.read(data.getPose(), cdr);

      geometry_msgs.msg.dds.TwistWithCovariancePubSubType.read(data.getTwist(), cdr);
   }

   public static void staticCopy(nav_msgs.msg.dds.Odometry src, nav_msgs.msg.dds.Odometry dest)
   {
      dest.set(src);
   }

   @Override
   public void serialize(nav_msgs.msg.dds.Odometry data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, nav_msgs.msg.dds.Odometry data) throws java.io.IOException
   {
      deserializeCDR.deserialize(serializedPayload);
      read(data, deserializeCDR);
      deserializeCDR.finishDeserialize();
   }

   @Override
   public final void serialize(nav_msgs.msg.dds.Odometry data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_a("header", new std_msgs.msg.dds.HeaderPubSubType(), data.getHeader());

      ser.write_type_d("child_frame_id", data.getChild_frame_id());

      ser.write_type_a("pose", new geometry_msgs.msg.dds.PoseWithCovariancePubSubType(), data.getPose());

      ser.write_type_a("twist", new geometry_msgs.msg.dds.TwistWithCovariancePubSubType(), data.getTwist());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, nav_msgs.msg.dds.Odometry data)
   {
      ser.read_type_a("header", new std_msgs.msg.dds.HeaderPubSubType(), data.getHeader());

      ser.read_type_d("child_frame_id", data.getChild_frame_id());

      ser.read_type_a("pose", new geometry_msgs.msg.dds.PoseWithCovariancePubSubType(), data.getPose());

      ser.read_type_a("twist", new geometry_msgs.msg.dds.TwistWithCovariancePubSubType(), data.getTwist());
   }

   @Override
   public nav_msgs.msg.dds.Odometry createData()
   {
      return new nav_msgs.msg.dds.Odometry();
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

   public void serialize(nav_msgs.msg.dds.Odometry data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(nav_msgs.msg.dds.Odometry data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }

   public void copy(nav_msgs.msg.dds.Odometry src, nav_msgs.msg.dds.Odometry dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public OdometryPubSubType newInstance()
   {
      return new OdometryPubSubType();
   }
}