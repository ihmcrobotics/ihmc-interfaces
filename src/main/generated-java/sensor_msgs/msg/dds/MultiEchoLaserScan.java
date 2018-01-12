package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "MultiEchoLaserScan" defined in MultiEchoLaserScan_.idl.
 *
 * This file was automatically generated from MultiEchoLaserScan_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit MultiEchoLaserScan_.idl instead.
 *
 */
public class MultiEchoLaserScan
{
   private std_msgs.msg.dds.Header header_;
   private float angle_min_;
   private float angle_max_;
   private float angle_increment_;
   private float time_increment_;
   private float scan_time_;
   private float range_min_;
   private float range_max_;
   private us.ihmc.idl.IDLSequence.Object<sensor_msgs.msg.dds.LaserEcho> ranges_;
   private us.ihmc.idl.IDLSequence.Object<sensor_msgs.msg.dds.LaserEcho> intensities_;

   public MultiEchoLaserScan()
   {
      header_ = new std_msgs.msg.dds.Header();
      ranges_ = new us.ihmc.idl.IDLSequence.Object<sensor_msgs.msg.dds.LaserEcho>(100, sensor_msgs.msg.dds.LaserEcho.class,
                                                                                  new sensor_msgs.msg.dds.LaserEchoPubSubType());

      intensities_ = new us.ihmc.idl.IDLSequence.Object<sensor_msgs.msg.dds.LaserEcho>(100, sensor_msgs.msg.dds.LaserEcho.class,
                                                                                       new sensor_msgs.msg.dds.LaserEchoPubSubType());
   }

   public void set(MultiEchoLaserScan other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      angle_min_ = other.angle_min_;
      angle_max_ = other.angle_max_;
      angle_increment_ = other.angle_increment_;
      time_increment_ = other.time_increment_;
      scan_time_ = other.scan_time_;
      range_min_ = other.range_min_;
      range_max_ = other.range_max_;
      ranges_.set(other.ranges_);
      intensities_.set(other.intensities_);
   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public float getAngle_min()
   {
      return angle_min_;
   }

   public void setAngle_min(float angle_min)
   {
      angle_min_ = angle_min;
   }

   public float getAngle_max()
   {
      return angle_max_;
   }

   public void setAngle_max(float angle_max)
   {
      angle_max_ = angle_max;
   }

   public float getAngle_increment()
   {
      return angle_increment_;
   }

   public void setAngle_increment(float angle_increment)
   {
      angle_increment_ = angle_increment;
   }

   public float getTime_increment()
   {
      return time_increment_;
   }

   public void setTime_increment(float time_increment)
   {
      time_increment_ = time_increment;
   }

   public float getScan_time()
   {
      return scan_time_;
   }

   public void setScan_time(float scan_time)
   {
      scan_time_ = scan_time;
   }

   public float getRange_min()
   {
      return range_min_;
   }

   public void setRange_min(float range_min)
   {
      range_min_ = range_min;
   }

   public float getRange_max()
   {
      return range_max_;
   }

   public void setRange_max(float range_max)
   {
      range_max_ = range_max;
   }

   public us.ihmc.idl.IDLSequence.Object<sensor_msgs.msg.dds.LaserEcho> getRanges()
   {
      return ranges_;
   }

   public us.ihmc.idl.IDLSequence.Object<sensor_msgs.msg.dds.LaserEcho> getIntensities()
   {
      return intensities_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof MultiEchoLaserScan))
         return false;
      MultiEchoLaserScan otherMyClass = (MultiEchoLaserScan) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.angle_min_ == otherMyClass.angle_min_;

      returnedValue &= this.angle_max_ == otherMyClass.angle_max_;

      returnedValue &= this.angle_increment_ == otherMyClass.angle_increment_;

      returnedValue &= this.time_increment_ == otherMyClass.time_increment_;

      returnedValue &= this.scan_time_ == otherMyClass.scan_time_;

      returnedValue &= this.range_min_ == otherMyClass.range_min_;

      returnedValue &= this.range_max_ == otherMyClass.range_max_;

      returnedValue &= this.ranges_.equals(otherMyClass.ranges_);

      returnedValue &= this.intensities_.equals(otherMyClass.intensities_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("MultiEchoLaserScan {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("angle_min=");
      builder.append(this.angle_min_);

      builder.append(", ");
      builder.append("angle_max=");
      builder.append(this.angle_max_);

      builder.append(", ");
      builder.append("angle_increment=");
      builder.append(this.angle_increment_);

      builder.append(", ");
      builder.append("time_increment=");
      builder.append(this.time_increment_);

      builder.append(", ");
      builder.append("scan_time=");
      builder.append(this.scan_time_);

      builder.append(", ");
      builder.append("range_min=");
      builder.append(this.range_min_);

      builder.append(", ");
      builder.append("range_max=");
      builder.append(this.range_max_);

      builder.append(", ");
      builder.append("ranges=");
      builder.append(this.ranges_);

      builder.append(", ");
      builder.append("intensities=");
      builder.append(this.intensities_);

      builder.append("}");
      return builder.toString();
   }
}