package com.eugenekrylov.powermockito;

class PrivateMethodExample {

    private static final String ORIGINAL_VALUE = "original value";

    String getValuePublic() {
        return getValuePrivate();
    }

    private String getValuePrivate() {
        return ORIGINAL_VALUE;
    }
}
