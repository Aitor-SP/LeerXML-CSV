package Model;

import com.opencsv.bean.CsvBindByName;

public class Activitat {
    @CsvBindByName
    String codi;

    @CsvBindByName
    String data_fi;

    @CsvBindByName
    String data_inici;

    @CsvBindByName
    String denominaci;

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getData_fi() {
        return data_fi;
    }

    public void setData_fi(String data_fi) {
        this.data_fi = data_fi;
    }

    public String getData_inici() {
        return data_inici;
    }

    public void setData_inici(String data_inici) {
        this.data_inici = data_inici;
    }

    public String getDenominaci() {
        return denominaci;
    }

    public void setDenominaci(String denominaci) {
        this.denominaci = denominaci;
    }

    @Override
    public String toString() {
        return "Activitat{" +
                "codi='" + codi + '\'' +
                ", data_fi='" + data_fi + '\'' +
                ", data_inici='" + data_inici + '\'' +
                ", denominaci='" + denominaci + '\'' +
                '}';
    }
}
