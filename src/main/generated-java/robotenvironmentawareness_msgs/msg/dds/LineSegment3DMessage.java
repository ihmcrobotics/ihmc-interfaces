package robotenvironmentawareness_msgs.msg.dds;

/**
 *
 * Definition of the class "LineSegment3DMessage" defined in LineSegment3DMessage_.idl.
 *
 * This file was automatically generated from LineSegment3DMessage_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit LineSegment3DMessage_.idl instead.
 *
 */
public class LineSegment3DMessage
{
   public LineSegment3DMessage()
   {
      start_ = new us.ihmc.euclid.tuple3D.Point3D32();
      end_ = new us.ihmc.euclid.tuple3D.Point3D32();

   }

   public void set(LineSegment3DMessage other)
   {
      geometry_msgs.msg.dds.Point32PubSubType.staticCopy(other.start_, start_);
      geometry_msgs.msg.dds.Point32PubSubType.staticCopy(other.end_, end_);
   }

   public us.ihmc.euclid.tuple3D.Point3D32 getStart()
   {
      return start_;
   }

   public us.ihmc.euclid.tuple3D.Point3D32 getEnd()
   {
      return end_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof LineSegment3DMessage))
         return false;
      LineSegment3DMessage otherMyClass = (LineSegment3DMessage) other;
      boolean returnedValue = true;

      returnedValue &= this.start_.equals(otherMyClass.start_);

      returnedValue &= this.end_.equals(otherMyClass.end_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("LineSegment3DMessage {");
      builder.append("start=");
      builder.append(this.start_);

      builder.append(", ");
      builder.append("end=");
      builder.append(this.end_);

      builder.append("}");
      return builder.toString();
   }

   private us.ihmc.euclid.tuple3D.Point3D32 start_;
   private us.ihmc.euclid.tuple3D.Point3D32 end_;

}