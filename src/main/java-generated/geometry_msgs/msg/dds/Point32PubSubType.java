package geometry_msgs.msg.dds;

/**
* 
* Topic data type of the struct "Point32" defined in "Point32_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from Point32_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Point32_.idl instead.
*
*/
public class Point32PubSubType implements us.ihmc.pubsub.TopicDataType<geometry_msgs.msg.dds.Point32>
{
	public static final java.lang.String name = "geometry_msgs::msg::dds_::Point32_";
	
	
	
    public Point32PubSubType()
    {
        
    }

	private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
	private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

    
    @Override
   public void serialize(geometry_msgs.msg.dds.Point32 data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }
   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, geometry_msgs.msg.dds.Point32 data) throws java.io.IOException
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

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	
	    return current_alignment - initial_alignment;
	}


	public final static int getCdrSerializedSize(geometry_msgs.msg.dds.Point32 data)
	{
		return getCdrSerializedSize(data, 0);
	}

	public final static int getCdrSerializedSize(geometry_msgs.msg.dds.Point32 data, int current_alignment)
	{
	    int initial_alignment = current_alignment;
	            
	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	    current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

	
	    return current_alignment - initial_alignment;
	}
	
   public static void write(geometry_msgs.msg.dds.Point32 data, us.ihmc.idl.CDR cdr)
   {

	    cdr.write_type_5(data.getX());

	    cdr.write_type_5(data.getY());

	    cdr.write_type_5(data.getZ());
   }

   public static void read(geometry_msgs.msg.dds.Point32 data, us.ihmc.idl.CDR cdr)
   {

	    	data.setX(cdr.read_type_5());
	    	

	    	data.setY(cdr.read_type_5());
	    	

	    	data.setZ(cdr.read_type_5());
	    	
   }
   
	@Override
	public final void serialize(geometry_msgs.msg.dds.Point32 data, us.ihmc.idl.InterchangeSerializer ser)
	{
			    ser.write_type_5("x", data.getX());
			    
			    ser.write_type_5("y", data.getY());
			    
			    ser.write_type_5("z", data.getZ());
			    
	}
	
	@Override
	public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, geometry_msgs.msg.dds.Point32 data)
	{
	    			data.setX(ser.read_type_5("x"));	
	    	    
	    			data.setY(ser.read_type_5("y"));	
	    	    
	    			data.setZ(ser.read_type_5("z"));	
	    	    
	}

   public static void staticCopy(geometry_msgs.msg.dds.Point32 src, geometry_msgs.msg.dds.Point32 dest)
   {
      dest.set(src);
   }
   
   
   @Override
   public geometry_msgs.msg.dds.Point32 createData()
   {
      return new geometry_msgs.msg.dds.Point32();
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
   
   public void serialize(geometry_msgs.msg.dds.Point32 data, us.ihmc.idl.CDR cdr)
	{
		write(data, cdr);
	}

   public void deserialize(geometry_msgs.msg.dds.Point32 data, us.ihmc.idl.CDR cdr)
   {
        read(data, cdr);
   }
   
   public void copy(geometry_msgs.msg.dds.Point32 src, geometry_msgs.msg.dds.Point32 dest)
   {
      staticCopy(src, dest);
   }	

   
   @Override
   public Point32PubSubType newInstance()
   {
   	  return new Point32PubSubType();
   }
}