package com.capgemini.QueueOperations;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example1 {

	public static void main(String[] args) 
	{
		Queue<Integer> q=new PriorityQueue<Integer>();
        q.add(45);
        q.add(16);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());

    }

}
