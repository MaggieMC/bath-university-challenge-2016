
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
public class Main {
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public int startMenu(){
		String answer;
		do{
			answer = "";
		System.out.println("What would you like to do? Enter the appropriate number");
		System.out.println("1. Edit a web page");
		System.out.println("2. Editing report");
		System.out.println("3. Exit application");
			try{
				answer = reader.readLine();
			}
			catch(IOException E){
				System.out.println("Wrong input, please try again");
				
			}
		}
		while(!answer.equals("1") && !answer.equals("2") && !answer.equals("3"));
		return Integer.parseInt(answer);
	}
	
	private static String getUrlSource(URL newURL) throws IOException {
		 
		 URLConnection connectionURL = newURL.openConnection();
		 BufferedReader in = new BufferedReader(new InputStreamReader(
						 connectionURL.getInputStream(), "UTF-8"));
		 String inputLine;
		 StringBuilder a = new StringBuilder();
		 while ((inputLine = in.readLine()) != null)
				 a.append(inputLine);
		 in.close();

		 return a.toString();

	}
	
	public void method1(){
		URL newURL;
		do{
			newURL = null;
			try{
				System.out.println("please enter URL");
				newURL = new URL(reader.readLine());
			}
			catch(Exception E){
				
			}

		}
		while(newURL != null);
		try {
			getUrlSource(newURL);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	public void method2(){
			
		}

	public void method3(){
		
	}
	public static void main(String[] args) {
		Main main = new Main();
		switch(main.startMenu()){
		case 1:
			main.method1();
		case 2:
			main.method2();
		case 3:
			main.method3();
		}
	}

}
