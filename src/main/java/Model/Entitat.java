package Model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="entitat")
@XmlAccessorType(XmlAccessType.FIELD)
public class Entitat {

    private String nom, tipus, poblacio, comarca;
    private String classificacioGeneral, classificacioEspecifica;
    private String dataInscripcio;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    public String getComarca() {
        return comarca;
    }

    public void setComarca(String comarca) {
        this.comarca = comarca;
    }

    public String getClassificacioGeneral() {
        return classificacioGeneral;
    }

    public void setClassificacioGeneral(String classificacioGeneral) {
        this.classificacioGeneral = classificacioGeneral;
    }

    public String getClassificacioEspecifica() {
        return classificacioEspecifica;
    }

    public void setClassificacioEspecifica(String classificacioEspecifica) {
        this.classificacioEspecifica = classificacioEspecifica;
    }

    public String getDataInscripcio() {
        return dataInscripcio;
    }

    public void setDataInscripcio(String dataInscripcio) {
        this.dataInscripcio = dataInscripcio;
    }

    @Override
    public String toString() {
        return "Entitat{" +
                "nomEntitat='" + nom + '\'' +
                ", tipus='" + tipus + '\'' +
                ", poblacio='" + poblacio + '\'' +
                ", comarca='" + comarca + '\'' +
                ", classificacioGeneral='" + classificacioGeneral + '\'' +
                ", classificacioEspecifica='" + classificacioEspecifica + '\'' +
                ", dataInscripcio='" + dataInscripcio + '\'' +
                '}';
    }
}
