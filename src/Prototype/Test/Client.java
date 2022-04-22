package Prototype.Test;

import Prototype.Notebook.*;

import javax.management.NotificationEmitter;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        NotebookRegistry notebookRegistry = new NotebookRegistry();

        notebookRegistry.registerNotebook(NotebookName.A4_DOTTED_120, new Notebook(PageType.A4, RuleType.PLAIN, 120));
        notebookRegistry.registerNotebook(NotebookName.A4_MATH_120, new Notebook(PageType.A4, RuleType.MATH, 120));
        notebookRegistry.registerNotebook(NotebookName.A3_RULE_120, new Notebook(PageType.A3, RuleType.RULED, 120));

        List<NotebookName> input = List.of(
                NotebookName.A4_DOTTED_120,
                NotebookName.A4_MATH_120,
                NotebookName.A3_RULE_120,
                NotebookName.A4_PLAIN_120
        );

        List<Notebook> notebooks = new ArrayList<>();

        for(NotebookName name : input) {
            Notebook prototypeNotebook = notebookRegistry.getNotebook(name);
            if(prototypeNotebook == null)
            {
                System.out.println("Notebook is not available in registry, skipping :: " + name);
                continue;
            }
            prototypeNotebook.setBackPage(new BackPage());
            prototypeNotebook.setFrontPage(new Frontpage());

            notebooks.add(prototypeNotebook);
        }
    }
}
