package assignment1;

import java.io.IOException;
import java.io.Writer;

import java.io.File;
import java.util.List;

public interface MemberImporter {

    public List< Member > importMembers( File inputFile ) throws Exception;

}
