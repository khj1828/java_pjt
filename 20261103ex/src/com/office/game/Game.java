package com.office.game;

public class Game {
	 private Bear bear;
	 private Robot robot;
	 private Airplain airplain;
	 private Dog dog;
	 private ICharactor[] iCharactors;
	 
	 
	 public Game(Bear bear, Robot robot, Airplain airplain, Dog dog) {
		this.bear = bear;
		this.robot = robot;
		this.airplain = airplain;
		this.dog = dog;
		
		iCharactors = new ICharactor[] {
				this.bear, 
				this.robot, 
				this.airplain, 
				this.dog
		};
	}



	 public void move(int x, int y) {
//		 bear.walk(x, y);
//		 robot.run(x, y);
//		 airplain.fly(x, y);
//		 dog.run(x, y);
		 
//		 bear.run(x, y);
//		 robot.run(x, y);
//		 airplain.run(x, y);
//		 dog.run(x, y);
		 
		 for (int i = 0; i < iCharactors.length; i++) {
			 iCharactors[i].run(x, y);
		 }
		
	}

}
