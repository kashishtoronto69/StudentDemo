/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareprogram;


public class Student {
    private String name;
    private int Maxcoiurse;
    public void setName(String name)
    {
        this.name  = name;
    }
    public String getName()
    {
        return name;
    }

    /**
     * @return the Maxcoiurse
     */
    public int getMaxcoiurse() {
        return Maxcoiurse;
    }

    /**
     * @param Maxcoiurse the Maxcoiurse to set
     */
    public void setMaxcoiurse(int Maxcoiurse) {
        this.Maxcoiurse = Maxcoiurse;
    }
    
}
