package co.edu.escuelaing.arep.sparkprimer;

import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        System.out.println("The app is starting ...!");
        get("/hello", (req, res) -> "Hello World");
    }
}
