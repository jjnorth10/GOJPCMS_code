package AclComponent;


/**
 * Write a description of class authentication here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Authentication
{
    //gives access to user if he/she is authorized
    public boolean hasAccess()
    {
        
        return true;
    }
    
    public static void main(String[] args){
    	DbConnect connect = new DbConnect();
    	connect.getData();
    }
}
