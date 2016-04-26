package swe.utility;

public class PrintMessages {
 
	public static void printMsg(String str){
	 System.out.println(str);
 }
 
	public static void printWarnMsg(String str){
		 System.out.println("The warning Message is displayed:"+str);
	 }
	
 public static void printMsgEmptyLn(int lineNo){
	 for (int i =0;i<=lineNo;i++){
		 System.out.println("");
	 }
 }
	 
	 public static void printWarnMsg(int i){
		 System.out.println("The warning Message is displayed:"+String.valueOf(i));
	 }
 }

