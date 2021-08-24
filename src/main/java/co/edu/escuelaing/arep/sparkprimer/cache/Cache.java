package co.edu.escuelaing.arep.sparkprimer.cache;
import java.util.HashMap;

public class Cache {
    
        // of type Singleton
        private static Cache single_instance = null;
     
        // Decl;aring a variable of type String
        public HashMap<String, String> cacheContainer;
     
        // Constructor
        // Here we will be creating private constructor
        // restricted to this class itself
        private Cache()
        {
            cacheContainer = new HashMap<>();
        }
     
        // Static method
        // Static method to create instance of Singleton class
        public static Cache getInstance()
        {
            if (single_instance == null)
                single_instance = new Cache();
     
            return single_instance;
        }
}
