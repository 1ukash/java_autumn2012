package ru.spbstu.telematics.javalectures.lecture12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Set;

public class NIO {
	public static void main(String[] args) throws IOException {
		ByteBuffer bb = ByteBuffer.allocate(100);
//		IntBuffer ib = bb.asIntBuffer();
		
		FileChannel ch = new FileOutputStream("/tmp/file.txt").getChannel();
		bb.put((byte) 10);
		bb.put(new byte[] { 1, 2, 3, 4 });
		bb.putInt(10);
		bb.flip();
		System.out.println(bb.position());
		ch.write(bb);
		ch.close();
		
		SocketChannel sc = null;
		
		Selector s = Selector.open();
		SelectionKey key = sc.register(s, SelectionKey.OP_READ | SelectionKey.OP_WRITE);	
		
		s.select();
		Set<SelectionKey> selectedKeys = s.selectedKeys();
		for (SelectionKey k : selectedKeys) {
			SelectableChannel ch2 = k.channel();
		}
		
	}
}
