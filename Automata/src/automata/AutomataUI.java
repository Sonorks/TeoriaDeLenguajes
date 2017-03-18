package automata;

import java.awt.Point;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CASA
 */
public class AutomataUI extends javax.swing.JFrame {
    public String[] columns= null;
    public String[] rows = null;
    public String[] data = null;
    public String[][] automata= null;

    public String[] getColumns() {
        return columns;
    }

    public void setColumns(String[] columns) {
        this.columns = columns;
    }

    public String[] getRows() {
        return rows;
    }

    public void setRows(String[] rows) {
        this.rows = rows;
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }
    
    
    /**
     * Creates new form AutomataUI
     */
    public AutomataUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutomata = new javax.swing.JTable();
        botonAddEstado = new javax.swing.JButton();
        textEstado = new javax.swing.JTextField();
        textSimbolo = new javax.swing.JTextField();
        botonAddSimbolo = new javax.swing.JButton();
        botonCargarArchivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonIdentificarYConvertir = new javax.swing.JButton();
        botonSimplificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textPrueba = new javax.swing.JTextField();
        botonProbar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        tablaAutomata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Est/Simb"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaAutomata);
        if (tablaAutomata.getColumnModel().getColumnCount() > 0) {
            tablaAutomata.getColumnModel().getColumn(0).setMinWidth(60);
            tablaAutomata.getColumnModel().getColumn(0).setPreferredWidth(60);
            tablaAutomata.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 320, 200);

        botonAddEstado.setText("Añadir estado");
        botonAddEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(botonAddEstado);
        botonAddEstado.setBounds(390, 30, 120, 30);
        jPanel1.add(textEstado);
        textEstado.setBounds(520, 30, 50, 30);
        jPanel1.add(textSimbolo);
        textSimbolo.setBounds(520, 80, 50, 30);

        botonAddSimbolo.setText("Añadir simbolo");
        botonAddSimbolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddSimboloActionPerformed(evt);
            }
        });
        jPanel1.add(botonAddSimbolo);
        botonAddSimbolo.setBounds(390, 80, 120, 30);

        botonCargarArchivo.setText("Cargar desde archivo");
        jPanel1.add(botonCargarArchivo);
        botonCargarArchivo.setBounds(390, 130, 180, 30);

        jLabel1.setText("Tabla de Autómata");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 230, 100, 17);

        botonIdentificarYConvertir.setText("Identificacion y conversion");
        botonIdentificarYConvertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIdentificarYConvertirMouseClicked(evt);
            }
        });
        botonIdentificarYConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIdentificarYConvertirActionPerformed(evt);
            }
        });
        jPanel1.add(botonIdentificarYConvertir);
        botonIdentificarYConvertir.setBounds(390, 180, 180, 30);

        botonSimplificar.setText("Simplificar");
        jPanel1.add(botonSimplificar);
        botonSimplificar.setBounds(390, 240, 180, 30);

        jLabel2.setText("Hilera:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 330, 45, 17);

        textPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPruebaActionPerformed(evt);
            }
        });
        jPanel1.add(textPrueba);
        textPrueba.setBounds(80, 330, 390, 27);

        botonProbar.setText("Probar");
        jPanel1.add(botonProbar);
        botonProbar.setBounds(500, 330, 59, 29);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIdentificarYConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIdentificarYConvertirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIdentificarYConvertirActionPerformed

    private void textPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPruebaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPruebaActionPerformed

    private void botonAddEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddEstadoActionPerformed
        addSimbolo();
    }//GEN-LAST:event_botonAddEstadoActionPerformed

    private void botonAddSimboloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddSimboloActionPerformed
        addEstado();
    }//GEN-LAST:event_botonAddSimboloActionPerformed

    private void botonIdentificarYConvertirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIdentificarYConvertirMouseClicked
        llenarAutomata();
    }//GEN-LAST:event_botonIdentificarYConvertirMouseClicked

    /**
     * @param args the command line arguments
     */
    public void llenarAutomata(){
        automata = new String[this.tablaAutomata.getRowCount()][this.tablaAutomata.getColumnCount()];
        for(int fila = 0; fila<this.tablaAutomata.getRowCount(); fila++){
            for (int columna= 0; columna<this.tablaAutomata.getColumnCount(); columna++){
                    automata[fila][columna]=this.tablaAutomata.getModel().getValueAt(fila, columna).toString();
                    System.out.print(automata[fila][columna]);
            }
            System.out.println(" ");
        }
    }
    public void addSimbolo(){
        int len = this.tablaAutomata.getColumnCount();
        this.tablaAutomata.addColumn(new TableColumn(len));
        TableColumn newCol = this.tablaAutomata.getColumnModel().getColumn(len);
        newCol.setHeaderValue(this.textEstado.getText());
    }
    public void addEstado(){
        int len = this.tablaAutomata.getColumnCount();
        int rowCount = this.tablaAutomata.getRowCount();
        String[] columnsTemp= new String[len];
        String[] rowsTemp = new String[len];
        String[] dataTemp = new String[rowCount];
        for (int i = 0; i<len; i++){
            columnsTemp[i] = this.tablaAutomata.getColumnModel().getColumn(i).getHeaderValue().toString();
        }
        for (int j = 0; j<rowCount; j++){
            dataTemp[j]=this.tablaAutomata.getModel().getValueAt(j,0).toString();
        }
        JTable table;
        table = new JTable(new DefaultTableModel(columnsTemp,rowCount));
        rowsTemp[0]= this.textSimbolo.getText();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setColumnIdentifiers(columnsTemp);
        this.tablaAutomata.setModel(model);
        model.addRow(rowsTemp);  
        for (int k = 0; k<rowCount; k++){
                this.tablaAutomata.getModel().setValueAt(dataTemp[k], k, 0);
        }
        setRows(rowsTemp);
        setData(dataTemp);
        setColumns(columnsTemp);
    }
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
            java.util.logging.Logger.getLogger(AutomataUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutomataUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutomataUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutomataUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutomataUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAddEstado;
    private javax.swing.JButton botonAddSimbolo;
    private javax.swing.JButton botonCargarArchivo;
    private javax.swing.JButton botonIdentificarYConvertir;
    private javax.swing.JButton botonProbar;
    private javax.swing.JButton botonSimplificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAutomata;
    private javax.swing.JTextField textEstado;
    private javax.swing.JTextField textPrueba;
    private javax.swing.JTextField textSimbolo;
    // End of variables declaration//GEN-END:variables
}
