/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageGE1;

import java.util.Objects;

/**
 *
 * @author moonlapsevertigo
 */
public class Teacher {
    private String name;
    public Teacher(String name) {
        this.name = name;
    }  
    public String getName() {
        
        
        return name; }
   
    public void setName(String name) {this.name = name; }
    @Override
     public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teacher other = (Teacher) obj;
        return Objects.equals(this.name, other.name);
    }    
    @Override
   public String toString(){        //ayto to block kwdika eisilthe me skopo na mou vgazei sto output ta 
                                    //onomata kai oxi hashcode gia na kserw an mou vgazei ta swsta.
        return name;}
}


 