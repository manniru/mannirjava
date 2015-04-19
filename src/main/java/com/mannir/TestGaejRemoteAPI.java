package com.mannir;

import com.google.appengine.tools.remoteapi.RemoteApiOptions;

public class TestGaejRemoteAPI {

	public static void main(String[] args) {
		String username = "test@example.com";
		String password = "";
		RemoteApiOptions options = new RemoteApiOptions()
		    .server("localhost", 8080) // server name must equal "localhost"
		    .credentials(username, password);

	}

}
