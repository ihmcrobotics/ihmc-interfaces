package sensor_msgs.msg.dds;
/**
* 
* Definition of the class "RegionOfInterest" defined in RegionOfInterest_.idl. 
*
* This file was automatically generated from RegionOfInterest_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RegionOfInterest_.idl instead.
*
*/
public class RegionOfInterest
{
    public RegionOfInterest()
    {
        
        
    }

    public void set(RegionOfInterest other)
    {
        	x_offset_ = other.x_offset_;
        	y_offset_ = other.y_offset_;
        	height_ = other.height_;
        	width_ = other.width_;
        	do_rectify_ = other.do_rectify_;

    }

    public void setX_offset(long x_offset)
    {
        x_offset_ = x_offset;
    }

    public long getX_offset()
    {
        return x_offset_;
    }

        
    public void setY_offset(long y_offset)
    {
        y_offset_ = y_offset;
    }

    public long getY_offset()
    {
        return y_offset_;
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

        
    public void setDo_rectify(boolean do_rectify)
    {
        do_rectify_ = do_rectify;
    }

    public boolean getDo_rectify()
    {
        return do_rectify_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof RegionOfInterest)) return false;
        RegionOfInterest otherMyClass = (RegionOfInterest)other;
        boolean returnedValue = true;

        returnedValue &= this.x_offset_ == otherMyClass.x_offset_;

                
        returnedValue &= this.y_offset_ == otherMyClass.y_offset_;

                
        returnedValue &= this.height_ == otherMyClass.height_;

                
        returnedValue &= this.width_ == otherMyClass.width_;

                
        returnedValue &= this.do_rectify_ == otherMyClass.do_rectify_;

                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("RegionOfInterest {");
        builder.append("x_offset=");
        builder.append(this.x_offset_);

                builder.append(", ");
        builder.append("y_offset=");
        builder.append(this.y_offset_);

                builder.append(", ");
        builder.append("height=");
        builder.append(this.height_);

                builder.append(", ");
        builder.append("width=");
        builder.append(this.width_);

                builder.append(", ");
        builder.append("do_rectify=");
        builder.append(this.do_rectify_);

                
        builder.append("}");
		return builder.toString();
    }

    private long x_offset_; 
    private long y_offset_; 
    private long height_; 
    private long width_; 
    private boolean do_rectify_; 

}