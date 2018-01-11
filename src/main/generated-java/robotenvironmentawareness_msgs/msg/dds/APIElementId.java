package robotenvironmentawareness_msgs.msg.dds;

/**
 *
 * Definition of the class "APIElementId" defined in APIElementId_.idl.
 *
 * This file was automatically generated from APIElementId_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit APIElementId_.idl instead.
 *
 */
public class APIElementId
{
   public APIElementId()
   {
      id_ = new us.ihmc.idl.IDLSequence.Long(100, "type_4");

   }

   public void set(APIElementId other)
   {
      id_.set(other.id_);
   }

   public us.ihmc.idl.IDLSequence.Long getId()
   {
      return id_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof APIElementId))
         return false;
      APIElementId otherMyClass = (APIElementId) other;
      boolean returnedValue = true;

      returnedValue &= this.id_.equals(otherMyClass.id_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("APIElementId {");
      builder.append("id=");
      builder.append(this.id_);

      builder.append("}");
      return builder.toString();
   }

   private us.ihmc.idl.IDLSequence.Long id_;

}