package std_msgs.msg.dds;

/**
 *
 * Definition of the class "Header" defined in Header_.idl.
 *
 * This file was automatically generated from Header_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Header_.idl instead.
 *
 */
public class Header
{
   private builtin_interfaces.msg.dds.Time stamp_;
   private java.lang.StringBuilder frame_id_;

   public Header()
   {
      stamp_ = new builtin_interfaces.msg.dds.Time();
      frame_id_ = new java.lang.StringBuilder(255);
   }

   public void set(Header other)
   {
      builtin_interfaces.msg.dds.TimePubSubType.staticCopy(other.stamp_, stamp_);
      frame_id_.setLength(0);
      frame_id_.append(other.frame_id_);
   }

   public builtin_interfaces.msg.dds.Time getStamp()
   {
      return stamp_;
   }

   public java.lang.String getFrame_idAsString()
   {
      return getFrame_id().toString();
   }

   public java.lang.StringBuilder getFrame_id()
   {
      return frame_id_;
   }

   public void setFrame_id(String frame_id)
   {
      frame_id_.setLength(0);
      frame_id_.append(frame_id);
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof Header))
         return false;
      Header otherMyClass = (Header) other;
      boolean returnedValue = true;

      returnedValue &= this.stamp_.equals(otherMyClass.stamp_);

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.frame_id_, otherMyClass.frame_id_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Header {");
      builder.append("stamp=");
      builder.append(this.stamp_);

      builder.append(", ");
      builder.append("frame_id=");
      builder.append(this.frame_id_);

      builder.append("}");
      return builder.toString();
   }
}