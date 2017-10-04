package shape_msgs.msg.dds;
/**
* 
* Definition of the class "Mesh" defined in Mesh_.idl. 
*
* This file was automatically generated from Mesh_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Mesh_.idl instead.
*
*/
public class Mesh
{
    public Mesh()
    {
        	triangles_ = new us.ihmc.idl.IDLSequence.Object<shape_msgs.msg.dds.MeshTriangle> (100, shape_msgs.msg.dds.MeshTriangle.class, new shape_msgs.msg.dds.MeshTrianglePubSubType());

        	vertices_ = new us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Point> (100, geometry_msgs.msg.dds.Point.class, new geometry_msgs.msg.dds.PointPubSubType());


        
        
    }

    public void set(Mesh other)
    {
            triangles_.set(other.triangles_);	vertices_.set(other.vertices_);	
    }


    public us.ihmc.idl.IDLSequence.Object<shape_msgs.msg.dds.MeshTriangle>  getTriangles()
    {
        return triangles_;
    }

        

    public us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Point>  getVertices()
    {
        return vertices_;
    }

        




    @Override
    public boolean equals(java.lang.Object other)
    {
        if(other == null) return false;
        if(other == this) return true;
        if(!(other instanceof Mesh)) return false;
        Mesh otherMyClass = (Mesh)other;
        boolean returnedValue = true;

        returnedValue &= this.triangles_.equals(otherMyClass.triangles_);
                
        returnedValue &= this.vertices_.equals(otherMyClass.vertices_);
                

        return returnedValue;
    }
    
     @Override
    public java.lang.String toString()
    {
		StringBuilder builder = new StringBuilder();
		
      	builder.append("Mesh {");
        builder.append("triangles=");
        builder.append(this.triangles_);

                builder.append(", ");
        builder.append("vertices=");
        builder.append(this.vertices_);

                
        builder.append("}");
		return builder.toString();
    }

    private us.ihmc.idl.IDLSequence.Object<shape_msgs.msg.dds.MeshTriangle>  triangles_; 
    private us.ihmc.idl.IDLSequence.Object<geometry_msgs.msg.dds.Point>  vertices_; 

}