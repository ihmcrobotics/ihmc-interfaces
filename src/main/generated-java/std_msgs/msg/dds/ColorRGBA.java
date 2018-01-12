package std_msgs.msg.dds;

/**
 *
 * Definition of the class "ColorRGBA" defined in ColorRGBA_.idl.
 *
 * This file was automatically generated from ColorRGBA_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit ColorRGBA_.idl instead.
 *
 */
public class ColorRGBA
{
   private float r_;
   private float g_;
   private float b_;
   private float a_;

   public ColorRGBA()
   {

   }

   public void set(ColorRGBA other)
   {
      r_ = other.r_;
      g_ = other.g_;
      b_ = other.b_;
      a_ = other.a_;
   }

   public float getR()
   {
      return r_;
   }

   public void setR(float r)
   {
      r_ = r;
   }

   public float getG()
   {
      return g_;
   }

   public void setG(float g)
   {
      g_ = g;
   }

   public float getB()
   {
      return b_;
   }

   public void setB(float b)
   {
      b_ = b;
   }

   public float getA()
   {
      return a_;
   }

   public void setA(float a)
   {
      a_ = a;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof ColorRGBA))
         return false;
      ColorRGBA otherMyClass = (ColorRGBA) other;
      boolean returnedValue = true;

      returnedValue &= this.r_ == otherMyClass.r_;

      returnedValue &= this.g_ == otherMyClass.g_;

      returnedValue &= this.b_ == otherMyClass.b_;

      returnedValue &= this.a_ == otherMyClass.a_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ColorRGBA {");
      builder.append("r=");
      builder.append(this.r_);

      builder.append(", ");
      builder.append("g=");
      builder.append(this.g_);

      builder.append(", ");
      builder.append("b=");
      builder.append(this.b_);

      builder.append(", ");
      builder.append("a=");
      builder.append(this.a_);

      builder.append("}");
      return builder.toString();
   }
}