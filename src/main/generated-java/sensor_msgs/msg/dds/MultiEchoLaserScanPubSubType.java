package sensor_msgs.msg.dds;

/**
* 
* Topic data type of the struct "MultiEchoLaserScan" defined in "MultiEchoLaserScan_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from MultiEchoLaserScan_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit MultiEchoLaserScan_.idl instead.
*
*/
public class MultiEchoLaserScanPubSubType implements us.ihmc.pubsub.TopicDataType<sensor_msgs.msg.dds.MultiEchoLaserScan>
{
	public static final java.lang.String name = "sensor_msgs::msg::dds_::MultiEchoLaserScan_";
	
	
	
    public MultiEchoLaserScanPubSubType()
    {
        
    }

	private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
	private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

    
    @Override
   public void serialize(sensor_msgs.msg.dds.MultiEchoLaserScan data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }
   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, sensor_msgs.msg.dds.MultiEchoLaserScan data) throws java.io.IOException
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
	            
	    current_alignment += std_msgs.msg.dds.HeaderPubSubType.getMaxCdrSerializedSize(current_alignment);
	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
	    for(int a = 0; a < 100; ++a)
	    {
	        current_alignment += sensor_msgs.msg.dds.LaserEchoPubSubType.getMaxCdrSerializedSize(current_alignment);}

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
	    for(int a = 0; a < 100; ++a)
	    {
	        current_alignment += sensor_msgs.msg.dds.LaserEchoPubSubType.getMaxCdrSerializedSize(current_alignment);}

	
	    return current_alignment - initial_alignment;
	}


	public final static int getCdrSerializedSize(sensor_msgs.msg.dds.MultiEchoLaserScan data)
	{
		return getCdrSerializedSize(data, 0);
	}

	public final static int getCdrSerializedSize(sensor_msgs.msg.dds.MultiEchoLaserScan data, int current_alignment)
	{
	    int initial_alignment = current_alignment;
	            
	    current_alignment += std_msgs.msg.dds.HeaderPubSubType.getCdrSerializedSize(data.getHeader(), current_alignment);
	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
	    for(int a = 0; a < data.getRanges().size(); ++a)
	    {
	        current_alignment += sensor_msgs.msg.dds.LaserEchoPubSubType.getCdrSerializedSize(data.getRanges().get(a), current_alignment);}

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);
	    for(int a = 0; a < data.getIntensities().size(); ++a)
	    {
	        current_alignment += sensor_msgs.msg.dds.LaserEchoPubSubType.getCdrSerializedSize(data.getIntensities().get(a), current_alignment);}

	
	    return current_alignment - initial_alignment;
	}
	
   public static void write(sensor_msgs.msg.dds.MultiEchoLaserScan data, us.ihmc.idl.CDR cdr)
   {

	    std_msgs.msg.dds.HeaderPubSubType.write(data.getHeader(), cdr);

	    cdr.write_type_5(data.getAngle_min());

	    cdr.write_type_5(data.getAngle_max());

	    cdr.write_type_5(data.getAngle_increment());

	    cdr.write_type_5(data.getTime_increment());

	    cdr.write_type_5(data.getScan_time());

	    cdr.write_type_5(data.getRange_min());

	    cdr.write_type_5(data.getRange_max());

	    if(data.getRanges().size() <= 100)
	    cdr.write_type_e(data.getRanges());else
	        throw new RuntimeException("ranges field exceeds the maximum length");

	    if(data.getIntensities().size() <= 100)
	    cdr.write_type_e(data.getIntensities());else
	        throw new RuntimeException("intensities field exceeds the maximum length");
   }

   public static void read(sensor_msgs.msg.dds.MultiEchoLaserScan data, us.ihmc.idl.CDR cdr)
   {

	    	std_msgs.msg.dds.HeaderPubSubType.read(data.getHeader(), cdr);	

	    	data.setAngle_min(cdr.read_type_5());
	    	

	    	data.setAngle_max(cdr.read_type_5());
	    	

	    	data.setAngle_increment(cdr.read_type_5());
	    	

	    	data.setTime_increment(cdr.read_type_5());
	    	

	    	data.setScan_time(cdr.read_type_5());
	    	

	    	data.setRange_min(cdr.read_type_5());
	    	

	    	data.setRange_max(cdr.read_type_5());
	    	

	    	cdr.read_type_e(data.getRanges());	

	    	cdr.read_type_e(data.getIntensities());	
   }
   
	@Override
	public final void serialize(sensor_msgs.msg.dds.MultiEchoLaserScan data, us.ihmc.idl.InterchangeSerializer ser)
	{
			    ser.write_type_a("header", new std_msgs.msg.dds.HeaderPubSubType(), data.getHeader());

			    
			    ser.write_type_5("angle_min", data.getAngle_min());
			    
			    ser.write_type_5("angle_max", data.getAngle_max());
			    
			    ser.write_type_5("angle_increment", data.getAngle_increment());
			    
			    ser.write_type_5("time_increment", data.getTime_increment());
			    
			    ser.write_type_5("scan_time", data.getScan_time());
			    
			    ser.write_type_5("range_min", data.getRange_min());
			    
			    ser.write_type_5("range_max", data.getRange_max());
			    
			    ser.write_type_e("ranges", data.getRanges());
			    
			    ser.write_type_e("intensities", data.getIntensities());
			    
	}
	
	@Override
	public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, sensor_msgs.msg.dds.MultiEchoLaserScan data)
	{
	    			ser.read_type_a("header", new std_msgs.msg.dds.HeaderPubSubType(), data.getHeader());
	    	
	    	    
	    			data.setAngle_min(ser.read_type_5("angle_min"));	
	    	    
	    			data.setAngle_max(ser.read_type_5("angle_max"));	
	    	    
	    			data.setAngle_increment(ser.read_type_5("angle_increment"));	
	    	    
	    			data.setTime_increment(ser.read_type_5("time_increment"));	
	    	    
	    			data.setScan_time(ser.read_type_5("scan_time"));	
	    	    
	    			data.setRange_min(ser.read_type_5("range_min"));	
	    	    
	    			data.setRange_max(ser.read_type_5("range_max"));	
	    	    
	    			ser.read_type_e("ranges", data.getRanges());	
	    	    
	    			ser.read_type_e("intensities", data.getIntensities());	
	    	    
	}

   public static void staticCopy(sensor_msgs.msg.dds.MultiEchoLaserScan src, sensor_msgs.msg.dds.MultiEchoLaserScan dest)
   {
      dest.set(src);
   }
   
   
   @Override
   public sensor_msgs.msg.dds.MultiEchoLaserScan createData()
   {
      return new sensor_msgs.msg.dds.MultiEchoLaserScan();
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
   
   public void serialize(sensor_msgs.msg.dds.MultiEchoLaserScan data, us.ihmc.idl.CDR cdr)
	{
		write(data, cdr);
	}

   public void deserialize(sensor_msgs.msg.dds.MultiEchoLaserScan data, us.ihmc.idl.CDR cdr)
   {
        read(data, cdr);
   }
   
   public void copy(sensor_msgs.msg.dds.MultiEchoLaserScan src, sensor_msgs.msg.dds.MultiEchoLaserScan dest)
   {
      staticCopy(src, dest);
   }	

   
   @Override
   public MultiEchoLaserScanPubSubType newInstance()
   {
   	  return new MultiEchoLaserScanPubSubType();
   }
}