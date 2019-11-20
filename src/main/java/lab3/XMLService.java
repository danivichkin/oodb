package lab3;

import lab3.model.WebSite;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XMLService {

        //Saving object by Website type into XML document
        public static void saveWebsiteData(WebSite webSite) throws JAXBException {
            JAXBContext jaxbContext = JAXBContext.newInstance(WebSite.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(webSite, new File("website.xml"));
        }

        //Parsing XML file into object type of Website
        public static WebSite loadWebsiteDataFromXML() throws JAXBException {
            JAXBContext jaxbContext = JAXBContext.newInstance(WebSite.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (WebSite) unmarshaller.unmarshal(new File("website.xml"));
        }
}

