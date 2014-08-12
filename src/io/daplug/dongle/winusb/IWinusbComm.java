package io.daplug.dongle.winusb;

public interface IWinusbComm {
	
	/**
	 * make an exchange with a daplug dongle winusb. 
	 * return value is a String [] with 2 values :
	 * first the data received if exist
	 * second the status word
	 * @param apdu bute [] apdu to send to the dongle
	 * @return String[2] result
	 * 
	 */
	public String[] exchange(byte[] apdu);
}
