package main;

import javafx.beans.property.SimpleStringProperty;

public class Faktura {
    public SimpleStringProperty id;
    public SimpleStringProperty partner;

    public Faktura(String id, String partner){
        this.id = new SimpleStringProperty(id);
        this.partner = new SimpleStringProperty(partner);

    }

    public String getId() {
        return id.get();
    }

    public SimpleStringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public void setPartner(String partner) {
        this.partner.set(partner);
    }

    public String getPartner() {
        return partner.get();
    }

    public SimpleStringProperty partnerProperty() {
        return partner;
    }
}
