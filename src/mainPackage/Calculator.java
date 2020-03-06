package mainPackage;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) throws IOException {
		int n, i;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of multiplication table: ");
		n = scan.nextInt();
		
		FileWriter arch = new FileWriter("Results.txt");
		
		PrintWriter WriteArch = new PrintWriter(arch);
		
		WriteArch.println("+------Results------+");
		
		for (i = 0; i <= 10; i++) {
			WriteArch.printf("     %d x %d = %d    \n", n, i, n*i);
		}
		
		WriteArch.println("+--------End--------+");
		
		arch.close();
		
		System.out.printf("%d times table completed successfully :D\n", n);
		
		scan.close();
 	}
}
