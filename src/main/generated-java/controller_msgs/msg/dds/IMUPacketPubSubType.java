package controller_msgs.msg.dds;

/**
 *
 * Topic data type of the struct "IMUPacket" defined in "IMUPacket_.idl". Use this class to provide the TopicDataType to a Participant.
 *
 * This file was automatically generated from IMUPacket_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit IMUPacket_.idl instead.
 *
 */
public class IMUPacketPubSubType implements us.ihmc.pubsub.TopicDataType<controller_msgs.msg.dds.IMUPacket>
{
   public static final java.lang.String name = "controller_msgs::msg::dds_::IMUPacket_";

   public IMUPacketPubSubType()
   {

   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(controller_msgs.msg.dds.IMUPacket data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, controller_msgs.msg.dds.IMUPacket data) throws java.io.IOException
   {
      deserializeCDR.deserialize(serializedPayload);
      read(data, deserializeCDR);
      deserializeCDR.finishDeserialize();
   }

   public static int getMaxCdrSerializedSize()
   {
      return getMaxCdrSerializedSize(0);
   }

   public static int getMaxCdrSerializedSize(int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += geometry_msgs.msg.dds.Vector3PubSubType.getMaxCdrSerializedSize(current_alignment);
      current_alignment += geometry_msgs.msg.dds.QuaternionPubSubType.getMaxCdrSerializedSize(current_alignment);
      current_alignment += geometry_msgs.msg.dds.Vector3PubSubType.getMaxCdrSerializedSize(current_alignment);
      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(controller_msgs.msg.dds.IMUPacket data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(controller_msgs.msg.dds.IMUPacket data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += geometry_msgs.msg.dds.Vector3PubSubType.getCdrSerializedSize(data.getLinear_acceleration(), current_alignment);
      current_alignment += geometry_msgs.msg.dds.QuaternionPubSubType.getCdrSerializedSize(data.getOrientation(), current_alignment);
      current_alignment += geometry_msgs.msg.dds.Vector3PubSubType.getCdrSerializedSize(data.getAngular_velocity(), current_alignment);
      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      return current_alignment - initial_alignment;
   }

   public static void write(controller_msgs.msg.dds.IMUPacket data, us.ihmc.idl.CDR cdr)
   {

      geometry_msgs.msg.dds.Vector3PubSubType.write(data.getLinear_acceleration(), cdr);

      geometry_msgs.msg.dds.QuaternionPubSubType.write(data.getOrientation(), cdr);

      geometry_msgs.msg.dds.Vector3PubSubType.write(data.getAngular_velocity(), cdr);

      cdr.write_type_6(data.getTime());
   }

   public static void read(controller_msgs.msg.dds.IMUPacket data, us.ihmc.idl.CDR cdr)
   {

      geometry_msgs.msg.dds.Vector3PubSubType.read(data.getLinear_acceleration(), cdr);

      geometry_msgs.msg.dds.QuaternionPubSubType.read(data.getOrientation(), cdr);

      geometry_msgs.msg.dds.Vector3PubSubType.read(data.getAngular_velocity(), cdr);

      data.setTime(cdr.read_type_6());

   }

   @Override
   public final void serialize(controller_msgs.msg.dds.IMUPacket data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_a("linear_acceleration", new geometry_msgs.msg.dds.Vector3PubSubType(), data.getLinear_acceleration());

      ser.write_type_a("orientation", new geometry_msgs.msg.dds.QuaternionPubSubType(), data.getOrientation());

      ser.write_type_a("angular_velocity", new geometry_msgs.msg.dds.Vector3PubSubType(), data.getAngular_velocity());

      ser.write_type_6("time", data.getTime());

   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, controller_msgs.msg.dds.IMUPacket data)
   {
      ser.read_type_a("linear_acceleration", new geometry_msgs.msg.dds.Vector3PubSubType(), data.getLinear_acceleration());

      ser.read_type_a("orientation", new geometry_msgs.msg.dds.QuaternionPubSubType(), data.getOrientation());

      ser.read_type_a("angular_velocity", new geometry_msgs.msg.dds.Vector3PubSubType(), data.getAngular_velocity());

      data.setTime(ser.read_type_6("time"));

   }

   public static void staticCopy(controller_msgs.msg.dds.IMUPacket src, controller_msgs.msg.dds.IMUPacket dest)
   {
      dest.set(src);
   }

   @Override
   public controller_msgs.msg.dds.IMUPacket createData()
   {
      return new controller_msgs.msg.dds.IMUPacket();
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

   public void serialize(controller_msgs.msg.dds.IMUPacket data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(controller_msgs.msg.dds.IMUPacket data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }

   public void copy(controller_msgs.msg.dds.IMUPacket src, controller_msgs.msg.dds.IMUPacket dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public IMUPacketPubSubType newInstance()
   {
      return new IMUPacketPubSubType();
   }
}