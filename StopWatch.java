//13 program for stopwatch
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class StopWatch{
	long StartTime = 0,StopTime = 0, Elapsed = 0;
	
	public void start(){
		StartTime = System.currentTimeMillis();
	}
	public void stop(){
		StopTime = System.currentTimeMillis();
	}

	public long getElapsedTime(){
		Elapsed = (StopTime - StartTime);
		return Elapsed;
	}

	public static void main(String[] args){
		Utility u = new Utility();
		int st,sp;
		StopWatch w = new StopWatch();
		System.out.println("Please Choose your option:\n1. Start\n2. Stop");
		st = u.inputInteger();
		w.start();
		System.out.println("Time is Started");
		sp = u.inputInteger();
		w.stop();
		System.out.println("Elapsed Time-: "+w.getElapsedTime()+" mili Seconds");
	
	}
}
