package io.turntabl;

public class PrivateClient extends Client implements ContactName{

    public PrivateClient(String name, int id, ServiceLevel serviceLevel) {
        super(name, id, serviceLevel);
    }

    @Override
    public void getContactName() {

    }
}
