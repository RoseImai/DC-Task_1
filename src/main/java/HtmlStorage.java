import java.io.IOException;
import java.io.PrintWriter;

public class HtmlStorage {
    public static void createID(PrintWriter output)
    {
        output.println("HTTP/1.1 200 OK");
        output.println("Content-Type: text/html; charset=utf-8");
        output.println();
        output.println("<html>");
        output.println("<head><title>New Item ID</title></head>");
        output.println("<body><p>New Item ID stored here</p></body>");
        output.println("</html>");
        output.flush();
    }

    public static void deleteID(PrintWriter output)
    {
        output.println("HTTP/1.1 200 OK");
        output.println("Content-Type: text/html; charset=utf-8");
        output.println();
        output.println("<html>");
        output.println("<head><title>Delete Item ID</title></head>");
        output.println("<body><p>ID will be deleted here</p></body>");
        output.println("</html>");
        output.flush();
    }

    public static void params(PrintWriter output)
    {
        output.println("HTTP/1.1 200 OK");
        output.println("Content-Type: text/html; charset=utf-8");
        output.println();
        output.println("<html>");
        output.println("<head><title>Function</title></head>");
        output.println("<body><p>Some function</p></body>");
        output.println("</html>");
        output.flush();
    }

    public static void defaultPage(PrintWriter output)
    {
        output.println("HTTP/1.1 200 OK");
        output.println("Content-Type: text/html; charset=utf-8");
        output.println();
        output.println("<html>");
        output.println("<head><title>Not Hello</title></head>");
        output.println("<body><p>Hello, world!</p></body>");
        output.println("</html>");
        output.flush();
    }
}
