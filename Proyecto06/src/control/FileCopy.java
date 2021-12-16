package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void FileCopy(String sourceFile, String destinationFile) {

        try {
            File inFile = new File(sourceFile);
            File outFile = new File(destinationFile);

            FileInputStream in = new FileInputStream(inFile);
            FileOutputStream out = new FileOutputStream(outFile);

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            in.close();
            out.close();
        } catch (IOException e) {
            System.err.println("Hubo un error de entrada/salida!!!");
        }
    }

}
