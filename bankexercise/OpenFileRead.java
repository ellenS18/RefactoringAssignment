package bankexercise;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class OpenFileRead extends BankApplication{
	static void openFileRead()
	   {
		
		table.clear();
			
		fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(null);
		 
     if (returnVal == JFileChooser.APPROVE_OPTION) {
         File file = fc.getSelectedFile();

     } else {
             }

			
		      try // open file
		      {
		    	  if(fc.getSelectedFile()!=null)
		    		  input = new RandomAccessFile( fc.getSelectedFile(), "r" );
		      } // end try
		      catch ( IOException ioException )
		      {
		    	  JOptionPane.showMessageDialog(null, "File Does Not Exist.");
		      } // end catch
			
	   } // end method openFile

}
