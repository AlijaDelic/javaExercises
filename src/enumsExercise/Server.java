package enumsExercise;

public class Server {
	int id;
	String name;
	ServerStatus status;

	public Server(String str) {
		String[] stringArray = str.split("&");

		this.id = Integer.parseInt(stringArray[0].split("=")[1]);
		this.name = stringArray[1].split("=")[1];
		this.status = getStatus(stringArray[2].split("=")[1]);
	}
	
	private ServerStatus getStatus (String str) {
		ServerStatus status = ServerStatus.UNKNOWN;
		
		try {
			status = ServerStatus.valueOf(str.toUpperCase());
		}catch(Exception e){
			System.out.println(e);
		}
		
		return status;
	}
	
	@Override
	public String toString() {
		return ("Server id: " + this.id +
			", server name:" + this.name +
			", status:" + this.status
				);
	}

}
