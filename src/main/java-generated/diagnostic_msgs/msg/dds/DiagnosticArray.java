package diagnostic_msgs.msg.dds;
/**
* 
* Definition of the class "DiagnosticArray" defined in DiagnosticArray_.idl. 
*
* This file was automatically generated from DiagnosticArray_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DiagnosticArray_.idl instead.
*
*/
public class DiagnosticArray
{
    public DiagnosticArray()
    {
        	header_ = new std_msgs.msg.dds.Header();status_ = new us.ihmc.idl.IDLSequence.Object<diagnostic_msgs.msg.dds.DiagnosticStatus> (100, diagnostic_msgs.msg.dds.DiagnosticStatus.class, new diagnostic_msgs.msg.dds.DiagnosticStatusPubSubType());


        
        
    }

    public void set(DiagnosticArray other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);status_.set(other.status_);	
    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        

    public us.ihmc.idl.IDLSequence.Object<diagnostic_msgs.msg.dds.DiagnosticStatus>  getStatus()
    {
        return status_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof DiagnosticArray)) return false;
        DiagnosticArray otherMyClass = (DiagnosticArray)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.status_.equals(otherMyClass.status_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("DiagnosticArray {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("status=");
        builder.append(this.status_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private us.ihmc.idl.IDLSequence.Object<diagnostic_msgs.msg.dds.DiagnosticStatus>  status_; 

}