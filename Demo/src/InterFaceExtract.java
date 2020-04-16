import java.util.Scanner;

public class InterFaceExtract implements InterDemo{
	
	public void NameDetails() {
		String name ="VW";
		System.out.println("Name of the Company is : "+name);
	}
public String Address(String str) {	
	//System.out.println("Address of the Company is : "+str);
	return str;
}

public int DoorNum() {
	int doorNum = 123;
	System.out.println("Door Number of the Company : "+ doorNum);
	return doorNum;
}

	
}
