package oversecured.ovaa.objects;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import oversecured.ovaa.utils.FileUtils;

public class DeleteFilesSerializable implements Serializable {
    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        File file = new File(in.readUTF());
        if(file.exists()) {
            FileUtils.deleteRecursive(file);
        }
    }
}
