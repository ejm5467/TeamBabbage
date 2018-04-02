/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babbage2;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Emily
 */
public class BabbageFrame extends javax.swing.JFrame {

    public CardLayout card;
    public ArrayList movies;
    /**
     * Creates new form BabbageFrame
     */
    public BabbageFrame(ArrayList a) {
        movies = a;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

//        babbage1 = new mybabbage.MyBabbage();
        panel = new JPanel(); 
        this.add(panel);
        loginView1 = new Login.LoginView(this);
        mainMenuView1 = new MainMenu.MainMenuView(this);
        sellTicketsView1 = new SellTickets.SellTicketsView(movies);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        card = new CardLayout();
        panel.setLayout(card);
        panel.add(loginView1, "card2");
        panel.add(mainMenuView1, "card3");
        panel.add(sellTicketsView1, "card4");
       

        pack();
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
//    private mybabbage.MyBabbage babbage1;
    public JPanel panel;
    private Login.LoginView loginView1;
    private MainMenu.MainMenuView mainMenuView1;
    private SellTickets.SellTicketsView sellTicketsView1;
    // End of variables declaration                   
}
