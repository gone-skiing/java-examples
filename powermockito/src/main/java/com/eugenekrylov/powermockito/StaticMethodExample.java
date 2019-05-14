package com.eugenekrylov.powermockito;

class StaticMethodExample {

    private static final String ORIGINAL_VALUE = "original value";

    String getValuePublic() {
        return getValueStatic();
    }

    static String getValueStatic() {
        return ORIGINAL_VALUE;
    }
}
