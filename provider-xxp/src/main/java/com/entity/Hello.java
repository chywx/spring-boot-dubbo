package com.entity;

import java.io.Serializable;
import java.util.Set;

public class Hello implements Serializable {

    private Set<String> names;

    public Set<String> getNames() {
        return names;
    }

    public void setNames(Set<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Hello{" +
            "names=" + names +
            '}';
    }
}
