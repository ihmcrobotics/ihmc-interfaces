package nav_msgs.msg.dds;

/**
 *
 * Definition of the class "OccupancyGrid" defined in OccupancyGrid_.idl.
 *
 * This file was automatically generated from OccupancyGrid_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit OccupancyGrid_.idl instead.
 *
 */
public class OccupancyGrid
{
   private std_msgs.msg.dds.Header header_;
   private nav_msgs.msg.dds.MapMetaData info_;
   private us.ihmc.idl.IDLSequence.Byte data_;

   public OccupancyGrid()
   {
      header_ = new std_msgs.msg.dds.Header();
      info_ = new nav_msgs.msg.dds.MapMetaData();
      data_ = new us.ihmc.idl.IDLSequence.Byte(100, "type_9");
   }

   public void set(OccupancyGrid other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      nav_msgs.msg.dds.MapMetaDataPubSubType.staticCopy(other.info_, info_);
      data_.set(other.data_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public nav_msgs.msg.dds.MapMetaData getInfo()
   {
      return info_;
   }

   public us.ihmc.idl.IDLSequence.Byte getData()
   {
      return data_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof OccupancyGrid))
         return false;
      OccupancyGrid otherMyClass = (OccupancyGrid) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.info_.equals(otherMyClass.info_);

      returnedValue &= this.data_.equals(otherMyClass.data_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("OccupancyGrid {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("info=");
      builder.append(this.info_);

      builder.append(", ");
      builder.append("data=");
      builder.append(this.data_);

      builder.append("}");
      return builder.toString();
   }
}