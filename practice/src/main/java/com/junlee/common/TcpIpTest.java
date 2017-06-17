package com.junlee.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpTest {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		ServerSocket server = new ServerSocket(8081);

		while (true) {
			final Socket socket = server.accept();
			final Socket destsocket = new Socket("127.0.1", 8088);

			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						DoTran(socket.getInputStream(), destsocket.getOutputStream());
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							socket.close();
							destsocket.close();
						} catch (IOException e) {
							e.printStackTrace();
						}

					}
				}
			}) {
			}.start();

			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						DoTran(destsocket.getInputStream(), socket.getOutputStream());
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							socket.close();
							destsocket.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();
		}
	}

	public static void DoTran(InputStream is, OutputStream os) throws IOException {
		while (true) {
			byte[] bts = new byte[1024 * 100000];
			int p = is.read(bts, 0, bts.length);

			if (p == -1) {
				break;
			}

			os.write(bts, 0, p);
		}
	}
}
