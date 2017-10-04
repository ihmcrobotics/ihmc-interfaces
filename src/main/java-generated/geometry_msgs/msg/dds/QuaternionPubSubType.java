package geometry_msgs.msg.dds;

/**
* 
* Topic data type of the struct "Quaternion" defined in "Quaternion_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from Quaternion_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Quaternion_.idl instead.
*
*/
public class QuaternionPubSubType implements us.ihmc.pubsub.TopicDataType<geometry_msgs.msg.dds.Quaternion>
{
	public static final java.lang.String name = "geometry_msgs::msg::dds_::Quaternion_";
	
	
	
    public QuaternionPubSubType()
    {
        
    }

	private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
	private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

    
    @Override
   public void serialize(geometry_msgs.msg.dds.Quaternion data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }
   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, geometry_msgs.msg.dds.Quaternion data) throws java.io.IOException
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

	    current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

	
	    return current_alignment - initial_alignment;
	}


	public final static int getCdrSerializedSize(geometry_msgs.msg.dds.Quaternion data)
	{
		return getCdrSerializedSize(data, 0);
	}

	public final static int getCdrSerializedSize(geometry_msgs.msg.dds.Quaternion data, int current_alignment)
	{
	    int initial_alignment = current_alignment;
	            
	    current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

	    current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

	    current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

	    current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

	
	    return current_alignment - initial_alignment;
	}
	
   public static void write(geometry_msgs.msg.dds.Quaternion data, us.ihmc.idl.CDR cdr)
   {

	    cdr.write_type_6(data.getX());

	    cdr.write_type_6(data.getY());

	    cdr.write_type_6(data.getZ());

	    cdr.write_type_6(data.getW());
   }

   public static void read(geometry_msgs.msg.dds.Quaternion data, us.ihmc.idl.CDR cdr)
   {

	    	data.setX(cdr.read_type_6());
	    	

	    	data.setY(cdr.read_type_6());
	    	

	    	data.setZ(cdr.read_type_6());
	    	

	    	data.setW(cdr.read_type_6());
	    	
   }
   
	@Override
	public final void serialize(geometry_msgs.msg.dds.Quaternion data, us.ihmc.idl.InterchangeSerializer ser)
	{
			    ser.write_type_6("x", data.getX());
			    
			    ser.write_type_6("y", data.getY());
			    
			    ser.write_type_6("z", data.getZ());
			    
			    ser.write_type_6("w", data.getW());
			    
	}
	
	@Override
	public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, geometry_msgs.msg.dds.Quaternion data)
	{
	    			data.setX(ser.read_type_6("x"));	
	    	    
	    			data.setY(ser.read_type_6("y"));	
	    	    
	    			data.setZ(ser.read_type_6("z"));	
	    	    
	    			data.setW(ser.read_type_6("w"));	
	    	    
	}

   public static void staticCopy(geometry_msgs.msg.dds.Quaternion src, geometry_msgs.msg.dds.Quaternion dest)
   {
      dest.set(src);
   }
   
   
   @Override
   public geometry_msgs.msg.dds.Quaternion createData()
   {
      return new geometry_msgs.msg.dds.Quaternion();
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
   
   public void serialize(geometry_msgs.msg.dds.Quaternion data, us.ihmc.idl.CDR cdr)
	{
		write(data, cdr);
	}

   public void deserialize(geometry_msgs.msg.dds.Quaternion data, us.ihmc.idl.CDR cdr)
   {
        read(data, cdr);
   }
   
   public void copy(geometry_msgs.msg.dds.Quaternion src, geometry_msgs.msg.dds.Quaternion dest)
   {
      staticCopy(src, dest);
   }	

   
   @Override
   public QuaternionPubSubType newInstance()
   {
   	  return new QuaternionPubSubType();
   }
}