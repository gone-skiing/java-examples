package com.eugenekrylov.powermockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.spy;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ PrivateMethodExample.class })
public class PrivateMethodExampleTest {

    private static final String INJECTED_VALUE = "injected value";

    @Test
    public void privateMethodOverride() throws Exception {
        PrivateMethodExample obj = spy(new PrivateMethodExample());

        when(obj, "getValueStatic").thenReturn(INJECTED_VALUE);
        assertEquals("Returned value", INJECTED_VALUE, obj.getValuePublic());
    }
}