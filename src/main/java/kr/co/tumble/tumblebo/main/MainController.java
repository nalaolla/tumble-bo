package kr.co.tumble.tumblebo.main;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * packageName    : kr.co.tumble.tumblebo.main
 * fileName       : MainController
 * author         : DANIEL
 * date           : 2023-07-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-31        DANIEL       최초 생성
 */

@Controller
@RequiredArgsConstructor
public class MainController {

    @RequestMapping("/")
    public String getIndexPage(HttpServletRequest request, Model model) {
        return "index";
    }


    @RequestMapping("/invoice")
    public String getInvoicePage(HttpServletRequest request, Model model) {
        return "/pages/examples/invoice";
    }
}
