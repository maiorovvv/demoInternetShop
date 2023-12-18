package org.demointernetshop.controllers;

import lombok.RequiredArgsConstructor;
import org.demointernetshop.entity.email.EmailRequest;

import org.demointernetshop.mail.DemoInternetMailSender;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmailController {
    private final DemoInternetMailSender mailSender;

    public String sendEmail(@RequestBody EmailRequest request){
        mailSender.send(request.getTo(), request.getSubject(), request.getText());
        return  "Email sent successfully!";
    }
}
