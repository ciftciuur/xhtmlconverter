import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class XhtmlConverter {
    public static void main(String[] args) {
	try {
	    System.err.println("converter started");
	    String filePath = "/home/beyaz/Desktop/xhtml/";

	    // home name refactor bean
	    addExtra("animalTypeDefinition");

	    File folder = new File(filePath);
	    File[] listOfFiles = folder.listFiles();

	    for (int i = 0; i < listOfFiles.length; i++) {
		if (listOfFiles[i].isFile()) {
		    Path path = Paths.get(filePath.concat(listOfFiles[i].getName()));
		    Charset charset = StandardCharsets.UTF_8;

		    String content = new String(Files.readAllBytes(path), charset);

		    for (RichToPrime _prime : RichToPrime.list)
			content = content.replace(_prime.getRihc(), _prime.getPrime());

		    Files.write(path, content.getBytes(charset));

		}
	    }

	    System.err.println("converter stoped");
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

    private static void addExtra(String entity) {
	if (!entity.isEmpty()) {
	    RichToPrime r1 = new RichToPrime(entity + "Home.instance", entity + "Bean.editing");
	    RichToPrime r2 = new RichToPrime("!" + entity + "Home.managed", entity + "Bean.editing.recordId==null");
	    RichToPrime r3 = new RichToPrime(entity + "Home.managed", entity + "Bean.editing.recordId!=null");
	    RichToPrime r4 = new RichToPrime(entity + "Home", entity + "Bean");
	    RichToPrime r5 = new RichToPrime(entity + "List", entity + "Bean");

	    RichToPrime.add(r1);
	    RichToPrime.add(r2);
	    RichToPrime.add(r3);
	    RichToPrime.add(r4);
	    RichToPrime.add(r5);
	}

    }
}
