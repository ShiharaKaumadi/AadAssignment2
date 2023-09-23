package lk.ijse.gdse.aad.api;

import lk.ijse.gdse.aad.service.TeachLeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.*;

@RestController
@RequestMapping("api/v1teachLead")
public class TeachLeadController extends HttpServlet {

    @Autowired
    TeachLeadService teachLeadService;

}