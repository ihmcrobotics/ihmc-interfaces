package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "JoyFeedback" defined in JoyFeedback_.idl.
 *
 * This file was automatically generated from JoyFeedback_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit JoyFeedback_.idl instead.
 *
 */
public class JoyFeedback
{
   private byte type_;
   private byte id_;
   private float intensity_;

   public JoyFeedback()
   {

   }

   public void set(JoyFeedback other)
   {
      type_ = other.type_;
      id_ = other.id_;
      intensity_ = other.intensity_;

   }

   public byte getType()
   {
      return type_;
   }

   public void setType(byte type)
   {
      type_ = type;
   }

   public byte getId()
   {
      return id_;
   }

   public void setId(byte id)
   {
      id_ = id;
   }

   public float getIntensity()
   {
      return intensity_;
   }

   public void setIntensity(float intensity)
   {
      intensity_ = intensity;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof JoyFeedback))
         return false;
      JoyFeedback otherMyClass = (JoyFeedback) other;
      boolean returnedValue = true;

      returnedValue &= this.type_ == otherMyClass.type_;

      returnedValue &= this.id_ == otherMyClass.id_;

      returnedValue &= this.intensity_ == otherMyClass.intensity_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("JoyFeedback {");
      builder.append("type=");
      builder.append(this.type_);

      builder.append(", ");
      builder.append("id=");
      builder.append(this.id_);

      builder.append(", ");
      builder.append("intensity=");
      builder.append(this.intensity_);

      builder.append("}");
      return builder.toString();
   }

}