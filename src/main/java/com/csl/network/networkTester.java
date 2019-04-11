package com.csl.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class networkTester {
    public static void main(String[] args) {
        String urlStr = "http://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f";
        try {
            URL url = new URL(urlStr);
            BufferedReader br = new BufferedReader( new InputStreamReader(url.openConnection().getInputStream()) );

            String line = null;
            StringBuffer sb = new StringBuffer();
            while ((line = br.readLine() )!= null) {
                sb.append(line+"\n");
            }
            System.out.println(sb.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



        //javax.net.ssl.SSLHandshakeException: sun.security.validator.ValidatorException
    }
}
