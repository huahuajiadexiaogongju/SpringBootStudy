package com.example.spring_boot_websocket.controller;

import com.example.spring_boot_websocket.config.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class WebSocketController {

    @RequestMapping("/socket/push")
    public String pushMsg(HttpServletRequest request) {
        String message = request.getParameter("fuwu");
        try {
            WebSocketServer.sendInfo(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "server";
    }
}