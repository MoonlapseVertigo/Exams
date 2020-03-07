/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageGE1;



/**
 *
 * @author moonlapsevertigo
 */
public class ExamCenter {
   
    private final ExamPaper[] examPapers;
    private final Teacher[] teachers;

    public ExamCenter(ExamPaper[] examPapers, Teacher[] teachers) {
        this.examPapers = examPapers;
        this. teachers = teachers;
    }
    public void displayMarks() {
        
        for (ExamPaper i : examPapers) {
        System.out.println("Paper "+i.paperID + " , Vathmos :  " + i.calculateMark());
        
        }
        
    }
     public void displayTeacherAverages() {
         int sum=0;                         
         int f=0;                             
         int sumarr=0;                       
         int count=0;                          
        double  avg=0;
         for(Teacher teacher:teachers) {       
             System.out.println(teacher);
               
            
             for  (ExamPaper examPaper : examPapers) {        //to deytero for kanei tis prakseis kai stackarei ta vathmologimena grapta vgazontas to sum kai epeita diairei me auta p vathmologithikan
                 f = examPaper.getTeacherMark(teacher);       //dhladh eksairei ta -1 me to if
                 if(f!=-1) {                                  //anapofeukth h xrhsh tou getTeacherMark nomizw
                                                              //dioti h klash examcenter den exei aparaithtes phges gia na vgalei xwris auth th methodo to apotelesma,den kserw isws k an ginetai
                      count++;                               
                   sum+=f;                                     
                                                              
                sumarr+=sum;
                  sum=0;
                  
                  avg=sumarr/count; 
                   
                }
              
             }
         
          
            sumarr=0;
           count=0;
            
             System.out.print(" " +avg +"\n");
         
             }
            
        
         }
            
        
         
         
         
         
	
   } 
     
         
 
     
        
     
    
     

