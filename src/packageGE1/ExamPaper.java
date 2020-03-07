/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageGE1;







public class ExamPaper {
    int paperID;      
    int[] marks;
    Teacher[] teachers; 
    public ExamPaper(int paperID, Teacher[] teachers, int[] marks) {
        this.paperID = paperID;
        this.teachers=teachers;
        this.marks=marks;
    }

    public int getPaperID() {
        return paperID;
    }

    public void setPaperID(int paperID) {
        this.paperID = paperID;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
    
    public int calculateMark() {
       int x;                                                                    //orizw mia metavliti gia to return h opoia tha pernaei mesa apta "if" gia na parei (prwta o theos xD) thn swsth morfh
      
       
       
        if ((marks[0] - marks[1]) <=12 && (marks[1] - marks[0]) <= 12)  {             //h diafora twn 2 prwtwn den einai megaluterh tou 12
        
    
            x=((marks[0]+marks[1]) / 2); 
            
        }
        else if((marks[0] - marks[1]) >=12 || (marks[1] - marks[0]) >= 12) {      //h diafora twn 2 prwtwn einai megaluterh tou 12
           if((marks[2] - marks[1]) > (marks[2] - marks[0])) {                    //einai megaluterh tou 12 KAI o marks0 einai pio konta ston marks2
               x=((marks[0]+marks[2]) / 2);
           }
           else if (marks[2] == ((marks[0]+marks[1]) / 2)) {                      //einai megaluterh tou 12 kai o marks2 einai isa me ton meso oro twn 2
            x=marks[2];
            
        }
           else if((marks[2] - marks[1]) < (marks[2] - marks[0])) {               //einai megaluterh tou 12 KAI o marks1 einai pio konta ston marks2
               x=((marks[1]+marks[2]) / 2); 
           }
              
           
               else {                                                            // prospathontas na kalupsw tis diaforetikes periptwseis...
                       x=-1;
                       }    
           }  
        else {
            x=-1;                                                                  //to idio me apo panw..
        }  
        return x;        
                
        }                                                                            // telos methodou
              
    
    
    public int getTeacherMark(Teacher teacher) {
     
       
         for (int i=0; i<teachers.length; i++) {

if (teachers[i].equals(teacher))   

return marks[i];

}

return -1;
    }
}
        
       
        

    
