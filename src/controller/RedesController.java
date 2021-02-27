package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
	public  RedesController(){
		super();
    }
	
	public String chamadaIP(String os) {
		String Exibir = null;
		try {
		     Process p  = Runtime.getRuntime().exec("ipconfig");
		     InputStream fluxo = p.getInputStream(); 
		     InputStreamReader leitor = new InputStreamReader(fluxo);
		     BufferedReader buffer = new BufferedReader(leitor);
		     String adap = null;
		     String ip = null;    
		     int nulos = 0;
		     while(nulos <= 4) {
		    	 String linha = buffer.readLine();
		    	 System.out.println(linha);
		    	 if(linha == null) {
		    		 nulos++;
		    	 }
		    	 if(nulos == 2) {
		    		 if(adap != null && ip != null) {
		    			 Exibir = Exibir +  adap +" "+ ip + "/n";  
		    			 adap = null;
		    			 ip = null;
		    		 }else {
		    			 adap = null;
		    			 ip = null;
		    		 }
		    	 }
		    	 if(linha.contains(" Adaptador ")) {
		    		 adap = linha;
		    		 nulos = 0;
		    	 }
		    	 if(linha.contains(" IPv4. ")) {
		    		 ip = linha;
		    	 }
		    	 linha = buffer.readLine();
		     }
		} catch (IOException e) {

			e.printStackTrace();
		}
		return Exibir;
	}

}
