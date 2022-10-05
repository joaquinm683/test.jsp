/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.isil.webappjsp.user.model;

/**
 *
 * @author joaqu
 */
public class User {
    
    private String name;
    private String lastname;
    private String username;
    private String pass;
    private String tipDoc;
    private String nroDoc;
    private int enable;
    private String email;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the tipDoc
     */
    public String getTipDoc() {
        return tipDoc;
    }

    /**
     * @param tipDoc the tipDoc to set
     */
    public void setTipDoc(String tipDoc) {
        this.tipDoc = tipDoc;
    }

    /**
     * @return the nroDoc
     */
    public String getNroDoc() {
        return nroDoc;
    }

    /**
     * @param nroDoc the nroDoc to set
     */
    public void setNroDoc(String nroDoc) {
        this.nroDoc = nroDoc;
    }

    /**
     * @return the enable
     */
    public int getEnable() {
        return enable;
    }

    /**
     * @param enable the enable to set
     */
    public void setEnable(int enable) {
        this.enable = enable;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param emal the email to set
     */
    public void setEmal(String emal) {
        this.email = emal;
    }
    
    
    
}
