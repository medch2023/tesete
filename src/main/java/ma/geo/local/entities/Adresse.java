package ma.geo.local.entities;

import javax.persistence.Embedded;

@Embedded
public class Address {
    private String rue;
    private String nim;
    private String avenue;

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }
}
