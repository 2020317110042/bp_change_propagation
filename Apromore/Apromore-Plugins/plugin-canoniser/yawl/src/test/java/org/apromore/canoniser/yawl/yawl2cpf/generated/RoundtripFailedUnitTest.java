package org.apromore.canoniser.yawl.yawl2cpf.generated;

import java.io.File;

import org.apromore.canoniser.yawl.BaseYAWL2CPFUnitTest;
import org.apromore.canoniser.yawl.utils.TestUtils;

public class RoundtripFailedUnitTest extends BaseYAWL2CPFUnitTest {

    /*
     * (non-Javadoc)
     * 
     * @see org.apromore.canoniser.yawl.BaseYAWL2CPFUnitTest#getYAWLFile()
     */
    @Override
    protected File getYAWLFile() {
        return new File(TestUtils.TEST_RESOURCES_DIRECTORY + "YAWL/Roundtrip/13_AndSplitJoin.cpf.yawl");
    }

}
