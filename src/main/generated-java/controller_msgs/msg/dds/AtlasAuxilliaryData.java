package controller_msgs.msg.dds;

/**
 *
 * Definition of the class "AtlasAuxilliaryData" defined in AtlasAuxilliaryData_.idl.
 *
 * This file was automatically generated from AtlasAuxilliaryData_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit AtlasAuxilliaryData_.idl instead.
 *
 */
public class AtlasAuxilliaryData
{
   private std_msgs.msg.dds.Header header_;
   private us.ihmc.idl.IDLSequence.Object<controller_msgs.msg.dds.ElectricJointData> electric_joint_data_;
   private us.ihmc.idl.IDLSequence.Object<controller_msgs.msg.dds.RawImuData> raw_imu_data_;
   private us.ihmc.idl.IDLSequence.Object<controller_msgs.msg.dds.BatteryState> battery_state_;
   private us.ihmc.idl.IDLSequence.Object<controller_msgs.msg.dds.PumpState> pump_state_;

   public AtlasAuxilliaryData()
   {
      header_ = new std_msgs.msg.dds.Header();
      electric_joint_data_ = new us.ihmc.idl.IDLSequence.Object<controller_msgs.msg.dds.ElectricJointData>(50, controller_msgs.msg.dds.ElectricJointData.class,
                                                                                                           new controller_msgs.msg.dds.ElectricJointDataPubSubType());

      raw_imu_data_ = new us.ihmc.idl.IDLSequence.Object<controller_msgs.msg.dds.RawImuData>(15, controller_msgs.msg.dds.RawImuData.class,
                                                                                             new controller_msgs.msg.dds.RawImuDataPubSubType());

      battery_state_ = new us.ihmc.idl.IDLSequence.Object<controller_msgs.msg.dds.BatteryState>(1, controller_msgs.msg.dds.BatteryState.class,
                                                                                                new controller_msgs.msg.dds.BatteryStatePubSubType());

      pump_state_ = new us.ihmc.idl.IDLSequence.Object<controller_msgs.msg.dds.PumpState>(1, controller_msgs.msg.dds.PumpState.class,
                                                                                          new controller_msgs.msg.dds.PumpStatePubSubType());
   }

   public void set(AtlasAuxilliaryData other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      electric_joint_data_.set(other.electric_joint_data_);
      raw_imu_data_.set(other.raw_imu_data_);
      battery_state_.set(other.battery_state_);
      pump_state_.set(other.pump_state_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public us.ihmc.idl.IDLSequence.Object<controller_msgs.msg.dds.ElectricJointData> getElectric_joint_data()
   {
      return electric_joint_data_;
   }

   public us.ihmc.idl.IDLSequence.Object<controller_msgs.msg.dds.RawImuData> getRaw_imu_data()
   {
      return raw_imu_data_;
   }

   public us.ihmc.idl.IDLSequence.Object<controller_msgs.msg.dds.BatteryState> getBattery_state()
   {
      return battery_state_;
   }

   public us.ihmc.idl.IDLSequence.Object<controller_msgs.msg.dds.PumpState> getPump_state()
   {
      return pump_state_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof AtlasAuxilliaryData))
         return false;
      AtlasAuxilliaryData otherMyClass = (AtlasAuxilliaryData) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.electric_joint_data_.equals(otherMyClass.electric_joint_data_);

      returnedValue &= this.raw_imu_data_.equals(otherMyClass.raw_imu_data_);

      returnedValue &= this.battery_state_.equals(otherMyClass.battery_state_);

      returnedValue &= this.pump_state_.equals(otherMyClass.pump_state_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("AtlasAuxilliaryData {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("electric_joint_data=");
      builder.append(this.electric_joint_data_);

      builder.append(", ");
      builder.append("raw_imu_data=");
      builder.append(this.raw_imu_data_);

      builder.append(", ");
      builder.append("battery_state=");
      builder.append(this.battery_state_);

      builder.append(", ");
      builder.append("pump_state=");
      builder.append(this.pump_state_);

      builder.append("}");
      return builder.toString();
   }
}