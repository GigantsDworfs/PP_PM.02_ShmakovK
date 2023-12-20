import javax.swing.JFrame;
import javax.swing.WindowConstants;

/* Шмаков Кирилл */

public class AppOval extends JFrame {

    private static AppOval oval;
    
    public static void main(String[] args) {
    
        oval = new AppOval();
        oval.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        oval.setLocation(200, 50);
        oval.setSize(900, 600);
        oval.setResizable(false);
        FieldOval oval_field = new Field();
        oval.add(oval_field);
        oval.setVisible(true);
        
    }
    
    public static void onRepaint(Graphics g) {
    
    }
    
    public static class AppOval extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g){
        
        super.paint(g);
            onRepaint(g);
    }    

}