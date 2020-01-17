/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author acezack
 * @author massus
 */
public class GUI extends javax.swing.JFrame {

    ArrayList<IceCream> iceCreamArray;
    int scrollIndex = 0;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        // Rensar och lägger till korrekta typer i vår dropdown för glasstyper.
        ddIceCreamType.removeAllItems();
        ddIceCreamType.addItem("popsicle");
        ddIceCreamType.addItem("cone");

        // Lägger till tre glassar i arrayen.
        iceCreamArray = new ArrayList();
        iceCreamArray.add(new IceCream("0", "popsicle", "GB Glass", 19, 5, "cola", true, false));
        iceCreamArray.add(new IceCream("1", "popsicle", "GB Glass", 19, 7, "jordgubbe", true, false));
        iceCreamArray.add(new IceCream("2", "cone", "GB Glass", 25, 3, "choklad", true, true));

        btnShowAll.doClick();
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
        tfIceCreamID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfIceCreamBrand = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfIceCreamPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfIceCreamStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfIceCreamFlavour = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbVegan = new javax.swing.JCheckBox();
        cbAllergens = new javax.swing.JCheckBox();
        ddIceCreamType = new javax.swing.JComboBox<>();
        btnSale = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnSearchPrice = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("MainFrame"); // NOI18N
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
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Type:");

        tfIceCreamBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIceCreamBrandActionPerformed(evt);
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

