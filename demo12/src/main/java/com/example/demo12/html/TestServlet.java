package com.example.demo12.html;

import com.google.gson.Gson;
import com.sun.xml.ws.resources.SoapMessages;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.xml.soap.*;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "testServlet", value = "/test-servlet")
public class TestServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Book book = new Book();
        book.setName("Godfather");
        book.setPages(100);
        book.setAuthor("Mario Piuso");
        book.setType("lifeStyle");

        Gson gson = new Gson();
        String bookJson = gson.toJson(book);

        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        out.print(bookJson);
        out.flush();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
            SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();
            SOAPBody soapBody = soapEnvelope.getBody();

            SOAPElement responseElement = soapBody.addChildElement("Response");

            SOAPElement resultElement = responseElement.addChildElement("Result");

            SOAPElement detailsElement = resultElement.addChildElement("Details");

            detailsElement.addAttribute(new QName("id"), "1");

            detailsElement.setValue("Some value");

            soapMessage.saveChanges();
            resp.setContentType("text/xml;charset=UTF-8");
            soapMessage.writeTo(resp.getOutputStream());


        } catch (SOAPException e) {
            throw new RuntimeException(e);
        }

    }
}
