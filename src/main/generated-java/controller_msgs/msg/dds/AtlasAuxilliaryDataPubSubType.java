package controller_msgs.msg.dds;

/**
 *
 * Topic data type of the struct "AtlasAuxilliaryData" defined in "AtlasAuxilliaryData_.idl". Use this class to provide the TopicDataType to a Participant.
 *
 * This file was automatically generated from AtlasAuxilliaryData_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit AtlasAuxilliaryData_.idl instead.
 *
 */
public class AtlasAuxilliaryDataPubSubType implements us.ihmc.pubsub.TopicDataType<controller_msgs.msg.dds.AtlasAuxilliaryData>
{
   public static final java.lang.String name = "controller_msgs::msg::dds_::AtlasAuxilliaryData_";
   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   public AtlasAuxilliaryDataPubSubType()
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
      for (int a = 0; a < 50; ++a)
      {
         current_alignment += controller_msgs.msg.dds.ElectricJointDataPubSubType.getMaxCdrSerializedSize(current_alignment);
      }

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      for (int a = 0; a < 15; ++a)
      {
         current_alignment += controller_msgs.msg.dds.RawImuDataPubSubType.getMaxCdrSerializedSize(current_alignment);
      }

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      for (int a = 0; a < 1; ++a)
      {
         current_alignment += controller_msgs.msg.dds.BatteryStatePubSubType.getMaxCdrSerializedSize(current_alignment);
      }

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      for (int a = 0; a < 1; ++a)
      {
         current_alignment += controller_msgs.msg.dds.PumpStatePubSubType.getMaxCdrSerializedSize(current_alignment);
      }

      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(controller_msgs.msg.dds.AtlasAuxilliaryData data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(controller_msgs.msg.dds.AtlasAuxilliaryData data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += std_msgs.msg.dds.HeaderPubSubType.getCdrSerializedSize(data.getHeader(), current_alignment);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      for (int a = 0; a < data.getElectric_joint_data().size(); ++a)
      {
         current_alignment += controller_msgs.msg.dds.ElectricJointDataPubSubType.getCdrSerializedSize(data.getElectric_joint_data().get(a), current_alignment);
      }

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      for (int a = 0; a < data.getRaw_imu_data().size(); ++a)
      {
         current_alignment += controller_msgs.msg.dds.RawImuDataPubSubType.getCdrSerializedSize(data.getRaw_imu_data().get(a), current_alignment);
      }

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      for (int a = 0; a < data.getBattery_state().size(); ++a)
      {
         current_alignment += controller_msgs.msg.dds.BatteryStatePubSubType.getCdrSerializedSize(data.getBattery_state().get(a), current_alignment);
      }

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      for (int a = 0; a < data.getPump_state().size(); ++a)
      {
         current_alignment += controller_msgs.msg.dds.PumpStatePubSubType.getCdrSerializedSize(data.getPump_state().get(a), current_alignment);
      }

      return current_alignment - initial_alignment;
   }

   public static void write(controller_msgs.msg.dds.AtlasAuxilliaryData data, us.ihmc.idl.CDR cdr)
   {

      std_msgs.msg.dds.HeaderPubSubType.write(data.getHeader(), cdr);

      if (data.getElectric_joint_data().size() <= 50)
         cdr.write_type_e(data.getElectric_joint_data());
      else
         throw new RuntimeException("electric_joint_data field exceeds the maximum length");

      if (data.getRaw_imu_data().size() <= 15)
         cdr.write_type_e(data.getRaw_imu_data());
      else
         throw new RuntimeException("raw_imu_data field exceeds the maximum length");

      if (data.getBattery_state().size() <= 1)
         cdr.write_type_e(data.getBattery_state());
      else
         throw new RuntimeException("battery_state field exceeds the maximum length");

      if (data.getPump_state().size() <= 1)
         cdr.write_type_e(data.getPump_state());
      else
         throw new RuntimeException("pump_state field exceeds the maximum length");
   }

   public static void read(controller_msgs.msg.dds.AtlasAuxilliaryData data, us.ihmc.idl.CDR cdr)
   {

      std_msgs.msg.dds.HeaderPubSubType.read(data.getHeader(), cdr);

      cdr.read_type_e(data.getElectric_joint_data());

      cdr.read_type_e(data.getRaw_imu_data());

      cdr.read_type_e(data.getBattery_state());

      cdr.read_type_e(data.getPump_state());
   }

   public static void staticCopy(controller_msgs.msg.dds.AtlasAuxilliaryData src, controller_msgs.msg.dds.AtlasAuxilliaryData dest)
   {
      dest.set(src);
   }

   @Override
   public void serialize(controller_msgs.msg.dds.AtlasAuxilliaryData data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, controller_msgs.msg.dds.AtlasAuxilliaryData data)
         throws java.io.IOException
   {
      deserializeCDR.deserialize(serializedPayload);
      read(data, deserializeCDR);
      deserializeCDR.finishDeserialize();
   }

   @Override
   public final void serialize(controller_msgs.msg.dds.AtlasAuxilliaryData data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_a("header", new std_msgs.msg.dds.HeaderPubSubType(), data.getHeader());

      ser.write_type_e("electric_joint_data", data.getElectric_joint_data());

      ser.write_type_e("raw_imu_data", data.getRaw_imu_data());

      ser.write_type_e("battery_state", data.getBattery_state());

      ser.write_type_e("pump_state", data.getPump_state());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, controller_msgs.msg.dds.AtlasAuxilliaryData data)
   {
      ser.read_type_a("header", new std_msgs.msg.dds.HeaderPubSubType(), data.getHeader());

      ser.read_type_e("electric_joint_data", data.getElectric_joint_data());

      ser.read_type_e("raw_imu_data", data.getRaw_imu_data());

      ser.read_type_e("battery_state", data.getBattery_state());

      ser.read_type_e("pump_state", data.getPump_state());
   }

   @Override
   public controller_msgs.msg.dds.AtlasAuxilliaryData createData()
   {
      return new controller_msgs.msg.dds.AtlasAuxilliaryData();
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

   public void serialize(controller_msgs.msg.dds.AtlasAuxilliaryData data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(controller_msgs.msg.dds.AtlasAuxilliaryData data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }

   public void copy(controller_msgs.msg.dds.AtlasAuxilliaryData src, controller_msgs.msg.dds.AtlasAuxilliaryData dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public AtlasAuxilliaryDataPubSubType newInstance()
   {
      return new AtlasAuxilliaryDataPubSubType();
   }
}