package geometry_msgs.msg.dds;

/**
* 
* Topic data type of the struct "Pose" defined in "Pose_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from Pose_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Pose_.idl instead.
*
*/
public class PosePubSubType implements us.ihmc.pubsub.TopicDataType<geometry_msgs.msg.dds.Pose>
{
	public static final java.lang.String name = "geometry_msgs::msg::dds_::Pose_";
	
	
	
    public PosePubSubType()
    {
        
    }

	private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
	private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

    
    @Override
   public void serialize(geometry_msgs.msg.dds.Pose data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }
   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, geometry_msgs.msg.dds.Pose data) throws java.io.IOException
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
	            
	    current_alignment += geometry_msgs.msg.dds.PointPubSubType.getMaxCdrSerializedSize(current_alignment);
	    current_alignment += geometry_msgs.msg.dds.QuaternionPubSubType.getMaxCdrSerializedSize(current_alignment);
	
	    return current_alignment - initial_alignment;
	}


	public final static int getCdrSerializedSize(geometry_msgs.msg.dds.Pose data)
	{
		return getCdrSerializedSize(data, 0);
	}

	public final static int getCdrSerializedSize(geometry_msgs.msg.dds.Pose data, int current_alignment)
	{
	    int initial_alignment = current_alignment;
	            
	    current_alignment += geometry_msgs.msg.dds.PointPubSubType.getCdrSerializedSize(data.getPosition(), current_alignment);
	    current_alignment += geometry_msgs.msg.dds.QuaternionPubSubType.getCdrSerializedSize(data.getOrientation(), current_alignment);
	
	    return current_alignment - initial_alignment;
	}
	
   public static void write(geometry_msgs.msg.dds.Pose data, us.ihmc.idl.CDR cdr)
   {

	    geometry_msgs.msg.dds.PointPubSubType.write(data.getPosition(), cdr);

	    geometry_msgs.msg.dds.QuaternionPubSubType.write(data.getOrientation(), cdr);
   }

   public static void read(geometry_msgs.msg.dds.Pose data, us.ihmc.idl.CDR cdr)
   {

	    	geometry_msgs.msg.dds.PointPubSubType.read(data.getPosition(), cdr);	

	    	geometry_msgs.msg.dds.QuaternionPubSubType.read(data.getOrientation(), cdr);	
   }
   
	@Override
	public final void serialize(geometry_msgs.msg.dds.Pose data, us.ihmc.idl.InterchangeSerializer ser)
	{
			    ser.write_type_a("position", new geometry_msgs.msg.dds.PointPubSubType(), data.getPosition());

			    
			    ser.write_type_a("orientation", new geometry_msgs.msg.dds.QuaternionPubSubType(), data.getOrientation());

			    
	}
	
	@Override
	public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, geometry_msgs.msg.dds.Pose data)
	{
	    			ser.read_type_a("position", new geometry_msgs.msg.dds.PointPubSubType(), data.getPosition());
	    	
	    	    
	    			ser.read_type_a("orientation", new geometry_msgs.msg.dds.QuaternionPubSubType(), data.getOrientation());
	    	
	    	    
	}

   public static void staticCopy(geometry_msgs.msg.dds.Pose src, geometry_msgs.msg.dds.Pose dest)
   {
      dest.set(src);
   }
   
   
   @Override
   public geometry_msgs.msg.dds.Pose createData()
   {
      return new geometry_msgs.msg.dds.Pose();
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
   
   public void serialize(geometry_msgs.msg.dds.Pose data, us.ihmc.idl.CDR cdr)
	{
		write(data, cdr);
	}

   public void deserialize(geometry_msgs.msg.dds.Pose data, us.ihmc.idl.CDR cdr)
   {
        read(data, cdr);
   }
   
   public void copy(geometry_msgs.msg.dds.Pose src, geometry_msgs.msg.dds.Pose dest)
   {
      staticCopy(src, dest);
   }	

   
   @Override
   public PosePubSubType newInstance()
   {
   	  return new PosePubSubType();
   }
}