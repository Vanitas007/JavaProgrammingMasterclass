package s11_InnerAndAbstractClassesAndInterfaces.Challenge.a150_Interfaces_Challenge;

import java.util.List;

public interface Saveable {

    List<String> write();

    void read(List<String> savedValues);
}
