package geometry_msgs.msg.dds;

/**
 *
 * Definition of the class "Accel" defined in Accel_.idl.
 *
 * This file was automatically generated from Accel_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Accel_.idl instead.
 *
 */
public class Accel
{
   private us.ihmc.euclid.tuple3D.Vector3D linear_;
   private us.ihmc.euclid.tuple3D.Vector3D angular_;

   public Accel()
   {
      linear_ = new us.ihmc.euclid.tuple3D.Vector3D();
      angular_ = new us.ihmc.euclid.tuple3D.Vector3D();

   }

   public void set(Accel other)
   {
      geometry_msgs.msg.dds.Vector3PubSubType.staticCopy(other.linear_, linear_);
      geometry_msgs.msg.dds.Vector3PubSubType.staticCopy(other.angular_, angular_);
   }

   public us.ihmc.euclid.tuple3D.Vector3D getLinear()
   {
      return linear_;
   }

   public us.ihmc.euclid.tuple3D.Vector3D getAngular()
   {
      return angular_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof Accel))
         return false;
      Accel otherMyClass = (Accel) other;
      boolean returnedValue = true;

      returnedValue &= this.linear_.equals(otherMyClass.linear_);

      returnedValue &= this.angular_.equals(otherMyClass.angular_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Accel {");
      builder.append("linear=");
      builder.append(this.linear_);

      builder.append(", ");
      builder.append("angular=");
      builder.append(this.angular_);

      builder.append("}");
      return builder.toString();
   }

}