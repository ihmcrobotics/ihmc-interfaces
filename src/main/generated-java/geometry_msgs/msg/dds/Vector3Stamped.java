package geometry_msgs.msg.dds;

/**
 *
 * Definition of the class "Vector3Stamped" defined in Vector3Stamped_.idl.
 *
 * This file was automatically generated from Vector3Stamped_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Vector3Stamped_.idl instead.
 *
 */
public class Vector3Stamped
{
   public Vector3Stamped()
   {
      header_ = new std_msgs.msg.dds.Header();
      vector_ = new us.ihmc.euclid.tuple3D.Vector3D();

   }

   public void set(Vector3Stamped other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      geometry_msgs.msg.dds.Vector3PubSubType.staticCopy(other.vector_, vector_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public us.ihmc.euclid.tuple3D.Vector3D getVector()
   {
      return vector_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof Vector3Stamped))
         return false;
      Vector3Stamped otherMyClass = (Vector3Stamped) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.vector_.equals(otherMyClass.vector_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Vector3Stamped {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("vector=");
      builder.append(this.vector_);

      builder.append("}");
      return builder.toString();
   }

   private std_msgs.msg.dds.Header header_;
   private us.ihmc.euclid.tuple3D.Vector3D vector_;

}