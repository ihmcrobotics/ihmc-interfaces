package std_msgs.msg.dds;

/**
 *
 * Topic data type of the struct "MultiArrayLayout" defined in "MultiArrayLayout_.idl". Use this class to provide the TopicDataType to a Participant.
 *
 * This file was automatically generated from MultiArrayLayout_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit MultiArrayLayout_.idl instead.
 *
 */
public class MultiArrayLayoutPubSubType implements us.ihmc.pubsub.TopicDataType<std_msgs.msg.dds.MultiArrayLayout>
{
   public static final java.lang.String name = "std_msgs::msg::dds_::MultiArrayLayout_";
   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   public MultiArrayLayoutPubSubType()
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
      for (int a = 0; a < 100; ++a)
      {
         current_alignment += std_msgs.msg.dds.MultiArrayDimensionPubSubType.getMaxCdrSerializedSize(current_alignment);
      }

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(std_msgs.msg.dds.MultiArrayLayout data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(std_msgs.msg.dds.MultiArrayLayout data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      for (int a = 0; a < data.getDim().size(); ++a)
      {
         current_alignment += std_msgs.msg.dds.MultiArrayDimensionPubSubType.getCdrSerializedSize(data.getDim().get(a), current_alignment);
      }

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(std_msgs.msg.dds.MultiArrayLayout data, us.ihmc.idl.CDR cdr)
   {

      if (data.getDim().size() <= 100)
         cdr.write_type_e(data.getDim());
      else
         throw new RuntimeException("dim field exceeds the maximum length");

      cdr.write_type_4(data.getData_offset());
   }

   public static void read(std_msgs.msg.dds.MultiArrayLayout data, us.ihmc.idl.CDR cdr)
   {

      cdr.read_type_e(data.getDim());

      data.setData_offset(cdr.read_type_4());
   }

   public static void staticCopy(std_msgs.msg.dds.MultiArrayLayout src, std_msgs.msg.dds.MultiArrayLayout dest)
   {
      dest.set(src);
   }

   @Override
   public void serialize(std_msgs.msg.dds.MultiArrayLayout data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, std_msgs.msg.dds.MultiArrayLayout data) throws java.io.IOException
   {
      deserializeCDR.deserialize(serializedPayload);
      read(data, deserializeCDR);
      deserializeCDR.finishDeserialize();
   }

   @Override
   public final void serialize(std_msgs.msg.dds.MultiArrayLayout data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_e("dim", data.getDim());

      ser.write_type_4("data_offset", data.getData_offset());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, std_msgs.msg.dds.MultiArrayLayout data)
   {
      ser.read_type_e("dim", data.getDim());

      data.setData_offset(ser.read_type_4("data_offset"));
   }

   @Override
   public std_msgs.msg.dds.MultiArrayLayout createData()
   {
      return new std_msgs.msg.dds.MultiArrayLayout();
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

   public void serialize(std_msgs.msg.dds.MultiArrayLayout data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(std_msgs.msg.dds.MultiArrayLayout data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }

   public void copy(std_msgs.msg.dds.MultiArrayLayout src, std_msgs.msg.dds.MultiArrayLayout dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public MultiArrayLayoutPubSubType newInstance()
   {
      return new MultiArrayLayoutPubSubType();
   }
}