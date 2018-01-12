package sensor_msgs.msg.dds;

/**
 *
 * Topic data type of the struct "PointCloud2" defined in "PointCloud2_.idl". Use this class to provide the TopicDataType to a Participant.
 *
 * This file was automatically generated from PointCloud2_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit PointCloud2_.idl instead.
 *
 */
public class PointCloud2PubSubType implements us.ihmc.pubsub.TopicDataType<sensor_msgs.msg.dds.PointCloud2>
{
   public static final java.lang.String name = "sensor_msgs::msg::dds_::PointCloud2_";
   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   public PointCloud2PubSubType()
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      for (int a = 0; a < 100; ++a)
      {
         current_alignment += sensor_msgs.msg.dds.PointFieldPubSubType.getMaxCdrSerializedSize(current_alignment);
      }

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += (100 * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(sensor_msgs.msg.dds.PointCloud2 data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(sensor_msgs.msg.dds.PointCloud2 data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += std_msgs.msg.dds.HeaderPubSubType.getCdrSerializedSize(data.getHeader(), current_alignment);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      for (int a = 0; a < data.getFields().size(); ++a)
      {
         current_alignment += sensor_msgs.msg.dds.PointFieldPubSubType.getCdrSerializedSize(data.getFields().get(a), current_alignment);
      }

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += (data.getData().size() * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public static void write(sensor_msgs.msg.dds.PointCloud2 data, us.ihmc.idl.CDR cdr)
   {

      std_msgs.msg.dds.HeaderPubSubType.write(data.getHeader(), cdr);

      cdr.write_type_4(data.getHeight());

      cdr.write_type_4(data.getWidth());

      if (data.getFields().size() <= 100)
         cdr.write_type_e(data.getFields());
      else
         throw new RuntimeException("fields field exceeds the maximum length");

      cdr.write_type_7(data.getIs_bigendian());

      cdr.write_type_4(data.getPoint_step());

      cdr.write_type_4(data.getRow_step());

      if (data.getData().size() <= 100)
         cdr.write_type_e(data.getData());
      else
         throw new RuntimeException("data field exceeds the maximum length");

      cdr.write_type_7(data.getIs_dense());
   }

   public static void read(sensor_msgs.msg.dds.PointCloud2 data, us.ihmc.idl.CDR cdr)
   {

      std_msgs.msg.dds.HeaderPubSubType.read(data.getHeader(), cdr);

      data.setHeight(cdr.read_type_4());

      data.setWidth(cdr.read_type_4());

      cdr.read_type_e(data.getFields());

      data.setIs_bigendian(cdr.read_type_7());

      data.setPoint_step(cdr.read_type_4());

      data.setRow_step(cdr.read_type_4());

      cdr.read_type_e(data.getData());

      data.setIs_dense(cdr.read_type_7());
   }

   public static void staticCopy(sensor_msgs.msg.dds.PointCloud2 src, sensor_msgs.msg.dds.PointCloud2 dest)
   {
      dest.set(src);
   }

   @Override
   public void serialize(sensor_msgs.msg.dds.PointCloud2 data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, sensor_msgs.msg.dds.PointCloud2 data) throws java.io.IOException
   {
      deserializeCDR.deserialize(serializedPayload);
      read(data, deserializeCDR);
      deserializeCDR.finishDeserialize();
   }

   @Override
   public final void serialize(sensor_msgs.msg.dds.PointCloud2 data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_a("header", new std_msgs.msg.dds.HeaderPubSubType(), data.getHeader());

      ser.write_type_4("height", data.getHeight());

      ser.write_type_4("width", data.getWidth());

      ser.write_type_e("fields", data.getFields());

      ser.write_type_7("is_bigendian", data.getIs_bigendian());

      ser.write_type_4("point_step", data.getPoint_step());

      ser.write_type_4("row_step", data.getRow_step());

      ser.write_type_e("data", data.getData());

      ser.write_type_7("is_dense", data.getIs_dense());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, sensor_msgs.msg.dds.PointCloud2 data)
   {
      ser.read_type_a("header", new std_msgs.msg.dds.HeaderPubSubType(), data.getHeader());

      data.setHeight(ser.read_type_4("height"));

      data.setWidth(ser.read_type_4("width"));

      ser.read_type_e("fields", data.getFields());

      data.setIs_bigendian(ser.read_type_7("is_bigendian"));

      data.setPoint_step(ser.read_type_4("point_step"));

      data.setRow_step(ser.read_type_4("row_step"));

      ser.read_type_e("data", data.getData());

      data.setIs_dense(ser.read_type_7("is_dense"));
   }

   @Override
   public sensor_msgs.msg.dds.PointCloud2 createData()
   {
      return new sensor_msgs.msg.dds.PointCloud2();
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

   public void serialize(sensor_msgs.msg.dds.PointCloud2 data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(sensor_msgs.msg.dds.PointCloud2 data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }

   public void copy(sensor_msgs.msg.dds.PointCloud2 src, sensor_msgs.msg.dds.PointCloud2 dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public PointCloud2PubSubType newInstance()
   {
      return new PointCloud2PubSubType();
   }
}