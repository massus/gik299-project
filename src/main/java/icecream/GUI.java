/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecream;

import java.util.ArrayList;

/**
 *
 * @author acezack
 */
public class GUI extends javax.swing.JFrame {

    ArrayList<IceCream> iceCreamArray;
    int scrollIndex = 0;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        ddProductType.removeAllItems();
        ddProductType.addItem("popsicle");
        ddProductType.addItem("cone");

        iceCreamArray = new ArrayList();
        iceCreamArray.add(new IceCream("0", "popsicle", "GB Glass", 19, 5, "cola", true, false));
        iceCreamArray.add(new IceCream("1", "popsicle", "GB Glass", 19, 7, "jordgubbe", true, false));
        iceCreamArray.add(new IceCream("2", "cone", "GB Glass", 25, 3, "choklad", true, true));
        
        updateLabels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        labelOutput = new javax.swing.JLabel();
        btnShowAll = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnScrollLeft = new javax.swing.JButton();
        btnScrollRight = new javax.swing.JButton();
        labelPopsicles = new javax.swing.JLabel();
        labelCones = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        labelTotalPrice = new javax.swing.JLabel();
        btnSort = new javax.swing.JButton();
        tfProductID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfProductBrand = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfProductPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfProductStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfProductFlavour = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbVegan = new javax.swing.JCheckBox();
        cbAllergens = new javax.swing.JCheckBox();
        ddProductType = new javax.swing.JComboBox<>();
        btnSale = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnSearchPrice = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("MainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(775, 515));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.setFocusable(false);
        jScrollPane1.setViewportView(txtArea);

        labelOutput.setText("Output:");

        btnShowAll.setLabel("Show all");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.setPreferredSize(new java.awt.Dimension(75, 23));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnScrollLeft.setText("<");
        btnScrollLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScrollLeftActionPerformed(evt);
            }
        });

        btnScrollRight.setText(">");
        btnScrollRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScrollRightActionPerformed(evt);
            }
        });

        labelPopsicles.setText("Popsicles: ");

        labelCones.setText("Cones:");

        labelTotal.setText("Total:");

        btnSearch.setText("Search");
        btnSearch.setMaximumSize(new java.awt.Dimension(63, 23));
        btnSearch.setMinimumSize(new java.awt.Dimension(62, 23));
        btnSearch.setPreferredSize(new java.awt.Dimension(62, 23));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        labelTotalPrice.setText("Price:");

        btnSort.setText("Sort");

        jLabel1.setText("ID:");

        jLabel2.setText("Type:");

        tfProductBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProductBrandActionPerformed(evt);
            }
        });

        jLabel3.setText("Brand:");

        jLabel4.setText("Price:");

        jLabel5.setText("Stock:");

        jLabel6.setText("Flavour:");

        jLabel7.setText("Vegan:");

        jLabel8.setText("Allergens:");

        cbVegan.setText("Vegan?");

        cbAllergens.setText("Other than dairy?");

        ddProductType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSale.setText("SALE");

        btnRemove.setText("Remove");
        btnRemove.setPreferredSize(new java.awt.Dimension(75, 23));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnSearchPrice.setText("Search");
        btnSearchPrice.setToolTipText("Searches for items with a price lower than entered in the price-field.");
        btnSearchPrice.setPreferredSize(new java.awt.Dimension(75, 23));
        btnSearchPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPriceActionPerformed(evt);
            }
        });

        jLabel9.setLabelFor(btnSearchPrice);
        jLabel9.setText("*");
        jLabel9.setToolTipText("Searches for items with a price lower than entered in the price-field.");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSale, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfProductBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbAllergens)
                                        .addComponent(cbVegan)
                                        .addComponent(tfProductFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ddProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRemove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelOutput)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnScrollLeft)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelPopsicles)
                            .addComponent(labelCones, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTotalPrice)
                            .addComponent(labelTotal))
                        .addGap(80, 80, 80)
                        .addComponent(btnScrollRight))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelOutput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(ddProductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfProductBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(btnSearchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfProductFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(cbVegan))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cbAllergens))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPopsicles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelCones))
                            .addComponent(btnScrollLeft)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTotalPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTotal))
                            .addComponent(btnScrollRight))))
                .addGap(97, 97, 97))
        );

        btnShowAll.getAccessibleContext().setAccessibleName("btnShowAll");
        btnAdd.getAccessibleContext().setAccessibleName("btnAdd");
        btnScrollLeft.getAccessibleContext().setAccessibleName("btnScrollLeft");
        btnScrollRight.getAccessibleContext().setAccessibleName("btnScrollRight");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfProductBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProductBrandActionPerformed

    }//GEN-LAST:event_tfProductBrandActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        boolean IDexists = false;
        if (!(tfProductID.getText().equals("")
                || tfProductBrand.getText().equals("")
                || tfProductPrice.getText().equals("")
                || tfProductStock.getText().equals("")
                || tfProductFlavour.getText().equals(""))) {

            for (IceCream iceCream : iceCreamArray) {
                if (iceCream.getId().equals(tfProductID.getText())) {
                    IDexists = true;
                }
            }
            if (IDexists) {
                txtArea.setText("Product-ID: " + tfProductID.getText() + " already exists.");
            } else {
                try {
                    iceCreamArray.add(new IceCream(
                            tfProductID.getText(),
                            ddProductType.getSelectedItem().toString(),
                            tfProductBrand.getText(),
                            Double.parseDouble(tfProductPrice.getText()),
                            Integer.parseInt(tfProductStock.getText()),
                            tfProductFlavour.getText(),
                            cbVegan.isSelected(),
                            cbAllergens.isSelected()));
                    txtArea.setText("Product added!");
                    tfProductID.setText("");
                    ddProductType.setSelectedIndex(0);
                    tfProductBrand.setText("");
                    tfProductPrice.setText("");
                    tfProductStock.setText("");
                    tfProductFlavour.setText("");
                    cbVegan.setSelected(false);
                    cbAllergens.setSelected(false);
                } catch (NumberFormatException e) {
                    txtArea.setText("Could not add, check information.");
                }

            }
        } else {
            txtArea.setText("Missing information to be able to add in to the list.");
        }
        updateLabels();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        if (iceCreamArray.isEmpty()) {
            txtArea.setText("Nothing in stock.");
        } else {
            txtArea.setText("");
            for (var i : iceCreamArray) {
                txtArea.append(i.getPrintable());
            }
        }
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        for (var i : iceCreamArray) {
            if (i.getId().equals(tfProductID.getText())) {
                txtArea.setText("Product-ID " + i.getId() + " has been removed.");
                tfProductID.setText("");
                iceCreamArray.remove(i);
                break;
            } else {
                txtArea.setText("The product with ID: " + tfProductID.getText() + " was not found.");
            }
        }
        updateLabels();
    }//GEN-LAST:event_btnRemoveActionPerformed
    private void btnScrollLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScrollLeftActionPerformed
        // TODO add your handling code here:
        scrollIndex--;
        if (scrollIndex == - 1) {
            scrollIndex = iceCreamArray.size() - 1;
        }
        txtArea.setText("Index: " + scrollIndex + "\n\n" + iceCreamArray.get(scrollIndex).getPrintable());
    }//GEN-LAST:event_btnScrollLeftActionPerformed

    private void btnScrollRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScrollRightActionPerformed
        // TODO add your handling code here:
        scrollIndex++;
        if (scrollIndex == iceCreamArray.size()) {
            scrollIndex = 0;
        }
        txtArea.setText("Index: " + scrollIndex + "\n\n" + iceCreamArray.get(scrollIndex).getPrintable());
    }//GEN-LAST:event_btnScrollRightActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int searchHits = 0;
        
        txtArea.setText("");
        for (var i : iceCreamArray) {
            if (i.getType().equals(ddProductType.getSelectedItem().toString()) && i.getBrand().equals(tfProductBrand.getText())) {
                txtArea.append(i.getPrintable());
                searchHits++;
            } else {
                txtArea.setText("Could not find items with given parameters.");
            }
        }
        txtArea.append("Search hits: " + searchHits);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        boolean found = false;
        for (var i : iceCreamArray) {
            if (i.getId().equals(tfProductID.getText())) {
                i.setPrice(Double.parseDouble(tfProductPrice.getText()));
                i.setStock(Integer.parseInt(tfProductStock.getText()));
                
                txtArea.setText("");
                txtArea.append("You changed product with ID: " + i.getId() + "\n\n");
                txtArea.append(i.getPrintable());
                found = true;
            }
        }
        
        if (!found) {
            txtArea.setText("ID not found");
        }
        updateLabels();
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnSearchPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPriceActionPerformed
        // TODO add your handling code here:
        boolean itemsFound = false;
        txtArea.setText("");
        for (IceCream iceCream : iceCreamArray) {
            if (iceCream.getPrice() < Double.parseDouble(tfProductPrice.getText())) {
                txtArea.append(iceCream.getPrintable());
                itemsFound = true;
            }
        }
        if (!itemsFound) {
            txtArea.setText("No items found with a price lower than " + tfProductPrice.getText() + "kr.");
        }
    }//GEN-LAST:event_btnSearchPriceActionPerformed

    private void updateLabels () {
        int popsicles = 0;
        int cones = 0;
        double totalPrice = 0;
        
        for (IceCream iceCream : iceCreamArray) {
            if (iceCream.getType().equals("popsicle")) {
                popsicles++;
            } else {
                cones++;
            }
            
            totalPrice += iceCream.getPrice();
        }
        
        labelPopsicles.setText("Popsicles: " + popsicles);
        labelCones.setText("Cones: " + cones);
        labelTotalPrice.setText("Total price: " + totalPrice);
        labelTotal.setText("Total stock: " + (popsicles + cones));
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSale;
    private javax.swing.JButton btnScrollLeft;
    private javax.swing.JButton btnScrollRight;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchPrice;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JButton btnSort;
    private javax.swing.JCheckBox cbAllergens;
    private javax.swing.JCheckBox cbVegan;
    private javax.swing.JComboBox<String> ddProductType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCones;
    private javax.swing.JLabel labelOutput;
    private javax.swing.JLabel labelPopsicles;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelTotalPrice;
    private javax.swing.JTextField tfProductBrand;
    private javax.swing.JTextField tfProductFlavour;
    private javax.swing.JTextField tfProductID;
    private javax.swing.JTextField tfProductPrice;
    private javax.swing.JTextField tfProductStock;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
