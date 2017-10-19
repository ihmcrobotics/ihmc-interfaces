/*
 * Copyright 2017 Florida Institute for Human and Machine Cognition (IHMC)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package us.ihmc.ros2.rosidl.geometry_msgs.msg.dds;

import geometry_msgs.msg.dds.Vector3PubSubType.AbstractVector3PubSubTypeImplementation;
import us.ihmc.euclid.tuple3D.Vector3D;

class Vector3PubSubTypeImpl extends AbstractVector3PubSubTypeImplementation
{

   @Override
   protected void copy(Vector3D src, Vector3D dest)
   {
      dest.set(src);
   }

   @Override
   protected double getX(Vector3D data)
   {
      return data.getX();
   }

   @Override
   protected void setX(Vector3D data, double x)
   {
      data.setX(x);
   }

   @Override
   protected double getY(Vector3D data)
   {
      return data.getY();
   }

   @Override
   protected void setY(Vector3D data, double y)
   {
      data.setY(y);
   }

   @Override
   protected double getZ(Vector3D data)
   {
      return data.getZ();
   }

   @Override
   protected void setZ(Vector3D data, double z)
   {
      data.setZ(z);
   }

   @Override
   public Vector3D createData()
   {
      return new Vector3D();
   }

}
