package servlets.authentication;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "login", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    /**
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            String casUrl = "//localhost:36878/web_war_exploded/login?service=SR-TP2";
            response.sendRedirect(casUrl);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
