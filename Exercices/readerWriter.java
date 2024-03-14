
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readerWriter {
    public static void main(String[] args) throws IOException {
        
        //Création d'un fileReader
            String fileName = "C:/Users/julie/Desktop/JAVA/note.txt";
            File file = new File(fileName);
            FileReader filereader = new FileReader(file);

            BufferedReader reader = new BufferedReader(filereader);

            try {

                //une fonction à essayer pouvant générer une erreur
                String line = reader.readLine();

                while(line != null) {

                    //affichage de la ligne
                    System.out.println(line);

                    //lecture de la prochaine ligne
                    line = reader.readLine();
                }
            }

            catch (IOException e) {
                e.printStackTrace();
            }
          reader.close();
    }
    
    
}