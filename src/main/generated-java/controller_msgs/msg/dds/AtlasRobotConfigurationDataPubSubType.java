package controller_msgs.msg.dds;

/**
 *
 * Topic data type of the struct "AtlasRobotConfigurationData" defined in "AtlasRobotConfigurationData_.idl". Use this class to provide the TopicDataType to a Participant.
 *
 * This file was automatically generated from AtlasRobotConfigurationData_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit AtlasRobotConfigurationData_.idl instead.
 *
 */
public class AtlasRobotConfigurationDataPubSubType implements us.ihmc.pubsub.TopicDataType<controller_msgs.msg.dds.AtlasRobotConfigurationData>
{
   public static final java.lang.String name = "controller_msgs::msg::dds_::AtlasRobotConfigurationData_";
   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   public AtlasRobotConfigurationDataPubSubType()
   {

   }

   public static int getMaxCdrSerializedSize()
   {
      return getMaxCdrSerializedSize(0);
   }

   public static int getMaxCdrSerializedSize(int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += controller_msgs.msg.dds.RobotConfigurationDataPubSubType.getMaxCdrSerializedSize(current_alignment);
      current_alignment += controller_msgs.msg.dds.AtlasAuxiliaryRobotDataPubSubType.getMaxCdrSerializedSize(current_alignment);

      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(controller_msgs.msg.dds.AtlasRobotConfigurationData data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(controller_msgs.msg.dds.AtlasRobotConfigurationData data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += controller_msgs.msg.dds.RobotConfigurationDataPubSubType.getCdrSerializedSize(data.getRobot_configuration_data(), current_alignment);
      current_alignment += controller_msgs.msg.dds.AtlasAuxiliaryRobotDataPubSubType
            .getCdrSerializedSize(data.getAtlas_auxiliary_robot_data(), current_alignment);

      return current_alignment - initial_alignment;
   }

   public static void write(controller_msgs.msg.dds.AtlasRobotConfigurationData data, us.ihmc.idl.CDR cdr)
   {

      controller_msgs.msg.dds.RobotConfigurationDataPubSubType.write(data.getRobot_configuration_data(), cdr);

      controller_msgs.msg.dds.AtlasAuxiliaryRobotDataPubSubType.write(data.getAtlas_auxiliary_robot_data(), cdr);
   }

   public static void read(controller_msgs.msg.dds.AtlasRobotConfigurationData data, us.ihmc.idl.CDR cdr)
   {

      controller_msgs.msg.dds.RobotConfigurationDataPubSubType.read(data.getRobot_configuration_data(), cdr);

      controller_msgs.msg.dds.AtlasAuxiliaryRobotDataPubSubType.read(data.getAtlas_auxiliary_robot_data(), cdr);
   }

   public static void staticCopy(controller_msgs.msg.dds.AtlasRobotConfigurationData src, controller_msgs.msg.dds.AtlasRobotConfigurationData dest)
   {
      dest.set(src);
   }

   @Override
   public void serialize(controller_msgs.msg.dds.AtlasRobotConfigurationData data, us.ihmc.pubsub.common.SerializedPayload serializedPayload)
         throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, controller_msgs.msg.dds.AtlasRobotConfigurationData data)
         throws java.io.IOException
   {
      deserializeCDR.deserialize(serializedPayload);
      read(data, deserializeCDR);
      deserializeCDR.finishDeserialize();
   }

   @Override
   public final void serialize(controller_msgs.msg.dds.AtlasRobotConfigurationData data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_a("robot_configuration_data", new controller_msgs.msg.dds.RobotConfigurationDataPubSubType(), data.getRobot_configuration_data());

      ser.write_type_a("atlas_auxiliary_robot_data", new controller_msgs.msg.dds.AtlasAuxiliaryRobotDataPubSubType(), data.getAtlas_auxiliary_robot_data());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, controller_msgs.msg.dds.AtlasRobotConfigurationData data)
   {
      ser.read_type_a("robot_configuration_data", new controller_msgs.msg.dds.RobotConfigurationDataPubSubType(), data.getRobot_configuration_data());

      ser.read_type_a("atlas_auxiliary_robot_data", new controller_msgs.msg.dds.AtlasAuxiliaryRobotDataPubSubType(), data.getAtlas_auxiliary_robot_data());
   }

   @Override
   public controller_msgs.msg.dds.AtlasRobotConfigurationData createData()
   {
      return new controller_msgs.msg.dds.AtlasRobotConfigurationData();
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

   public void serialize(controller_msgs.msg.dds.AtlasRobotConfigurationData data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(controller_msgs.msg.dds.AtlasRobotConfigurationData data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }

   public void copy(controller_msgs.msg.dds.AtlasRobotConfigurationData src, controller_msgs.msg.dds.AtlasRobotConfigurationData dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public AtlasRobotConfigurationDataPubSubType newInstance()
   {
      return new AtlasRobotConfigurationDataPubSubType();
   }
}