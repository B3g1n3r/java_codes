public class letter_R{
	public static void main(String args[]){
	int i=0,j=0;
	for(i=0;i<5;i++){
		for(j=0;j<5;j++){
			if((j==1 && i==1) || (j==2 && i==1) ||(j==3 && i==1)||(j!=0 && i==3) ||(j!=0 && i==4)){
			System.out.print(" ");
			}
			else{
			System.out.print("R");
			}	
if((j==1 && i==3) ||(j==2 && i==4)){
System.out.print("R");
}
}

System.out.println(" ");

}

}
}