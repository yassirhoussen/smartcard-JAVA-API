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
*   Yassir Houssen Abdullah <a.yassirhoussen@plug-up.com>

*/

package io.daplug.session;

public interface SessionConstante {

	//Dongles
		public static final int	HID_DEVICE = 0,
								WINUSB_DEVICE = 1;

		//Security levels
	    public static final int SEC_LEVEL_C_MAC = (byte) 0x01; /** Ensure command integrity */
	    public static final int SEC_LEVEL_C_DEC = (byte) 0x02; /** Ensure command encryption */
	    public static final int SEC_LEVEL_R_MAC = (byte) 0x10; /** Ensure response integrity */
	    public static final int SEC_LEVEL_R_ENC = (byte) 0x20; /** Ensure response encryption */
	    
	    //Encryption constants
	    public static final int	ENC_ECB = (byte) 0x01, /** Use ECB mode */
	    	    				ENC_CBC = (byte) 0x02, /** Use CBC mode */
	    	    				ENC_1_DIV = (byte) 0x04, /** Use one diversifier */
	    	    				ENC_2_DIV = (byte) 0x08; /** Use two diversifiers */
	    
	    //OTP constants
	    public static final int	OTP_6_DIGIT = (byte) 0x10, /** Output a 6-digits OTP */
	    	    				OTP_7_DIGIT = (byte) 0x20, /** Output a 7-digits OTP */
	    	    				OTP_8_DIGIT = (byte) 0x40, /** Output a 8-digits OTP */
	    	    				OTP_0_DIV = (byte) 0x00, /** Do not use diversifiers */
	    	    				OTP_1_DIV = (byte) 0x01, /** Use one diversifier */
	    	    				OTP_2_DIV = (byte) 0x02; /** Use two diversifiers */
	    						
	    
	    //FS
		public static final int MAX_FS_FILE_SIZE = 0xFFFF; //Max size of an EF
		public static final int MAX_REAL_DATA_SIZE = 0xEF; //EF = FF - 8 - 8 (data max len - possible mac - possible pad if data encrypted)
		public static final int FS_MASTER_FILE = 0x3F00; //Master file ID
		
	    //Other constants
	    public static final int MAC_LEN = 8; //MAC length
		public static final int HOTP_TIME_STEP = 30; //Recommended HOTP time step 
		public static final int ACCESS_ALWAYS = 0x00;
		public static final int ACCESS_NEVER = 0xFF;
		
		public static final int 	ENCRYPT = (byte) 0x01, /* Encryption */
									DECRYPT = (byte) 0x02, /* Decryption */
									HMAC = 0,
									HOTP = 1,
									TOTP = 2;
}
