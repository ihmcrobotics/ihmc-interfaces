package diagnostic_msgs.msg.dds;

/**
 *
 * Definition of the class "DiagnosticStatus" defined in DiagnosticStatus_.idl.
 *
 * This file was automatically generated from DiagnosticStatus_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit DiagnosticStatus_.idl instead.
 *
 */
public class DiagnosticStatus
{
   private byte level_;
   private java.lang.StringBuilder name_;
   private java.lang.StringBuilder message_;
   private java.lang.StringBuilder hardware_id_;
   private us.ihmc.idl.IDLSequence.Object<diagnostic_msgs.msg.dds.KeyValue> values_;

   public DiagnosticStatus()
   {
      name_ = new java.lang.StringBuilder(255);
      message_ = new java.lang.StringBuilder(255);
      hardware_id_ = new java.lang.StringBuilder(255);
      values_ = new us.ihmc.idl.IDLSequence.Object<diagnostic_msgs.msg.dds.KeyValue>(100, diagnostic_msgs.msg.dds.KeyValue.class,
                                                                                     new diagnostic_msgs.msg.dds.KeyValuePubSubType());

   }

   public void set(DiagnosticStatus other)
   {
      level_ = other.level_;
      name_.setLength(0);
      name_.append(other.name_);
      message_.setLength(0);
      message_.append(other.message_);
      hardware_id_.setLength(0);
      hardware_id_.append(other.hardware_id_);
      values_.set(other.values_);
   }

   public byte getLevel()
   {
      return level_;
   }

   public void setLevel(byte level)
   {
      level_ = level;
   }

   public java.lang.String getNameAsString()
   {
      return getName().toString();
   }

   public java.lang.StringBuilder getName()
   {
      return name_;
   }

   public void setName(String name)
   {
      name_.setLength(0);
      name_.append(name);
   }

   public java.lang.String getMessageAsString()
   {
      return getMessage().toString();
   }

   public java.lang.StringBuilder getMessage()
   {
      return message_;
   }

   public void setMessage(String message)
   {
      message_.setLength(0);
      message_.append(message);
   }

   public java.lang.String getHardware_idAsString()
   {
      return getHardware_id().toString();
   }

   public java.lang.StringBuilder getHardware_id()
   {
      return hardware_id_;
   }

   public void setHardware_id(String hardware_id)
   {
      hardware_id_.setLength(0);
      hardware_id_.append(hardware_id);
   }

   public us.ihmc.idl.IDLSequence.Object<diagnostic_msgs.msg.dds.KeyValue> getValues()
   {
      return values_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof DiagnosticStatus))
         return false;
      DiagnosticStatus otherMyClass = (DiagnosticStatus) other;
      boolean returnedValue = true;

      returnedValue &= this.level_ == otherMyClass.level_;

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.name_, otherMyClass.name_);

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.message_, otherMyClass.message_);

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.hardware_id_, otherMyClass.hardware_id_);

      returnedValue &= this.values_.equals(otherMyClass.values_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("DiagnosticStatus {");
      builder.append("level=");
      builder.append(this.level_);

      builder.append(", ");
      builder.append("name=");
      builder.append(this.name_);

      builder.append(", ");
      builder.append("message=");
      builder.append(this.message_);

      builder.append(", ");
      builder.append("hardware_id=");
      builder.append(this.hardware_id_);

      builder.append(", ");
      builder.append("values=");
      builder.append(this.values_);

      builder.append("}");
      return builder.toString();
   }

}