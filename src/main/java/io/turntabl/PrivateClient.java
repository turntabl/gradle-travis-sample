package io.turntabl;

public class PrivateClient extends Client {
    private String person;
    public PrivateClient(String name, String id, ServiceLevel serviceLevel) {
        super(name, id, serviceLevel);
    }

    @Override
    public String getContactName() {
        return getName();
    }


}
