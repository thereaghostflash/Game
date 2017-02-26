package demo.ui;

import ui.panel.BackpackPanel;

import javax.swing.*;

/**
 * @author Qi Xia
 */
public class BackpackPanelDemo extends JFrame{
    public static void main(String[] args) {
        BackpackPanelDemo window = new BackpackPanelDemo();
        window.setSize(500, 400);
        window.setLayout(null);
        window.setVisible(true);
    }

    public BackpackPanelDemo(){
        BackpackPanel backpackPanel = new BackpackPanel();
        backpackPanel.setLocation(0, 20);
        this.add(backpackPanel);
    }
}
