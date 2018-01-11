package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "JoyFeedbackArray" defined in JoyFeedbackArray_.idl.
 *
 * This file was automatically generated from JoyFeedbackArray_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit JoyFeedbackArray_.idl instead.
 *
 */
public class JoyFeedbackArray
{
   private us.ihmc.idl.IDLSequence.Object<sensor_msgs.msg.dds.JoyFeedback> array_;

   public JoyFeedbackArray()
   {
      array_ = new us.ihmc.idl.IDLSequence.Object<sensor_msgs.msg.dds.JoyFeedback>(100, sensor_msgs.msg.dds.JoyFeedback.class,
                                                                                   new sensor_msgs.msg.dds.JoyFeedbackPubSubType());

   }

   public void set(JoyFeedbackArray other)
   {
      array_.set(other.array_);
   }

   public us.ihmc.idl.IDLSequence.Object<sensor_msgs.msg.dds.JoyFeedback> getArray()
   {
      return array_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof JoyFeedbackArray))
         return false;
      JoyFeedbackArray otherMyClass = (JoyFeedbackArray) other;
      boolean returnedValue = true;

      returnedValue &= this.array_.equals(otherMyClass.array_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("JoyFeedbackArray {");
      builder.append("array=");
      builder.append(this.array_);

      builder.append("}");
      return builder.toString();
   }

}