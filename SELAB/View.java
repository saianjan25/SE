import java.awt.*;
import javax.swing.*;
// import javax.swing.table.JTableHeader;

import java.io.*;
import java.util.*;
public class View extends JPanel{
    public View(String filename) throws Exception{
        Scanner scan = new Scanner(new File(filename));
        int i = 0;
        while(scan.hasNextLine()) {
            i+=1;
            scan.nextLine();
        }
        scan = new Scanner(new File(filename));
        Object data[][] = new Object[i][5];
        int c = 0;
        while(scan.hasNextLine()){
            String s = scan.nextLine();
            // System.out.println(s);
            String info[]=s.split(",");
            for(int j=0;j<5;j++) {
                data[c][j] = info[j];
            }
            c += 1;
        }
        String[] headings = {"Bookname", "Isbn" ,"Author" ,"Publisher" ,"Count"};
        JTable table = new JTable(data, headings);
    
        JFrame jfrm = new JFrame("books");
        jfrm.setSize(500,500);
        jfrm.setLayout(new FlowLayout());
       // jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // JTabbedPane jtp = new JTabbedPane();
        // jtp.add("Book Details", table);
        jfrm.add(table);
        jfrm.setVisible(true);
    }
    public static void run(String filename)throws Exception{
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                try {
                    new View(filename);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
}
    
