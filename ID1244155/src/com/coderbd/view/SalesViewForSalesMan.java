package com.coderbd.view;

import com.coderbd.domain.Purchase;
import com.coderbd.domain.Sales;
import com.coderbd.domain.Summary;
import com.coderbd.domain.User;
import com.coderbd.service.PurchaseService;
import com.coderbd.service.ReportService;
import com.coderbd.service.SalesService;
import com.coderbd.service.SummaryService;
import com.coderbd.util.MenuFormSalesMan;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class SalesViewForSalesMan extends javax.swing.JFrame {

    public SalesViewForSalesMan() {
        initComponents();
        displaySummaryIntoTable();
        if (rAllSales.isSelected() == true) {
            displaySalesIntoTable();
        }

        txtProductId.setVisible(false);
        MenuFormSalesMan.commonMenuForSalesMan(this);
        txtLoginMsg.setText(Login.loggedIn);
    }

    public void clearForm() {

        txtPName.setText("");
        txtPCode.setText("");
        txtQty.setText("");
        txtUnitPrice.setText("");
        txtTotalPrice.setText("");
        lblMsg.setText("");
    }

    public void displaySummaryIntoTable() {
        DefaultTableModel model = (DefaultTableModel) tblSummary.getModel();
        model.setRowCount(0);
        Object[] row = new Object[6];
        List<Summary> summarys = SummaryService.getSummaryList();
        for (int i = 0; i < summarys.size(); i++) {
            row[0] = summarys.get(i).getProductName();
            row[1] = summarys.get(i).getProductCode();
            row[2] = summarys.get(i).getTotalQty();
            row[3] = summarys.get(i).getSoldQty();
            row[4] = summarys.get(i).getAvailableQty();
            row[5] = summarys.get(i).getPurchase().getProductCategory().getName();
            model.addRow(row);
        }

    }

    public void displaySalesIntoTable() {
        DefaultTableModel model = (DefaultTableModel) tblSales.getModel();
        model.setRowCount(0);
        Object[] row = new Object[7];
        List<Sales> list = ReportService.getSalesByUser(Login.loggedInUserId);
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getProductName();
            row[1] = list.get(i).getProductCode();
            row[2] = list.get(i).getQty();
            row[3] = list.get(i).getUnitprice();
            row[4] = list.get(i).getTotalPrice();
            row[5] = list.get(i).getSalesdate();
            row[6] = list.get(i).getPurchase().getProductCategory().getName();

            model.addRow(row);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtLoginMsg = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSummary = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSales = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rAllSales = new javax.swing.JRadioButton();
        txtStartDate = new javax.swing.JTextField();
        txtEndDate = new javax.swing.JTextField();
        btnViewSales = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPCode = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblMsg = new javax.swing.JLabel();
        btnSales = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        txtAvialble = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JLabel();
        txtProductId = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Brush Script MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mobile & Accessories Collection ");

        txtLoginMsg.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 51));
        jLabel13.setText("Jahan's");

        jPanel3.setBackground(new java.awt.Color(231, 229, 135));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Store Summary"));

        tblSummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code", "Total Qty", "Sold Qty", "Available Qty", "Category"
            }
        ));
        jScrollPane2.setViewportView(tblSummary);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(92, 207, 207));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Sales Details Info"));

        tblSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code", "Qty", "U.P", "T.P", "Date", "Category"
            }
        ));
        jScrollPane1.setViewportView(tblSales);

        jLabel11.setText("From Date");

        jLabel12.setText("To Date");

        rAllSales.setSelected(true);
        rAllSales.setText("All");

        txtStartDate.setText("2018-01-15");

        txtEndDate.setText("2018-12-31");

        btnViewSales.setBackground(new java.awt.Color(231, 229, 135));
        btnViewSales.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnViewSales.setText("View Sales");
        btnViewSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rAllSales)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewSales)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnViewSales))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rAllSales)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(234, 169, 114));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Sell  Products");

        jLabel6.setText("Product Name");

        jLabel7.setText("Product Code");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel8.setText("Unit Price");

        txtUnitPrice.setText("0");

        jLabel9.setText("Sales Qty");

        txtQty.setText("0");
        txtQty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtQtyMousePressed(evt);
            }
        });

        jLabel10.setText("Total Price");

        btnSales.setBackground(new java.awt.Color(92, 207, 207));
        btnSales.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSales.setText("Sales");
        btnSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesActionPerformed(evt);
            }
        });

        jLabel5.setText("Available Qty");

        btnClear.setBackground(new java.awt.Color(92, 207, 207));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtAvialble.setText("0");

        txtTotalPrice.setText("0");

        txtProductId.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnClear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSales))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                    .addGap(24, 24, 24))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(27, 27, 27)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPName)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtPCode, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSearch))
                                .addComponent(txtUnitPrice)
                                .addComponent(txtQty)
                                .addComponent(txtAvialble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTotalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtProductId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(txtProductId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(txtAvialble, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSales)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coderbd/picturs/icon.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLoginMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLoginMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2018 J2EE Round-37, CCSL, All rights reserved.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        try {
            if (txtPCode.getText().trim().length() >= 5) {

                Summary summary = SummaryService.getSummaryByProductCode(txtPCode.getText().trim());
                txtAvialble.setText(String.valueOf(summary.getAvailableQty()));

                Purchase purchase = PurchaseService.getProductDetails(txtPCode.getText().trim());
                txtPName.setText(purchase.getProductName());
                txtUnitPrice.setText(String.valueOf(Math.round(purchase.getUnitprice() * 1.10)));
                txtProductId.setText(String.valueOf(purchase.getId()));
            } else {
                lblMsg.setText("Enter Valid Product Code");
            }
        } catch (Exception e) {
            lblMsg.setText("Enter Valid Product Code");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtQtyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQtyMousePressed
        // TODO add your handling code here:
        double price = Double.parseDouble(txtUnitPrice.getText().trim()) * Integer.parseInt(txtQty.getText().trim());
        txtTotalPrice.setText(String.valueOf(price));
    }//GEN-LAST:event_txtQtyMousePressed

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
        // TODO add your handling code here:
        Sales sales = new Sales();
        sales.setProductName(txtPName.getText().trim());
        sales.setProductCode(txtPCode.getText().trim());
        sales.setQty(Integer.parseInt(txtQty.getText().trim()));
        sales.setUnitprice(Double.parseDouble(txtUnitPrice.getText().trim()));
        sales.setTotalPrice(Double.parseDouble(txtTotalPrice.getText().trim()));
        sales.setSalesdate(new Date());
        Purchase purchase = new Purchase();
        purchase.setId(Integer.parseInt(txtProductId.getText().trim()));
        sales.setPurchase(purchase);
        User user = new User();
        user.setId(Login.loggedInUserId);
        sales.setUser(user);
        SalesService.insertForSales(sales);
        clearForm();
        lblMsg.setText("Sales Success!");
        displaySummaryIntoTable();
        displaySalesIntoTable();
    }//GEN-LAST:event_btnSalesActionPerformed

    private void btnViewSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSalesActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblSales.getModel();
        model.setRowCount(0);
        Object[] row = new Object[7];
        try {
            Date sdate = new SimpleDateFormat("yyyy-MM-dd").parse(txtStartDate.getText().trim());
            Date edate = new SimpleDateFormat("yyyy-MM-dd").parse(txtEndDate.getText().trim());
            List<Sales> list = ReportService.getSalesByUserAndDateRange(Login.loggedInUserId, sdate, edate);
            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getProductName();
                row[1] = list.get(i).getProductCode();
                row[2] = list.get(i).getQty();
                row[3] = list.get(i).getUnitprice();
                row[4] = list.get(i).getTotalPrice();
                row[5] = list.get(i).getSalesdate();
                row[6] = list.get(i).getPurchase().getProductCategory().getName();

                model.addRow(row);
            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_btnViewSalesActionPerformed

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
            java.util.logging.Logger.getLogger(SalesViewForSalesMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesViewForSalesMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesViewForSalesMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesViewForSalesMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesViewForSalesMan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewSales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JRadioButton rAllSales;
    private javax.swing.JTable tblSales;
    private javax.swing.JTable tblSummary;
    private javax.swing.JLabel txtAvialble;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JLabel txtLoginMsg;
    private javax.swing.JTextField txtPCode;
    private javax.swing.JTextField txtPName;
    private javax.swing.JLabel txtProductId;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JLabel txtTotalPrice;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables
}
