package Model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "entitats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Entitats {
    @XmlElement(name = "entitat")
    private List<Entitat> llistaEntitats;

    public List<Entitat> getLlistaEntitats() {
        return llistaEntitats;
    }

    public void setLlistaEntitats(List<Entitat> llistaEntitats) {
        this.llistaEntitats = llistaEntitats;
    }
}
