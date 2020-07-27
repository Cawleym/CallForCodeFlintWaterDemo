/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MongoDBManage;
import java.util.ArrayList;  
import java.util.List;  
import com.mongodb.MongoClient;  
import com.mongodb.MongoCredential;  
import com.mongodb.ServerAddress;  
import com.mongodb.client.MongoDatabase;  
/**
 *
 * @author Bingnan Dong
 */
public class MongoDB {
    private static String hostName ="localhost";
    private static String userName ="username";
    private static String databaseName ="databaseName";
    private static String password ="password";
    
    private static List<ServerAddress> addrs = new ArrayList<ServerAddress>();
    private static List<MongoCredential> credentials = new ArrayList<MongoCredential>(); 
    
    public static List<ServerAddress> getServerAddress(){
           try {  
            //Connect to MongoDB Service If it is virtual connection, replace“localhost”with the IP address of your server  
            //The two prameters of ServerAddress() are server's IP address and　port  
            ServerAddress serverAddress = new ServerAddress(hostName,27017);  
            addrs = new ArrayList<ServerAddress>();  
            addrs.add(serverAddress);  
               
            System.out.println("Get Server Address successfully");  
        } catch (Exception e) {  
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );  
        }  
            return addrs;
   }
    
       public static List<MongoCredential> getCresdential(){
           try {  
           
              
            //The three parameters of MongoCredential.createScramSha1Credential() are username, databaseName and password 
            MongoCredential credential = MongoCredential.createScramSha1Credential(userName, databaseName, password.toCharArray());  
            credentials = new ArrayList<MongoCredential>();  
            credentials.add(credential); 
            
            System.out.println("Get credentials successfully");    
           
             
        } catch (Exception e) {  
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );  
        }  
            return credentials;
   }
    
    /**
     * Create a collection with a given string in DB
     * @param mongo  a given string for creating collection
     */
    
   public void createCollection(List<ServerAddress> addrs, List<MongoCredential> credentials, String mongo){
        try{        
           //connect to MongoDB  
            MongoClient mongoClient = new MongoClient(addrs,credentials);  
            System.out.println("Connect to MongoDB successfully"); 
            //connect to database
            MongoDatabase mongoDatabase = mongoClient.getDatabase(databaseName);
            
            System.out.println("Connect to database successfully"); 
            mongoDatabase.createCollection(mongo);
            System.out.println("Create collection successfully");
        
      }catch(Exception e){
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
     }
   }

   


}
    

