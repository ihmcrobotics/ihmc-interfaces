package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "Transform" defined in Transform_.idl. 
*
* This file was automatically generated from Transform_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Transform_.idl instead.
*
*/
public class Transform
{
    public Transform()
    {
        	translation_ = new geometry_msgs.msg.dds.Vector3();rotation_ = new geometry_msgs.msg.dds.Quaternion();        
        
    }

    public void set(Transform other)
    {
           	geometry_msgs.msg.dds.Vector3PubSubType.staticCopy(other.translation_, translation_);geometry_msgs.msg.dds.QuaternionPubSubType.staticCopy(other.rotation_, rotation_);    }


    public geometry_msgs.msg.dds.Vector3 getTranslation()
    {
        return translation_;
    }

        

    public geometry_msgs.msg.dds.Quaternion getRotation()
    {
        return rotation_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Transform)) return false;
        Transform otherMyClass = (Transform)other;
        boolean returnedValue = true;

        returnedValue &= this.translation_.equals(otherMyClass.translation_);
                
        returnedValue &= this.rotation_.equals(otherMyClass.rotation_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Transform {");
        builder.append("translation=");
        builder.append(this.translation_);

                builder.append(", ");
        builder.append("rotation=");
        builder.append(this.rotation_);

                
        builder.append("}");
		return builder.toString();
    }

    private geometry_msgs.msg.dds.Vector3 translation_; 
    private geometry_msgs.msg.dds.Quaternion rotation_; 

}