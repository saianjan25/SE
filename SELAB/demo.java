// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileReader;
// import java.util.ArrayList;
// import java.util.List;
// import java.awt.*;
// import javax.swing.JFrame;
// import javax.swing.JPanel;
// import javax.swing.JTable;
// import javax.swing.SwingUtilities;
// import javax.swing.table.DefaultTableModel;

// public class View {

//     public static void view(String filename) {
//         try {

//             BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
//             List<String[]> elements = new ArrayList<String[]>();
//             String line = null;
//             while((line = br.readLine())!=null) {
//                 String[] splitted = line.split(",");
//                 elements.add(splitted);
//             }
//             br.close();
//             JTable table = new JTable();
//             Object[][] content = new Object[elements.size()][5];
//             for(int i=0; i<elements.size(); i++) {
//             	content[i][0] = 
//                 content[i][0] = elements.get(i)[0];
//                // System.out.println(content[i][0]);
//                 content[i][1] = elements.get(i)[1];
//                // System.out.println(content[i][1]);
//                 content[i][2] = elements.get(i)[2];
//                 content[i][3] = elements.get(i)[3];
//                 content[i][4] = elements.get(i)[4];
//             }

//             table.setModel(new DefaultTableModel(content,columNames));
//            // table.setModel(new DefaultTableModel(content,columNames));

//             JFrame frame = new JFrame();
//             frame.setLayout(new FlowLayout());
//             frame.setSize(1000,1000);
//             JPanel panel = new JPanel();
//             panel.add(table);
//             frame.getContentPane().add(panel);
//             frame.setVisible(true);

//             //System.out.println(table.getModel().getValueAt(1, 1));

//         } catch (Exception ex) {
//             ex.printStackTrace();
//         }



//     }

//     public static void run(String filename) {
//     	SwingUtilities.invokeLater(new Runnable(){
//             public void run(){
//                 try {
//                    View.view(String filename);
//                 } catch (Exception e) {
//                     e.printStackTrace();
//                 }
//             }
//         });
//     }
// }