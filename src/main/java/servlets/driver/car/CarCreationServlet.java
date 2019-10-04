package servlets.driver.car;

import authentication.AuthenticationRequired;
import beans.Car;
import managers.CarManagerInterface;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "driver-car-creation", urlPatterns = "/driver/cars/creation")
public class CarCreationServlet extends HttpServlet {

    @Inject
    private CarManagerInterface carManager;

    /**
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     */
    @AuthenticationRequired
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/driver-car-creation.jsp").forward(request, response);
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
            String registration = (String) request.getAttribute("registration");
            int places = (int) request.getAttribute("places");
            carManager.createCar(new Car(places, registration), (String) request.getSession().getAttribute("userName"));
            response.sendRedirect("/driver/cars");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
