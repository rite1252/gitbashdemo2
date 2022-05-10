package com.cg.enums;

public class EnumDemo {
	public static void main(String  [] args) {
		Directions directions=Directions.NORTH;
		System.out.println(directions.name());
		System.out.println(directions.ordinal());
		
		System.out.println(directions.age + "" + directions.myName);
		directions.check();
		Directions array[] = Directions.values();
		for (int i = 0;i < array.length;i++) {
			System.out.println(array[i] + "===" + array[i].ordinal());
		}
		}
	}



/*int chArray[]  = new int[5];
chArray[1]=10;
chArray=new int[2];



System.out.print(chArray[0]);
}*/