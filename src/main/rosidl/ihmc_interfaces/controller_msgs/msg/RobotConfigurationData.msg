std_msgs/Header header

int64 sensor_head_pps_timestamp
int32 joint_name_hash

float32[<=50] joint_angles
float32[<=50] joint_velocities
float32[<=50] joint_torques
controller_msgs/Wrench[<=50] force_sensor_data
controller_msgs/ElectricJointData[<=50] electric_joint_data

controller_msgs/RawImuData[<=15] raw_imu_data
sensor_msgs/Imu[<=5] imu_sensor_data
geometry_msgs/Vector3 root_translation
geometry_msgs/Quaternion root_orientation
geometry_msgs/Vector3 pelvis_linear_velocity
geometry_msgs/Vector3 pelvis_angular_velocity
geometry_msgs/Vector3 pelvis_linear_acceleration

int32 STANDING = 3
int32 IN_MOTION = 4
int32 robot_motion_status

controller_msgs/BatteryState[<=1] battery_state
controller_msgs/PumpState[<=1] pump_state

# For verifying the robot is receiving your commands
int32 last_received_packet_type_id
int64 last_received_packet_unique_id
int64 last_received_packet_robot_timestamp
