package bankexercise;

import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JOptionPane;

public class OpenFileWrite extends BankApplication{
	static void openFileWrite()
	   {
		if(fileToSaveAs!=""){
	      try // open file
	      {
	         output = new RandomAccessFile( fileToSaveAs, "rw" );
	         JOptionPane.showMessageDialog(null, "Accounts saved to " + fileToSaveAs);
	      } // end try
	      catch ( IOException ioException )
	      {
	    	  JOptionPane.showMessageDialog(null, "File does not exist.");
	      } // end catch
		}
		else
			SaveToFileAs.saveToFileAs();
	   }

}
