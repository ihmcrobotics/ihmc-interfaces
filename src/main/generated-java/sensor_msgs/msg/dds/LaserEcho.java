package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "LaserEcho" defined in LaserEcho_.idl.
 *
 * This file was automatically generated from LaserEcho_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit LaserEcho_.idl instead.
 *
 */
public class LaserEcho
{
   private us.ihmc.idl.IDLSequence.Float echoes_;

   public LaserEcho()
   {
      echoes_ = new us.ihmc.idl.IDLSequence.Float(100, "type_5");
   }

   public void set(LaserEcho other)
   {
      echoes_.set(other.echoes_);
   }

   public us.ihmc.idl.IDLSequence.Float getEchoes()
   {
      return echoes_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof LaserEcho))
         return false;
      LaserEcho otherMyClass = (LaserEcho) other;
      boolean returnedValue = true;

      returnedValue &= this.echoes_.equals(otherMyClass.echoes_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("LaserEcho {");
      builder.append("echoes=");
      builder.append(this.echoes_);

      builder.append("}");
      return builder.toString();
   }
}