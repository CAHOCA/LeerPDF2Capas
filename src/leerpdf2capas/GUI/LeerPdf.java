package leerpdf2capas.GUI;


import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

/***************  LECTOR DE DATOS BASICOS DEL RUT VERSIÓN BETA 2.05.20181024 ***********
 *  CODIGO CLAVE:"CAH2b"
 *  FECHA Y HORA DE COMPILACION: 24/10/2018 2:18
 *  REQUERIMIENTOS:     
 *  - FORMATO DE RUT ESTANDARIZADO DE LA DIAN, PDF DESCARGADO DIGITALMENTE (PROVISIONAL)
 *  - DOCUMENTO PDF LIBRE DE CONTRASEÑA
 *  - JDK8.0 O SUPERIOR
 *  - LIBRERIA APACHE PDFBOX 2.0.6 O SUPERIOR
 **************************************************************************************/

public class LeerPdf extends LeoPDF {
 
        
    public String[] extraccion(File archivo, String contrasenia)throws Exception{ 
        
       //DEFINICION DE LAS VARIABLES
       String[] datos = new String[13];
       LeoPDF leerPDF =new LeerPdf();
       String NIT,TipoDeDoc,NumeroDoc,FechaExp,LugarExp,Departamento,Ciudad,
       Apellidos,Nombres,Direccion,Correo,Telefono; //DEFINICIÓN DE LOS PARÁMETROS A BUSCAR
       char cad[]; //
       String TipoContribuyente=leerPDF.lecturaPDF(archivo, 26, 216, 55, 10, contrasenia);
       NIT=leerPDF.lecturaPDF(archivo, 75, 180, 121, 10, contrasenia);
       TipoDeDoc=leerPDF.lecturaPDF(archivo, 185, 216, 94, 10, contrasenia);
       NumeroDoc=leerPDF.lecturaPDF(archivo, 338, 216, 147, 10, contrasenia);
       FechaExp=leerPDF.lecturaPDF(archivo, 484, 216, 110, 10, contrasenia);
       LugarExp=leerPDF.lecturaPDF(archivo, 27, 241, 151, 10, contrasenia);
       Departamento=leerPDF.lecturaPDF(archivo, 200, 350, 121, 10, contrasenia);
       Ciudad=leerPDF.lecturaPDF(archivo, 390, 350, 151, 10, contrasenia);
       Apellidos=leerPDF.lecturaPDF(archivo, 27, 265, 255, 10, contrasenia);
       Nombres=leerPDF.lecturaPDF(archivo, 257, 265, 255, 10, contrasenia);
       Direccion=leerPDF.lecturaPDF(archivo, 27, 374, 551, 10, contrasenia);
       Correo=leerPDF.lecturaPDF(archivo, 27, 398, 251, 10, contrasenia);
       Telefono=leerPDF.lecturaPDF(archivo, 281, 398, 151, 10, contrasenia);
       cad = TipoContribuyente.toCharArray(); 
       NIT=NIT.replaceAll("\\s+","");
       NIT=NIT.replaceAll("\\n+","");
       NumeroDoc=NumeroDoc.replaceAll("\\s+","");
       NumeroDoc=NumeroDoc.replaceAll("\\n+","");
       Telefono=Telefono.replaceAll("\\s+","");
       Telefono=Telefono.replaceAll("\\n+","");
       FechaExp=FechaExp.replaceAll("\\s+","");
       FechaExp=FechaExp.replaceAll("\\n+","");
       
       TipoContribuyente=TipoContribuyente.replaceAll("\\n+","");
       TipoDeDoc=TipoDeDoc.replaceAll("\\n+","");
       LugarExp=LugarExp.replaceAll("\\n+","");
       Departamento=Departamento.replaceAll("\\n+","");
       Ciudad=Ciudad.replaceAll("\\n+","");
       Apellidos=Apellidos.replaceAll("\\n+","");
       Nombres=Nombres.replaceAll("\\n+","");
       Direccion=Direccion.replaceAll("\\n+","");
       Correo=Correo.replaceAll("\\n+","");
       
       
       datos[0]=TipoContribuyente; datos[1]=NIT; datos[2]=TipoDeDoc; datos[3]=NumeroDoc; datos[4]=FechaExp; datos[5]=LugarExp; datos[6]=Departamento; 
       datos[7]=Ciudad; datos[8]=Apellidos; datos[9]=Nombres; datos[10]=Direccion; datos[11]=Correo; datos[12]=Telefono; 
       
       if(TipoContribuyente!=null){
       switch (cad[8]){
           case 'n':

               break;
               
           case 'j':

               break;               
        }
       }//WHILE
       if(cad[8]!='n'&&cad[8]!='j'){
           JOptionPane.showMessageDialog(null,"El archivo seleccionado no corresponde al Registro Único Tributatrio\nSeleccione otro documento", "Datos erróneos", JOptionPane.ERROR_MESSAGE);
       }
       return datos;
    }
    
    public void generarTXT(String archivo,String contenido){
    
        String doctxt = archivo+".txt";
        BufferedWriter bw = null;
	FileWriter fw = null;

	try {
            fw = new FileWriter(doctxt);
            bw = new BufferedWriter(fw);
            bw.write(contenido);

            System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
    }

   
}//CLASS