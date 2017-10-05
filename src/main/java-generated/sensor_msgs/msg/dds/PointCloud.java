package sensor_msgs.msg.dds;
/**
* 
* Definition of the class "PointCloud" defined in PointCloud_.idl. 
*
* This file was automatically generated from PointCloud_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit PointCloud_.idl instead.
*
*/
public class PointCloud
{
    public PointCloud()
    {
        	header_ = new std_msgs.msg.dds.Header();points_ = new us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.tuple3D.Point3D32> (100, us.ihmc.euclid.tuple3D.Point3D32.class, new geometry_msgs.msg.dds.Point32PubSubType());

        	channels_ = new us.ihmc.idl.IDLSequence.Object<sensor_msgs.msg.dds.ChannelFloat32> (100, sensor_msgs.msg.dds.ChannelFloat32.class, new sensor_msgs.msg.dds.ChannelFloat32PubSubType());


        
        
    }

    public void set(PointCloud other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);points_.set(other.points_);	channels_.set(other.channels_);	
    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        

    public us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.tuple3D.Point3D32>  getPoints()
    {
        return points_;
    }

        

    public us.ihmc.idl.IDLSequence.Object<sensor_msgs.msg.dds.ChannelFloat32>  getChannels()
    {
        return channels_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof PointCloud)) return false;
        PointCloud otherMyClass = (PointCloud)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.points_.equals(otherMyClass.points_);
                
        returnedValue &= this.channels_.equals(otherMyClass.channels_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("PointCloud {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("points=");
        builder.append(this.points_);

                builder.append(", ");
        builder.append("channels=");
        builder.append(this.channels_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.tuple3D.Point3D32>  points_; 
    private us.ihmc.idl.IDLSequence.Object<sensor_msgs.msg.dds.ChannelFloat32>  channels_; 

}