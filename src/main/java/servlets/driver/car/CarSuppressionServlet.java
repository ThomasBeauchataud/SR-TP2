package servlets.driver.car;

import authentication.AuthenticationRequired;
import managers.CarManagerInterface;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "driver-car-suppression", urlPatterns = "/driver/cars/suppression")
public class CarSuppressionServlet extends HttpServlet {

    @Inject
    private CarManagerInterface carManager;

    /**
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     */
    @AuthenticationRequired
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            String registration = (String) request.getAttribute("registration");
            String userName = (String) request.getSession().getAttribute("userName");
            if(carManager.isOwner(registration, userName)) {
                carManager.deleteCarByRegistration(registration);
            }
            response.sendRedirect("/driver/cars");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
