package nav_msgs.msg.dds;
/**
* 
* Definition of the class "Path" defined in Path_.idl. 
*
* This file was automatically generated from Path_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Path_.idl instead.
*
*/
public class Path
{
    public Path()
    {
        	header_ = new std_msgs.msg.dds.Header();poses_ = new us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.PoseStamped> (100, geometry_msgs.msg.dds.PoseStamped.class, new geometry_msgs.msg.dds.PoseStampedPubSubType());


        
        
    }

    public void set(Path other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);poses_.set(other.poses_);	
    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        

    public us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.PoseStamped>  getPoses()
    {
        return poses_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Path)) return false;
        Path otherMyClass = (Path)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.poses_.equals(otherMyClass.poses_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Path {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("poses=");
        builder.append(this.poses_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.PoseStamped>  poses_; 

}