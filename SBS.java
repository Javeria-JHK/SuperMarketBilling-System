import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;


import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.List;
public class SBS {
    public static int order_id = 5005;
    static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public Date date ;
    
        public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
        public static void main(String[] args) {
            // Creating a Mongo client 
        String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("SBS");
            MongoCollection<Document> collection = database.getCollection("product");
            Document doc = collection.find(eq("name","Eggs")).first();
            if (doc != null) {
                System.out.println(doc.toJson());
            } else {
                System.out.println("No matching documents found.");
            }
        }
        System.out.println("Created Mongo Connection successfully");
        System.out.println("Hello World!");
        HomeScreen h2 = new HomeScreen();
        h2.setVisible(true);
    }
        
public static boolean verifyManagerLogin(String user, String pass){
            String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("SBS");
            MongoCollection<Document> collection = database.getCollection("Manager");
            // Create the query with "AND" operation
            Document query = new Document();
            query.append("Manager_email", user)
                 .append("password", pass);

        // Perform the find operation
        Document doc= collection.find(query).first();
            if (doc != null) {
                return true;
            } else {
                return false;
            }
        }
}

public static boolean verifyCashierLogin(String user, String pass){
            String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("SBS");
            MongoCollection<Document> collection = database.getCollection("Cashier");
            // Create the query with "AND" operation
            Document query = new Document();
            query.append("Email", user)
                 .append("Password", pass);

        // Perform the find operation
        Document doc= collection.find(query).first();
            if (doc != null) {
                return true;
            } else {
                return false;
            }
        }
}
public static void addCashier(Cashier c){
            String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("SBS");
            MongoCollection<Document> collection = database.getCollection("Cashier");
            //Inserting sample records by creating documents.
            Document doc =new Document("Employee_id",c.id);
            doc.append("Fname",c.fname);  
            doc.append("Lname",c.lname); 
            doc.append("Email",c.email);  
            doc.append("Gender",c.gender);  
            doc.append("Contact",c.Ph_number);  
            doc.append("Age",c.age);
            doc.append("Password",c.Password);  
            doc.append("Experiance",c.experience);

            collection.insertOne(doc);
            System.out.println("documnet inserted");

        }
}
public static void UpdateCashier(Cashier c){
            String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("SBS");
            MongoCollection<Document> collection = database.getCollection("Cashier");
  


            Document doc =new Document("Employee_id",c.id);
            doc.append("Fname",c.fname);  
            doc.append("Lname",c.lname); 
            doc.append("Email",c.email);  
            doc.append("Gender",c.gender);  
            doc.append("Contact",c.Ph_number);  
            doc.append("Age",c.age);
            doc.append("Password",c.Password);  
            doc.append("Experiance",c.experience);
            
            Document filter = new Document("Employee_id", c.id);
            Document update = new Document("$set",doc);
            collection.updateOne(filter, update);       
            System.out.println("Document updated successfully...");

        }
}
  
public static void DeleteCashier(String fname, String lname,int id){
            String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("SBS");
            MongoCollection<Document> collection = database.getCollection("Cashier");
  
           
            collection.deleteOne(Filters.eq("Employee_id", id)); 
            System.out.println("Document deleted successfully...");


        }
}
public static void addProduct(Product p){
            String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("SBS");
            MongoCollection<Document> collection = database.getCollection("product");
            //Inserting sample records by creating documents.
            Document doc =new Document("id",p.productID);
            doc.append("name",p.productName);  
            doc.append("Description",p.description); 
            doc.append("price",p.price);  
            doc.append("quantity",p.quantity);  

            collection.insertOne(doc);
            System.out.println("documnet inserted");

        }
}
public static void UpdateProduct(Product p){
            String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("SBS");
            MongoCollection<Document> collection = database.getCollection("product");
  


            Document doc =new Document("id",p.productID);
            doc.append("name",p.productName);  
            doc.append("Description",p.description); 
            doc.append("price",p.price);  
            doc.append("quantity",p.quantity);  
            
            Document filter = new Document("id", p.productID);
            Document update = new Document("$set",doc);
            collection.updateOne(filter, update);     
            System.out.println("Document updated successfully...");

        }
}
public static void DeleteProduct(String name,int pid){
            String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("SBS");
            MongoCollection<Document> collection = database.getCollection("Cashier");
  
           
            collection.deleteOne(Filters.eq("id", pid)); 
            System.out.println("Document deleted successfully...");


        }
}
public static Product checkProduct(int id1, int qty){
            String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("SBS");
            MongoCollection<Document> collection = database.getCollection("product");
            // Create the query with "AND" operation
            Document query = new Document();
            query.append("id", id1);

        // Perform the find operation
        Document doc= collection.find(query).first();
        
        String productName = doc.getString("name");
        double productPrice = doc.getDouble("price");
        String productDescription = doc.getString("Description");
        
        Product p = new Product(id1,productName,productDescription,productPrice,qty);
        
        int currentQuantity = doc.getInteger("quantity", 0);
        int updatedQuantity = currentQuantity - qty;
        doc.put("quantity", updatedQuantity);
        collection.replaceOne(query, doc);
        System.out.println("product checked");
        return p;
        

        }

}
   public static void addProductToOrder(int orderId, Product p) {
         String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("SBS");
            MongoCollection<Document> collection = database.getCollection("Order");
       
        // Create a document representing the product
        Document productDoc = new Document("id", p.productID)
                .append("price", p.price).append("quantity",p.quantity);

        // Create the filter for the query
        Document filter = new Document("order_id", orderId);
        Document update = new Document("$push", new Document("items", productDoc));
        System.out.println("problem here?");
        
        Document result = collection.find(filter).first();
        
        if(result!=null){

                // Check if the 'items' field is an array
                Object itemsField = result.get("items");
                if (itemsField instanceof List) {
                    // Append the new item to the existing 'items' array
                    collection.updateOne(filter, update);
                    System.out.println("inserted in already existingr");

                } else {
                    // Handle the case where 'items' field is not an array
                    // Create a new 'items' array and set it in the document
                    List<Document> items = new ArrayList<>();
                    items.add(productDoc);
                    result.put("items", items);
                    collection.replaceOne(filter, result);
                   System.out.println("made new one and inserted");

                }
            }else{
            //Inserting sample records by creating documents.
            List<Document> items = new ArrayList<>();
            items.add(productDoc);
            Document doc =new Document("order_id",orderId);
            doc.append("items",items);  
            collection.insertOne(doc);
            System.out.println("documnet inserted");
        }
        
                System.out.println("Success product add to order");

    }
   }
      public static void addOrder(int orderId,String c_name,Date d,String pay_meth,String card) {
         String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("SBS");
            MongoCollection<Document> collection = database.getCollection("Order");
       
        // Create a document representing the product
                   Document update = new Document("$set", new Document("customer_name", c_name)
                    .append("order_date", d)
                    .append("payment_method", pay_meth)
                    .append("card_number", card));

        // Create the filter for the query
        Document filter = new Document("order_id", orderId);
               


        // Perform the update operation
        collection.updateOne(filter,update );
        System.out.println("added Successfully");
    }
   }
   
   

}
