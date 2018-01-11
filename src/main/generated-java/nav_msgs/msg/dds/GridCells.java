package nav_msgs.msg.dds;

/**
 *
 * Definition of the class "GridCells" defined in GridCells_.idl.
 *
 * This file was automatically generated from GridCells_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit GridCells_.idl instead.
 *
 */
public class GridCells
{
   public GridCells()
   {
      header_ = new std_msgs.msg.dds.Header();
      cells_ = new us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.tuple3D.Point3D>(100, us.ihmc.euclid.tuple3D.Point3D.class,
                                                                                  new geometry_msgs.msg.dds.PointPubSubType());

   }

   public void set(GridCells other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      cell_width_ = other.cell_width_;
      cell_height_ = other.cell_height_;
      cells_.set(other.cells_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public void setCell_width(float cell_width)
   {
      cell_width_ = cell_width;
   }

   public float getCell_width()
   {
      return cell_width_;
   }

   public void setCell_height(float cell_height)
   {
      cell_height_ = cell_height;
   }

   public float getCell_height()
   {
      return cell_height_;
   }

   public us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.tuple3D.Point3D> getCells()
   {
      return cells_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof GridCells))
         return false;
      GridCells otherMyClass = (GridCells) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.cell_width_ == otherMyClass.cell_width_;

      returnedValue &= this.cell_height_ == otherMyClass.cell_height_;

      returnedValue &= this.cells_.equals(otherMyClass.cells_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("GridCells {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("cell_width=");
      builder.append(this.cell_width_);

      builder.append(", ");
      builder.append("cell_height=");
      builder.append(this.cell_height_);

      builder.append(", ");
      builder.append("cells=");
      builder.append(this.cells_);

      builder.append("}");
      return builder.toString();
   }

   private std_msgs.msg.dds.Header header_;
   private float cell_width_;
   private float cell_height_;
   private us.ihmc.idl.IDLSequence.Object<us.ihmc.euclid.tuple3D.Point3D> cells_;

}