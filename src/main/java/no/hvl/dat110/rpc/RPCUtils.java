package no.hvl.dat110.rpc;

import java.nio.ByteBuffer;
import java.util.Arrays;
import no.hvl.dat110.TODO;

public class RPCUtils {

	public static byte[] encapsulate(byte rpcid, byte[] payload) {

		byte[] rpcmsg = null;

		// TODO - START

		// Encapsulate the rpcid and payload in a byte array according to the RPC
		// message syntax / format
		int length = payload.length + 1;
		rpcmsg = new byte[length];

		rpcmsg[0] = rpcid;

		for (int i = 0; i < payload.length; i++) {
			rpcmsg[i + 1] = payload[i];
		}

//		if (true)
//			throw new UnsupportedOperationException(TODO.method());

		// TODO - END

		return rpcmsg;
	}

	public static byte[] decapsulate(byte[] rpcmsg) {

		byte[] payload = null;

		// TODO - START

		// Decapsulate the rpcid and payload in a byte array according to the RPC
		// message syntax
		payload = new byte[rpcmsg.length - 1];
		for (int i = 0; i < rpcmsg.length - 1; i++) {
			payload[i] = rpcmsg[i + 1];
		}

//		if (true)
//			throw new UnsupportedOperationException(TODO.method());

		// TODO - END

		return payload;

	}

	// convert String to byte array
	public static byte[] marshallString(String str) {

		byte[] encoded = null;

		// TODO - START
		encoded = str.getBytes();

//		if (true)
//			throw new UnsupportedOperationException(TODO.method());

		// TODO - END

		return encoded;
	}

	// convert byte array to a String
	public static String unmarshallString(byte[] data) {

		String decoded = null;

		// TODO - START
		decoded = new String(data);

//		if (true)
//			throw new UnsupportedOperationException(TODO.method());

		// TODO - END

		return decoded;
	}

	public static byte[] marshallVoid() {

		byte[] encoded = null;

		// TODO - START

		if (true)
			throw new UnsupportedOperationException(TODO.method());

		// TODO - END

		return encoded;

	}

	public static void unmarshallVoid(byte[] data) {

		// TODO

		if (true)
			throw new UnsupportedOperationException(TODO.method());

	}

	// convert boolean to a byte array representation
	public static byte[] marshallBoolean(boolean b) {

		byte[] encoded = new byte[1];

		if (b) {
			encoded[0] = 1;
		} else {
			encoded[0] = 0;
		}

		return encoded;
	}

	// convert byte array to a boolean representation
	public static boolean unmarshallBoolean(byte[] data) {

		return (data[0] > 0);

	}

	// integer to byte array representation
	public static byte[] marshallInteger(int x) {

		byte[] encoded = null;

		// TODO - START
		encoded = ByteBuffer.allocate(4).putInt(x).array();

//		if (true)
//			throw new UnsupportedOperationException(TODO.method());

		// TODO - END

		return encoded;
	}

	// byte array representation to integer
	public static int unmarshallInteger(byte[] data) {

		int decoded = 0;

		// TODO - START
		if (data.length > 0) {

			decoded = ByteBuffer.allocate(Integer.BYTES).put(data).rewind().getInt();

		}

//		if (true)
//			throw new UnsupportedOperationException(TODO.method());

		// TODO - END

		return decoded;

	}
}
