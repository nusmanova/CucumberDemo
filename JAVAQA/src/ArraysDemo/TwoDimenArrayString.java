package ArraysDemo;

public class TwoDimenArrayString {

	public static void main(String[] args) {
		
String b[][]= new String [4][2];


b[0][0]= "I am";
b[0][1]= "Roza";

b[1][0]= "You are";
b[1][1]= "Nasiba";

b[2][0]= "They are";
b[2][1]= "Kids";

b[3][0]= "We are";
b[3][1]= "Students";


String g [][]= {{"I am", "Roza"}, {"You are", "Nasiba"},{"They are", "Kids"},{"We are", "Student"} };

System.out.println(g.length);
System.out.println(g [2][1]);
		
	}

}
