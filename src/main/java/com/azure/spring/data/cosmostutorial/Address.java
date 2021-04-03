// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.data.cosmostutorial;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

public class Address {
    private String street;
    private String postalcode;
    private String city;

    public Address() {}

    public Address(String street, String postalcode, String city) {
        this.street = street;
        this.postalcode = postalcode;
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("Address: %s %s %s", street, postalcode, city);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
