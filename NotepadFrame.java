
package za.ac.tut.ui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class NotepadFrame extends JFrame{
    
    private JMenuBar menuBar;
    private JMenu helpMenu;
    
    private JMenuItem fileMenuItem;
    private JMenuItem editMenuItem;
    private JMenuItem formatMenuItem;
    private JMenuItem viewJMenuItem;
    
    private JMenuItem viewHelpSubMenuItem;
    private JMenuItem feedbackHelpSubMenuItem;
    private JMenuItem aboutHelpSubMenuItem;

    public NotepadFrame() {
        
        setTitle("Notepad");
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 450);
        
        fileMenuItem = new JMenuItem("File");
        editMenuItem = new JMenuItem("Edit");
        formatMenuItem = new JMenuItem("Format");
        viewJMenuItem = new JMenuItem("View");
        helpMenu = new JMenu("Help");
        
        viewHelpSubMenuItem = new JMenuItem("View Help");
        feedbackHelpSubMenuItem = new JMenuItem("Send Feedback");
        aboutHelpSubMenuItem = new JMenuItem("About Notepad");
        
        helpMenu.add(viewHelpSubMenuItem);
        helpMenu.add(feedbackHelpSubMenuItem);
        helpMenu.addSeparator();
        helpMenu.add(aboutHelpSubMenuItem);
        
        menuBar = new JMenuBar();
        
        menuBar.add(fileMenuItem);
        menuBar.add(editMenuItem);
        menuBar.add(formatMenuItem);
        menuBar.add(viewJMenuItem);
        menuBar.add(helpMenu);
        
        setJMenuBar(menuBar);
        
        setVisible(true);
        
        
    }
    
    
    
}
