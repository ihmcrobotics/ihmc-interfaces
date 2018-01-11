package geometry_msgs.msg.dds;

/**
 *
 * Definition of the class "Inertia" defined in Inertia_.idl.
 *
 * This file was automatically generated from Inertia_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit Inertia_.idl instead.
 *
 */
public class Inertia
{
   private double m_;
   private us.ihmc.euclid.tuple3D.Vector3D com_;
   private double ixx_;
   private double ixy_;
   private double ixz_;
   private double iyy_;
   private double iyz_;
   private double izz_;

   public Inertia()
   {
      com_ = new us.ihmc.euclid.tuple3D.Vector3D();

   }

   public void set(Inertia other)
   {
      m_ = other.m_;
      geometry_msgs.msg.dds.Vector3PubSubType.staticCopy(other.com_, com_);
      ixx_ = other.ixx_;
      ixy_ = other.ixy_;
      ixz_ = other.ixz_;
      iyy_ = other.iyy_;
      iyz_ = other.iyz_;
      izz_ = other.izz_;

   }

   public double getM()
   {
      return m_;
   }

   public void setM(double m)
   {
      m_ = m;
   }

   public us.ihmc.euclid.tuple3D.Vector3D getCom()
   {
      return com_;
   }

   public double getIxx()
   {
      return ixx_;
   }

   public void setIxx(double ixx)
   {
      ixx_ = ixx;
   }

   public double getIxy()
   {
      return ixy_;
   }

   public void setIxy(double ixy)
   {
      ixy_ = ixy;
   }

   public double getIxz()
   {
      return ixz_;
   }

   public void setIxz(double ixz)
   {
      ixz_ = ixz;
   }

   public double getIyy()
   {
      return iyy_;
   }

   public void setIyy(double iyy)
   {
      iyy_ = iyy;
   }

   public double getIyz()
   {
      return iyz_;
   }

   public void setIyz(double iyz)
   {
      iyz_ = iyz;
   }

   public double getIzz()
   {
      return izz_;
   }

   public void setIzz(double izz)
   {
      izz_ = izz;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof Inertia))
         return false;
      Inertia otherMyClass = (Inertia) other;
      boolean returnedValue = true;

      returnedValue &= this.m_ == otherMyClass.m_;

      returnedValue &= this.com_.equals(otherMyClass.com_);

      returnedValue &= this.ixx_ == otherMyClass.ixx_;

      returnedValue &= this.ixy_ == otherMyClass.ixy_;

      returnedValue &= this.ixz_ == otherMyClass.ixz_;

      returnedValue &= this.iyy_ == otherMyClass.iyy_;

      returnedValue &= this.iyz_ == otherMyClass.iyz_;

      returnedValue &= this.izz_ == otherMyClass.izz_;

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Inertia {");
      builder.append("m=");
      builder.append(this.m_);

      builder.append(", ");
      builder.append("com=");
      builder.append(this.com_);

      builder.append(", ");
      builder.append("ixx=");
      builder.append(this.ixx_);

      builder.append(", ");
      builder.append("ixy=");
      builder.append(this.ixy_);

      builder.append(", ");
      builder.append("ixz=");
      builder.append(this.ixz_);

      builder.append(", ");
      builder.append("iyy=");
      builder.append(this.iyy_);

      builder.append(", ");
      builder.append("iyz=");
      builder.append(this.iyz_);

      builder.append(", ");
      builder.append("izz=");
      builder.append(this.izz_);

      builder.append("}");
      return builder.toString();
   }

}