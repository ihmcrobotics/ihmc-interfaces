package robotenvironmentawareness_msgs.msg.dds;

/**
 *
 * Topic data type of the struct "APIElementId" defined in "APIElementId_.idl". Use this class to provide the TopicDataType to a Participant.
 *
 * This file was automatically generated from APIElementId_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit APIElementId_.idl instead.
 *
 */
public class APIElementIdPubSubType implements us.ihmc.pubsub.TopicDataType<robotenvironmentawareness_msgs.msg.dds.APIElementId>
{
   public static final java.lang.String name = "robotenvironmentawareness_msgs::msg::dds_::APIElementId_";

   public APIElementIdPubSubType()
   {

   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(robotenvironmentawareness_msgs.msg.dds.APIElementId data, us.ihmc.pubsub.common.SerializedPayload serializedPayload)
         throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, robotenvironmentawareness_msgs.msg.dds.APIElementId data)
         throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += (100 * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(robotenvironmentawareness_msgs.msg.dds.APIElementId data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(robotenvironmentawareness_msgs.msg.dds.APIElementId data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += (data.getId().size() * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(robotenvironmentawareness_msgs.msg.dds.APIElementId data, us.ihmc.idl.CDR cdr)
   {

      if (data.getId().size() <= 100)
         cdr.write_type_e(data.getId());
      else
         throw new RuntimeException("id field exceeds the maximum length");
   }

   public static void read(robotenvironmentawareness_msgs.msg.dds.APIElementId data, us.ihmc.idl.CDR cdr)
   {

      cdr.read_type_e(data.getId());
   }

   @Override
   public final void serialize(robotenvironmentawareness_msgs.msg.dds.APIElementId data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_e("id", data.getId());

   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, robotenvironmentawareness_msgs.msg.dds.APIElementId data)
   {
      ser.read_type_e("id", data.getId());

   }

   public static void staticCopy(robotenvironmentawareness_msgs.msg.dds.APIElementId src, robotenvironmentawareness_msgs.msg.dds.APIElementId dest)
   {
      dest.set(src);
   }

   @Override
   public robotenvironmentawareness_msgs.msg.dds.APIElementId createData()
   {
      return new robotenvironmentawareness_msgs.msg.dds.APIElementId();
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

   public void serialize(robotenvironmentawareness_msgs.msg.dds.APIElementId data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(robotenvironmentawareness_msgs.msg.dds.APIElementId data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }

   public void copy(robotenvironmentawareness_msgs.msg.dds.APIElementId src, robotenvironmentawareness_msgs.msg.dds.APIElementId dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public APIElementIdPubSubType newInstance()
   {
      return new APIElementIdPubSubType();
   }
}