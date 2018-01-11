package controller_msgs.msg.dds;

/**
 *
 * Definition of the class "AtlasAuxiliaryRobotData" defined in AtlasAuxiliaryRobotData_.idl.
 *
 * This file was automatically generated from AtlasAuxiliaryRobotData_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit AtlasAuxiliaryRobotData_.idl instead.
 *
 */
public class AtlasAuxiliaryRobotData
{
   private us.ihmc.idl.IDLSequence.Float electric_joint_temperatures_;
   private us.ihmc.idl.IDLSequence.Float electric_joint_currents_;
   private us.ihmc.idl.IDLSequence.Boolean electric_joint_enabled_array_;
   private us.ihmc.idl.IDLSequence.Long raw_imu_timestamps_;
   private us.ihmc.idl.IDLSequence.Long raw_imu_packets_counts_;
   private std_msgs.msg.dds.Float32MultiArray raw_imu_rates_;
   private std_msgs.msg.dds.Float32MultiArray raw_imu_deltas_;
   private boolean battery_charging_;
   private float battery_voltage_;
   private float battery_current_;
   private float remaining_battery_time_;
   private float remaining_amp_hours_;
   private float remaining_charge_percentage_;
   private long battery_cycle_count_;
   private float pump_inlet_pressure_;
   private float pump_supply_pressure_;
   private float air_sump_pressure_;
   private float pump_supply_temperature_;
   private float pump_rpm_;
   private float motor_temperature_;
   private float motor_driver_temperature_;

   public AtlasAuxiliaryRobotData()
   {
      electric_joint_temperatures_ = new us.ihmc.idl.IDLSequence.Float(100, "type_5");
      electric_joint_currents_ = new us.ihmc.idl.IDLSequence.Float(100, "type_5");
      electric_joint_enabled_array_ = new us.ihmc.idl.IDLSequence.Boolean(100, "type_7");
      raw_imu_timestamps_ = new us.ihmc.idl.IDLSequence.Long(100, "type_11");
      raw_imu_packets_counts_ = new us.ihmc.idl.IDLSequence.Long(100, "type_11");
      raw_imu_rates_ = new std_msgs.msg.dds.Float32MultiArray();
      raw_imu_deltas_ = new std_msgs.msg.dds.Float32MultiArray();

   }

   public void set(AtlasAuxiliaryRobotData other)
   {
      electric_joint_temperatures_.set(other.electric_joint_temperatures_);
      electric_joint_currents_.set(other.electric_joint_currents_);
      electric_joint_enabled_array_.set(other.electric_joint_enabled_array_);
      raw_imu_timestamps_.set(other.raw_imu_timestamps_);
      raw_imu_packets_counts_.set(other.raw_imu_packets_counts_);
      std_msgs.msg.dds.Float32MultiArrayPubSubType.staticCopy(other.raw_imu_rates_, raw_imu_rates_);
      std_msgs.msg.dds.Float32MultiArrayPubSubType.staticCopy(other.raw_imu_deltas_, raw_imu_deltas_);
      battery_charging_ = other.battery_charging_;
      battery_voltage_ = other.battery_voltage_;
      battery_current_ = other.battery_current_;
      remaining_battery_time_ = other.remaining_battery_time_;
      remaining_amp_hours_ = other.remaining_amp_hours_;
      remaining_charge_percentage_ = other.remaining_charge_percentage_;
      battery_cycle_count_ = other.battery_cycle_count_;
      pump_inlet_pressure_ = other.pump_inlet_pressure_;
      pump_supply_pressure_ = other.pump_supply_pressure_;
      air_sump_pressure_ = other.air_sump_pressure_;
      pump_supply_temperature_ = other.pump_supply_temperature_;
      pump_rpm_ = other.pump_rpm_;
      motor_temperature_ = other.motor_temperature_;
      motor_driver_temperature_ = other.motor_driver_temperature_;

   }

   public us.ihmc.idl.IDLSequence.Float getElectric_joint_temperatures()
   {
      return electric_joint_temperatures_;
   }

   public us.ihmc.idl.IDLSequence.Float getElectric_joint_currents()
   {
      return electric_joint_currents_;
   }

   public us.ihmc.idl.IDLSequence.Boolean getElectric_joint_enabled_array()
   {
      return electric_joint_enabled_array_;
   }

