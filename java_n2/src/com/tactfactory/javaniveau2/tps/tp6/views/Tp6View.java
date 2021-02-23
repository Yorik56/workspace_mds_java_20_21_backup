package com.tactfactory.javaniveau2.tps.tp6.views;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import com.tactfactory.javaniveau2.tps.tp6.entities.User;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tp6View {

  private JFrame frame;
  private Map<String,Object> components = new HashMap<String, Object>();

  public Map<String, Object> getComponents() {
    return components;
  }

  /**
   * Create the application.
   */
  public Tp6View() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setTitle("Tp6");
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] {10, 0, 0, 0, 10};
    gridBagLayout.rowHeights = new int[] {10, 0, 0, 0, 0, 0, 10};
    gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
    gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
    frame.getContentPane().setLayout(gridBagLayout);

    List<GridBagConstraints> constraints = new ArrayList<GridBagConstraints>();

    GridBagConstraints gbc_lblTitle = new GridBagConstraints();
    gbc_lblTitle.gridx = 1;
    gbc_lblTitle.gridy = 1;
    gbc_lblTitle.gridwidth = 3;
    constraints.add(gbc_lblTitle);

    GridBagConstraints gbc_lblLastname = new GridBagConstraints();
    gbc_lblLastname.gridx = 1;
    gbc_lblLastname.gridy = 2;
    constraints.add(gbc_lblLastname);


    GridBagConstraints gbc_tfLastname = new GridBagConstraints();
    gbc_tfLastname.gridx = 2;
    gbc_tfLastname.gridy = 2;
    constraints.add(gbc_tfLastname);

    GridBagConstraints gbc_lblFirstname = new GridBagConstraints();
    gbc_lblFirstname.gridx = 1;
    gbc_lblFirstname.gridy = 3;
    constraints.add(gbc_lblFirstname);

    GridBagConstraints gbc_tfFirstname = new GridBagConstraints();
    gbc_tfFirstname.gridx = 2;
    gbc_tfFirstname.gridy = 3;
    constraints.add(gbc_tfFirstname);

    GridBagConstraints gbc_btnDel = new GridBagConstraints();
    gbc_btnDel.gridx = 1;
    gbc_btnDel.gridy = 4;
    constraints.add(gbc_btnDel);

    GridBagConstraints gbc_btnAdd = new GridBagConstraints();
    gbc_btnAdd.gridx = 3;
    gbc_btnAdd.gridy = 4;
    constraints.add(gbc_btnAdd);

    GridBagConstraints gbc_listUsers = new GridBagConstraints();
    gbc_listUsers.gridx = 1;
    gbc_listUsers.gridy = 5;
    constraints.add(gbc_listUsers);

    for (GridBagConstraints gridBagConstraints : constraints) {
      gridBagConstraints.insets = new Insets(0, 0, 5, 5);
      gridBagConstraints.weighty = 100;
      gridBagConstraints.weightx = 100;
      gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
    }

    JLabel lblTitle = new JLabel("Formulaire");
    gbc_lblTitle.fill = GridBagConstraints.CENTER;
    components.put("lblTitle", lblTitle);
    frame.getContentPane().add(lblTitle, gbc_lblTitle);

    JLabel lblLastname = new JLabel("Nom");
    components.put("lblLastname", lblLastname);
    frame.getContentPane().add(lblLastname, gbc_lblLastname);

    JTextField tfLastname = new JTextField();
    gbc_tfLastname.gridwidth = 2;
    components.put("tfLastname", tfLastname);
    frame.getContentPane().add(tfLastname, gbc_tfLastname);

    JLabel lblFirstname = new JLabel("Prénom");
    components.put("lblFirstname", lblFirstname);
    frame.getContentPane().add(lblFirstname, gbc_lblFirstname);

    JTextField tfFirstname = new JTextField();
    gbc_tfFirstname.gridwidth = 2;
    components.put("tfFirstname", tfFirstname);
    frame.getContentPane().add(tfFirstname, gbc_tfFirstname);

    JButton btnDel = new JButton("Supprimer");
    components.put("btnDel", btnDel);
    frame.getContentPane().add(btnDel, gbc_btnDel);

    JButton btnAdd = new JButton("Ajouter");
    components.put("btnAdd", btnAdd);
    frame.getContentPane().add(btnAdd, gbc_btnAdd);

    DefaultListModel<User> listModel = new DefaultListModel<User>();
    for (int i = 0; i < 100; i++) {
      User user = new User();
      user.setFirstname("f"+i);
      user.setLastname("l"+i);
      listModel.addElement(user);
    }
    components.put("listUsersModel", listModel);

    JList<User> listUsers = new JList<User>(listModel);
    listUsers.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    gbc_listUsers.gridwidth = 3;
    gbc_listUsers.fill = GridBagConstraints.BOTH;
    components.put("listUsers", listUsers);
    frame.getContentPane().add(new JScrollPane(listUsers), gbc_listUsers);
  }

  public void show() {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Tp6View window = Tp6View.this;
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

}
