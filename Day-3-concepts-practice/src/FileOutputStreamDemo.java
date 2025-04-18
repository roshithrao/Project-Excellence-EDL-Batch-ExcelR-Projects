import java.io.FileOutputStream;  
public class FileOutputStreamDemo {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
             String s=
            		 "Gihub link will be shared in the next 2 mins";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
} 

//Assignment : Write a program to write string data appended into a file.
//previous version : Are you ready?
//Updated version of file : Are you ready? WelcomeToJava 