package Startup;

import Interface.Info;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Millionaire {

    public static void main(String[] args) {
        
        setApperance();
        initializeGUI();
    }
    
    private static void initializeGUI() {
        Info.show(null);
    }
    
    private static void setApperance() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            System.err.println("Class not found.");
        } catch (InstantiationException ex) {
            System.err.println("Instantiation exception.");
        } catch (IllegalAccessException ex) {
            System.err.println("Illegal access exception.");
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Unsupported theme!");
        } 
    }
}
