package lab3;

import lab3.model.WebSite;

import javax.xml.bind.JAXBException;

public class MainLoad {
    public static void main(String[] args) throws JAXBException {
        WebSite webSite = XMLService.loadWebsiteDataFromXML();
        System.out.println(webSite);
    }
}
