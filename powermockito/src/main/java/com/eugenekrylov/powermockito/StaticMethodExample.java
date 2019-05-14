package com.eugenekrylov.powermockito;

public class StaticMethodExample {

    public String getValuePublic() {
        return getValueStatic();
    }

    static String getValueStatic() {
        return "original value";
    }
}
