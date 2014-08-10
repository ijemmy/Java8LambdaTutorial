package com.ijemmy.Java8LambdaTutorial.example04;

import com.ijemmy.Java8LambdaTutorial.example04.IntWrapper;

public class IntWrapper {
	private int data;
	public IntWrapper(int i){
		this.data = i;
	}
	public String toString(){
		return this.data+"";
	}
	public void incr(){
		this.data++;
	}
	public int getInt(){
		return this.data;
	}
}