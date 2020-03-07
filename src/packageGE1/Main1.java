/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageGE1;

import java.util.Arrays;

public class Main1 {
 

public static void main(String[]args) {
  Teacher[] teachers= new Teacher[5];                     //dhmiourgia neou pinaka Teacher
   teachers[0]= new Teacher("Oswald Mosley") ;
   teachers[1]=new Teacher("Cullen Bohannon") ;           //Dhmioyrgia Vathmologitwn
   teachers[2]=new Teacher("Rusty Cohle")  ; 
   teachers[3]=new Teacher("James Moriarty");
   teachers[4]=new Teacher("Theodore Bagwell");
   
     ExamPaper[]examPapers=new ExamPaper[4]  ;
     examPapers[0]=new ExamPaper(1,  new Teacher[]{teachers[0], teachers[1]}, new int[]{ 56,62});
     examPapers[1]=new ExamPaper(2,  new Teacher[]{teachers[0], teachers[2],teachers[3]}, new int[]{ 25,50,75}); 
     examPapers[2]= new ExamPaper(3,  new Teacher[]{teachers[1], teachers[2]}, new int[]{ 50,60}); 
     examPapers[3]=new ExamPaper(4,  new Teacher[]{teachers[2], teachers[3],teachers[4]}, new int[]{70,25,80});
     
     
     
 
ExamCenter center1= new ExamCenter (new ExamPaper[]{examPapers[0],examPapers[1],examPapers[2],examPapers[3]} , new Teacher[]{teachers[0],teachers[1],teachers[2],teachers[3],teachers[4]});




System.out.println("PaperID "+ examPapers[0].paperID  +":"+ Arrays.toString( examPapers[0].teachers)  +"marks: "+ Arrays.toString( examPapers[0].marks) );
System.out.println("PaperID "+examPapers[1].paperID  +":"+ Arrays.toString(examPapers[1].teachers)  +"marks: "+ Arrays.toString(examPapers[1].marks) );  
System.out.println("PaperID "+ examPapers[2].paperID  +":"+ Arrays.toString( examPapers[2].teachers)  +"marks: "+ Arrays.toString( examPapers[2].marks) );  
System.out.println("PaperID "+examPapers[3].paperID  +":"+ Arrays.toString(examPapers[3].teachers)  +"marks: "+ Arrays.toString(examPapers[3].marks) );
System.out.println();

System.out.println("CalculateMark");
System.out.println("**************");
System.out.println();
    for (ExamPaper i : examPapers) {
        System.out.print("O vathmos gia to grapto " +i.paperID + "  einai: " );            //CalculateMark Method output
        System.out.print(i.calculateMark());
        System.out.println();
    }
    //************************************************************
    //************************************************************
    System.out.println();
     System.out.println(); 
      System.out.println("getTeacherMark"); 
      System.out.println("**************");
      System.out.println();
 System.out.println("o vathmos tou vathmologiti pou orisate einai "+ examPapers[1].getTeacherMark(teachers[3]));
        System.out.println();
    System.out.println();
    //*************************************************************
     System.out.println("DisplayMarks");
     System.out.println("**************");
     
     System.out.println();
     
   center1.displayMarks();
 System.out.println();
    //*************************************************************
     System.out.println("DisplayAverages");
      System.out.println("**************");
      System.out.println();
    center1.displayTeacherAverages();
 System.out.println();
  System.out.println();
  //*****************************************************************
  
  
  System.out.println("MAIN");
  System.out.println("**************");
  System.out.println("**************");
  System.out.print("                " );
 
    for (int j=0;j<examPapers.length;j++) {
      
        System.out.print("  " + examPapers[j].paperID );
    }
    System.out.println(); 
    for (int i=0; i<teachers.length;i++) {

  
       System.out.print(teachers[i].getName()+ "\t" );
       for(int j=0;j<examPapers.length;j++) {
           
           if(examPapers[j].getTeacherMark(teachers[i]) != -1)
           System.out.print(" " + examPapers[j].getTeacherMark(teachers[i]) );        
           else {                                                                       
               System.out.print("   ");                                                
               
           }
        
       }
      
             System.out.println();
    }      
  
      
    
 }}
 

 


 

 
 
 