package servlets.passenger.travel;

import authentication.AuthenticationRequired;
import beans.Travel;
import managers.TravelManagerInterface;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "passenger-travel-search", urlPatterns = "/passenger/travels/search")
public class TravelSearchServlet extends HttpServlet {

    @Inject
    private TravelManagerInterface travelManager;

    /**
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     */
    @AuthenticationRequired
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            if(request.getParameter("departure") == null
                    && request.getParameter("destination") == null
                    && request.getParameter("date") == null) {
                request.getRequestDispatcher("/passenger-travel-search.jsp").forward(request, response);
            } else {
                Travel[] travels = travelManager.findTravels(
                        request.getParameter("departure"),
                        request.getParameter("destination"),
                        new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"))
                );
                request.getRequestDispatcher("/passenger-travel-search-result.jsp").forward(request, response);
            }
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
        doGet(request, response);
    }

}
