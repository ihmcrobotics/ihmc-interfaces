package std_msgs.msg.dds;

/**
 *
 * Definition of the class "MultiArrayDimension" defined in MultiArrayDimension_.idl.
 *
 * This file was automatically generated from MultiArrayDimension_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit MultiArrayDimension_.idl instead.
 *
 */
public class MultiArrayDimension
{
   private java.lang.StringBuilder label_;
   private long size_;
   private long stride_;

   public MultiArrayDimension()
   {
      label_ = new java.lang.StringBuilder(255);

   }

   public void set(MultiArrayDimension other)
   {
      label_.setLength(0);
      label_.append(other.label_);
      size_ = other.size_;
      stride_ = other.stride_;

   }

   public java.lang.String getLabelAsString()
   {
      return getLabel().toString();
   }

   public java.lang.StringBuilder getLabel()
   {
      return label_;
   }

   public void setLabel(String label)
   {
      label_.setLength(0);
      label_.append(label);
   }

   public long getSize()
   {
      return size_;
   }

   public void setSize(long size)
   {
      size_ = size;
   }

   public long getStride()
   {
      return stride_;
   }

   public void setStride(long stride)
   {
      stride_ = stride;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof MultiArrayDimension))
         return false;
      MultiArrayDimension otherMyClass = (MultiArrayDimension) other;
      boolean returnedValue = true;

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.label_, otherMyClass.label_);

      returnedValue &= this.size_ == otherMyClass.size_;

      returnedValue &= this.stride_ == otherMyClass.stride_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("MultiArrayDimension {");
      builder.append("label=");
      builder.append(this.label_);

      builder.append(", ");
      builder.append("size=");
      builder.append(this.size_);

      builder.append(", ");
      builder.append("stride=");
      builder.append(this.stride_);

      builder.append("}");
      return builder.toString();
   }

}