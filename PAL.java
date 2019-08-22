package Main;

/**
 *file name: PAL.java
 * @author Mary Tom
 * This file forms part of the Project to read data from the csv file containing bmr
 * and energy needs and set user's energy need.
 * 
 */
//to store the description and value of various standard PAL levels
public enum PAL {
   LevelOne("bed rest", "1.2"),
   LevelTwo("very sedentary", "1.4"),
   LevelThree("light", "1.6"),
   LevelFour("moderate", "1.8"),
   LevelFive("heavy","2"),
   LevelSix("vigorous","2.2");
   
   private final String discription;
   private final String value;
   
   PAL (String dis, String val)
   {
      this.discription = dis;
      this.value = val;
   }
   public String getDescription()
   {
      return this.discription;
   }
   public String getValue()
   {
      return this.value;
   }
   
}
