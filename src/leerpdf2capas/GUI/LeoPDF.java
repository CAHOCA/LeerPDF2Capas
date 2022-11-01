package leerpdf2capas.GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Rectangle;
import java.awt.print.PageFormat;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
/**
 *
 * @author Carlos
 */
public class LeoPDF {
    
    public String lecturaPDF(File FF, int xx, int yy, int ancho, int alto, String pass) throws Exception
    { 
         String contenido = new String();//CONTENIDO = A LO QUE CONTENGA EL AREA O REGION
              try {
                  //JOptionPane.showMessageDialog(null, "llego la contraseña "+pass);
                  String F=FF.toString();
                  PDDocument pd = PDDocument.load(new File(F),pass); //CARGAR EL PDF
                  //System.out.println("Encripcion del archivo:"+pd.isEncrypted());
                  AccessPermission ap = new AccessPermission();
                  ap.setCanPrint(true);
                  ap.setCanExtractContent(false);
                  ap.setCanExtractForAccessibility(false);
                  PDPage doc = pd.getPage(0);  //SELECCIONA LA PAGINA 1     
                  PDFTextStripperByArea stripper = new PDFTextStripperByArea();//COMPONENTE PARA ACCESO AL TEXTO
                  Rectangle rect = new Rectangle(xx, yy, ancho, alto);//DEFNIR AREA DONDE SE BUSCARA EL TEXTO
                  stripper.addRegion("area1", rect);//REGISTRAMOS LA REGION CON UN NOMBRE
                  stripper.extractRegions(doc);//EXTRAE TEXTO DEL AREA
                  contenido=(stripper.getTextForRegion("area1"));
                  pd.close();

              } catch (IOException e) {
                  if(e.toString()!=null){
                  }
                  e.printStackTrace();
              }//CATCH
              
                return contenido;
    }//LECTURAPDF()
}
