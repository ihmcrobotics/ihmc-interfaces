package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "PoseArray" defined in PoseArray_.idl. 
*
* This file was automatically generated from PoseArray_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit PoseArray_.idl instead.
*
*/
public class PoseArray
{
    public PoseArray()
    {
        	header_ = new std_msgs.msg.dds.Header();poses_ = new us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.geometry.Pose3D> (100, us.ihmc.euclid.geometry.Pose3D.class, new geometry_msgs.msg.dds.PosePubSubType());


        
        
    }

    public void set(PoseArray other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);poses_.set(other.poses_);	
    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        

    public us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.geometry.Pose3D>  getPoses()
    {
        return poses_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof PoseArray)) return false;
        PoseArray otherMyClass = (PoseArray)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.poses_.equals(otherMyClass.poses_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("PoseArray {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("poses=");
        builder.append(this.poses_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.geometry.Pose3D>  poses_; 

}