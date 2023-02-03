package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static int MESSAGINGPORT = 8080;
	public static String MESSAGINGHOST = "localhost";

	public static byte[] encapsulate(Message message) {
		
		byte[] segment = null;
		byte[] data;
		
		// TODO - START
		
		// encapulate/encode the payload data of the message and form a segment
		// according to the segment format for the messaging layer
		data = message.getData();
		
		segment = new byte[SEGMENTSIZE];
		
		segment[0] = (byte) data.length;
		for(int i = 0; i<data.length; i++ ) {
			segment[i+1] = data[i];
		}
		
		
//		if (true)
//			throw new UnsupportedOperationException(TODO.method());
			
		// TODO - END
		return segment;
		
	}

	public static Message decapsulate(byte[] segment) {

		Message message = null;
		
		// TODO - START
		// decapsulate segment and put received payload data into a message
		int lengde = segment[0];
		byte[] data = new byte[lengde];
		
		for(int i = 0; i < lengde; i++) {
			data[i] = segment[i+1];
		}
		
		message = new Message(data);
		
//		if (true)
//			throw new UnsupportedOperationException(TODO.method());
		
		// TODO - END
		
		return message;
		
	}
	
}
