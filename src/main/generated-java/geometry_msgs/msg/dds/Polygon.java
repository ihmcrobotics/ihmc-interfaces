package geometry_msgs.msg.dds;
/**
* 
* Definition of the class "Polygon" defined in Polygon_.idl. 
*
* This file was automatically generated from Polygon_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Polygon_.idl instead.
*
*/
public class Polygon
{
    public Polygon()
    {
        	points_ = new us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.tuple3D.Point3D32> (100, us.ihmc.euclid.tuple3D.Point3D32.class, new geometry_msgs.msg.dds.Point32PubSubType());


        
        
    }

    public void set(Polygon other)
    {
            points_.set(other.points_);	
    }


    public us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.tuple3D.Point3D32>  getPoints()
    {
        return points_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Polygon)) return false;
        Polygon otherMyClass = (Polygon)other;
        boolean returnedValue = true;

        returnedValue &= this.points_.equals(otherMyClass.points_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Polygon {");
        builder.append("points=");
        builder.append(this.points_);

                
        builder.append("}");
		return builder.toString();
    }

    private us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.tuple3D.Point3D32>  points_; 

}