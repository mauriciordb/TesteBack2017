/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.valebomi.Customer.dao;

import br.com.valebomi.Customer.Customer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mauricio
 */
public class DAO {
    
    private java.sql.Connection connection = null;

    public DAO(){
        connection = new Conexao().getConnection();
    }
    
    public void insertCustomer(Customer c) {
        String sql = "INSERT INTO tb_customer_account (cpf_cnpj, nm_customer, is_active, vl_total) "
                + "VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getCpfCnpj());
            stmt.setString(2, c.getNmCustomer());
            stmt.setInt(3, c.isIsAsctive() ? 1 : 0);
            stmt.setFloat(4, c.getVlTotal());
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public List<Customer> getCustomer() {
        List<Customer> customerList = new ArrayList<Customer>();
        
        String sql = "select * from tb_customer_account where id_customer between 1500 and 2700 order by vl_total desc;";
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        try {
            stmt = connection.prepareStatement(sql);
            resultado = stmt.executeQuery();
            while (resultado.next()) {
                Customer f = new Customer();
                f.setCpfCnpj(resultado.getString("cpf_cnpj"));
                f.setNmCustomer(resultado.getString("nm_customer"));
                f.setIsAsctive(resultado.getInt("is_active") == 1 ? true : false);
                f.setVlTotal(resultado.getFloat("vl_total"));
                f.setIdCustomer(resultado.getInt("id_customer"));
                customerList.add(f);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (resultado != null) {
                    resultado.close();
                }
                if(stmt!= null){
                    stmt.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return customerList;
    }
}
