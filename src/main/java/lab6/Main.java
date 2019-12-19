
package lab6;

import lab6.CustomJPAAnnotationProcessor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        CustomJPAAnnotationProcessor annotationProcessor=new CustomJPAAnnotationProcessor("lab6.Entities");
        String str=annotationProcessor.builtMetaClasses().toString();
        str=str.substring(2, str.length()-1);
        System.out.println(str);
        writeToFile(str);
    }
    
    public static void writeToFile(String str){
        File file =new File("src/metaClasses.txt");
        if (!file.exists())
            try {
                file.createNewFile();
        } catch (IOException ex) {
                System.err.println("Can not create file cause:"+ex );
        }
        try(FileWriter writer=new FileWriter(file,false)){
            writer.write(str);
        } catch (IOException ex) {
            System.err.println("Can not write file cause:"+ex );
        }
    }
    
}
