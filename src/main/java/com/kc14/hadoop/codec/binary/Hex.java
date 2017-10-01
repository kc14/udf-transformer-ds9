package com.kc14.hadoop.codec.binary;

import javax.xml.bind.DatatypeConverter;

public class Hex {

	private final static byte[/* high digit */][/* low */]hex2byte =
		{
				{
					(byte) 0x00, (byte) 0x01, (byte) 0x02, (byte) 0x03,
					(byte) 0x04, (byte) 0x05, (byte) 0x06, (byte) 0x07,
					(byte) 0x08, (byte) 0x09, (byte) 0x0a, (byte) 0x0b,
					(byte) 0x0c, (byte) 0x0d, (byte) 0x0e, (byte) 0x0f,
				},
				{
					(byte) 0x10, (byte) 0x11, (byte) 0x12, (byte) 0x13,
					(byte) 0x14, (byte) 0x15, (byte) 0x16, (byte) 0x17,
					(byte) 0x18, (byte) 0x19, (byte) 0x1a, (byte) 0x1b,
					(byte) 0x1c, (byte) 0x1d, (byte) 0x1e, (byte) 0x1f,
				},
				{
					(byte) 0x20, (byte) 0x21, (byte) 0x22, (byte) 0x23,
					(byte) 0x24, (byte) 0x25, (byte) 0x26, (byte) 0x27,
					(byte) 0x28, (byte) 0x29, (byte) 0x2a, (byte) 0x2b,
					(byte) 0x2c, (byte) 0x2d, (byte) 0x2e, (byte) 0x2f,
				},
				{
					(byte) 0x30, (byte) 0x31, (byte) 0x32, (byte) 0x33,
					(byte) 0x34, (byte) 0x35, (byte) 0x36, (byte) 0x37,
					(byte) 0x38, (byte) 0x39, (byte) 0x3a, (byte) 0x3b,
					(byte) 0x3c, (byte) 0x3d, (byte) 0x3e, (byte) 0x3f,
				},
				{
					(byte) 0x40, (byte) 0x41, (byte) 0x42, (byte) 0x43,
					(byte) 0x44, (byte) 0x45, (byte) 0x46, (byte) 0x47,
					(byte) 0x48, (byte) 0x49, (byte) 0x4a, (byte) 0x4b,
					(byte) 0x4c, (byte) 0x4d, (byte) 0x4e, (byte) 0x4f,
				},
				{
					(byte) 0x50, (byte) 0x51, (byte) 0x52, (byte) 0x53,
					(byte) 0x54, (byte) 0x55, (byte) 0x56, (byte) 0x57,
					(byte) 0x58, (byte) 0x59, (byte) 0x5a, (byte) 0x5b,
					(byte) 0x5c, (byte) 0x5d, (byte) 0x5e, (byte) 0x5f,
				},
				{
					(byte) 0x60, (byte) 0x61, (byte) 0x62, (byte) 0x63,
					(byte) 0x64, (byte) 0x65, (byte) 0x66, (byte) 0x67,
					(byte) 0x68, (byte) 0x69, (byte) 0x6a, (byte) 0x6b,
					(byte) 0x6c, (byte) 0x6d, (byte) 0x6e, (byte) 0x6f,
				},
				{
					(byte) 0x70, (byte) 0x71, (byte) 0x72, (byte) 0x73,
					(byte) 0x74, (byte) 0x75, (byte) 0x76, (byte) 0x77,
					(byte) 0x78, (byte) 0x79, (byte) 0x7a, (byte) 0x7b,
					(byte) 0x7c, (byte) 0x7d, (byte) 0x7e, (byte) 0x7f,
				},
				{
					(byte) 0x80, (byte) 0x81, (byte) 0x82, (byte) 0x83,
					(byte) 0x84, (byte) 0x85, (byte) 0x86, (byte) 0x87,
					(byte) 0x88, (byte) 0x89, (byte) 0x8a, (byte) 0x8b,
					(byte) 0x8c, (byte) 0x8d, (byte) 0x8e, (byte) 0x8f,
				},
				{
					(byte) 0x90, (byte) 0x91, (byte) 0x92, (byte) 0x93,
					(byte) 0x94, (byte) 0x95, (byte) 0x96, (byte) 0x97,
					(byte) 0x98, (byte) 0x99, (byte) 0x9a, (byte) 0x9b,
					(byte) 0x9c, (byte) 0x9d, (byte) 0x9e, (byte) 0x9f,
				},
				{
					(byte) 0xa0, (byte) 0xa1, (byte) 0xa2, (byte) 0xa3,
					(byte) 0xa4, (byte) 0xa5, (byte) 0xa6, (byte) 0xa7,
					(byte) 0xa8, (byte) 0xa9, (byte) 0xaa, (byte) 0xab,
					(byte) 0xac, (byte) 0xad, (byte) 0xae, (byte) 0xaf,
				},
				{
					(byte) 0xb0, (byte) 0xb1, (byte) 0xb2, (byte) 0xb3,
					(byte) 0xb4, (byte) 0xb5, (byte) 0xb6, (byte) 0xb7,
					(byte) 0xb8, (byte) 0xb9, (byte) 0xba, (byte) 0xbb,
					(byte) 0xbc, (byte) 0xbd, (byte) 0xbe, (byte) 0xbf,
				},
				{
					(byte) 0xc0, (byte) 0xc1, (byte) 0xc2, (byte) 0xc3,
					(byte) 0xc4, (byte) 0xc5, (byte) 0xc6, (byte) 0xc7,
					(byte) 0xc8, (byte) 0xc9, (byte) 0xca, (byte) 0xcb,
					(byte) 0xcc, (byte) 0xcd, (byte) 0xce, (byte) 0xcf,
				},
				{
					(byte) 0xd0, (byte) 0xd1, (byte) 0xd2, (byte) 0xd3,
					(byte) 0xd4, (byte) 0xd5, (byte) 0xd6, (byte) 0xd7,
					(byte) 0xd8, (byte) 0xd9, (byte) 0xda, (byte) 0xdb,
					(byte) 0xdc, (byte) 0xdd, (byte) 0xde, (byte) 0xdf,
				},
				{
					(byte) 0xe0, (byte) 0xe1, (byte) 0xe2, (byte) 0xe3,
					(byte) 0xe4, (byte) 0xe5, (byte) 0xe6, (byte) 0xe7,
					(byte) 0xe8, (byte) 0xe9, (byte) 0xea, (byte) 0xeb,
					(byte) 0xec, (byte) 0xed, (byte) 0xee, (byte) 0xef,
				},
				{
					(byte) 0xf0, (byte) 0xf1, (byte) 0xf2, (byte) 0xf3,
					(byte) 0xf4, (byte) 0xf5, (byte) 0xf6, (byte) 0xf7,
					(byte) 0xf8, (byte) 0xf9, (byte) 0xfa, (byte) 0xfb,
					(byte) 0xfc, (byte) 0xfd, (byte) 0xfe, (byte) 0xff,
				},
		};

