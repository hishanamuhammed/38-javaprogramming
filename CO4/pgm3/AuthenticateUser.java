// Write a user defined exception class to authenticate the user name and password.

import java.util.*;

class AuthUsername extends Exception

{
    
AuthUsername(String s)
    
{
        
super(s);
    

}

}
class AuthPassword extends Exception

{
    
AuthPassword(String s)
    
{
        
super(s);
    
}
}

class AuthenticateUser

{
    
public static void main(String args[]) 
{
        
        
String username,password;
           
try
{
                
Scanner sc=new Scanner(System.in);
                
System.out.println("enter the username:");
                
username=sc.nextLine();
                
System.out.println("enter the password:");
                
password=sc.nextLine();
                
if(!username.equals("hishana"))
                    
throw new AuthUsername("incorrect Username");
                
else if(!password.equals("12345678"))               
                     
throw new  AuthPassword("incorrect password");
                
else
                     
System.out.println("\t\t\tlogin successfull......");
                
}
                 
catch(AuthUsername e)
{
                        
System.out.println(e);
                  
}
                  
catch(AuthPassword e)
{
                         
System.out.println(e);
                  
}
                 
finally
{
                       
System.out.println("\n \n program ends....");

}

}

}