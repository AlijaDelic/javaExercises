package enumsExercise;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		String str = "serverId=25&serverName=my name&serverStatus=Running";
		
		Server server = new Server(str);
		System.out.println(server.toString());
	

	}

}
