import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;

import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import me.fizal.MerlinBot.Bot;

public class Main {

  static Bot botInstance;

  public static void main(String[] args) throws IOException {

    try {
      botInstance = new Bot().main();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    HttpServer server = HttpServer.create(new InetSocketAddress("0.0.0.0", 8080), 0);
    server.createContext("/", new  MyController());
    server.setExecutor(null);
    server.start();
    System.out.println(" Server started on port 8080");
  }

}


class MyController implements HttpHandler {
    public void handle(HttpExchange t) throws IOException {
        InputStream is = t.getRequestBody();
        String response = "<h1>HOOOO SKUNT BAI!</h1>";
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
   }