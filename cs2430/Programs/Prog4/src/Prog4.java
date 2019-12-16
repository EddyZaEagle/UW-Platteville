/**
Runs the main for program 4
@author Sam Peterson
*/
public class Prog4
{

   /**
   Runs ConsoleSimulation.
   @param args is unused
   */
   public static void main(String args[])
   {
      try
      {
         new ConsoleSimulation().run();
      }
      catch (Exception e)
      {
         System.out.println("Program Error: " + e);
      }
   }
}