	private final static String[/* byte */] byte2hex = {
			"00", "01", "02", "03", "04", "05", "06", "07",
			"08", "09", "0A", "0B", "0C", "0D", "0E", "0F",
			"10", "11", "12", "13", "14", "15", "16", "17",
			"18", "19", "1A", "1B", "1C", "1D", "1E", "1F",
			"20", "21", "22", "23", "24", "25", "26", "27",
			"28", "29", "2A", "2B", "2C", "2D", "2E", "2F",
			"30", "31", "32", "33", "34", "35", "36", "37",
			"38", "39", "3A", "3B", "3C", "3D", "3E", "3F",
			"40", "41", "42", "43", "44", "45", "46", "47",
			"48", "49", "4A", "4B", "4C", "4D", "4E", "4F",
			"50", "51", "52", "53", "54", "55", "56", "57",
			"58", "59", "5A", "5B", "5C", "5D", "5E", "5F",
			"60", "61", "62", "63", "64", "65", "66", "67",
			"68", "69", "6A", "6B", "6C", "6D", "6E", "6F",
			"70", "71", "72", "73", "74", "75", "76", "77",
			"78", "79", "7A", "7B", "7C", "7D", "7E", "7F",
			"80", "81", "82", "83", "84", "85", "86", "87",
			"88", "89", "8A", "8B", "8C", "8D", "8E", "8F",
			"90", "91", "92", "93", "94", "95", "96", "97",
			"98", "99", "9A", "9B", "9C", "9D", "9E", "9F",
			"A0", "A1", "A2", "A3", "A4", "A5", "A6", "A7",
			"A8", "A9", "AA", "AB", "AC", "AD", "AE", "AF",
			"B0", "B1", "B2", "B3", "B4", "B5", "B6", "B7",
			"B8", "B9", "BA", "BB", "BC", "BD", "BE", "BF",
			"C0", "C1", "C2", "C3", "C4", "C5", "C6", "C7",
			"C8", "C9", "CA", "CB", "CC", "CD", "CE", "CF",
			"D0", "D1", "D2", "D3", "D4", "D5", "D6", "D7",
			"D8", "D9", "DA", "DB", "DC", "DD", "DE", "DF",
			"E0", "E1", "E2", "E3", "E4", "E5", "E6", "E7",
			"E8", "E9", "EA", "EB", "EC", "ED", "EE", "EF",
			"F0", "F1", "F2", "F3", "F4", "F5", "F6", "F7",
			"F8", "F9", "FA", "FB", "FC", "FD", "FE", "FF",
	};


	public static byte[] decodeHex(String data) {
		return decodeHex(data.toCharArray());
	}
	
	public static byte[] decodeHex(final char[] data) {
		
		final int len = data.length;

		if ((len & 0x01) != 0) {
			throw new IllegalArgumentException("Odd number of characters.");
		}
		
		final byte[] out = new byte[len >> 1]; // divided by 2
		
		// two characters form the hex value.
		for (int i = 0, j = 0; i < out.length; i += 1, j += 2) {
			out[i] = hex2byte[toDigit(data[j])][toDigit(data[j+1])];
		}
		
		return out;
	}
	
	private final static int ord0 = 0x30;
	private final static int ord9 = 0x39;
	private final static int ordA = 0x41;
	private final static int ordF = 0x70;

	public static int toDigit(char c) {
		int d = c - ord0;
		if (d < 0) throw new IllegalArgumentException("Bad hex digit: [" + c + "]");
		if (d > 9) d = c - (ordA - 10);
		if (d > 15) throw new IllegalArgumentException("Bad hex digit: [" + c + "]");
		return d;
	}



	public static String encodeHex(byte[] bytes) {
		StringBuffer r = new StringBuffer(bytes.length << 1);
		for (int oneByte : bytes) {
			r.append(byte2hex[oneByte & 0xFF]);
		}
		return r.toString();
	}
	
	public static String encodeHex2(byte[] bytes) { // Slow
		return DatatypeConverter.printHexBinary(bytes);
	}
	
}
