package sensor_msgs.msg.dds;
/**
* 
* Definition of the class "CameraInfo" defined in CameraInfo_.idl. 
*
* This file was automatically generated from CameraInfo_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit CameraInfo_.idl instead.
*
*/
public class CameraInfo
{
    public CameraInfo()
    {
        	header_ = new std_msgs.msg.dds.Header();distortion_model_ = new java.lang.StringBuilder(255); 
        	d_ = new us.ihmc.idl.IDLSequence.Double (100, "type_6");
        	k_ = new double[9];
        	r_ = new double[9];
        	p_ = new double[12];
        	roi_ = new sensor_msgs.msg.dds.RegionOfInterest();        
        
    }

    public void set(CameraInfo other)
    {
           	std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);height_ = other.height_;
        	width_ = other.width_;
        	distortion_model_.setLength(0);
        	distortion_model_.append(other.distortion_model_);
            d_.set(other.d_);	for(int b = 0; b < k_.length; ++b)
        	{
        	    	k_[b] = other.k_[b];	

        	}
        	
        	for(int d = 0; d < r_.length; ++d)
        	{
        	    	r_[d] = other.r_[d];	

        	}
        	
        	for(int f = 0; f < p_.length; ++f)
        	{
        	    	p_[f] = other.p_[f];	

        	}
        	
        	binning_x_ = other.binning_x_;
        	binning_y_ = other.binning_y_;
           	sensor_msgs.msg.dds.RegionOfInterestPubSubType.staticCopy(other.roi_, roi_);
    }


    public std_msgs.msg.dds.Header getHeader()
    {
        return header_;
    }

        
    public void setHeight(long height)
    {
        height_ = height;
    }

    public long getHeight()
    {
        return height_;
    }

        
    public void setWidth(long width)
    {
        width_ = width;
    }

    public long getWidth()
    {
        return width_;
    }

        
        public void setDistortion_model(String distortion_model)
        {
        	distortion_model_.setLength(0);
        	distortion_model_.append(distortion_model);
        }
        
        public java.lang.String getDistortion_modelAsString()
        {
        	return getDistortion_model().toString();
        }

    public java.lang.StringBuilder getDistortion_model()
    {
        return distortion_model_;
    }

        

    public us.ihmc.idl.IDLSequence.Double  getD()
    {
        return d_;
    }

        

    public double[] getK()
    {
        return k_;
    }

        

    public double[] getR()
    {
        return r_;
    }

        

    public double[] getP()
    {
        return p_;
    }

        
    public void setBinning_x(long binning_x)
    {
        binning_x_ = binning_x;
    }

    public long getBinning_x()
    {
        return binning_x_;
    }

        
    public void setBinning_y(long binning_y)
    {
        binning_y_ = binning_y;
    }

    public long getBinning_y()
    {
        return binning_y_;
    }

        

    public sensor_msgs.msg.dds.RegionOfInterest getRoi()
    {
        return roi_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof CameraInfo)) return false;
        CameraInfo otherMyClass = (CameraInfo)other;
        boolean returnedValue = true;

        returnedValue &= this.header_.equals(otherMyClass.header_);
                
        returnedValue &= this.height_ == otherMyClass.height_;

                
        returnedValue &= this.width_ == otherMyClass.width_;

                
        returnedValue &= us.ihmc.idl.IDLTools.equals(this.distortion_model_, otherMyClass.distortion_model_);
                
        returnedValue &= this.d_.equals(otherMyClass.d_);
                
                	for(int h = 0; h < k_.length; ++h)
                	{
                	    returnedValue &= this.k_[h] == otherMyClass.k_[h];

                	}        
                	for(int j = 0; j < r_.length; ++j)
                	{
                	    returnedValue &= this.r_[j] == otherMyClass.r_[j];

                	}        
                	for(int l = 0; l < p_.length; ++l)
                	{
                	    returnedValue &= this.p_[l] == otherMyClass.p_[l];

                	}        
        returnedValue &= this.binning_x_ == otherMyClass.binning_x_;

                
        returnedValue &= this.binning_y_ == otherMyClass.binning_y_;

                
        returnedValue &= this.roi_.equals(otherMyClass.roi_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("CameraInfo {");
        builder.append("header=");
        builder.append(this.header_);

                builder.append(", ");
        builder.append("height=");
        builder.append(this.height_);

                builder.append(", ");
        builder.append("width=");
        builder.append(this.width_);

                builder.append(", ");
        builder.append("distortion_model=");
        builder.append(this.distortion_model_);

                builder.append(", ");
        builder.append("d=");
        builder.append(this.d_);

                builder.append(", ");
        builder.append("k=");
        builder.append(java.util.Arrays.toString(this.k_));

                builder.append(", ");
        builder.append("r=");
        builder.append(java.util.Arrays.toString(this.r_));

                builder.append(", ");
        builder.append("p=");
        builder.append(java.util.Arrays.toString(this.p_));

                builder.append(", ");
        builder.append("binning_x=");
        builder.append(this.binning_x_);

                builder.append(", ");
        builder.append("binning_y=");
        builder.append(this.binning_y_);

                builder.append(", ");
        builder.append("roi=");
        builder.append(this.roi_);

                
        builder.append("}");
		return builder.toString();
    }

    private std_msgs.msg.dds.Header header_; 
    private long height_; 
    private long width_; 
    private java.lang.StringBuilder distortion_model_; 
    private us.ihmc.idl.IDLSequence.Double  d_; 
    private double[] k_; 
    private double[] r_; 
    private double[] p_; 
    private long binning_x_; 
    private long binning_y_; 
    private sensor_msgs.msg.dds.RegionOfInterest roi_; 

}