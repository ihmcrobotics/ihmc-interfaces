package controller_msgs.msg.dds;

/**
 *
 * Topic data type of the struct "AtlasAuxiliaryRobotData" defined in "AtlasAuxiliaryRobotData_.idl". Use this class to provide the TopicDataType to a Participant.
 *
 * This file was automatically generated from AtlasAuxiliaryRobotData_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit AtlasAuxiliaryRobotData_.idl instead.
 *
 */
public class AtlasAuxiliaryRobotDataPubSubType implements us.ihmc.pubsub.TopicDataType<controller_msgs.msg.dds.AtlasAuxiliaryRobotData>
{
   public static final java.lang.String name = "controller_msgs::msg::dds_::AtlasAuxiliaryRobotData_";
   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   public AtlasAuxiliaryRobotDataPubSubType()
   {

   }

   public static int getMaxCdrSerializedSize()
   {
      return getMaxCdrSerializedSize(0);
   }

   public static int getMaxCdrSerializedSize(int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += (100 * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += (100 * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += (100 * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += (100 * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += (100 * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += std_msgs.msg.dds.Float32MultiArrayPubSubType.getMaxCdrSerializedSize(current_alignment);
      current_alignment += std_msgs.msg.dds.Float32MultiArrayPubSubType.getMaxCdrSerializedSize(current_alignment);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(controller_msgs.msg.dds.AtlasAuxiliaryRobotData data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(controller_msgs.msg.dds.AtlasAuxiliaryRobotData data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += (data.getElectric_joint_temperatures().size() * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += (data.getElectric_joint_currents().size() * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += (data.getElectric_joint_enabled_array().size() * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += (data.getRaw_imu_timestamps().size() * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += (data.getRaw_imu_packets_counts().size() * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += std_msgs.msg.dds.Float32MultiArrayPubSubType.getCdrSerializedSize(data.getRaw_imu_rates(), current_alignment);
      current_alignment += std_msgs.msg.dds.Float32MultiArrayPubSubType.getCdrSerializedSize(data.getRaw_imu_deltas(), current_alignment);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(controller_msgs.msg.dds.AtlasAuxiliaryRobotData data, us.ihmc.idl.CDR cdr)
   {

      if (data.getElectric_joint_temperatures().size() <= 100)
         cdr.write_type_e(data.getElectric_joint_temperatures());
      else
         throw new RuntimeException("electric_joint_temperatures field exceeds the maximum length");

      if (data.getElectric_joint_currents().size() <= 100)
         cdr.write_type_e(data.getElectric_joint_currents());
      else
         throw new RuntimeException("electric_joint_currents field exceeds the maximum length");

      if (data.getElectric_joint_enabled_array().size() <= 100)
         cdr.write_type_e(data.getElectric_joint_enabled_array());
      else
         throw new RuntimeException("electric_joint_enabled_array field exceeds the maximum length");

      if (data.getRaw_imu_timestamps().size() <= 100)
         cdr.write_type_e(data.getRaw_imu_timestamps());
      else
         throw new RuntimeException("raw_imu_timestamps field exceeds the maximum length");

      if (data.getRaw_imu_packets_counts().size() <= 100)
         cdr.write_type_e(data.getRaw_imu_packets_counts());
      else
         throw new RuntimeException("raw_imu_packets_counts field exceeds the maximum length");

      std_msgs.msg.dds.Float32MultiArrayPubSubType.write(data.getRaw_imu_rates(), cdr);

      std_msgs.msg.dds.Float32MultiArrayPubSubType.write(data.getRaw_imu_deltas(), cdr);

      cdr.write_type_7(data.getBattery_charging());

      cdr.write_type_5(data.getBattery_voltage());

      cdr.write_type_5(data.getBattery_current());

      cdr.write_type_5(data.getRemaining_battery_time());

      cdr.write_type_5(data.getRemaining_amp_hours());

      cdr.write_type_5(data.getRemaining_charge_percentage());

      cdr.write_type_11(data.getBattery_cycle_count());

      cdr.write_type_5(data.getPump_inlet_pressure());

      cdr.write_type_5(data.getPump_supply_pressure());

      cdr.write_type_5(data.getAir_sump_pressure());

      cdr.write_type_5(data.getPump_supply_temperature());

      cdr.write_type_5(data.getPump_rpm());

      cdr.write_type_5(data.getMotor_temperature());

      cdr.write_type_5(data.getMotor_driver_temperature());
   }

   public static void read(controller_msgs.msg.dds.AtlasAuxiliaryRobotData data, us.ihmc.idl.CDR cdr)
   {

      cdr.read_type_e(data.getElectric_joint_temperatures());

      cdr.read_type_e(data.getElectric_joint_currents());

      cdr.read_type_e(data.getElectric_joint_enabled_array());

      cdr.read_type_e(data.getRaw_imu_timestamps());

      cdr.read_type_e(data.getRaw_imu_packets_counts());

      std_msgs.msg.dds.Float32MultiArrayPubSubType.read(data.getRaw_imu_rates(), cdr);

      std_msgs.msg.dds.Float32MultiArrayPubSubType.read(data.getRaw_imu_deltas(), cdr);

      data.setBattery_charging(cdr.read_type_7());

      data.setBattery_voltage(cdr.read_type_5());

      data.setBattery_current(cdr.read_type_5());

      data.setRemaining_battery_time(cdr.read_type_5());

      data.setRemaining_amp_hours(cdr.read_type_5());

      data.setRemaining_charge_percentage(cdr.read_type_5());

      data.setBattery_cycle_count(cdr.read_type_11());

      data.setPump_inlet_pressure(cdr.read_type_5());

      data.setPump_supply_pressure(cdr.read_type_5());

      data.setAir_sump_pressure(cdr.read_type_5());

      data.setPump_supply_temperature(cdr.read_type_5());

      data.setPump_rpm(cdr.read_type_5());

      data.setMotor_temperature(cdr.read_type_5());

      data.setMotor_driver_temperature(cdr.read_type_5());
   }

   public static void staticCopy(controller_msgs.msg.dds.AtlasAuxiliaryRobotData src, controller_msgs.msg.dds.AtlasAuxiliaryRobotData dest)
   {
      dest.set(src);
   }

   @Override
   public void serialize(controller_msgs.msg.dds.AtlasAuxiliaryRobotData data, us.ihmc.pubsub.common.SerializedPayload serializedPayload)
         throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, controller_msgs.msg.dds.AtlasAuxiliaryRobotData data)
         throws java.io.IOException
   {
      deserializeCDR.deserialize(serializedPayload);
      read(data, deserializeCDR);
      deserializeCDR.finishDeserialize();
   }

   @Override
   public final void serialize(controller_msgs.msg.dds.AtlasAuxiliaryRobotData data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_e("electric_joint_temperatures", data.getElectric_joint_temperatures());

      ser.write_type_e("electric_joint_currents", data.getElectric_joint_currents());

      ser.write_type_e("electric_joint_enabled_array", data.getElectric_joint_enabled_array());

      ser.write_type_e("raw_imu_timestamps", data.getRaw_imu_timestamps());

      ser.write_type_e("raw_imu_packets_counts", data.getRaw_imu_packets_counts());

      ser.write_type_a("raw_imu_rates", new std_msgs.msg.dds.Float32MultiArrayPubSubType(), data.getRaw_imu_rates());

      ser.write_type_a("raw_imu_deltas", new std_msgs.msg.dds.Float32MultiArrayPubSubType(), data.getRaw_imu_deltas());

      ser.write_type_7("battery_charging", data.getBattery_charging());

      ser.write_type_5("battery_voltage", data.getBattery_voltage());

      ser.write_type_5("battery_current", data.getBattery_current());

      ser.write_type_5("remaining_battery_time", data.getRemaining_battery_time());

      ser.write_type_5("remaining_amp_hours", data.getRemaining_amp_hours());

      ser.write_type_5("remaining_charge_percentage", data.getRemaining_charge_percentage());

      ser.write_type_11("battery_cycle_count", data.getBattery_cycle_count());

      ser.write_type_5("pump_inlet_pressure", data.getPump_inlet_pressure());

      ser.write_type_5("pump_supply_pressure", data.getPump_supply_pressure());

      ser.write_type_5("air_sump_pressure", data.getAir_sump_pressure());

      ser.write_type_5("pump_supply_temperature", data.getPump_supply_temperature());

      ser.write_type_5("pump_rpm", data.getPump_rpm());

      ser.write_type_5("motor_temperature", data.getMotor_temperature());

      ser.write_type_5("motor_driver_temperature", data.getMotor_driver_temperature());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, controller_msgs.msg.dds.AtlasAuxiliaryRobotData data)
   {
      ser.read_type_e("electric_joint_temperatures", data.getElectric_joint_temperatures());

      ser.read_type_e("electric_joint_currents", data.getElectric_joint_currents());

      ser.read_type_e("electric_joint_enabled_array", data.getElectric_joint_enabled_array());

      ser.read_type_e("raw_imu_timestamps", data.getRaw_imu_timestamps());

      ser.read_type_e("raw_imu_packets_counts", data.getRaw_imu_packets_counts());

      ser.read_type_a("raw_imu_rates", new std_msgs.msg.dds.Float32MultiArrayPubSubType(), data.getRaw_imu_rates());

      ser.read_type_a("raw_imu_deltas", new std_msgs.msg.dds.Float32MultiArrayPubSubType(), data.getRaw_imu_deltas());

      data.setBattery_charging(ser.read_type_7("battery_charging"));

      data.setBattery_voltage(ser.read_type_5("battery_voltage"));

      data.setBattery_current(ser.read_type_5("battery_current"));

      data.setRemaining_battery_time(ser.read_type_5("remaining_battery_time"));

      data.setRemaining_amp_hours(ser.read_type_5("remaining_amp_hours"));

      data.setRemaining_charge_percentage(ser.read_type_5("remaining_charge_percentage"));

      data.setBattery_cycle_count(ser.read_type_11("battery_cycle_count"));

      data.setPump_inlet_pressure(ser.read_type_5("pump_inlet_pressure"));

      data.setPump_supply_pressure(ser.read_type_5("pump_supply_pressure"));

      data.setAir_sump_pressure(ser.read_type_5("air_sump_pressure"));

      data.setPump_supply_temperature(ser.read_type_5("pump_supply_temperature"));

      data.setPump_rpm(ser.read_type_5("pump_rpm"));

      data.setMotor_temperature(ser.read_type_5("motor_temperature"));

      data.setMotor_driver_temperature(ser.read_type_5("motor_driver_temperature"));
   }

   @Override
   public controller_msgs.msg.dds.AtlasAuxiliaryRobotData createData()
   {
      return new controller_msgs.msg.dds.AtlasAuxiliaryRobotData();
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

   public void serialize(controller_msgs.msg.dds.AtlasAuxiliaryRobotData data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(controller_msgs.msg.dds.AtlasAuxiliaryRobotData data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }

   public void copy(controller_msgs.msg.dds.AtlasAuxiliaryRobotData src, controller_msgs.msg.dds.AtlasAuxiliaryRobotData dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public AtlasAuxiliaryRobotDataPubSubType newInstance()
   {
      return new AtlasAuxiliaryRobotDataPubSubType();
   }
}