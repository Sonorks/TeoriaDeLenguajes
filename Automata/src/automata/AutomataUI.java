package automata;

import java.awt.Point;
import java.util.Queue;
import java.util.Stack;
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
    public String[] columns= null; //las columnas de la tabla = los simbolos
    public String[] rows = null; //se usa para actualizar las filas cada que se agrega un estado
    public String[] data = null; //donde se guardan los estados
    public String[][] automata= null; // donde se guarda la tabla en general

    public void prueba(){
        this.textSimbolo.setText("estado enviado del otro lado");
    }
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
        botonAddSimbolo = new javax.swing.JButton();
        textSimbolo = new javax.swing.JTextField();
        textEstado = new javax.swing.JTextField();
        botonAddEstado = new javax.swing.JButton();
        botonCargarArchivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonIdentificarYConvertir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textPrueba = new javax.swing.JTextField();
        botonProbar = new javax.swing.JButton();
        botonAñadirTransicion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        tablaAutomata = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
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
        tablaAutomata.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tablaAutomata);
        if (tablaAutomata.getColumnModel().getColumnCount() > 0) {
            tablaAutomata.getColumnModel().getColumn(0).setMinWidth(60);
            tablaAutomata.getColumnModel().getColumn(0).setPreferredWidth(60);
            tablaAutomata.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 320, 200);

        botonAddSimbolo.setText("Añadir Simbolo");
        botonAddSimbolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddSimboloActionPerformed(evt);
            }
        });
        jPanel1.add(botonAddSimbolo);
        botonAddSimbolo.setBounds(390, 30, 120, 30);
        jPanel1.add(textSimbolo);
        textSimbolo.setBounds(520, 30, 50, 30);
        jPanel1.add(textEstado);
        textEstado.setBounds(520, 80, 50, 30);

        botonAddEstado.setText("Añadir Estado");
        botonAddEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(botonAddEstado);
        botonAddEstado.setBounds(390, 80, 120, 30);

        botonCargarArchivo.setText("Cargar desde archivo");
        jPanel1.add(botonCargarArchivo);
        botonCargarArchivo.setBounds(390, 130, 180, 30);

        jLabel1.setText("Tabla de Autómata");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 230, 200, 17);

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
        botonIdentificarYConvertir.setBounds(390, 270, 180, 30);

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
        botonProbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProbarActionPerformed(evt);
            }
        });
        jPanel1.add(botonProbar);
        botonProbar.setBounds(500, 330, 59, 29);

        botonAñadirTransicion.setText("Añadir transicion");
        botonAñadirTransicion.setToolTipText("");
        botonAñadirTransicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirTransicionActionPerformed(evt);
            }
        });
        jPanel1.add(botonAñadirTransicion);
        botonAñadirTransicion.setBounds(390, 180, 180, 29);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void botonAddSimboloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddSimboloActionPerformed
        addSimbolo();
    }//GEN-LAST:event_botonAddSimboloActionPerformed

    private void botonAddEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddEstadoActionPerformed
        addEstado();
    }//GEN-LAST:event_botonAddEstadoActionPerformed

    private void botonIdentificarYConvertirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIdentificarYConvertirMouseClicked
        llenarAutomata();
    }//GEN-LAST:event_botonIdentificarYConvertirMouseClicked

    private void botonAñadirTransicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirTransicionActionPerformed
        añadirTransicion();
    }//GEN-LAST:event_botonAñadirTransicionActionPerformed

    private void botonProbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProbarActionPerformed
        //estadosEquivalentes();
        //estadosMuertos();
        NoDeterministicoADeterministico(); 
    }//GEN-LAST:event_botonProbarActionPerformed

    /**
     * @param args the command line arguments
     */
    public void añadirTransicion(){ //Metodo para mostrar la tabla de transiciones
        //se guardara las cabeceras de las columnas empezando desde la segunda
        String[] simbolos = new String[columns.length - 1];
        for(int i = 0; i< simbolos.length; i++){
            simbolos[i] = columns[i+1];
        }
        Transiciones transicionesUI = new Transiciones(simbolos,data); // se crea el JFrame de transiciones
        transicionesUI.setVisible(true); //se muestra el JFrame de transiciones
        transicionesUI.añadirTransicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { //controlar click en el boton
               añadirTransicionATabla(transicionesUI.simboloTransicion.getSelectedItem().toString(),transicionesUI.estadoOrigenTransicion.getSelectedItem().toString(),transicionesUI.estadoDestinoTransicion.getSelectedItem().toString());
            }
        });   
    }
    //metodo para añadir la transicion a la JTable
    public void añadirTransicionATabla(String simbolo, String estadoOrigen, String estadoDestino){
        int col = buscarPosicion(this.columns,simbolo );
        int filOrigen = buscarPosicion(this.data,estadoOrigen);
        String data = null;
        try{
            data =this.tablaAutomata.getModel().getValueAt(filOrigen, col).toString();
        }catch(Exception e){
            System.out.println("No hay transicion actualmente en la posicion: "+filOrigen+","+col);
        }
//System.out.println("Se añadira el simbolo: "+estadoDestino+ " en "+col+", "+filDestino);
        if (data== null){
            this.tablaAutomata.getModel().setValueAt(estadoDestino, filOrigen, col);
        }
        else{
            if(!data.contains(estadoDestino)){
                this.tablaAutomata.getModel().setValueAt(data+"-"+estadoDestino, filOrigen, col);
            }
        }
    }
    //Metodo para encontrar la posicion en la tabla de un estado o simbolo especifico
    public int buscarPosicion(String[] array, String word){
        for(int i = 0 ; i < array.length; i++){
            if(array[i].equalsIgnoreCase(word)){
                //System.out.print(i);
                return i;
            }
        }
        return -1;
    }
    //Metodo para guardar los datos de la tabla en el arreglo automata
    public void llenarAutomata(){
        automata = new String[this.tablaAutomata.getRowCount()][this.tablaAutomata.getColumnCount()];//crea el arreglo con las dimensiones
        for(int fila = 0; fila<this.tablaAutomata.getRowCount(); fila++){ //recorrer las filas
            for (int columna= 0; columna<this.tablaAutomata.getColumnCount(); columna++){//recorrer las columnas
                    try{ //manejo de excepciones en caso de que haya una transicion vacía
                    automata[fila][columna]=this.tablaAutomata.getModel().getValueAt(fila, columna).toString();
                    }catch (NullPointerException e){ //si está vacía deja un espacio en automata[][]
                        automata[fila][columna] = " ";
                    }finally{
                        System.out.print(automata[fila][columna]);
                    }
            }
            System.out.println(" ");
        }
    }
    //añadir simbolos a la tabla
    public void addSimbolo(){
        if(!this.textSimbolo.getText().isEmpty()){ //que no se agreguen espacios nulos
            int len = this.tablaAutomata.getColumnCount(); //cantidad de columnas actuales
            String[] columnsTemp = new String[len]; // arreglo para guardar las cabeceras de las columnas
            for (int i = 0; i<len; i++){
                //se guardan las cabeceras actuales
                columnsTemp[i] = this.tablaAutomata.getColumnModel().getColumn(i).getHeaderValue().toString();
            }
            if(buscarPosicion(columnsTemp,this.textSimbolo.getText().toString())== -1){//valida que no se meta un simbolo que ya existe
                //int len = this.tablaAutomata.getColumnCount();
                this.tablaAutomata.addColumn(new TableColumn(len));//agrega la columna
                TableColumn newCol = this.tablaAutomata.getColumnModel().getColumn(len);
                newCol.setHeaderValue(this.textSimbolo.getText());// se copia el modelo de las columnas 
                this.textSimbolo.setText(""); // se limpia el campo donde se ingreso
            }
        }
    }
    public void addEstado(){
        if(!this.textEstado.getText().isEmpty()){ //para que no ingrese campos vacios / nulos
            int len = this.tablaAutomata.getColumnCount(); //numero de columnas
            int rowCount = this.tablaAutomata.getRowCount(); //numero de filas
            String[] columnsTemp= new String[len]; //arreglos para almacenar datos antes de agregar nuevos
            String[] rowsTemp = new String[len];
            String[] dataTemp = new String[rowCount+1];
            for (int i = 0; i<len; i++){ // guardando las cabeceras de las columnas (simbolos)
                columnsTemp[i] = this.tablaAutomata.getColumnModel().getColumn(i).getHeaderValue().toString();
            }
            for (int j = 0; j<rowCount; j++){//guardando las cabeceras de las filas (estados)
                dataTemp[j]=this.tablaAutomata.getModel().getValueAt(j,0).toString();
            }
            dataTemp[rowCount]= "-1";
            if (buscarPosicion(dataTemp,this.textEstado.getText()) == -1){ // que no se repitan estados
                dataTemp[rowCount]= this.textEstado.getText(); 
                JTable table; //se modifica la primera columna de la tabla para agregar estado
                table = new JTable(new DefaultTableModel(columnsTemp,rowCount));
                rowsTemp[0]= this.textEstado.getText();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setColumnIdentifiers(columnsTemp);
                this.tablaAutomata.setModel(model);
                model.addRow(rowsTemp);  
                for (int k = 0; k<rowCount; k++){
                        this.tablaAutomata.getModel().setValueAt(dataTemp[k], k, 0);
                }
                this.textEstado.setText("");
                setRows(rowsTemp);// se guardan los valores
                setData(dataTemp);// se guardan los valores
                setColumns(columnsTemp); // se guardan los valores
            }
        }
    }
    public void estadosEquivalentes(){
        int cantEstados = this.tablaAutomata.getModel().getRowCount();
        int cantSimbolos = this.tablaAutomata.getModel().getColumnCount();
        String[] estadosAux = new String[cantEstados];
        for ( int estados = 0; estados <cantEstados; estados ++){
            estadosAux[estados]=automata[estados][0]+"-";
            for( int simbolos = 1 ; simbolos <cantSimbolos; simbolos++){
                estadosAux[estados]+=automata[estados][simbolos];
            }
            System.out.println(estadosAux[estados]);
        }
        for ( int estados = 0; estados <estadosAux.length; estados++){
            int simbolosDeEstado = estadosAux[estados].indexOf("-");
            for (int estados2=0; estados2<estadosAux.length;estados2++){
                int simbolosDeEstado2 = estadosAux[estados2].indexOf("-");
                if(estadosAux[estados].substring(simbolosDeEstado).equals(estadosAux[estados2].substring(simbolosDeEstado2))){
                    if(estados!=estados2){
                        combinarEstados(estados,estados2);
                        estadosAux[estados2]="-modificado";
                    }
                }
            }
        }
    }
    public void combinarEstados(int estado1, int estado2){
        String estadoAEliminar = automata[estado2][0];
        String estadoCombinado = automata[estado1][0];
        System.out.println("el estado a eliminar es: "+estadoAEliminar);
        int cantEstados = this.tablaAutomata.getModel().getRowCount();
        int cantSimbolos = this.tablaAutomata.getModel().getColumnCount();
        for ( int estados = 0; estados <cantEstados; estados ++){
            for( int simbolos = 1 ; simbolos <cantSimbolos; simbolos++){
                if(automata[estados][simbolos].equals(estadoAEliminar)){
                    automata[estados][simbolos] = estadoCombinado;
                }
            }
        }
        mostrarAutomata();
        /*for (int simbolos = 0; simbolos < cantSimbolos; simbolos++){
            automata[estado2][simbolos] = "";
        }*/
        eliminarEstado(estado2);
        mostrarAutomata();
    }
    public void mostrarAutomata(){
        System.out.println("El automata esta así");
        int cantEstados = this.tablaAutomata.getModel().getRowCount();
        int cantSimbolos = this.tablaAutomata.getModel().getColumnCount();
        for ( int estados = 0; estados <cantEstados; estados ++){
            for( int simbolos = 0 ; simbolos <cantSimbolos; simbolos++){
                System.out.print(automata[estados][simbolos]);
            }
            System.out.println("");
        }
    }
    public void estadosMuertos(){
        Stack q = new Stack();
        q.push(automata[0][0]);
        int cantEstados = this.tablaAutomata.getModel().getRowCount();
        int cantSimbolos = this.tablaAutomata.getModel().getColumnCount();
        boolean[] agregados = new boolean[cantEstados];
        for (int i = 0 ; i<agregados.length; i++){
            agregados[i] = false;
        }
        String[] estadosAutomata = data;
        agregados[0]=true;
        while(!q.isEmpty()){
            String estadoActual = (String)q.pop();
            for ( int estados = 0; estados < cantEstados; estados ++){
                if(automata[estados][0].equals(estadoActual)){
                    for( int simbolos = 0 ; simbolos <cantSimbolos; simbolos++){
                        int pos = buscarPosicion(data,automata[estados][simbolos]);
                        if(pos != -1){
                            if(agregados[pos]== false){
                                q.add(automata[estados][simbolos]);
                                agregados[pos] = true;
                            } 
                        }
                    }
                }
            }
            for (int i = 0 ; i<agregados.length; i++){
                if(agregados[i]==false){
                    eliminarEstado(i);
                }
            }
        }
        mostrarAutomata();
    }
    public void eliminarEstado(int pos){
        for (int i = 0; i< this.tablaAutomata.getModel().getColumnCount();i++){
            automata[pos][i]="";
        }
    }
    public void NoDeterministicoADeterministico(){
        Stack q = new Stack();
        int estadosNuevos = 0;
        int cantEstados = this.tablaAutomata.getModel().getRowCount();
        int cantSimbolos = this.tablaAutomata.getModel().getColumnCount();
        q.push(automata[0][0]);
        String[][] automataDeterministico = new String[cantEstados*10][cantSimbolos];
        automataDeterministico[0][0]=automata[0][0];
        String[] nuevosEstados = null;
        if(esNoDeterministico()){
            boolean nuevoEstadoDescubierto = true;
            while(nuevoEstadoDescubierto = true){
                int estadosNuevosActual = estadosNuevos;
                nuevoEstadoDescubierto = false;
                String estado = automataDeterministico[estadosNuevos][0];
                if(!estado.equals("null")){
                    String[] transicionesDeEstadoNuevo = buscarTransiciones(estado,cantEstados,cantSimbolos);
                    for (int n = 0; n < transicionesDeEstadoNuevo.length; n++){
                        automataDeterministico[estadosNuevos][n] = transicionesDeEstadoNuevo[n];
                    }
                    for (int n = 0; n < transicionesDeEstadoNuevo.length; n++){
                        System.out.println(transicionesDeEstadoNuevo[n]);
                    }
                }
                nuevosEstados= buscarNuevosEstados(automataDeterministico,cantEstados,cantSimbolos, estadosNuevos);
                for (int n = 0; n < nuevosEstados.length; n++){
                    if(!nuevosEstados.equals("null")){
                        System.out.println("Estados nuevos: "+nuevosEstados[n]+" en: "+n );
                    }
                }
                for(int i = 0 ; i<nuevosEstados.length; i++){
                    if(!q.contains(nuevosEstados[i])){
                            if(!"null".equals(nuevosEstados[i])){
                            q.push(nuevosEstados[i]);
                            nuevoEstadoDescubierto = true;
                            estadosNuevosActual++;
                            automataDeterministico[estadosNuevosActual][0] = nuevosEstados[i];
                            System.out.println("Nuevo estado en pila: "+nuevosEstados[i]);
                        }
                    }
                }
            for (int j = 0; j<3; j++){
                System.out.print(automataDeterministico[estadosNuevos][j]+" ");
            }
                estadosNuevos++;
            }
        }
        
    }
    public String[] buscarTransiciones(String estado, int cantEstados, int cantSimbolos){
        System.out.println("Buscar transiciones para el estado: "+estado);
        String[] transiciones = new String[cantSimbolos];
        for( int k = 0 ; k<transiciones.length; k++){
            transiciones[k]="";
        }
        System.out.println("cantidad de estados en nuevo estado: "+estado.length());
        if(true){
            for (int i = 0; i< estado.length() ; i++){
                String estadoND = Character.toString(estado.charAt(i));
                int pos = buscarPosicion(data,estadoND);
                System.out.println("posicion de: "+estadoND+ " es: "+pos);
                for(int j = 0; j<cantSimbolos; j++){
                    String trans = automata[pos][j];
                    System.out.println("Trans es: "+ trans);
                    if(trans.contains("-")){
                        trans = trans.replace("-", "");
                    }
                    for(int k = 0; k<trans.length(); k++){
                        String tran = Character.toString(trans.charAt(k));
                        if(!transiciones[j].contains(tran)){
                            System.out.println("Transiciones[J] es: "+transiciones[j]);
                            transiciones[j] += tran;
                            System.out.println("Transiciones[J] modificada es: "+transiciones[j]);
                        }
                    }
                }
            }
        }
        for( int k = 0 ; k<transiciones.length; k++){
            System.out.println("Transicion:" + transiciones[k] + " en:"+k);
        }
        return transiciones;
    }
    public String[] buscarNuevosEstados(String[][] automata, int cantEstados, int cantSimbolos, int estadoActual){
        String[] nuevosEstados = new String[cantSimbolos];
        for (int i = 0 ; i<nuevosEstados.length; i++){
            nuevosEstados[i]="null";
        }
        int cantEstadosNuevos = 0;
        nuevosEstados[0] = automata[estadoActual][0];
        Stack q = new Stack();
        q.push(automata[estadoActual][0]);
            for (int j = 0; j < cantSimbolos; j++){
                if (automata[estadoActual][j].contains("-")){
                    if(!q.contains(automata[estadoActual][j])){
                        String nuevoEstado = automata[estadoActual][j].replaceAll("-","");
                        if(!q.contains(nuevoEstado)){
                            System.out.println("nuevoEstado: "+nuevoEstado);
                            q.push(nuevoEstado);
                            nuevosEstados[cantEstadosNuevos]= nuevoEstado;
                            cantEstadosNuevos++;
                        }
                    }
                }
                else if(!automata[estadoActual][j].isEmpty()){
                    String nuevoEstado = automata[estadoActual][j];
                    if(!q.contains(nuevoEstado)){
                            System.out.println("nuevoEstado: "+nuevoEstado);
                            q.push(nuevoEstado);
                            nuevosEstados[cantEstadosNuevos]= nuevoEstado;
                            cantEstadosNuevos++;
                        }
                }
            }      
        return nuevosEstados;
    }
    public boolean esNoDeterministico(){
        return true;
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
    private javax.swing.JButton botonAñadirTransicion;
    private javax.swing.JButton botonCargarArchivo;
    private javax.swing.JButton botonIdentificarYConvertir;
    private javax.swing.JButton botonProbar;
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
