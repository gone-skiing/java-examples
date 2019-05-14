package com.eugenekrylov.powermockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ StaticMethodExample.class })
public class StaticMethodExampleTest {
    private static final String INJECTED_VALUE = "injected value";

    @Test
    public void staticMethodOverride() {
        mockStatic(StaticMethodExample.class);
        when(StaticMethodExample.getValueStatic()).thenReturn(INJECTED_VALUE);

        StaticMethodExample obj = new StaticMethodExample();
        assertEquals("Returned value", INJECTED_VALUE, obj.getValuePublic());
    }
}