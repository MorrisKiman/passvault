/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passvault;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 *
 * @author KIMANI
 */
public class PassVault {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(() -> {
            // Create a JFrame as the main window
            JFrame frame = new JFrame("PassVault");

            // Add the Login panel
            frame.setContentPane(new LoginPage());

            // Default close behavior overridden
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

            // Add a window listener for close confirmation
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    int choice = JOptionPane.showConfirmDialog(
                            frame,
                            "Are you sure you want to close PassVault?",
                            "Exit PassVault?",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE
                    );
                    if (choice == JOptionPane.YES_OPTION) {
                        frame.dispose();  // closes the window
                        System.exit(0);   // exits the app completely
                    }
                }
            });

            // Adjust size to fit components
            frame.pack();

            // Center the window on screen
            frame.setLocationRelativeTo(null);

            // Show the window
            frame.setVisible(true);
        });
    }
    
}
