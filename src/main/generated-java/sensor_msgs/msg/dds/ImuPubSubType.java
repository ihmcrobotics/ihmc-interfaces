package sensor_msgs.msg.dds;

/**
 *
 * Topic data type of the struct "Imu" defined in "Imu_.idl". Use this class to provide the TopicDataType to a Participant.
 *
 * This file was automatically generated from Imu_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Imu_.idl instead.
 *
 */
public class ImuPubSubType implements us.ihmc.pubsub.TopicDataType<sensor_msgs.msg.dds.Imu>
{
   public static final java.lang.String name = "sensor_msgs::msg::dds_::Imu_";
   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   public ImuPubSubType()
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
      current_alignment += geometry_msgs.msg.dds.QuaternionPubSubType.getMaxCdrSerializedSize(current_alignment);
      current_alignment += ((9) * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += geometry_msgs.msg.dds.Vector3PubSubType.getMaxCdrSerializedSize(current_alignment);
      current_alignment += ((9) * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += geometry_msgs.msg.dds.Vector3PubSubType.getMaxCdrSerializedSize(current_alignment);
      current_alignment += ((9) * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(sensor_msgs.msg.dds.Imu data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(sensor_msgs.msg.dds.Imu data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += std_msgs.msg.dds.HeaderPubSubType.getCdrSerializedSize(data.getHeader(), current_alignment);
      current_alignment += geometry_msgs.msg.dds.QuaternionPubSubType.getCdrSerializedSize(data.getOrientation(), current_alignment);
      current_alignment += ((9) * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);
      current_alignment += geometry_msgs.msg.dds.Vector3PubSubType.getCdrSerializedSize(data.getAngular_velocity(), current_alignment);
      current_alignment += ((9) * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);
      current_alignment += geometry_msgs.msg.dds.Vector3PubSubType.getCdrSerializedSize(data.getLinear_acceleration(), current_alignment);
      current_alignment += ((9) * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      return current_alignment - initial_alignment;
   }

   public static void write(sensor_msgs.msg.dds.Imu data, us.ihmc.idl.CDR cdr)
   {

      std_msgs.msg.dds.HeaderPubSubType.write(data.getHeader(), cdr);

      geometry_msgs.msg.dds.QuaternionPubSubType.write(data.getOrientation(), cdr);

      for (int a = 0; a < data.getOrientation_covariance().length; ++a)
      {
         cdr.write_type_6(data.getOrientation_covariance()[a]);
      }

      geometry_msgs.msg.dds.Vector3PubSubType.write(data.getAngular_velocity(), cdr);

      for (int a = 0; a < data.getAngular_velocity_covariance().length; ++a)
      {
         cdr.write_type_6(data.getAngular_velocity_covariance()[a]);
      }

      geometry_msgs.msg.dds.Vector3PubSubType.write(data.getLinear_acceleration(), cdr);

      for (int a = 0; a < data.getLinear_acceleration_covariance().length; ++a)
      {
         cdr.write_type_6(data.getLinear_acceleration_covariance()[a]);
      }
   }

   public static void read(sensor_msgs.msg.dds.Imu data, us.ihmc.idl.CDR cdr)
   {

      std_msgs.msg.dds.HeaderPubSubType.read(data.getHeader(), cdr);

      geometry_msgs.msg.dds.QuaternionPubSubType.read(data.getOrientation(), cdr);

      for (int a = 0; a < data.getOrientation_covariance().length; ++a)
      {
         data.getOrientation_covariance()[a] = cdr.read_type_6();
      }

      geometry_msgs.msg.dds.Vector3PubSubType.read(data.getAngular_velocity(), cdr);

      for (int a = 0; a < data.getAngular_velocity_covariance().length; ++a)
      {
         data.getAngular_velocity_covariance()[a] = cdr.read_type_6();
      }

      geometry_msgs.msg.dds.Vector3PubSubType.read(data.getLinear_acceleration(), cdr);

      for (int a = 0; a < data.getLinear_acceleration_covariance().length; ++a)
      {
         data.getLinear_acceleration_covariance()[a] = cdr.read_type_6();
      }
   }

   public static void staticCopy(sensor_msgs.msg.dds.Imu src, sensor_msgs.msg.dds.Imu dest)
   {
      dest.set(src);
   }

   @Override
   public void serialize(sensor_msgs.msg.dds.Imu data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, sensor_msgs.msg.dds.Imu data) throws java.io.IOException
   {
      deserializeCDR.deserialize(serializedPayload);
      read(data, deserializeCDR);
      deserializeCDR.finishDeserialize();
   }

   @Override
   public final void serialize(sensor_msgs.msg.dds.Imu data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_a("header", new std_msgs.msg.dds.HeaderPubSubType(), data.getHeader());

      ser.write_type_a("orientation", new geometry_msgs.msg.dds.QuaternionPubSubType(), data.getOrientation());

      ser.write_type_f("orientation_covariance", data.getOrientation_covariance());
      ser.write_type_a("angular_velocity", new geometry_msgs.msg.dds.Vector3PubSubType(), data.getAngular_velocity());

      ser.write_type_f("angular_velocity_covariance", data.getAngular_velocity_covariance());
      ser.write_type_a("linear_acceleration", new geometry_msgs.msg.dds.Vector3PubSubType(), data.getLinear_acceleration());

      ser.write_type_f("linear_acceleration_covariance", data.getLinear_acceleration_covariance());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, sensor_msgs.msg.dds.Imu data)
   {
      ser.read_type_a("header", new std_msgs.msg.dds.HeaderPubSubType(), data.getHeader());

      ser.read_type_a("orientation", new geometry_msgs.msg.dds.QuaternionPubSubType(), data.getOrientation());

      ser.read_type_f("orientation_covariance", data.getOrientation_covariance());

      ser.read_type_a("angular_velocity", new geometry_msgs.msg.dds.Vector3PubSubType(), data.getAngular_velocity());

      ser.read_type_f("angular_velocity_covariance", data.getAngular_velocity_covariance());

      ser.read_type_a("linear_acceleration", new geometry_msgs.msg.dds.Vector3PubSubType(), data.getLinear_acceleration());

      ser.read_type_f("linear_acceleration_covariance", data.getLinear_acceleration_covariance());
   }

   @Override
   public sensor_msgs.msg.dds.Imu createData()
   {
      return new sensor_msgs.msg.dds.Imu();
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

   public void serialize(sensor_msgs.msg.dds.Imu data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(sensor_msgs.msg.dds.Imu data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }

   public void copy(sensor_msgs.msg.dds.Imu src, sensor_msgs.msg.dds.Imu dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ImuPubSubType newInstance()
   {
      return new ImuPubSubType();
   }
}