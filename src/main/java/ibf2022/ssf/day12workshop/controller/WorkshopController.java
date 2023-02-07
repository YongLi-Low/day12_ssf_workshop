package ibf2022.ssf.day12workshop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path="/workshop")
public class WorkshopController {
    
    @GetMapping
    public String workshop() {

        return "workshop";
    }

    @PostMapping("/processNumber")
    public String processNumber(@RequestParam(name="inputNumber", defaultValue="1") Integer unit, Model model) {
        // inputNumber must follow the same name in the form in the html

        List<Integer> lstIntegers = new ArrayList<>();

        Integer loopValue = unit;
        Integer currentValue = 1;

        while (currentValue <= loopValue) {
            int result = (int) (Math.random() * 20) + 1;

            if (!lstIntegers.contains(Integer.valueOf(result))) {
                lstIntegers.add(Integer.valueOf(result));
                currentValue++;
            }
        }

        model.addAttribute("numbers", lstIntegers);

        return "workshopresult";
    }

}
