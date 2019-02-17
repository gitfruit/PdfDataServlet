package com.app;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfServlet extends HttpServlet
{

 public void doGet(HttpServletRequest req,HttpServletResponse resp)
 {
      resp.setContentType("application/pdf");
      resp.addHeader("Content-Disposition","attachement;filename=myData.pdf");
      
         try{
       //Create Document object
     Document doc=new Document();

      //To getInstance(object) of Pdf and outputStream writes into Document
        PdfWriter.getInstance(doc,resp.getOutputStream());
       //open document
         doc.open();
        //write to document
         doc.add(new Paragraph("welcom to HomePage"));
        PdfPTable t=new PdfPTable(3);
        t.addCell("Sid");
        t.addCell("Name");     
        t.addCell("Marks");
        t.addCell("144");
        t.addCell("venkat");
        t.addCell("84"); 
        t.addCell("848");
        t.addCell("sai");
        t.addCell("94");
         doc.add(t);
        
           doc.close();
             }
       catch(Exception e)
           {
                   System.out.println(e);
           }
 }
}
  