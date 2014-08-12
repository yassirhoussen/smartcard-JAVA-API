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

import io.daplug.session.DaplugSession;
import java.util.Vector;

public class Daplug {

	private static Vector<String> listDevices = null;
	
	public Daplug() {
		Daplug.listDevices =  new Vector<String>();
	}
	
	public static Vector<String> listAllDevices() {
		Daplug.listDevices = DaplugEnumerator.listDaplugDongles();
		return Daplug.listDevices;
	}
	
	public static DaplugSession selectElementListById(int id) {
		DaplugDongle dongle = new DaplugDongle(Daplug.listDevices.elementAt(id));
		DaplugSession session = new DaplugSession(dongle);
		return session;	
	}
	
//	public static void PrintList() {
//		for (String s : listDevices) {
//			System.out.println(s);
//		}
//	}
}
