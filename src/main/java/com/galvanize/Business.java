package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gschool on 1/30/17.
 */
public class Business implements Addressable{

    private final String name;
    private final ArrayList<Address> addresses;
    public Business(String name) {
        this.name = name;
        this.addresses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public void addAddress(Address address) {
        this.addresses.add(address);
    }
}
