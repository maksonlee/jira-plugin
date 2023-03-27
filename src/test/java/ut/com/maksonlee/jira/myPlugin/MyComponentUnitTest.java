package ut.com.maksonlee.jira.myPlugin;

import org.junit.Test;
import com.maksonlee.jira.myPlugin.api.MyPluginComponent;
import com.maksonlee.jira.myPlugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}