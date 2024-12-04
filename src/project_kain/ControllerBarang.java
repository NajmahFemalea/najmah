/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_kain;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerBarang {
    ArrayList<ModelBarang> ArrayData;
    DefaultTableModel tabelModel;
    
    public ControllerBarang(){
        ArrayData = new ArrayList<ModelBarang>();
    }
    
    public void InsertData(String jenisBrg, int jmlh, String alamat, int harga, String pembayaran, int total_bayar){
        ModelBarang brg = new ModelBarang(jenisBrg, jmlh, alamat, harga, pembayaran, total_bayar);
        ArrayData.add(brg);
    }
    
    public DefaultTableModel showData(){
        String[] kolom = {"Jenis Kain", "Jumlah", "Alamat", "Harga", "Pembayaran", "Total Bayar"};
        Object[][] objData = new Object[ArrayData.size()][6]; 
        int i = 0;

        for(ModelBarang brg : ArrayData) {
            Object[] arrData = {
                brg.getJenisBrg(),
                brg.getJmlh(),
                brg.getAlamat(),
                brg.getHarga(),
                brg.getPembayaran(),
                brg.getTotal_bayar()
            };
            objData[i] = arrData;
            i++;
        }

        tabelModel = new DefaultTableModel(objData, kolom) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        return tabelModel;
    }
}