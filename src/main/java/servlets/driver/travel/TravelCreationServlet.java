package servlets.driver.travel;

import authentication.AuthenticationRequired;
import beans.Car;
import managers.CarManagerInterface;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "driver-travel-creation", urlPatterns = "/driver/travels/creation")
public class TravelCreationServlet extends HttpServlet {

    @Inject
    private CarManagerInterface carManager;

    /**
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     */
    @AuthenticationRequired
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            String userName = (String) request.getSession().getAttribute("userName");
            Car[] cars = carManager.getCarsByUserName(userName);
            request.setAttribute("cars", cars);
            request.getRequestDispatcher("/driver-travel-creation.jsp").forward(request, response);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     */
    @AuthenticationRequired
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/connection.jsp").forward(request, response);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
