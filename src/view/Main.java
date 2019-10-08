package view;

import controller.Controller;
import repository.MemoryRepository;
import repository.Repository;

/**
 * 7. Se da o colectie de mai multe obiecte
 * avind forme de cuburi, sfere si cilindrii.
 * Sa se afiseze obiectele avind volumul mai mare
 * decit 25cm3.
 */

public class Main
{
    public static void main(String[] args)
    {
        Repository repository = new MemoryRepository();
        Controller controller = new Controller(repository);
        //TODO View functionality goes here
    }
}
