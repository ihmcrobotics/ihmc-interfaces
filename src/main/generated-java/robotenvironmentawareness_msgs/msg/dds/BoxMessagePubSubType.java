package robotenvironmentawareness_msgs.msg.dds;

/**
 *
 * Topic data type of the struct "BoxMessage" defined in "BoxMessage_.idl". Use this class to provide the TopicDataType to a Participant.
 *
 * This file was automatically generated from BoxMessage_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit BoxMessage_.idl instead.
 *
 */
public class BoxMessagePubSubType implements us.ihmc.pubsub.TopicDataType<robotenvironmentawareness_msgs.msg.dds.BoxMessage>
{
   public static final java.lang.String name = "robotenvironmentawareness_msgs::msg::dds_::BoxMessage_";
   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();
   public BoxMessagePubSubType()
   {

   }

   public static int getMaxCdrSerializedSize()
   {
      return getMaxCdrSerializedSize(0);
   }

   public static int getMaxCdrSerializedSize(int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += geometry_msgs.msg.dds.Vector3PubSubType.getMaxCdrSerializedSize(current_alignment);

      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(robotenvironmentawareness_msgs.msg.dds.BoxMessage data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(robotenvironmentawareness_msgs.msg.dds.BoxMessage data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += geometry_msgs.msg.dds.Vector3PubSubType.getCdrSerializedSize(data.getSome_vector(), current_alignment);

      return current_alignment - initial_alignment;
   }

   public static void write(robotenvironmentawareness_msgs.msg.dds.BoxMessage data, us.ihmc.idl.CDR cdr)
   {

      cdr.write_type_7(data.getIs_empty());

      geometry_msgs.msg.dds.Vector3PubSubType.write(data.getSome_vector(), cdr);
   }

   public static void read(robotenvironmentawareness_msgs.msg.dds.BoxMessage data, us.ihmc.idl.CDR cdr)
   {

      data.setIs_empty(cdr.read_type_7());

      geometry_msgs.msg.dds.Vector3PubSubType.read(data.getSome_vector(), cdr);
   }

   public static void staticCopy(robotenvironmentawareness_msgs.msg.dds.BoxMessage src, robotenvironmentawareness_msgs.msg.dds.BoxMessage dest)
   {
      dest.set(src);
   }

   @Override
   public void serialize(robotenvironmentawareness_msgs.msg.dds.BoxMessage data, us.ihmc.pubsub.common.SerializedPayload serializedPayload)
         throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, robotenvironmentawareness_msgs.msg.dds.BoxMessage data)
         throws java.io.IOException
   {
      deserializeCDR.deserialize(serializedPayload);
      read(data, deserializeCDR);
      deserializeCDR.finishDeserialize();
   }

   @Override
   public final void serialize(robotenvironmentawareness_msgs.msg.dds.BoxMessage data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_7("is_empty", data.getIs_empty());

      ser.write_type_a("some_vector", new geometry_msgs.msg.dds.Vector3PubSubType(), data.getSome_vector());

   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, robotenvironmentawareness_msgs.msg.dds.BoxMessage data)
   {
      data.setIs_empty(ser.read_type_7("is_empty"));

      ser.read_type_a("some_vector", new geometry_msgs.msg.dds.Vector3PubSubType(), data.getSome_vector());

   }

   @Override
   public robotenvironmentawareness_msgs.msg.dds.BoxMessage createData()
   {
      return new robotenvironmentawareness_msgs.msg.dds.BoxMessage();
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

   public void serialize(robotenvironmentawareness_msgs.msg.dds.BoxMessage data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(robotenvironmentawareness_msgs.msg.dds.BoxMessage data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }

   public void copy(robotenvironmentawareness_msgs.msg.dds.BoxMessage src, robotenvironmentawareness_msgs.msg.dds.BoxMessage dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public BoxMessagePubSubType newInstance()
   {
      return new BoxMessagePubSubType();
   }
}