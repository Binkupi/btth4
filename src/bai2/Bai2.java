/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author quoct
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    static dbContext db=new dbContext();
    public static void main(String[] args) {
           new QuanLySinhVien().setVisible(true);
    }
    
    
}
