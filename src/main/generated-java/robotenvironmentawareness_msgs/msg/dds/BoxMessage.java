package robotenvironmentawareness_msgs.msg.dds;

/**
 *
 * Definition of the class "BoxMessage" defined in BoxMessage_.idl.
 *
 * This file was automatically generated from BoxMessage_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit BoxMessage_.idl instead.
 *
 */
public class BoxMessage
{
   public BoxMessage()
   {
      some_vector_ = new us.ihmc.euclid.tuple3D.Vector3D();

   }

   public void set(BoxMessage other)
   {
      is_empty_ = other.is_empty_;
      geometry_msgs.msg.dds.Vector3PubSubType.staticCopy(other.some_vector_, some_vector_);
   }

   public void setIs_empty(boolean is_empty)
   {
      is_empty_ = is_empty;
   }

   public boolean getIs_empty()
   {
      return is_empty_;
   }

   public us.ihmc.euclid.tuple3D.Vector3D getSome_vector()
   {
      return some_vector_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof BoxMessage))
         return false;
      BoxMessage otherMyClass = (BoxMessage) other;
      boolean returnedValue = true;

      returnedValue &= this.is_empty_ == otherMyClass.is_empty_;

      returnedValue &= this.some_vector_.equals(otherMyClass.some_vector_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("BoxMessage {");
      builder.append("is_empty=");
      builder.append(this.is_empty_);

      builder.append(", ");
      builder.append("some_vector=");
      builder.append(this.some_vector_);

      builder.append("}");
      return builder.toString();
   }

   private boolean is_empty_;
   private us.ihmc.euclid.tuple3D.Vector3D some_vector_;

}