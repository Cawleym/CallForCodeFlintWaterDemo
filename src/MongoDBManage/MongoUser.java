/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MongoDBManage;
import UserManage.User;
import java.util.ArrayList;  
import java.util.List; 
import org.bson.Document;
import com.mongodb.MongoClient;  
import com.mongodb.MongoCredential;  
import com.mongodb.ServerAddress;  
import com.mongodb.client.MongoDatabase; 
import com.mongodb.client.MongoCollection;
/**
 *
 * @author Bingnan Dong
 */
public class MongoUser extends MongoDB{
    private ArrayList<User> user = new ArrayList<>();
    private static String databaseName ="databaseName";
    
    public void createCollection(List<ServerAddress> addrs, List<MongoCredential> credentials){
        try{
            //connect to MongoDB  
            MongoClient mongoClient = new MongoClient(addrs,credentials);  
            System.out.println("Connect to MongoDB successfully"); 
            //connect to database
            MongoDatabase mongoDatabase = mongoClient.getDatabase(databaseName);
            
            System.out.println("Connect to database successfully"); 
            mongoDatabase.createCollection("User");
            System.out.println("Create collection successfully");
            MongoCollection<Document> collection = mongoDatabase.getCollection("User");
            System.out.println("Select User successfully");
            Document document = new Document("FirstName", "Bingnan").  
            append("LastName", "Dong").  
            append("UserName", "RabbitTank"). 
            append("Password", "Dbn981012!").  
            append("EmailAddress", "bvd5283@psu.edu"). 
            append("BirthDate", "1998/10/12").          
            append("UserType", "Resident");  
            
         List<Document> documents = new ArrayList<Document>();  
         documents.add(document);  
         collection.insertMany(documents);  
         System.out.println("Insert Document successfully"); 
            
            
        }
        catch(Exception e){
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
     }
    }
    
  /**
     * Insert a new user in DB

     */
    public  void insertTable(List<ServerAddress> addrs, List<MongoCredential> credentials){
        try{
            //connect to MongoDB  
            MongoClient mongoClient = new MongoClient(addrs,credentials);  
            System.out.println("Connect to MongoDB successfully"); 
            //connect to database
            MongoDatabase mongoDatabase = mongoClient.getDatabase(databaseName);
            
            System.out.println("Connect to database successfully"); 
            
            MongoCollection<Document> collection = mongoDatabase.getCollection("User");
            System.out.println("Select User successfully");
            Document document = new Document("FirstName", user.getFirstName()).  
            append("LastName", "Dong").  
            append("UserName", "RabbitTank"). 
            append("Password", "Dbn981012!").  
            append("EmailAddress", "bvd5283@psu.edu"). 
            append("BirthDate", "1998/10/12").          
            append("UserType", "Resident");  
            
         List<Document> documents = new ArrayList<Document>();  
         documents.add(document);  
         collection.insertMany(documents);  
         System.out.println("Insert Document successfully"); 
            
            
        }
        catch(Exception e){
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
     }
    }   
    
    
    
    
    
}
