package Main;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *file name: PALdata.java
 * @author Mary Tom
  * This file forms part of the Project to read data from the csv file containing bmr
 * and energy needs and set user's energy need.
 */

public class PALdata {
   // This is to store a chosen PAL level and corresponding energy need.
  private PAL  pal;
     float energy;
     
     public PALdata ( String description, float energy)
     {
        for (PAL temp: PAL.values())
             if (temp.getDescription().equalsIgnoreCase(description))
              pal= temp;
        this.energy = energy;
     }
     public PALdata ( String description)
     {
         for (PAL temp: PAL.values())
             if (temp.getDescription().equalsIgnoreCase(description))
              pal= temp;
         
     }
     // This method serches through the set of PAL levels and chooses the
     // appropriate PAL level using the description.
     public void setPal (String description)
     {
         for (PAL temp: PAL.values())
             if (temp.getDescription().equalsIgnoreCase(description))
              pal= temp;
     }
     //Acessor, mutator methods to set and get field values
     public void setEnergy(float en)
     {
         this.energy = en;
     }
     public PAL getPal()
     {
         return pal;
     }
     public float getEnergy ()
     {
         return this.energy;
     }
     public String toString()
     {
        return String.format("%s   %s   %.2f\n", pal.getDescription(),pal.getValue(), energy);
     }
}
