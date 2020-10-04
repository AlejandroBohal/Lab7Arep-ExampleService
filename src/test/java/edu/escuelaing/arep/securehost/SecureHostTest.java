package edu.escuelaing.arep.securehost;

import org.junit.Assert;
import org.junit.Test;

public class SecureHostTest {
    @Test
    public void shouldCreateHost(){
        Assert.assertEquals(SecureHost.getPort(),5001);
    }
}
