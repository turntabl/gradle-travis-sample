package io.turntabl;

public class CustomerTO {
    private String companyName;
    private String contactName;

    public CustomerTO(String companyName, String contactName) {
        this.companyName = companyName;
        this.contactName = contactName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getContactName() {
        return contactName;
    }
}
