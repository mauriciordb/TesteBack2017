/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.valebomi.Customer;

import br.com.valebomi.Customer.dao.DAO;
import java.util.List;

/**
 *
 * @author Mauricio
 */
public class App {
    public static void main(String[] args) {
        DAO executa = new DAO();
        Customer d = new Customer();
        for(int i=0; i<3000; i++){
        d.setCpfCnpj("45752574862");
        d.setNmCustomer("Mauricio"+i);
        d.setIsAsctive(false);
        d.setVlTotal(10*i);
        executa.insertCustomer(d);
        }
        List<Customer> lista = executa.getCustomer();
        float media = 0;
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i).getIdCustomer()+" - "+lista.get(i).getNmCustomer());
            media+=lista.get(i).getVlTotal();
        }
        System.out.println("Média: "+media/lista.size());
    }
}
