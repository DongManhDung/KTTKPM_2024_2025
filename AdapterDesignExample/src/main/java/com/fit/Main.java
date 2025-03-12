package com.fit;

import com.fit.adapter.DataAdapter;
import com.fit.adapter.XmlToJsonAdapter;
import com.fit.service.JsonService;
import com.fit.service.XmlService;

public class Main {
    public static void main(String[] args) {
        XmlService xmlService = new XmlService();
        JsonService jsonService = new JsonService();

        DataAdapter adapter = new XmlToJsonAdapter(xmlService);

        String xmlData = "<user><name>John</name><age>30</age></user>";
        System.out.println("Original XML: " + xmlData);

        // Convert XML -> JSON and process
        String jsonData = adapter.convertToJson(xmlData);
        jsonService.processJson(jsonData);

        // Convert JSON -> XML
        String convertedXml = adapter.convertToXml(jsonData);
        xmlService.processXml(convertedXml);
    }
}