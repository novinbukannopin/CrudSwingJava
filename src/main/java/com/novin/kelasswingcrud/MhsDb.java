package com.novin.kelasswingcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MhsDb {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    // Constructor
    public MhsDb(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahasiswa","root","");
            } catch (SQLException ex) {
                Logger.getLogger(MhsDb.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Koneksi Sukses");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MhsDb.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    public void insertDb(String nim, String nama, String alamat){
        try {
            String sql = "insert into mhs values(?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, nim);
            pst.setString(2, nama);
            pst.setString(3, alamat);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MhsDb.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }
    public ResultSet selectDb(){
        try {
            String sql = "select * from mhs";
            st = con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MhsDb.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return rs;
    }
    
    public void deleteDb(String nim) {
        try{
        String query = "Delete from mhs where nim = ?";
        pst = con.prepareStatement(query);
        pst.setString(1, nim);
        pst.executeUpdate();
        } catch (SQLException exception){
            Logger.getLogger(MhsDb.class.getName()).log(Level.SEVERE, null, exception);
        }
            
        
    }
    
    public void updateDb(String nim, String nama, String alamat){
        try{
            String query = "update mhs set nama=?, alamat=? where nim=?";
            pst = con.prepareStatement(query);
            pst.setString(1, nama);
            pst.setString(2, alamat);
            pst.setString(3, nim);
            pst.executeUpdate();
        } catch(SQLException exception){
            Logger.getLogger(MhsDb.class.getName()).log(Level.SEVERE, null, exception);
        }
    }
    
}