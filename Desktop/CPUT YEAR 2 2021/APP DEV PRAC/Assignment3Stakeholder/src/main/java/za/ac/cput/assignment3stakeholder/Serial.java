/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3stakeholder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author ethan
 */
public class Serial extends CreateStakeHolderSer {
    /* Initialize array lists 
    */
    Serial(){
    ArrayList<Customer> cust = new ArrayList<Customer>();
    ArrayList<Supplier> sup = new ArrayList<Supplier>();
    }
   
    static void readFromFile() throws IOException{
    
    BufferedReader br= new BufferedReader(new FileReader("stakeholder.ser"));
    String str = br.readLine();
    while(str!=null){
        
     if (str = cust,cust+){   
        else sup++;
    }
    }
       
    str=br.readLine();
    }
    
    
     static void getStHolderID(){
    for (int i =0;i<cust.size(); i++)
    {
    for (int j =0;i<cust.size(); i++)
    {
    if(cust.get(i).getId()>cust.get(j).getId())
    {   
    Customer c= cust.get(i);
    cust.set(i, cust.get(j));
    cust.set(j, c);
        
    }
    }
    }
    }
    /**
     *
     */
    public void dateOfBirth(){
   int age[]= new int[cust.size()];
    
   for (int i=0;i<cust.size();i++)
   Id=dateOfBirth.parse(cust.get(i).getDateOfBirth()
   ); 
    
    
    
  
    }
    String p = "dd MM yy";
    SimpleDataFormat sdf =new SipleDataFormat(p, new Locale("da","DK"));
    for(int i=0; i<cust.size();i++);
    {
     cust.get(i).setDateOfBirth(sdf.format(cust.get(i).getDateOfBirth));   
    
    }
    
    public void wrteToFileCust(){
    
    BufferedWriter bw=new BufferedWriter( new FileWriter("stakeholder.ser"));
    String str;
    str = "=================Customer==================";
    bw.write(str);
    bw.newLine(); 
    str= "============================================";
    bw.write(str);
    bw.newLine();
    for(int i=0;<cust.size();i++);
    {
     strcust.get(i).getID()+"\t"+cust.get(i).getName()+"\t"+cust.get(i).getDateOfBirth()+"\t"+age[i];
     bw.write(str);
     bw.newLine();
    }    
    String r;
    String nr; 
    
    str="Number of customers who can rent:"=+r;
    bw.write(str);
    bw.newLine();
    
    str="Number of customers who cannot afford rent:"+nr;
    bw.write(str);
    bw.newLine();
    bw.close();
    }
    public void canRentCal(){
    
      for(int i=0;<cust.size;i++); 
      { 
       if(cust.get(i).rent); 
       {  
      r=r+1;
       }
       else 
       {
       nr=nr+1;        
      
      }        
      }
      
      }
    public void getProductType(){
    
    for(int i=0; i<sup.size();i++)
   {
   for(int j=0; j<sup.size();j++)
   {  
           
   if(sup.get(i).getName().compareTo(sup.get(j).getName()>0) {   
    
   
   Supplier s=sup.get(i);              
   sup.set(i,sup.get(i));                
   sup.set(j,s);      
   }      
   }
   }       
    }
    public void writeToFileSup(){
     
    BufferedWriter bw=new BufferedWriter( new FileWriter("stakeholder.sar"));
     String
     str = "====================Supplier===================";
      bw.write(str);
      bw.newLine();
      str="ID\tName\tProd Type\tDescription";
      bw.write(str);
      bw.newLine();
      str="===============================================";
       bw.write(str);
       bw.newLine();
       for(int i=0;i<sup.size();i++){
       str=sup.get(i).getId()+"\t"+sup.get(i).getName()+"\t"+sup.get(i).getProdType()+"\t"+sup.get(i).getDescription();   
       bw.write(str);
       bw.newLine();
       
       
       }
    
    }
    }
   