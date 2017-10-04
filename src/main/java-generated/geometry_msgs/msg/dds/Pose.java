package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "Pose" defined in Pose_.idl. 
*
* This file was automatically generated from Pose_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Pose_.idl instead.
*
*/
public class Pose
{
    public Pose()
    {
        	position_ = new geometry_msgs.msg.dds.Point();orientation_ = new geometry_msgs.msg.dds.Quaternion();        
        
    }

    public void set(Pose other)
    {
           	geometry_msgs.msg.dds.PointPubSubType.staticCopy(other.position_, position_);geometry_msgs.msg.dds.QuaternionPubSubType.staticCopy(other.orientation_, orientation_);    }


    public geometry_msgs.msg.dds.Point getPosition()
    {
        return position_;
    }

        

    public geometry_msgs.msg.dds.Quaternion getOrientation()
    {
        return orientation_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Pose)) return false;
        Pose otherMyClass = (Pose)other;
        boolean returnedValue = true;

        returnedValue &= this.position_.equals(otherMyClass.position_);
                
        returnedValue &= this.orientation_.equals(otherMyClass.orientation_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Pose {");
        builder.append("position=");
        builder.append(this.position_);

                builder.append(", ");
        builder.append("orientation=");
        builder.append(this.orientation_);

                
        builder.append("}");
		return builder.toString();
    }

    private geometry_msgs.msg.dds.Point position_; 
    private geometry_msgs.msg.dds.Quaternion orientation_; 

}