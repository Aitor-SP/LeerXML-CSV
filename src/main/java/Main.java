import Model.Activitat;
import Model.GuiaEntitats;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

public class Main {

    public static final String PATH = "http://justicia.gencat.cat/web/.content/tramits/entitats/llistatEntitats-federacions.xml";
    public static final String PATH_CSV = "https://analisi.transparenciacatalunya.cat/resource/rhpv-yr4f.csv";

    public static void main(String[] args) {

        URL url = null;

        try {
            url = new URL(PATH_CSV);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

//        try {
//            JAXBContext contextObj = JAXBContext.newInstance(GuiaEntitats.class);
//            // Unmarshaller pasar XML a JAVA
//            Unmarshaller unmarshallerObj = contextObj.createUnmarshaller();
//
//            GuiaEntitats guiaEntitats = (GuiaEntitats) unmarshallerObj.unmarshal(url);
//
//
//            guiaEntitats.getEntitats().getLlistaEntitats().forEach(System.out::println);
//
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }

        BufferedReader in = null;
        CSVReader reader = null;

        try {
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            reader = new CSVReader(in);

        } catch (IOException e) {
            e.printStackTrace();
        }
        CsvToBean<Activitat> activitatCsvToBean = new CsvToBeanBuilder(reader)
                .withType(Activitat.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        Iterator<Activitat> csvIterator = activitatCsvToBean.iterator();
        while (csvIterator.hasNext()) {
            Activitat activitat = csvIterator.next();
            System.out.println(activitat);
        }

    }
}
