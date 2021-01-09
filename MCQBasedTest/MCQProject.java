package MCQBasedTest;
import java.util.Scanner;
public class MCQProject {

	public static void main(String[] args) {
		int total=10;
		int count=0;
		int skcount=0;
		Scanner sc=new Scanner(System.in);
		String[] queArr=new String[total];
		String[] ansArr1=new String[total];
		String[] ansArr2=new String[total];
		queArr[0]="1) Which of these is a access modifier ? \n (a) public \n (b) new \n (c) int \n (d) char";
		queArr[1]="2) Which of these is not a keyword ? \n (a) public \n (b) new \n (c) super() \n (d) final";
		queArr[2]="3) Which of these is not a member of class?\n (a) object \n (b) constructors \n (c) methods  \n (d) threads";
		queArr[3]="4) ____ is used to find and fix bugs in the Java programs.\n (a) JVM \n (b) JRE \n (c) JDK \n (d) JDB";
		queArr[4]="5) What is the return type of the hashCode() method in the Object class?\n (a) Object \n (b) char \n (c) int \n (d) void";
		queArr[5]="6) Which of the following is a valid long literal? \n (a) ABH8097 \n (b) L990023 \n (c) 904423 \n (d) 0xnf029L";
		queArr[6]="7) What does the expression float a = 35 / 0 return?\n (a) Run time Exception \n (b) 0 \n (c) 35 \n (d) infinity";
		queArr[7]="8) Which of the following creates a List of 3 visible items and multiple selections abled?\n (a) new List(false, 3) \n (b) new List(3, true) \n (c) new List(true, 3) \n (d) new List(3, false)";
		queArr[8]="9) Which of the following for loop declaration is not valid?\n (a) for ( int i = 99; i >= 0; i / 9 ) \n (b) for ( int i = 7; i <= 77; i += 7 ) \n (c) for ( int i = 20; i >= 2; - -i ) \n (d) for ( int i = 2; i <= 20; i = 2* i )";
		queArr[9]="10) Which of the following is a reserved keyword in Java?\n (a) object \n (b) strictfp \n (c) main \n (d) system";
		
		ansArr1[0]="public";
		ansArr1[1]="super()";
		ansArr1[2]="threads";
		ansArr1[3]="JDB";
		ansArr1[4]="int";
		ansArr1[5]="0xnf029L";
		ansArr1[6]="infinity";
		ansArr1[7]="new List(3, true)";
		ansArr1[8]="for ( int i = 99; i >= 0; i / 9 )";
		ansArr1[9]="strictfp";
		
		ansArr2[0]="a";
		ansArr2[1]="c";
		ansArr2[2]="d";
		ansArr2[3]="d";
		ansArr2[4]="c";
		ansArr2[5]="d";
		ansArr2[6]="d";
		ansArr2[7]="b";
		ansArr2[8]="a";
		ansArr2[9]="b";
		
		for (int i = 0; i < queArr.length; i++) {
			System.out.println(queArr[i]);
			System.out.print(" Enter your Answer or skip for next Question: ");
			String ans=sc.next();
			System.out.println();
			if(ans.equals(ansArr1[i]) || ans.equals(ansArr2[i])) {
				count++;
				
			}else if(ans.equals("skip")) {
				skcount++;
				continue;				
			}
		}
		int totalatmpt=total-skcount;
		int wrong = totalatmpt-count;
		System.out.println("\n");
		System.out.println("Submitted.. Your Test is finished..");
		System.out.println("Result >>");
		System.out.println();
		System.out.println(" Descriptions                Status");
		System.out.println("---------------------------------------");
		System.out.println("Attempted Questions           "+totalatmpt);
		System.out.println("Un-Attempted Questions        "+skcount);
		System.out.println("Total Correct Answers         "+count);
		System.out.println("Total Wrong Answers           "+wrong);
		if(count>=6 && count<8) {
			System.out.println("Result                        Pass");
			System.out.println("Performance                   Good");
		}else if(count==8) {
			System.out.println("Result                        Pass");
			System.out.println("Performance                   Very Good");
		}else if(count==9) {
			System.out.println("Result                        Pass");
			System.out.println("Performance                   Excellent");
		}else if(count==10) {
			System.out.println("Result                        Pass");
			System.out.println("Performance                   OutStanding");
		}else {
			System.out.println("SORRY! you are failed, try next time..");
		}
		
		
		

	}
}
