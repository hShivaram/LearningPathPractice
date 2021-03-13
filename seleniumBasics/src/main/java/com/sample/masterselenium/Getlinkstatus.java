package com.sample.masterselenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Getlinkstatus {

	static int invalidlink;
	public static void linkstatuscode(String link) {
		try {
			URL url=new URL(link);
			HttpURLConnection urlconnect=(HttpURLConnection) url.openConnection();
			urlconnect.setConnectTimeout(50000);
			urlconnect.connect();
			if(urlconnect.getResponseCode()==200) {
				
			}else {
				System.out.println(link +" "+urlconnect.getResponseMessage()+" "+HttpURLConnection.HTTP_NOT_FOUND);
				invalidlink++;
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
