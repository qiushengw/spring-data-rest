package net.kidzmath.springdatarest;

import javax.persistence.*;

@Embeddable
public class Customer {
    private String cifNo;
    private String name;

    public String getCifNo() {
        return cifNo;
    }

    public void setCifNo(String cifNo) {
        this.cifNo = cifNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
