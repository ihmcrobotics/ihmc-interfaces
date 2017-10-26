package robotenvironmentawareness_msgs.msg.dds;

/**
* 
* Topic data type of the struct "LineSegment3DMessage" defined in "LineSegment3DMessage_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from LineSegment3DMessage_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit LineSegment3DMessage_.idl instead.
*
*/
public class LineSegment3DMessagePubSubType implements us.ihmc.pubsub.TopicDataType<robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage>
{
	public static final java.lang.String name = "robotenvironmentawareness_msgs::msg::dds_::LineSegment3DMessage_";
	
	
	
    public LineSegment3DMessagePubSubType()
    {
        
    }

	private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
	private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

    
    @Override
   public void serialize(robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }
   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage data) throws java.io.IOException
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
	            
	    current_alignment += geometry_msgs.msg.dds.Point32PubSubType.getMaxCdrSerializedSize(current_alignment);
	    current_alignment += geometry_msgs.msg.dds.Point32PubSubType.getMaxCdrSerializedSize(current_alignment);
	
	    return current_alignment - initial_alignment;
	}


	public final static int getCdrSerializedSize(robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage data)
	{
		return getCdrSerializedSize(data, 0);
	}

	public final static int getCdrSerializedSize(robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage data, int current_alignment)
	{
	    int initial_alignment = current_alignment;
	            
	    current_alignment += geometry_msgs.msg.dds.Point32PubSubType.getCdrSerializedSize(data.getStart(), current_alignment);
	    current_alignment += geometry_msgs.msg.dds.Point32PubSubType.getCdrSerializedSize(data.getEnd(), current_alignment);
	
	    return current_alignment - initial_alignment;
	}
	
   public static void write(robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage data, us.ihmc.idl.CDR cdr)
   {

	    geometry_msgs.msg.dds.Point32PubSubType.write(data.getStart(), cdr);

	    geometry_msgs.msg.dds.Point32PubSubType.write(data.getEnd(), cdr);
   }

   public static void read(robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage data, us.ihmc.idl.CDR cdr)
   {

	    	geometry_msgs.msg.dds.Point32PubSubType.read(data.getStart(), cdr);	

	    	geometry_msgs.msg.dds.Point32PubSubType.read(data.getEnd(), cdr);	
   }
   
	@Override
	public final void serialize(robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage data, us.ihmc.idl.InterchangeSerializer ser)
	{
			    ser.write_type_a("start", new geometry_msgs.msg.dds.Point32PubSubType(), data.getStart());

			    
			    ser.write_type_a("end", new geometry_msgs.msg.dds.Point32PubSubType(), data.getEnd());

			    
	}
	
	@Override
	public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage data)
	{
	    			ser.read_type_a("start", new geometry_msgs.msg.dds.Point32PubSubType(), data.getStart());
	    	
	    	    
	    			ser.read_type_a("end", new geometry_msgs.msg.dds.Point32PubSubType(), data.getEnd());
	    	
	    	    
	}

   public static void staticCopy(robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage src, robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage dest)
   {
      dest.set(src);
   }
   
   
   @Override
   public robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage createData()
   {
      return new robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage();
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
   
   public void serialize(robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage data, us.ihmc.idl.CDR cdr)
	{
		write(data, cdr);
	}

   public void deserialize(robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage data, us.ihmc.idl.CDR cdr)
   {
        read(data, cdr);
   }
   
   public void copy(robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage src, robotenvironmentawareness_msgs.msg.dds.LineSegment3DMessage dest)
   {
      staticCopy(src, dest);
   }	

   
   @Override
   public LineSegment3DMessagePubSubType newInstance()
   {
   	  return new LineSegment3DMessagePubSubType();
   }
}