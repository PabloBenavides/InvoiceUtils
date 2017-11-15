/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rubik.desk.invoiceutils.tmodel;

import com.rubik.model.Factura;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author GrucasDev
 */
public class TModelFactura extends AbstractTableModel{

    ArrayList<String> titulos;
    List<Factura> values;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public TModelFactura(){
        values = new ArrayList<>();
        titulos = new ArrayList<>();
        titulos.add("ID");
        titulos.add("EMISOR");
        titulos.add("RECEPTOR");
        titulos.add("TOTAL");
    }
    
    @Override
    public int getRowCount() {
        return values.size();
    }

    @Override
    public int getColumnCount() {
        return titulos.size();
    }
    
    public String getColumnName(int column){
        return titulos.get(column);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0: {
                return values.get(rowIndex).getId();
            }

            case 1: {
                return values.get(rowIndex).getEmisor_rfc();
            }

            case 2: {
                return values.get(rowIndex).getReceptor_rfc();
            }
            
            case 3: {
                return values.get(rowIndex).getTotal();
            }

            default: {
                return "";
            }
        }

    }

    public ArrayList<String> getTitulos() {
        return titulos;
    }

    public void setTitulos(ArrayList<String> titulos) {
        this.titulos = titulos;
    }

    public List<Factura> getValues() {
        return values;
    }

    public void setValues(List<Factura> values) {
        this.values = values;
    }
}