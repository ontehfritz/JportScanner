/*
 * TextFileIO.java
 *
 * Created on June 26, 2002, 8:25 PM
 */

//package JPortScanner;

/**
 *
 * @author Nameless1
 */
import java.io.*;

public class TextFileIO extends File{

	public TextFileIO(String name){
		super(name);
	}
	public String getText(){

		String EOL = System.getProperty("line.separator");
		StringBuffer stringBuff = new StringBuffer();
		try{
			BufferedReader br = new BufferedReader(new FileReader(this));
			String line = "NOTNULL";
			while (line != null){
				line = br.readLine();
				if (line != null)
				stringBuff.append(line + EOL);
			}
		}

		catch (IOException ioe){
			System.err.println(ioe.getMessage());
		}
		return stringBuff.toString();

	}
	public void setText(String text){
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(this));
			bw.write(text);
			bw.flush();
			bw.close();
		}
		catch(IOException io){
			System.err.println(io.getMessage());
		}

	}

}

