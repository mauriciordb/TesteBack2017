/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.valebomi.Customer;

/**
 *
 * @author Mauricio
 */
public class Customer {
    private int idCustomer;
    private String cpfCnpj;
    private String nmCustomer;
    private boolean isAsctive;
    private float vlTotal;

    /**
     * @return the idCustomer
     */
    public int getIdCustomer() {
        return idCustomer;
    }

    /**
     * @param idCustomer the idCustomer to set
     */
    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    /**
     * @return the cpfCnpj
     */
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * @param cpfCnpj the cpfCnpj to set
     */
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    /**
     * @return the nmCustomer
     */
    public String getNmCustomer() {
        return nmCustomer;
    }

    /**
     * @param nmCustomer the nmCustomer to set
     */
    public void setNmCustomer(String nmCustomer) {
        this.nmCustomer = nmCustomer;
    }

    /**
     * @return the isAsctive
     */
    public boolean isIsAsctive() {
        return isAsctive;
    }

    /**
     * @param isAsctive the isAsctive to set
     */
    public void setIsAsctive(boolean isAsctive) {
        this.isAsctive = isAsctive;
    }

    /**
     * @return the vlTotal
     */
    public float getVlTotal() {
        return vlTotal;
    }

    /**
     * @param vlTotal the vlTotal to set
     */
    public void setVlTotal(float vlTotal) {
        this.vlTotal = vlTotal;
    }
}
