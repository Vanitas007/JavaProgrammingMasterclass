package s11_InnerAndAbstractClassesAndInterfaces.Exercise.e042_Interface;

import java.util.List;

public interface ISaveable {

    List<String> write();

    void read(List<String> savedValues);
}
