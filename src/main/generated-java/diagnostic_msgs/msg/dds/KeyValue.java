package diagnostic_msgs.msg.dds;

/**
 *
 * Definition of the class "KeyValue" defined in KeyValue_.idl.
 *
 * This file was automatically generated from KeyValue_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit KeyValue_.idl instead.
 *
 */
public class KeyValue
{
   public KeyValue()
   {
      key_ = new java.lang.StringBuilder(255);
      value_ = new java.lang.StringBuilder(255);

   }

   public void set(KeyValue other)
   {
      key_.setLength(0);
      key_.append(other.key_);
      value_.setLength(0);
      value_.append(other.value_);
   }

   public void setKey(String key)
   {
      key_.setLength(0);
      key_.append(key);
   }

   public java.lang.String getKeyAsString()
   {
      return getKey().toString();
   }

   public java.lang.StringBuilder getKey()
   {
      return key_;
   }

   public void setValue(String value)
   {
      value_.setLength(0);
      value_.append(value);
   }

   public java.lang.String getValueAsString()
   {
      return getValue().toString();
   }

   public java.lang.StringBuilder getValue()
   {
      return value_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof KeyValue))
         return false;
      KeyValue otherMyClass = (KeyValue) other;
      boolean returnedValue = true;

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.key_, otherMyClass.key_);

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.value_, otherMyClass.value_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("KeyValue {");
      builder.append("key=");
      builder.append(this.key_);

      builder.append(", ");
      builder.append("value=");
      builder.append(this.value_);

      builder.append("}");
      return builder.toString();
   }

   private java.lang.StringBuilder key_;
   private java.lang.StringBuilder value_;

}