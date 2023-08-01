package kr.co.tumble.bo.main;

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



    @RequestMapping({"/", "index"})
    public String getIndexPage(HttpServletRequest request, Model model) {



        return "index";
    }

    @RequestMapping({ "index2"})
    public String getIndexPage2(HttpServletRequest request, Model model) {
            return "index2";
        }

    @RequestMapping({"index3"})
    public String getIndexPage3(HttpServletRequest request, Model model) {
            return "index3";
        }


    @RequestMapping("/invoice")
    public String getInvoicePage(HttpServletRequest request, Model model) {
        return "/pages/examples/invoice";
    }
}
