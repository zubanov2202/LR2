package com.example.lr2;

import com.example.lr2.T1.Author;

import org.junit.Test;

public class Task1 {
    @Test
    public void TestTaskOne(){
        Author a1 = new Author("Mark Markov", "mark@gmail.com");
        System.out.println(a1);

        a1.setName("Mark");
        a1.setEmail("markBooks@gmail.com");
        System.out.println(a1);
        System.out.println("name: " + a1.getName());
        System.out.println("email: " + a1.getEmail());

    }
}
