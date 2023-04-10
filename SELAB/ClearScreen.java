import java.io.IOException;

public class ClearScreen  {  
  public final static void clearConsole() throws InterruptedException, IOException  {  
	  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    	 /** try  {  
    		  final String os = System.getProperty("os.name");  
    	      if (os.contains("Windows"))  {  
    	    	  Runtime.getRuntime().exec("cls");  
    	      }
 
          }  
			catch (final Exception e)  {
				e.printStackTrace();  
			}**/
	  }
  
} 
  
