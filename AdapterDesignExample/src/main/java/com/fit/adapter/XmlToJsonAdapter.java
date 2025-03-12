package com.fit.adapter;

import com.fit.service.XmlService;
import org.json.JSONObject;
import org.json.XML;

public class XmlToJsonAdapter implements DataAdapter {
    private XmlService xmlService;

    public XmlToJsonAdapter(XmlService xmlService) {
        this.xmlService = xmlService;
    }


    @Override
    public String convertToJson(String xmlData) {
        JSONObject json = XML.toJSONObject(xmlData);
        return json.toString();
    }

    @Override
    public String convertToXml(String jsonData) {
        JSONObject jsonObject = new JSONObject(jsonData);
        return XML.toString(jsonObject);
    }
}
