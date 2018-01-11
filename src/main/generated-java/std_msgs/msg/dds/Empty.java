package std_msgs.msg.dds;

/**
 *
 * Definition of the class "Empty" defined in Empty_.idl.
 *
 * This file was automatically generated from Empty_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Empty_.idl instead.
 *
 */
public class Empty
{
   public Empty()
   {

   }

   public void set(Empty other)
   {
      _dummy_ = other._dummy_;

   }

   public void set_dummy(boolean _dummy)
   {
      _dummy_ = _dummy;
   }

   public boolean get_dummy()
   {
      return _dummy_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof Empty))
         return false;
      Empty otherMyClass = (Empty) other;
      boolean returnedValue = true;

      returnedValue &= this._dummy_ == otherMyClass._dummy_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Empty {");
      builder.append("_dummy=");
      builder.append(this._dummy_);

      builder.append("}");
      return builder.toString();
   }

   private boolean _dummy_;

}