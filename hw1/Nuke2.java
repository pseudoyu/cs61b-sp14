import java.io.*;

class Nuke2 {
	public static void main(String[] arg) throws Exception {
		
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a string:");
		System.out.flush();

		String inputLine = keyboard.readLine();
		int inputLength = inputLine.length();
		System.out.println(inputLine.substring(0, 1) + inputLine.substring(2, inputLength));
	}
}