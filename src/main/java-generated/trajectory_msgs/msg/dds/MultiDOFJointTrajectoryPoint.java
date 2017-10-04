package trajectory_msgs.msg.dds;
/**
* 
* Definition of the class "MultiDOFJointTrajectoryPoint" defined in MultiDOFJointTrajectoryPoint_.idl. 
*
* This file was automatically generated from MultiDOFJointTrajectoryPoint_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit MultiDOFJointTrajectoryPoint_.idl instead.
*
*/
public class MultiDOFJointTrajectoryPoint
{
    public MultiDOFJointTrajectoryPoint()
    {
        	transforms_ = new us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Transform> (100, geometry_msgs.msg.dds.Transform.class, new geometry_msgs.msg.dds.TransformPubSubType());

        	velocities_ = new us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Twist> (100, geometry_msgs.msg.dds.Twist.class, new geometry_msgs.msg.dds.TwistPubSubType());

        	accelerations_ = new us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Twist> (100, geometry_msgs.msg.dds.Twist.class, new geometry_msgs.msg.dds.TwistPubSubType());

        	time_from_start_ = new builtin_interfaces.msg.dds.Duration();
        
        
    }

    public void set(MultiDOFJointTrajectoryPoint other)
    {
            transforms_.set(other.transforms_);	velocities_.set(other.velocities_);	accelerations_.set(other.accelerations_);	builtin_interfaces.msg.dds.DurationPubSubType.staticCopy(other.time_from_start_, time_from_start_);
    }


    public us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Transform>  getTransforms()
    {
        return transforms_;
    }

        

    public us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Twist>  getVelocities()
    {
        return velocities_;
    }

        

    public us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Twist>  getAccelerations()
    {
        return accelerations_;
    }

        

    public builtin_interfaces.msg.dds.Duration getTime_from_start()
    {
        return time_from_start_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof MultiDOFJointTrajectoryPoint)) return false;
        MultiDOFJointTrajectoryPoint otherMyClass = (MultiDOFJointTrajectoryPoint)other;
        boolean returnedValue = true;

        returnedValue &= this.transforms_.equals(otherMyClass.transforms_);
                
        returnedValue &= this.velocities_.equals(otherMyClass.velocities_);
                
        returnedValue &= this.accelerations_.equals(otherMyClass.accelerations_);
                
        returnedValue &= this.time_from_start_.equals(otherMyClass.time_from_start_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("MultiDOFJointTrajectoryPoint {");
        builder.append("transforms=");
        builder.append(this.transforms_);

                builder.append(", ");
        builder.append("velocities=");
        builder.append(this.velocities_);

                builder.append(", ");
        builder.append("accelerations=");
        builder.append(this.accelerations_);

                builder.append(", ");
        builder.append("time_from_start=");
        builder.append(this.time_from_start_);

                
        builder.append("}");
		return builder.toString();
    }

    private us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Transform>  transforms_; 
    private us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Twist>  velocities_; 
    private us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Twist>  accelerations_; 
    private builtin_interfaces.msg.dds.Duration time_from_start_; 

}