        ddIceCreamType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSale.setText("SALE");
        btnSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleActionPerformed(evt);
            }
        });

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
                                        .addComponent(tfIceCreamBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfIceCreamPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfIceCreamStock, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbAllergens)
                                        .addComponent(cbVegan)
                                        .addComponent(tfIceCreamFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ddIceCreamType, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfIceCreamID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                .addGap(76, 76, 76)))
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelOutput)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnScrollLeft)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelPopsicles)
                            .addComponent(labelCones, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTotalPrice)
                            .addComponent(labelTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                    .addComponent(tfIceCreamID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(ddIceCreamType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIceCreamBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfIceCreamPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(btnSearchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfIceCreamStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfIceCreamFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(10, 10, 10))
        );

        btnShowAll.getAccessibleContext().setAccessibleName("btnShowAll");
        btnAdd.getAccessibleContext().setAccessibleName("btnAdd");
        btnScrollLeft.getAccessibleContext().setAccessibleName("btnScrollLeft");
        btnScrollRight.getAccessibleContext().setAccessibleName("btnScrollRight");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfIceCreamBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIceCreamBrandActionPerformed

    }//GEN-LAST:event_tfIceCreamBrandActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        boolean iceCreamIDExists = false;
        
        // Kollar så att inget fält är tomt
        if (!(tfIceCreamID.getText().equals("")
                || tfIceCreamBrand.getText().equals("")
                || tfIceCreamPrice.getText().equals("")
                || tfIceCreamStock.getText().equals("")
                || tfIceCreamFlavour.getText().equals(""))) {

            // Kollar så att ID:t inte är upptaget.
            for (IceCream iceCream : iceCreamArray) {
                if (iceCream.getId().equals(tfIceCreamID.getText())) {
                    iceCreamIDExists = true;
                }
            }
            // Om ID:t är upptaget, skriv att det finns.
            if (iceCreamIDExists) {
                txtArea.setText("Product-ID: " + tfIceCreamID.getText() + " already exists.");
            } else {
                // Try-catch för att kunna hantera om användaren skriver in 
                // icke-siffror i fälten för pris och lager som är double
                // respektive int.
                try {
                    iceCreamArray.add(new IceCream(
                            tfIceCreamID.getText(),
                            ddIceCreamType.getSelectedItem().toString(),
                            tfIceCreamBrand.getText(),
                            Double.parseDouble(tfIceCreamPrice.getText()),
                            Integer.parseInt(tfIceCreamStock.getText()),
                            tfIceCreamFlavour.getText(),
                            cbVegan.isSelected(),
                            cbAllergens.isSelected()));
                    txtArea.setText("Product added!");
                    tfIceCreamID.setText("");
                    ddIceCreamType.setSelectedIndex(0);
                    tfIceCreamBrand.setText("");
                    tfIceCreamPrice.setText("");
                    tfIceCreamStock.setText("");
                    tfIceCreamFlavour.setText("");
                    cbVegan.setSelected(false);
                    cbAllergens.setSelected(false);
                } catch (NumberFormatException e) {
                    txtArea.setText("Could not add, check information.");
                }

            }
        // Är ett fält skriver vi en varning.
        } else {
            txtArea.setText("Missing information to be able to add in to the list.");
        }
        // Uppdaterar våra labels.
        updateLabels();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        // Kollar så att arrayen inte är tom.
        if (iceCreamArray.isEmpty()) {
            txtArea.setText("Nothing in stock.");
        } else {
            // Tömmer textfältet och loopar igenom alla glassar och skriver ut.
            txtArea.setText("");
            for (IceCream iceCream : iceCreamArray) {
                txtArea.append(iceCream.getPrintable());
            }
        }
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        boolean iceCreamRemoved = false;

        // Söker igenom hela arrayen med ID:t från ID-fältet.
        for (IceCream iceCream : iceCreamArray) {
            // Får vi en matchning tar vi bort glassen.
            if (iceCream.getId().equals(tfIceCreamID.getText())) {
                txtArea.setText("Product-ID " + iceCream.getId() + " has been removed.");
                tfIceCreamID.setText("");
                iceCreamArray.remove(iceCream);
                iceCreamRemoved = true;
                break;
            }
        }
        // Hittade vi ingen glass med ID:t skriver vi det.
        if (!iceCreamRemoved) {
            txtArea.setText("The product with ID: " + tfIceCreamID.getText() + " was not found.");
        }
        updateLabels();
    }//GEN-LAST:event_btnRemoveActionPerformed
    private void btnScrollLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScrollLeftActionPerformed
        // Håller koll på position och ser till att den inte hamnar utanför
        // arrayens gränser.
        scrollIndex--;
        if (scrollIndex == - 1) {
            scrollIndex = iceCreamArray.size() - 1;
        }
        txtArea.setText("Index: " + scrollIndex + "\n\n" + iceCreamArray.get(scrollIndex).getPrintable());
    }//GEN-LAST:event_btnScrollLeftActionPerformed

    private void btnScrollRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScrollRightActionPerformed
        // Tvärtom.
        scrollIndex++;
        if (scrollIndex == iceCreamArray.size()) {
            scrollIndex = 0;
        }
        txtArea.setText("Index: " + scrollIndex + "\n\n" + iceCreamArray.get(scrollIndex).getPrintable());
    }//GEN-LAST:event_btnScrollRightActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int searchHits = 0;
        boolean iceCreamFound = false;

        txtArea.setText("");
        // Letar igenom arrayen efter en glass där både glasstyp och glassmärke 
        // samma som är skrivna i fälten i GUI:t och säger att glass hittades,
        // skriver ut alla träffar och räknar antalet träffar.
        for (IceCream iceCream : iceCreamArray) {
            if (iceCream.getType().equals(ddIceCreamType.getSelectedItem().toString()) && iceCream.getBrand().equals(tfIceCreamBrand.getText())) {
                txtArea.append(iceCream.getPrintable());
                iceCreamFound = true;
                searchHits++;
            }
        }
        // Hittades ingen glass skriver vi det.
        if (!iceCreamFound) {
            txtArea.setText("Could not find items with given parameters.");
            // Hittades en glass skriver vi ut hur många som hittades.
        } else {
            txtArea.append("Search hits: " + searchHits);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        boolean iceCreamFound = false;

        // Letar igenom arrayen efter ett ID som passar och ändrar datan för det
        // ID:t med objektets setters.
        for (IceCream iceCream : iceCreamArray) {
            if (iceCream.getId().equals(tfIceCreamID.getText())) {
                // Fångar upp om användaren skriver något annat än siffror i 
                // vardera fält.
                try {
                    iceCream.setPrice(Double.parseDouble(tfIceCreamPrice.getText()));
                    iceCream.setStock(Integer.parseInt(tfIceCreamStock.getText()));

                    txtArea.setText("");
                    txtArea.append("You changed product with ID: " + iceCream.getId() + "\n\n");
                    txtArea.append(iceCream.getPrintable());
                    iceCreamFound = true;
                    break;
                } catch (NumberFormatException e) {
                    txtArea.setText("Could not handle input. Check price "
                            + "and stock-fields.");
                }
            }
        }

        // Printar att produkt inte hittades
        if (!iceCreamFound) {
            txtArea.setText("Product with ID: " + tfIceCreamID.getText()
                    + " not found");
        }
        updateLabels();
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnSearchPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPriceActionPerformed
        // TODO add your handling code here:

        // Letar igenom alla objekts .getPrice() efter ett pris som är lägre 
        // än i pris-fältet i GUI:t och om det är lägre skriver vi ut det.
        boolean itemsFound = false;
        txtArea.setText("");
        for (IceCream iceCream : iceCreamArray) {
            if (iceCream.getPrice() < Double.parseDouble(tfIceCreamPrice.getText())) {
                txtArea.append(iceCream.getPrintable());
                itemsFound = true;
            }
        }
        // Hittade vi ingen glass med lägre pris skriver vi ut det.
        if (!itemsFound) {
            txtArea.setText("No items found with a price lower than " + tfIceCreamPrice.getText() + "kr.");
        }
    }//GEN-LAST:event_btnSearchPriceActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed

        // Sorterar arrayen med hjälp av en komparator som jämför märkena 
        // alfabetiskt.
        if (iceCreamArray.isEmpty()) {
            txtArea.setText("No ice cream in stock...");
        } else {
            Collections.sort(iceCreamArray, new Comparator<IceCream>() {
                @Override
                public int compare(IceCream a, IceCream b) {
                    return a.getBrand().compareToIgnoreCase(b.getBrand());
                }
            });
            txtArea.setText("Sorted by brand.");
        }
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleActionPerformed
        // TODO add your handling code here:

        // Variabler för att hantera sökningen
        Random randomiser = new Random();
        // Slumpad index
        int randomNumber = randomiser.nextInt(iceCreamArray.size());
        // Håller koll på om vi hittade en glass.
        boolean itemFound = false;
        // Håller koll på gamla priset.
        double oldPrice = 0;
        // Håller koll på ID:s på alla glassar vi redan försökt gjort en sale på.
        ArrayList<String> iceCreamsSearched = new ArrayList();

        // Loopar så länge itemFound = false och antalet sökta glassar är lägre
        // än antalet glassar i vår huvudsakliga array.
        while (itemFound == false && iceCreamsSearched.size() < iceCreamArray.size()) {
            // Kollar om vår slumpade glass har ett lagerantal över 0
            if (iceCreamArray.get(randomNumber).getStock() > 0) {
                // Säger att vi hittat en glass med lagerantal över 0.
                itemFound = true;

                oldPrice = iceCreamArray.get(randomNumber).getPrice();
                // Hämtar glassen ifråga och sätter en nytt pris vilket är
                // dess gamla pris multiplicerat med 0,65.
                iceCreamArray.get(randomNumber).setPrice(iceCreamArray.get(randomNumber).getPrice() * 0.65);
                // Uppdaterar totala priset via vår metod.
                updateLabels();
                // Skriver ut alla glassar igen
                btnShowAll.doClick();
                // Skriver en rad längst ner som informerar.
                txtArea.append(String.format("Product-ID: " + iceCreamArray.get(randomNumber).getId() + " has had it's price reduced by 45%%!\n"
                        + "Was %.2f kr, it now costs: %.2f kr!", oldPrice, iceCreamArray.get(randomNumber).getPrice()));
            } else {
                // Hittade vi ingen glass med ett lager>0 på detta slumpade tal
                // kollar vi om vår sökning redan finns lagrad.
                // Finns den inte lägger vi till sökningen i vår lista över 
                // sökningar.
                if (!iceCreamsSearched.contains(iceCreamArray.get(randomNumber).getId())) {
                    iceCreamsSearched.add(iceCreamArray.get(randomNumber).getId());
                }
                // Slumpar fram ett nytt tal.
                randomNumber = randomiser.nextInt(iceCreamArray.size());
            }
        }
        // Om vi slumpade fram allting men inget fanns i lager skriver vi det.
        if (iceCreamsSearched.size() == iceCreamArray.size()) {
            txtArea.setText("No items in stock to put on sale.");
        }

    }//GEN-LAST:event_btnSaleActionPerformed

    // Metod för att updatera labels.
    private void updateLabels() {
        int popsicles = 0;
        int cones = 0;
        double totalPrice = 0;

        // Loopar igenom och får lagerantalet på alla typer vi hade(popsicle 
        // eller cone).
        for (IceCream iceCream : iceCreamArray) {
            if (iceCream.getType().equals("popsicle")) {
                popsicles += iceCream.getStock();
            } else {
                cones += iceCream.getStock();
            }
            // Sparar in priset för varje glass.
            totalPrice += iceCream.getPrice() * iceCream.getStock();
        }

        // Uppdaterar alla labels.
        labelPopsicles.setText("Popsicles: " + popsicles);
        labelCones.setText("Cones: " + cones);
        labelTotalPrice.setText(String.format("Total price: %.2f kr", totalPrice));
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
    private javax.swing.JComboBox<String> ddIceCreamType;
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
    private javax.swing.JTextField tfIceCreamBrand;
    private javax.swing.JTextField tfIceCreamFlavour;
    private javax.swing.JTextField tfIceCreamID;
    private javax.swing.JTextField tfIceCreamPrice;
    private javax.swing.JTextField tfIceCreamStock;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
