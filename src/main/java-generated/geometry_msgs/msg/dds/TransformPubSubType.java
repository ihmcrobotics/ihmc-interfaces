package geometry_msgs.msg.dds;

/**
* 
* Topic data type of the struct "Transform" defined in "Transform_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from Transform_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Transform_.idl instead.
*
*/
public class TransformPubSubType implements us.ihmc.pubsub.TopicDataType<geometry_msgs.msg.dds.Transform>
{
	public static final java.lang.String name = "geometry_msgs::msg::dds_::Transform_";
	
	
	
    public TransformPubSubType()
    {
        
    }

	private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
	private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

    
    @Override
   public void serialize(geometry_msgs.msg.dds.Transform data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }
   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, geometry_msgs.msg.dds.Transform data) throws java.io.IOException
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
	            
	    current_alignment += geometry_msgs.msg.dds.Vector3PubSubType.getMaxCdrSerializedSize(current_alignment);
	    current_alignment += geometry_msgs.msg.dds.QuaternionPubSubType.getMaxCdrSerializedSize(current_alignment);
	
	    return current_alignment - initial_alignment;
	}


	public final static int getCdrSerializedSize(geometry_msgs.msg.dds.Transform data)
	{
		return getCdrSerializedSize(data, 0);
	}

	public final static int getCdrSerializedSize(geometry_msgs.msg.dds.Transform data, int current_alignment)
	{
	    int initial_alignment = current_alignment;
	            
	    current_alignment += geometry_msgs.msg.dds.Vector3PubSubType.getCdrSerializedSize(data.getTranslation(), current_alignment);
	    current_alignment += geometry_msgs.msg.dds.QuaternionPubSubType.getCdrSerializedSize(data.getRotation(), current_alignment);
	
	    return current_alignment - initial_alignment;
	}
	
   public static void write(geometry_msgs.msg.dds.Transform data, us.ihmc.idl.CDR cdr)
   {

	    geometry_msgs.msg.dds.Vector3PubSubType.write(data.getTranslation(), cdr);

	    geometry_msgs.msg.dds.QuaternionPubSubType.write(data.getRotation(), cdr);
   }

   public static void read(geometry_msgs.msg.dds.Transform data, us.ihmc.idl.CDR cdr)
   {

	    	geometry_msgs.msg.dds.Vector3PubSubType.read(data.getTranslation(), cdr);	

	    	geometry_msgs.msg.dds.QuaternionPubSubType.read(data.getRotation(), cdr);	
   }
   
	@Override
	public final void serialize(geometry_msgs.msg.dds.Transform data, us.ihmc.idl.InterchangeSerializer ser)
	{
			    ser.write_type_a("translation", new geometry_msgs.msg.dds.Vector3PubSubType(), data.getTranslation());

			    
			    ser.write_type_a("rotation", new geometry_msgs.msg.dds.QuaternionPubSubType(), data.getRotation());

			    
	}
	
	@Override
	public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, geometry_msgs.msg.dds.Transform data)
	{
	    			ser.read_type_a("translation", new geometry_msgs.msg.dds.Vector3PubSubType(), data.getTranslation());
	    	
	    	    
	    			ser.read_type_a("rotation", new geometry_msgs.msg.dds.QuaternionPubSubType(), data.getRotation());
	    	
	    	    
	}

   public static void staticCopy(geometry_msgs.msg.dds.Transform src, geometry_msgs.msg.dds.Transform dest)
   {
      dest.set(src);
   }
   
   
   @Override
   public geometry_msgs.msg.dds.Transform createData()
   {
      return new geometry_msgs.msg.dds.Transform();
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
   
   public void serialize(geometry_msgs.msg.dds.Transform data, us.ihmc.idl.CDR cdr)
	{
		write(data, cdr);
	}

   public void deserialize(geometry_msgs.msg.dds.Transform data, us.ihmc.idl.CDR cdr)
   {
        read(data, cdr);
   }
   
   public void copy(geometry_msgs.msg.dds.Transform src, geometry_msgs.msg.dds.Transform dest)
   {
      staticCopy(src, dest);
   }	

   
   @Override
   public TransformPubSubType newInstance()
   {
   	  return new TransformPubSubType();
   }
}