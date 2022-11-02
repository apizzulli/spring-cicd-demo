package com.dev.cicd.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class DataController {

        @GetMapping("/")
        public String healthCheck() {
                return "HEALTH CHECK OK!";
        }

        @GetMapping("/version")
        public String version() {
                return "The actual version is 1.0.0";
        }

        @GetMapping("/nations")
        public List<Nation> getNations() {
                List<Nation> nations = new ArrayList<Nation>();
                nations.add(new Nation("American", "Washington, D.C.", "English", "Dollar"));
                nations.add(new Nation("Canada", "Ottowa", "French", "Canadian Dollar"));
                nations.add(new Nation("Italy", "Rome", "Italian", "Euro"));
                return nations;
        }

        @GetMapping("/currencies")
        public List<String> getRandomCurrencies() {
                List<String> list = new ArrayList<>();
                list.add("Dollar");
                list.add("Candian Dollar");
                list.add("Euro");
                return list;
        }

}