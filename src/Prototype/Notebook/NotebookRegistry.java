package Prototype.Notebook;

import java.util.HashMap;
import java.util.Map;

public class NotebookRegistry {
    private Map<NotebookName, Notebook> notebooks = new HashMap<>();

    public void registerNotebook(NotebookName name, Notebook notebook){
        notebooks.put(name, notebook);
    }

    public Notebook getNotebook(NotebookName name){
        Notebook notebook = notebooks.get(name);

        if(notebook != null)
        {
            return notebook.clone();
        }
        else
        {
            return null;
        }
    }
}