   public us.ihmc.idl.IDLSequence.Long getRaw_imu_timestamps()
   {
      return raw_imu_timestamps_;
   }

   public us.ihmc.idl.IDLSequence.Long getRaw_imu_packets_counts()
   {
      return raw_imu_packets_counts_;
   }

   public std_msgs.msg.dds.Float32MultiArray getRaw_imu_rates()
   {
      return raw_imu_rates_;
   }

   public std_msgs.msg.dds.Float32MultiArray getRaw_imu_deltas()
   {
      return raw_imu_deltas_;
   }

   public boolean getBattery_charging()
   {
      return battery_charging_;
   }

   public void setBattery_charging(boolean battery_charging)
   {
      battery_charging_ = battery_charging;
   }

   public float getBattery_voltage()
   {
      return battery_voltage_;
   }

   public void setBattery_voltage(float battery_voltage)
   {
      battery_voltage_ = battery_voltage;
   }

   public float getBattery_current()
   {
      return battery_current_;
   }

   public void setBattery_current(float battery_current)
   {
      battery_current_ = battery_current;
   }

   public float getRemaining_battery_time()
   {
      return remaining_battery_time_;
   }

   public void setRemaining_battery_time(float remaining_battery_time)
   {
      remaining_battery_time_ = remaining_battery_time;
   }

   public float getRemaining_amp_hours()
   {
      return remaining_amp_hours_;
   }

   public void setRemaining_amp_hours(float remaining_amp_hours)
   {
      remaining_amp_hours_ = remaining_amp_hours;
   }

   public float getRemaining_charge_percentage()
   {
      return remaining_charge_percentage_;
   }

   public void setRemaining_charge_percentage(float remaining_charge_percentage)
   {
      remaining_charge_percentage_ = remaining_charge_percentage;
   }

   public long getBattery_cycle_count()
   {
      return battery_cycle_count_;
   }

   public void setBattery_cycle_count(long battery_cycle_count)
   {
      battery_cycle_count_ = battery_cycle_count;
   }

   public float getPump_inlet_pressure()
   {
      return pump_inlet_pressure_;
   }

   public void setPump_inlet_pressure(float pump_inlet_pressure)
   {
      pump_inlet_pressure_ = pump_inlet_pressure;
   }

   public float getPump_supply_pressure()
   {
      return pump_supply_pressure_;
   }

   public void setPump_supply_pressure(float pump_supply_pressure)
   {
      pump_supply_pressure_ = pump_supply_pressure;
   }

   public float getAir_sump_pressure()
   {
      return air_sump_pressure_;
   }

   public void setAir_sump_pressure(float air_sump_pressure)
   {
      air_sump_pressure_ = air_sump_pressure;
   }

   public float getPump_supply_temperature()
   {
      return pump_supply_temperature_;
   }

   public void setPump_supply_temperature(float pump_supply_temperature)
   {
      pump_supply_temperature_ = pump_supply_temperature;
   }

   public float getPump_rpm()
   {
      return pump_rpm_;
   }

   public void setPump_rpm(float pump_rpm)
   {
      pump_rpm_ = pump_rpm;
   }

   public float getMotor_temperature()
   {
      return motor_temperature_;
   }

   public void setMotor_temperature(float motor_temperature)
   {
      motor_temperature_ = motor_temperature;
   }

   public float getMotor_driver_temperature()
   {
      return motor_driver_temperature_;
   }

