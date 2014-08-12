/*
* Copyright Plug-up International SAS (c)
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*       http://www.apache.org/licenses/LICENSE-2.0
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*
* Authors:
*   Saada BENAMAR <s.benamar@plug-up.com>
*   Yassir Houssen ABDULLAH <a.yassirhoussen@plug-up.com>
*/

package io.daplug.dongle;

public interface IDaplugDongle {
	
	/**
	 * List all devices on the computer whatever his kind (HID, WINUSB)
	 * @return Object array of all devices (the array content will change according, to the implementation) 
	 * 
	 */
	public Object ListAllDevices();	
	
	/**
	 * List all devices with a specific VID and PID 
	 * @param vid int vendor_id
	 * @param pid int product_id
	 * @return Object array of all devices (the array content will change according, to the implementation)
	 * 
	 */
	public Object ListAllDevices(int vid, int pid);
	
	/**
	 * List all Daplug Device whatever his kind (HID, WINUSB)
	 * @return Object array of all devices (the array content will change according, to the implementation)
	 * 
	 */
	public Object ListAllDaplug();
	
	/**
	 * 
	 * @return Object
	 * 
	 */
	public Object openDevice();	
	
	/**
	 * Open a specific device with specific vid and pid value
	 * @param vid int vendor_id
	 * @param pid int product_id
	 * @return Object the Open Device
	 * 
	 */
	public Object openDevice(int vid, int pid);	
	
	/**
	 * Open a specific device with specific vid and pid value
	 * @param path String 
	 * @return
	 * 
	 */
	public Object openDevice(String path);
	
	/**
	 * exchange command with the daplugDongle.
	 * @param apdu
	 * @return
	 * 
	 */
	public Object exchange(byte[]apdu);
	
	/**
	 * exchange command with the daplugDongle.
	 * @param apdu
	 * @return
	 * 
	 */
	public Object exchange(String apdu);
	
}
