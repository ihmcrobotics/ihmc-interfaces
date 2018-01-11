package controller_msgs.msg.dds;

/**
 *
 * Definition of the class "AtlasRobotConfigurationData" defined in AtlasRobotConfigurationData_.idl.
 *
 * This file was automatically generated from AtlasRobotConfigurationData_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit AtlasRobotConfigurationData_.idl instead.
 *
 */
public class AtlasRobotConfigurationData
{
   public AtlasRobotConfigurationData()
   {
      robot_configuration_data_ = new controller_msgs.msg.dds.RobotConfigurationData();
      atlas_auxiliary_robot_data_ = new controller_msgs.msg.dds.AtlasAuxiliaryRobotData();

   }

   public void set(AtlasRobotConfigurationData other)
   {
      controller_msgs.msg.dds.RobotConfigurationDataPubSubType.staticCopy(other.robot_configuration_data_, robot_configuration_data_);
      controller_msgs.msg.dds.AtlasAuxiliaryRobotDataPubSubType.staticCopy(other.atlas_auxiliary_robot_data_, atlas_auxiliary_robot_data_);
   }

   public controller_msgs.msg.dds.RobotConfigurationData getRobot_configuration_data()
   {
      return robot_configuration_data_;
   }

   public controller_msgs.msg.dds.AtlasAuxiliaryRobotData getAtlas_auxiliary_robot_data()
   {
      return atlas_auxiliary_robot_data_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof AtlasRobotConfigurationData))
         return false;
      AtlasRobotConfigurationData otherMyClass = (AtlasRobotConfigurationData) other;
      boolean returnedValue = true;

      returnedValue &= this.robot_configuration_data_.equals(otherMyClass.robot_configuration_data_);

      returnedValue &= this.atlas_auxiliary_robot_data_.equals(otherMyClass.atlas_auxiliary_robot_data_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("AtlasRobotConfigurationData {");
      builder.append("robot_configuration_data=");
      builder.append(this.robot_configuration_data_);

      builder.append(", ");
      builder.append("atlas_auxiliary_robot_data=");
      builder.append(this.atlas_auxiliary_robot_data_);

      builder.append("}");
      return builder.toString();
   }

   private controller_msgs.msg.dds.RobotConfigurationData robot_configuration_data_;
   private controller_msgs.msg.dds.AtlasAuxiliaryRobotData atlas_auxiliary_robot_data_;

}