package sensor_msgs.msg.dds;
/**
* 
* Definition of the class "NavSatFix" defined in NavSatFix_.idl. 
*
* This file was automatically generated from NavSatFix_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit NavSatFix_.idl instead.
*
*/
public class NavSatFix
{
    public NavSatFix()
    {
        	header_ = new std_msgs.msg.dds.Header();status_ = new sensor_msgs.msg.dds.NavSatStatus();position_covariance_ = new double[9];
        
        
    }

    public void set(NavSatFix other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);sensor_msgs.msg.dds.NavSatStatusPubSubType.staticCopy(other.status_, status_);latitude_ = other.latitude_;
        	longitude_ = other.longitude_;
        	altitude_ = other.altitude_;
        	for(int b = 0; b < position_covariance_.length; ++b)
        	{
        	    	position_covariance_[b] = other.position_covariance_[b];	

        	}
        	
        	position_covariance_type_ = other.position_covariance_type_;

    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        

    public sensor_msgs.msg.dds.NavSatStatus getStatus()
    {
        return status_;
    }

        
    public void setLatitude(double latitude)
    {
        latitude_ = latitude;
    }

    public double getLatitude()
    {
        return latitude_;
    }

        
    public void setLongitude(double longitude)
    {
        longitude_ = longitude;
    }

    public double getLongitude()
    {
        return longitude_;
    }

        
    public void setAltitude(double altitude)
    {
        altitude_ = altitude;
    }

    public double getAltitude()
    {
        return altitude_;
    }

        

    public double[] getPosition_covariance()
    {
        return position_covariance_;
    }

        
    public void setPosition_covariance_type(byte position_covariance_type)
    {
        position_covariance_type_ = position_covariance_type;
    }

    public byte getPosition_covariance_type()
    {
        return position_covariance_type_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof NavSatFix)) return false;
        NavSatFix otherMyClass = (NavSatFix)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.status_.equals(otherMyClass.status_);
                
        returnedValue &= this.latitude_ == otherMyClass.latitude_;

                
        returnedValue &= this.longitude_ == otherMyClass.longitude_;

                
        returnedValue &= this.altitude_ == otherMyClass.altitude_;

                
                	for(int d = 0; d < position_covariance_.length; ++d)
                	{
                	    returnedValue &= this.position_covariance_[d] == otherMyClass.position_covariance_[d];

                	}        
        returnedValue &= this.position_covariance_type_ == otherMyClass.position_covariance_type_;

                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("NavSatFix {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("status=");
        builder.append(this.status_);

                builder.append(", ");
        builder.append("latitude=");
        builder.append(this.latitude_);

                builder.append(", ");
        builder.append("longitude=");
        builder.append(this.longitude_);

                builder.append(", ");
        builder.append("altitude=");
        builder.append(this.altitude_);

                builder.append(", ");
        builder.append("position_covariance=");
        builder.append(java.util.Arrays.toString(this.position_covariance_));

                builder.append(", ");
        builder.append("position_covariance_type=");
        builder.append(this.position_covariance_type_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private sensor_msgs.msg.dds.NavSatStatus status_; 
    private double latitude_; 
    private double longitude_; 
    private double altitude_; 
    private double[] position_covariance_; 
    private byte position_covariance_type_; 

}