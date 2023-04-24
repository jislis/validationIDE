package ide;

import junit.framework.TestCase;

public class IDEFinderTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testValidate() {
        String nature = "blablabla CHE-214.686.752 blablabla";
        IDEFinder finder = new IDEFinder(nature);
        finder.validate();
    }

}