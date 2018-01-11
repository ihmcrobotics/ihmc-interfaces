package shape_msgs.msg.dds;

/**
 *
 * Definition of the class "MeshTriangle" defined in MeshTriangle_.idl.
 *
 * This file was automatically generated from MeshTriangle_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit MeshTriangle_.idl instead.
 *
 */
public class MeshTriangle
{
   private long[] vertex_indices_;

   public MeshTriangle()
   {
      vertex_indices_ = new long[3];

   }

   public void set(MeshTriangle other)
   {
      for (int b = 0; b < vertex_indices_.length; ++b)
      {
         vertex_indices_[b] = other.vertex_indices_[b];

      }

   }

   public long[] getVertex_indices()
   {
      return vertex_indices_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof MeshTriangle))
         return false;
      MeshTriangle otherMyClass = (MeshTriangle) other;
      boolean returnedValue = true;

      for (int d = 0; d < vertex_indices_.length; ++d)
      {
         returnedValue &= this.vertex_indices_[d] == otherMyClass.vertex_indices_[d];

      }

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("MeshTriangle {");
      builder.append("vertex_indices=");
      builder.append(java.util.Arrays.toString(this.vertex_indices_));

      builder.append("}");
      return builder.toString();
   }

}