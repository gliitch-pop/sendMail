package com.example.sendMail.Controller;

import com.example.sendMail.Model.MailStructure;
import com.example.sendMail.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")

public class MailController {
    @Autowired
    private MailService mailService;

    @PostMapping("/send/{mail}")

    public String sendMail(@PathVariable String mail, @RequestBody MailStructure mailstructure)
    {
         mailService.sendMail(mail, mailstructure);
         return "Sucessfully sent the Mail!";
    }


}
