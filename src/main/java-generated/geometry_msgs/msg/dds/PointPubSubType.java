package geometry_msgs.msg.dds;

/**
* 
* Topic data type of the struct "Point" defined in "Point_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from Point_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Point_.idl instead.
*
*/
public class PointPubSubType implements us.ihmc.pubsub.TopicDataType<geometry_msgs.msg.dds.Point>
{
	public static final java.lang.String name = "geometry_msgs::msg::dds_::Point_";
	
	
	
    public PointPubSubType()
    {
        
    }

	private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
	private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

    
    @Override
   public void serialize(geometry_msgs.msg.dds.Point data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }
   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, geometry_msgs.msg.dds.Point data) throws java.io.IOException
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
	            
	    current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

	    current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

	    current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

	
	    return current_alignment - initial_alignment;
	}


	public final static int getCdrSerializedSize(geometry_msgs.msg.dds.Point data)
	{
		return getCdrSerializedSize(data, 0);
	}

	public final static int getCdrSerializedSize(geometry_msgs.msg.dds.Point data, int current_alignment)
	{
	    int initial_alignment = current_alignment;
	            
	    current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

	    current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

	    current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

	
	    return current_alignment - initial_alignment;
	}
	
   public static void write(geometry_msgs.msg.dds.Point data, us.ihmc.idl.CDR cdr)
   {

	    cdr.write_type_6(data.getX());

	    cdr.write_type_6(data.getY());

	    cdr.write_type_6(data.getZ());
   }

   public static void read(geometry_msgs.msg.dds.Point data, us.ihmc.idl.CDR cdr)
   {

	    	data.setX(cdr.read_type_6());
	    	

	    	data.setY(cdr.read_type_6());
	    	

	    	data.setZ(cdr.read_type_6());
	    	
   }
   
	@Override
	public final void serialize(geometry_msgs.msg.dds.Point data, us.ihmc.idl.InterchangeSerializer ser)
	{
			    ser.write_type_6("x", data.getX());
			    
			    ser.write_type_6("y", data.getY());
			    
			    ser.write_type_6("z", data.getZ());
			    
	}
	
	@Override
	public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, geometry_msgs.msg.dds.Point data)
	{
	    			data.setX(ser.read_type_6("x"));	
	    	    
	    			data.setY(ser.read_type_6("y"));	
	    	    
	    			data.setZ(ser.read_type_6("z"));	
	    	    
	}

   public static void staticCopy(geometry_msgs.msg.dds.Point src, geometry_msgs.msg.dds.Point dest)
   {
      dest.set(src);
   }
   
   
   @Override
   public geometry_msgs.msg.dds.Point createData()
   {
      return new geometry_msgs.msg.dds.Point();
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
   
   public void serialize(geometry_msgs.msg.dds.Point data, us.ihmc.idl.CDR cdr)
	{
		write(data, cdr);
	}

   public void deserialize(geometry_msgs.msg.dds.Point data, us.ihmc.idl.CDR cdr)
   {
        read(data, cdr);
   }
   
   public void copy(geometry_msgs.msg.dds.Point src, geometry_msgs.msg.dds.Point dest)
   {
      staticCopy(src, dest);
   }	

   
   @Override
   public PointPubSubType newInstance()
   {
   	  return new PointPubSubType();
   }
}