package shape_msgs.msg.dds;

/**
 *
 * Definition of the class "Plane" defined in Plane_.idl.
 *
 * This file was automatically generated from Plane_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Plane_.idl instead.
 *
 */
public class Plane
{
   private double[] coef_;

   public Plane()
   {
      coef_ = new double[4];
   }

   public void set(Plane other)
   {
      for (int b = 0; b < coef_.length; ++b)
      {
         coef_[b] = other.coef_[b];
      }
   }

   public double[] getCoef()
   {
      return coef_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof Plane))
         return false;
      Plane otherMyClass = (Plane) other;
      boolean returnedValue = true;

      for (int d = 0; d < coef_.length; ++d)
      {
         returnedValue &= this.coef_[d] == otherMyClass.coef_[d];
      }

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Plane {");
      builder.append("coef=");
      builder.append(java.util.Arrays.toString(this.coef_));

      builder.append("}");
      return builder.toString();
   }
}