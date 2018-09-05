package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Student stephanieClarcksonTasks = new StephanieClarcksonTaskQueue();
        Student lindaKovalskyTasks = new LindaKovalskyTaskQueue();
        Student jessiePinkmanTasks = new JessiePinkmanTaskQueue();
        Mentor johnSmith = new Mentor ("John Smith");
        Mentor ivoneEscobar = new Mentor ("Ivone Escobar");
        stephanieClarcksonTasks.registerObserver(ivoneEscobar);
        lindaKovalskyTasks.registerObserver(johnSmith);
        jessiePinkmanTasks.registerObserver(ivoneEscobar);

        //When
        stephanieClarcksonTasks.addPost("SQL");
        lindaKovalskyTasks.addPost("Code smell");
        jessiePinkmanTasks.addPost("Spring");
        stephanieClarcksonTasks.addPost("Hibernate");
        lindaKovalskyTasks.addPost("Project patterns");

        //Then
        assertEquals(2, johnSmith.getUpdateCount());
        assertEquals(3, ivoneEscobar.getUpdateCount());
    }
}
