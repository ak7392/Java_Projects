package Day5.jdbc;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class MongoExample {
    public static void main(String[] args) {

        MongoClient mongoClient=null;
		try {
			mongoClient = new MongoClient("localhost", 27017);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        DB database = mongoClient.getDB("learning_mongo");

        // print existing databases
       // mongoClient.getDatabaseNames().forEach(System.out::println);

       //database.createCollection("customers", null);

        // print all collections in customers database
      //database.getCollectionNames().forEach(System.out::println);

        // create data
     DBCollection collection = database.getCollection("customers");
     /*    BasicDBObject document = new BasicDBObject();
        document.put("name", "Maruthi");
        document.put("company", "SummitWorks");
        collection.insert(document);
*/
        // update data
      /* BasicDBObject query = new BasicDBObject();
        query.put("name", "Maruthi");
        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("name", "Raj");
        BasicDBObject updateObject = new BasicDBObject();
        updateObject.put("$set", newDocument);
        collection.update(query, updateObject);
        System.out.println("data has been updated");*/

        // read data
      /*BasicDBObject searchQuery = new BasicDBObject();
       // searchQuery.put("name", "Maruthi");
        DBCursor cursor = collection.find(searchQuery);
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }*/

        // delete data
        BasicDBObject deleteQuery = new BasicDBObject();
        deleteQuery.put("name", "Raj");
        collection.remove(deleteQuery);
        System.out.println("record has been remvoed");
    }
}