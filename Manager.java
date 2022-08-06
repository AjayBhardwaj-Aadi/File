
package com.mycompany.inheritance;
public class Manager extends Members                                                                                                                
{
  private String   department;
  
 public String getDepartment()
 {
 return department;
 }
 public void setDepartment (String department)
 {
 this.department = department;
 }
 public static void main(String args [])
 {
 Manager manager = new Manager ();
 Employe employe = new Employe ();
 
 manager.setName ("Aadi");
 manager.setAddress("Jalandhar");
 manager.setPhonenumber(628323335);
 
 System.out.println(manager.getName());
 System.out.println(manager.getAddress());
 System.out.println(manager.getPhonenumber());
     
 }
}