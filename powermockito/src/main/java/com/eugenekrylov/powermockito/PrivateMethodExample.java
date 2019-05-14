package com.eugenekrylov.powermockito;

public class PrivateMethodExample {

    public String getValuePublic() {
        return getValuePrivate();
    }

    private String getValuePrivate() {
        return "original value";
    }
}
