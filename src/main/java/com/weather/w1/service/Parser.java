package com.weather.w1.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;


public class Parser {
    private static Document getPage() throws IOException {
        String url = "https://rp5.ru/Погода_в_Челябинске";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getPage());
    }
}
