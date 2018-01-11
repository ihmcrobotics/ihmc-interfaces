package actionlib_msgs.msg.dds;

/**
 *
 * Definition of the class "GoalStatusArray" defined in GoalStatusArray_.idl.
 *
 * This file was automatically generated from GoalStatusArray_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit GoalStatusArray_.idl instead.
 *
 */
public class GoalStatusArray
{
   public GoalStatusArray()
   {
      header_ = new std_msgs.msg.dds.Header();
      status_list_ = new us.ihmc.idl.IDLSequence.Object<actionlib_msgs.msg.dds.GoalStatus>(100, actionlib_msgs.msg.dds.GoalStatus.class,
                                                                                           new actionlib_msgs.msg.dds.GoalStatusPubSubType());

   }

   public void set(GoalStatusArray other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      status_list_.set(other.status_list_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public us.ihmc.idl.IDLSequence.Object<actionlib_msgs.msg.dds.GoalStatus> getStatus_list()
   {
      return status_list_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof GoalStatusArray))
         return false;
      GoalStatusArray otherMyClass = (GoalStatusArray) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.status_list_.equals(otherMyClass.status_list_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("GoalStatusArray {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("status_list=");
      builder.append(this.status_list_);

      builder.append("}");
      return builder.toString();
   }

   private std_msgs.msg.dds.Header header_;
   private us.ihmc.idl.IDLSequence.Object<actionlib_msgs.msg.dds.GoalStatus> status_list_;

}