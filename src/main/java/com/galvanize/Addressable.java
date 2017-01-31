package com.galvanize;

import java.util.List;

/**
 * Created by gschool on 1/30/17.
 */
public interface Addressable {
    public List<Address> getAddresses();
    public void addAddress(Address address);
}
