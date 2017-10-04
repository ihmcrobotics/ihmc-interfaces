package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "Wrench" defined in Wrench_.idl. 
*
* This file was automatically generated from Wrench_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Wrench_.idl instead.
*
*/
public class Wrench
{
    public Wrench()
    {
        	force_ = new geometry_msgs.msg.dds.Vector3();torque_ = new geometry_msgs.msg.dds.Vector3();        
        
    }

    public void set(Wrench other)
    {
           	geometry_msgs.msg.dds.Vector3PubSubType.staticCopy(other.force_, force_);geometry_msgs.msg.dds.Vector3PubSubType.staticCopy(other.torque_, torque_);    }


    public geometry_msgs.msg.dds.Vector3 getForce()
    {
        return force_;
    }

        

    public geometry_msgs.msg.dds.Vector3 getTorque()
    {
        return torque_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Wrench)) return false;
        Wrench otherMyClass = (Wrench)other;
        boolean returnedValue = true;

        returnedValue &= this.force_.equals(otherMyClass.force_);
                
        returnedValue &= this.torque_.equals(otherMyClass.torque_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Wrench {");
        builder.append("force=");
        builder.append(this.force_);

                builder.append(", ");
        builder.append("torque=");
        builder.append(this.torque_);

                
        builder.append("}");
		return builder.toString();
    }

    private geometry_msgs.msg.dds.Vector3 force_; 
    private geometry_msgs.msg.dds.Vector3 torque_; 

}