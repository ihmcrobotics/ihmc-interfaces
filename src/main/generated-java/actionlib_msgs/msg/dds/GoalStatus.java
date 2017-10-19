package actionlib_msgs.msg.dds;
/**
* 
* Definition of the class "GoalStatus" defined in GoalStatus_.idl. 
*
* This file was automatically generated from GoalStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit GoalStatus_.idl instead.
*
*/
public class GoalStatus
{
    public GoalStatus()
    {
        	goal_id_ = new actionlib_msgs.msg.dds.GoalID();text_ = new java.lang.StringBuilder(255); 
        
        
    }

    public void set(GoalStatus other)
    {
           	actionlib_msgs.msg.dds.GoalIDPubSubType.staticCopy(other.goal_id_, goal_id_);status_ = other.status_;
        	text_.setLength(0);
        	text_.append(other.text_);

    }


    public actionlib_msgs.msg.dds.GoalID getGoal_id()
    {
        return goal_id_;
    }

        
    public void setStatus(byte status)
    {
        status_ = status;
    }

    public byte getStatus()
    {
        return status_;
    }

        
        public void setText(String text)
        {
        	text_.setLength(0);
        	text_.append(text);
        }
        
        public java.lang.String getTextAsString()
        {
        	return getText().toString();
        }

    public java.lang.StringBuilder getText()
    {
        return text_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof GoalStatus)) return false;
        GoalStatus otherMyClass = (GoalStatus)other;
        boolean returnedValue = true;

        returnedValue &= this.goal_id_.equals(otherMyClass.goal_id_);
                
        returnedValue &= this.status_ == otherMyClass.status_;

                
        returnedValue &= us.ihmc.idl.IDLTools.equals(this.text_, otherMyClass.text_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("GoalStatus {");
        builder.append("goal_id=");
        builder.append(this.goal_id_);

                builder.append(", ");
        builder.append("status=");
        builder.append(this.status_);

                builder.append(", ");
        builder.append("text=");
        builder.append(this.text_);

                
        builder.append("}");
		return builder.toString();
    }

    private actionlib_msgs.msg.dds.GoalID goal_id_; 
    private byte status_; 
    private java.lang.StringBuilder text_; 

}