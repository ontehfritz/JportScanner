
/*
 * SocketFun.java
 *
 * Created on June 26, 2002, 8:19 PM
 */

//package JPortScanner;
import java.net.*;
import java.io.*;
import javax.swing.*;


/**
 *
 * @author  Namless1
 */


public class SocketFun{

	private Socket connection;
	private PrintWriter out;
	private BufferedReader in;
	private String host;
	public String serverMsg;
	private String clientCommand;
	private int port;


	public SocketFun(){
		this.host = "unknown";
		this.port = 0;
	}
	public SocketFun(String host,int port){
		this.host = host;
		this.port = port;
	}
        public boolean testConnection(){
            try{
               this.connection = new Socket(host,port);
            }catch(UnknownHostException e){
                return false;
            }catch (IOException e) {
                return true;
            }
            return true;


        }
	public boolean makeConnection(){
		try{
			this.connection = new Socket(host,port);
			out = new PrintWriter(connection.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		}catch(UnknownHostException e){
			System.err.println("Could not find:" + host);

			System.exit(1);
		}catch (IOException e) {
            		//System.err.println("I/O connection could not be established" + host);
            		//System.exit(1);
			return false;
        	}
		return true;
	}
	public void closeConnection(){
		try{
			//out.close();
			//in.close();
			connection.close();
		}catch(IOException e){


		}

	}
	public void readServer()throws IOException{
		do{
			serverMsg = in.readLine();
            		System.out.println("Server: " + serverMsg);
		}while(serverMsg == null);


        }
	public void sendCommand(String command){
		out.println(command);


	}
	public void setIP(String host){
		this.host = host;

	}
	public 	void setPort(int port){
		this.port = port;
	}


}



