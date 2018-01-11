package sensor_msgs.msg.dds;

/**
 *
 * Definition of the class "BatteryState" defined in BatteryState_.idl.
 *
 * This file was automatically generated from BatteryState_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit BatteryState_.idl instead.
 *
 */
public class BatteryState
{
   public BatteryState()
   {
      header_ = new std_msgs.msg.dds.Header();
      cell_voltage_ = new us.ihmc.idl.IDLSequence.Float(100, "type_5");
      location_ = new java.lang.StringBuilder(255);
      serial_number_ = new java.lang.StringBuilder(255);

   }

   public void set(BatteryState other)
   {
      std_msgs.msg.dds.HeaderPubSubType.staticCopy(other.header_, header_);
      voltage_ = other.voltage_;
      current_ = other.current_;
      charge_ = other.charge_;
      capacity_ = other.capacity_;
      design_capacity_ = other.design_capacity_;
      percentage_ = other.percentage_;
      power_supply_status_ = other.power_supply_status_;
      power_supply_health_ = other.power_supply_health_;
      power_supply_technology_ = other.power_supply_technology_;
      present_ = other.present_;
      cell_voltage_.set(other.cell_voltage_);
      location_.setLength(0);
      location_.append(other.location_);
      serial_number_.setLength(0);
      serial_number_.append(other.serial_number_);

   }

   public std_msgs.msg.dds.Header getHeader()
   {
      return header_;
   }

   public void setVoltage(float voltage)
   {
      voltage_ = voltage;
   }

   public float getVoltage()
   {
      return voltage_;
   }

   public void setCurrent(float current)
   {
      current_ = current;
   }

   public float getCurrent()
   {
      return current_;
   }

   public void setCharge(float charge)
   {
      charge_ = charge;
   }

   public float getCharge()
   {
      return charge_;
   }

   public void setCapacity(float capacity)
   {
      capacity_ = capacity;
   }

   public float getCapacity()
   {
      return capacity_;
   }

   public void setDesign_capacity(float design_capacity)
   {
      design_capacity_ = design_capacity;
   }

   public float getDesign_capacity()
   {
      return design_capacity_;
   }

   public void setPercentage(float percentage)
   {
      percentage_ = percentage;
   }

   public float getPercentage()
   {
      return percentage_;
   }

   public void setPower_supply_status(byte power_supply_status)
   {
      power_supply_status_ = power_supply_status;
   }

   public byte getPower_supply_status()
   {
      return power_supply_status_;
   }

   public void setPower_supply_health(byte power_supply_health)
   {
      power_supply_health_ = power_supply_health;
   }

   public byte getPower_supply_health()
   {
      return power_supply_health_;
   }

   public void setPower_supply_technology(byte power_supply_technology)
   {
      power_supply_technology_ = power_supply_technology;
   }

   public byte getPower_supply_technology()
   {
      return power_supply_technology_;
   }

   public void setPresent(boolean present)
   {
      present_ = present;
   }

   public boolean getPresent()
   {
      return present_;
   }

   public us.ihmc.idl.IDLSequence.Float getCell_voltage()
   {
      return cell_voltage_;
   }

   public void setLocation(String location)
   {
      location_.setLength(0);
      location_.append(location);
   }

   public java.lang.String getLocationAsString()
   {
      return getLocation().toString();
   }

   public java.lang.StringBuilder getLocation()
   {
      return location_;
   }

   public void setSerial_number(String serial_number)
   {
      serial_number_.setLength(0);
      serial_number_.append(serial_number);
   }

   public java.lang.String getSerial_numberAsString()
   {
      return getSerial_number().toString();
   }

   public java.lang.StringBuilder getSerial_number()
   {
      return serial_number_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof BatteryState))
         return false;
      BatteryState otherMyClass = (BatteryState) other;
      boolean returnedValue = true;

      returnedValue &= this.header_.equals(otherMyClass.header_);

      returnedValue &= this.voltage_ == otherMyClass.voltage_;

      returnedValue &= this.current_ == otherMyClass.current_;

      returnedValue &= this.charge_ == otherMyClass.charge_;

      returnedValue &= this.capacity_ == otherMyClass.capacity_;

      returnedValue &= this.design_capacity_ == otherMyClass.design_capacity_;

      returnedValue &= this.percentage_ == otherMyClass.percentage_;

      returnedValue &= this.power_supply_status_ == otherMyClass.power_supply_status_;

      returnedValue &= this.power_supply_health_ == otherMyClass.power_supply_health_;

      returnedValue &= this.power_supply_technology_ == otherMyClass.power_supply_technology_;

      returnedValue &= this.present_ == otherMyClass.present_;

      returnedValue &= this.cell_voltage_.equals(otherMyClass.cell_voltage_);

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.location_, otherMyClass.location_);

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.serial_number_, otherMyClass.serial_number_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("BatteryState {");
      builder.append("header=");
      builder.append(this.header_);

      builder.append(", ");
      builder.append("voltage=");
      builder.append(this.voltage_);

      builder.append(", ");
      builder.append("current=");
      builder.append(this.current_);

      builder.append(", ");
      builder.append("charge=");
      builder.append(this.charge_);

      builder.append(", ");
      builder.append("capacity=");
      builder.append(this.capacity_);

      builder.append(", ");
      builder.append("design_capacity=");
      builder.append(this.design_capacity_);

      builder.append(", ");
      builder.append("percentage=");
      builder.append(this.percentage_);

      builder.append(", ");
      builder.append("power_supply_status=");
      builder.append(this.power_supply_status_);

      builder.append(", ");
      builder.append("power_supply_health=");
      builder.append(this.power_supply_health_);

      builder.append(", ");
      builder.append("power_supply_technology=");
      builder.append(this.power_supply_technology_);

      builder.append(", ");
      builder.append("present=");
      builder.append(this.present_);

      builder.append(", ");
      builder.append("cell_voltage=");
      builder.append(this.cell_voltage_);

      builder.append(", ");
      builder.append("location=");
      builder.append(this.location_);

      builder.append(", ");
      builder.append("serial_number=");
      builder.append(this.serial_number_);

      builder.append("}");
      return builder.toString();
   }

   private std_msgs.msg.dds.Header header_;
   private float voltage_;
   private float current_;
   private float charge_;
   private float capacity_;
   private float design_capacity_;
   private float percentage_;
   private byte power_supply_status_;
   private byte power_supply_health_;
   private byte power_supply_technology_;
   private boolean present_;
   private us.ihmc.idl.IDLSequence.Float cell_voltage_;
   private java.lang.StringBuilder location_;
   private java.lang.StringBuilder serial_number_;

}