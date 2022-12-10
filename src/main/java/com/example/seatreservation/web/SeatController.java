package com.example.seatreservation.web;

import com.example.seatreservation.entities.Customer;
import com.example.seatreservation.respositories.SeatRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@SessionAttributes({"a", "e"})
@Controller
@AllArgsConstructor
public class SeatController {
    @Autowired
    private SeatRepository seatRepository;

    static int num = 0;

    @GetMapping(path = "/index")
    public String seats(Model model){
        List<Customer> customers = seatRepository.findAll();
        model.addAttribute("listCustomers", customers);

        return "seats";
    }
    @GetMapping("/delete")
    public String delete(Long id){
        seatRepository.deleteById(id);
        return "redirect:/index";
    }

    @PostMapping(path="/save")
    public String save(Model model, Customer customer, BindingResult bindingResult, ModelMap mm, HttpSession session) {
        if (bindingResult.hasErrors()) { return "formCustomers";
        } else {
            seatRepository.save(customer);
            if (num == 2) {
                mm.put("e", 2);
                mm.put("a", 0);
            } else {
                mm.put("a", 1);
                mm.put("e", 0);
            }
            return "redirect:index";
        }
    }
}