   public void setMotor_driver_temperature(float motor_driver_temperature)
   {
      motor_driver_temperature_ = motor_driver_temperature;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof AtlasAuxiliaryRobotData))
         return false;
      AtlasAuxiliaryRobotData otherMyClass = (AtlasAuxiliaryRobotData) other;
      boolean returnedValue = true;

      returnedValue &= this.electric_joint_temperatures_.equals(otherMyClass.electric_joint_temperatures_);

      returnedValue &= this.electric_joint_currents_.equals(otherMyClass.electric_joint_currents_);

      returnedValue &= this.electric_joint_enabled_array_.equals(otherMyClass.electric_joint_enabled_array_);

      returnedValue &= this.raw_imu_timestamps_.equals(otherMyClass.raw_imu_timestamps_);

      returnedValue &= this.raw_imu_packets_counts_.equals(otherMyClass.raw_imu_packets_counts_);

      returnedValue &= this.raw_imu_rates_.equals(otherMyClass.raw_imu_rates_);

      returnedValue &= this.raw_imu_deltas_.equals(otherMyClass.raw_imu_deltas_);

      returnedValue &= this.battery_charging_ == otherMyClass.battery_charging_;

      returnedValue &= this.battery_voltage_ == otherMyClass.battery_voltage_;

      returnedValue &= this.battery_current_ == otherMyClass.battery_current_;

      returnedValue &= this.remaining_battery_time_ == otherMyClass.remaining_battery_time_;

      returnedValue &= this.remaining_amp_hours_ == otherMyClass.remaining_amp_hours_;

      returnedValue &= this.remaining_charge_percentage_ == otherMyClass.remaining_charge_percentage_;

      returnedValue &= this.battery_cycle_count_ == otherMyClass.battery_cycle_count_;

      returnedValue &= this.pump_inlet_pressure_ == otherMyClass.pump_inlet_pressure_;

      returnedValue &= this.pump_supply_pressure_ == otherMyClass.pump_supply_pressure_;

      returnedValue &= this.air_sump_pressure_ == otherMyClass.air_sump_pressure_;

      returnedValue &= this.pump_supply_temperature_ == otherMyClass.pump_supply_temperature_;

      returnedValue &= this.pump_rpm_ == otherMyClass.pump_rpm_;

      returnedValue &= this.motor_temperature_ == otherMyClass.motor_temperature_;

      returnedValue &= this.motor_driver_temperature_ == otherMyClass.motor_driver_temperature_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("AtlasAuxiliaryRobotData {");
      builder.append("electric_joint_temperatures=");
      builder.append(this.electric_joint_temperatures_);

      builder.append(", ");
      builder.append("electric_joint_currents=");
      builder.append(this.electric_joint_currents_);

      builder.append(", ");
      builder.append("electric_joint_enabled_array=");
      builder.append(this.electric_joint_enabled_array_);

      builder.append(", ");
      builder.append("raw_imu_timestamps=");
      builder.append(this.raw_imu_timestamps_);

      builder.append(", ");
      builder.append("raw_imu_packets_counts=");
      builder.append(this.raw_imu_packets_counts_);

      builder.append(", ");
      builder.append("raw_imu_rates=");
      builder.append(this.raw_imu_rates_);

      builder.append(", ");
      builder.append("raw_imu_deltas=");
      builder.append(this.raw_imu_deltas_);

      builder.append(", ");
      builder.append("battery_charging=");
      builder.append(this.battery_charging_);

      builder.append(", ");
      builder.append("battery_voltage=");
      builder.append(this.battery_voltage_);

      builder.append(", ");
      builder.append("battery_current=");
      builder.append(this.battery_current_);

      builder.append(", ");
      builder.append("remaining_battery_time=");
      builder.append(this.remaining_battery_time_);

      builder.append(", ");
      builder.append("remaining_amp_hours=");
      builder.append(this.remaining_amp_hours_);

      builder.append(", ");
      builder.append("remaining_charge_percentage=");
      builder.append(this.remaining_charge_percentage_);

      builder.append(", ");
      builder.append("battery_cycle_count=");
      builder.append(this.battery_cycle_count_);

      builder.append(", ");
      builder.append("pump_inlet_pressure=");
      builder.append(this.pump_inlet_pressure_);

      builder.append(", ");
      builder.append("pump_supply_pressure=");
      builder.append(this.pump_supply_pressure_);

      builder.append(", ");
      builder.append("air_sump_pressure=");
      builder.append(this.air_sump_pressure_);

      builder.append(", ");
      builder.append("pump_supply_temperature=");
      builder.append(this.pump_supply_temperature_);

      builder.append(", ");
      builder.append("pump_rpm=");
      builder.append(this.pump_rpm_);

      builder.append(", ");
      builder.append("motor_temperature=");
      builder.append(this.motor_temperature_);

      builder.append(", ");
      builder.append("motor_driver_temperature=");
      builder.append(this.motor_driver_temperature_);

      builder.append("}");
      return builder.toString();
   }

}