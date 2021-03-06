package sensor_msgs.msg.dds;

/**
 *
 * Topic data type of the struct "CameraInfo" defined in "CameraInfo_.idl". Use this class to provide the TopicDataType to a Participant.
 *
 * This file was automatically generated from CameraInfo_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit CameraInfo_.idl instead.
 *
 */
public class CameraInfoPubSubType implements us.ihmc.pubsub.TopicDataType<sensor_msgs.msg.dds.CameraInfo>
{
   public static final java.lang.String name = "sensor_msgs::msg::dds_::CameraInfo_";
   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   public CameraInfoPubSubType()
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4) + 255 + 1;

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += (100 * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += ((9) * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += ((9) * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += ((12) * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += sensor_msgs.msg.dds.RegionOfInterestPubSubType.getMaxCdrSerializedSize(current_alignment);

      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(sensor_msgs.msg.dds.CameraInfo data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(sensor_msgs.msg.dds.CameraInfo data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += std_msgs.msg.dds.HeaderPubSubType.getCdrSerializedSize(data.getHeader(), current_alignment);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4) + data.getDistortion_model().length() + 1;

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += (data.getD().size() * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += ((9) * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);
      current_alignment += ((9) * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);
      current_alignment += ((12) * 8) + us.ihmc.idl.CDR.alignment(current_alignment, 8);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += sensor_msgs.msg.dds.RegionOfInterestPubSubType.getCdrSerializedSize(data.getRoi(), current_alignment);

      return current_alignment - initial_alignment;
   }

   public static void write(sensor_msgs.msg.dds.CameraInfo data, us.ihmc.idl.CDR cdr)
   {

      std_msgs.msg.dds.HeaderPubSubType.write(data.getHeader(), cdr);

      cdr.write_type_4(data.getHeight());

      cdr.write_type_4(data.getWidth());

      if (data.getDistortion_model().length() <= 255)
         cdr.write_type_d(data.getDistortion_model());
      else
         throw new RuntimeException("distortion_model field exceeds the maximum length");

      if (data.getD().size() <= 100)
         cdr.write_type_e(data.getD());
      else
         throw new RuntimeException("d field exceeds the maximum length");

      for (int a = 0; a < data.getK().length; ++a)
      {
         cdr.write_type_6(data.getK()[a]);
      }

      for (int a = 0; a < data.getR().length; ++a)
      {
         cdr.write_type_6(data.getR()[a]);
      }

      for (int a = 0; a < data.getP().length; ++a)
      {
         cdr.write_type_6(data.getP()[a]);
      }

      cdr.write_type_4(data.getBinning_x());

      cdr.write_type_4(data.getBinning_y());

      sensor_msgs.msg.dds.RegionOfInterestPubSubType.write(data.getRoi(), cdr);
   }

   public static void read(sensor_msgs.msg.dds.CameraInfo data, us.ihmc.idl.CDR cdr)
   {

      std_msgs.msg.dds.HeaderPubSubType.read(data.getHeader(), cdr);

      data.setHeight(cdr.read_type_4());

      data.setWidth(cdr.read_type_4());

      cdr.read_type_d(data.getDistortion_model());

      cdr.read_type_e(data.getD());

      for (int a = 0; a < data.getK().length; ++a)
      {
         data.getK()[a] = cdr.read_type_6();
      }

      for (int a = 0; a < data.getR().length; ++a)
      {
         data.getR()[a] = cdr.read_type_6();
      }

      for (int a = 0; a < data.getP().length; ++a)
      {
         data.getP()[a] = cdr.read_type_6();
      }

      data.setBinning_x(cdr.read_type_4());

      data.setBinning_y(cdr.read_type_4());

      sensor_msgs.msg.dds.RegionOfInterestPubSubType.read(data.getRoi(), cdr);
   }

   public static void staticCopy(sensor_msgs.msg.dds.CameraInfo src, sensor_msgs.msg.dds.CameraInfo dest)
   {
      dest.set(src);
   }

   @Override
   public void serialize(sensor_msgs.msg.dds.CameraInfo data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, sensor_msgs.msg.dds.CameraInfo data) throws java.io.IOException
   {
      deserializeCDR.deserialize(serializedPayload);
      read(data, deserializeCDR);
      deserializeCDR.finishDeserialize();
   }

   @Override
   public final void serialize(sensor_msgs.msg.dds.CameraInfo data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_a("header", new std_msgs.msg.dds.HeaderPubSubType(), data.getHeader());

      ser.write_type_4("height", data.getHeight());

      ser.write_type_4("width", data.getWidth());

      ser.write_type_d("distortion_model", data.getDistortion_model());

      ser.write_type_e("d", data.getD());

      ser.write_type_f("k", data.getK());
      ser.write_type_f("r", data.getR());
      ser.write_type_f("p", data.getP());
      ser.write_type_4("binning_x", data.getBinning_x());

      ser.write_type_4("binning_y", data.getBinning_y());

      ser.write_type_a("roi", new sensor_msgs.msg.dds.RegionOfInterestPubSubType(), data.getRoi());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, sensor_msgs.msg.dds.CameraInfo data)
   {
      ser.read_type_a("header", new std_msgs.msg.dds.HeaderPubSubType(), data.getHeader());

      data.setHeight(ser.read_type_4("height"));

      data.setWidth(ser.read_type_4("width"));

      ser.read_type_d("distortion_model", data.getDistortion_model());

      ser.read_type_e("d", data.getD());

      ser.read_type_f("k", data.getK());

      ser.read_type_f("r", data.getR());

      ser.read_type_f("p", data.getP());

      data.setBinning_x(ser.read_type_4("binning_x"));

      data.setBinning_y(ser.read_type_4("binning_y"));

      ser.read_type_a("roi", new sensor_msgs.msg.dds.RegionOfInterestPubSubType(), data.getRoi());
   }

   @Override
   public sensor_msgs.msg.dds.CameraInfo createData()
   {
      return new sensor_msgs.msg.dds.CameraInfo();
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

   public void serialize(sensor_msgs.msg.dds.CameraInfo data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(sensor_msgs.msg.dds.CameraInfo data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }

   public void copy(sensor_msgs.msg.dds.CameraInfo src, sensor_msgs.msg.dds.CameraInfo dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public CameraInfoPubSubType newInstance()
   {
      return new CameraInfoPubSubType();
   }
}