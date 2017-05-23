package es.esy.williamoldham.langgen;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by william on 15/05/17.
 */
public class Main {

    public static void main(String[] args) {
//        Config config = new Config("lang.json");
//        int i = 0;
//        for (Language lang : Language.values()) {
//            if (i == 3)
//                break;
//            String path = lang.name().toLowerCase().replaceAll("_", ".");
//            config.set(path, "");
//            i++;
//        }
//        System.out.print(config.getJsonObject().toString());

        Tree<String> forest = new Tree<String>("forest");
        Tree<String> current = forest;

        for (Language lang : Language.values()) {
            Tree<String> root = current;

            String path = lang.name().toLowerCase().replaceAll("_", ".");
            for (String data : path.split("\\.")) {
                current = current.child(data);
            }

            current = root;
        }

        forest.accept(new PrintIndentedVisitor(0));

    }

}
