package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "PointStamped" defined in PointStamped_.idl. 
*
* This file was automatically generated from PointStamped_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit PointStamped_.idl instead.
*
*/
public class PointStamped
{
    public PointStamped()
    {
        	header_ = new std_msgs.msg.dds.Header();point_ = new geometry_msgs.msg.dds.Point();        
        
    }

    public void set(PointStamped other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);geometry_msgs.msg.dds.PointPubSubType.staticCopy(other.point_, point_);    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        

    public geometry_msgs.msg.dds.Point getPoint()
    {
        return point_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof PointStamped)) return false;
        PointStamped otherMyClass = (PointStamped)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.point_.equals(otherMyClass.point_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("PointStamped {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("point=");
        builder.append(this.point_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private geometry_msgs.msg.dds.Point point_; 

}