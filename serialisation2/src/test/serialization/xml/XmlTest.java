package test.serialization.xml;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.bind.JAXBException;
import test.serialization.xml.entities.Class2;

public class XmlTest {

  public static void main(String[] args) throws IOException, JAXBException {
    // Classe déclaré de manière anonyme ne peut pas être utilisé correctement par
    // certain sérialiseur
    // Class2 class2 = new Class2() {
    // {
    // setId(10);
    // setData1("data1");
    // setData2("data2");
    // }
    // };
    Class2 class2 = new Class2();
    class2.setId(10);
    class2.setData1("data1");
    class2.setData2("data2");

    // Sérialisation en Java Bean
    XMLEncoder encoder = null;
    encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("./test.xml")));
    encoder.writeObject(class2);
    encoder.close();

    FileInputStream fis = new FileInputStream("./test.xml");
    XMLDecoder decoder = new XMLDecoder(fis);
    Class2 c2Test = (Class2) decoder.readObject();
    decoder.close();
    fis.close();

    System.out.println(c2Test);
  }
}