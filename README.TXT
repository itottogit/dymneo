------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:

 public boolean markiereElemente(Point2D p)
    {
        
        
     for (Iterator i = verwaltungsListeElemente.iterator(); i.hasNext();)
     { 
         Element element = (Element) i.next();
         Shape aktuelleFigur = element.gibAktuelleFigur();
      if((aktuelleFigur.contains(p)) && (element instanceof Kraftwerk))
      {
         element.farbe = Color.red ;
         element.markiert = true; 
         System.out.println("true"); 
      }
      else 
      {
         element.farbe = Color.black;
         element.markiert = false; 
         System.out.println("false"); 
      }     
        
     }
     return(true); 
    }