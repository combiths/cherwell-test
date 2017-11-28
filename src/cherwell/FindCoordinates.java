package cherwell;

public class FindCoordinates {

	public static void main(String[] args) {
		if(args.length == 3){
			int x1 = Integer.parseInt(args[0].split(",")[0]);
			int y1 = Integer.parseInt(args[0].split(",")[1]);
			int x2 = Integer.parseInt(args[1].split(",")[0]);
			int y2 = Integer.parseInt(args[1].split(",")[1]);
			int x3 = Integer.parseInt(args[2].split(",")[0]);
			int y3 = Integer.parseInt(args[2].split(",")[1]);
			String result = "";
			
			if(y1 + y2 + y3 < 30){
				result = "A";
			}
			else if (y1 + y2 + y3 < 60){
				result = "B";
			}
			else if (y1 + y2 + y3 < 90){
				result = "C";
			}
			else if (y1 + y2 + y3 < 120){
				result = "D";
			}
			else if (y1 + y2 + y3 < 150){
				result = "E";
			}
			else{
				result = "F";
			}
			switch ((x1 + x2 + x3)/10){
				case 1: result = result + "1"; break;
				case 2: result = result + "2"; break;
				case 4: result = result + "3"; break;
				case 5: result = result + "4"; break;
				case 7: result = result + "5"; break;
				case 8: result = result + "6"; break;
				case 10: result = result + "7"; break;
				case 11: result = result + "8"; break;
				case 13: result = result + "9"; break;
				case 14: result = result + "10"; break;
				case 16: result = result + "11"; break;
				case 17: result = result + "12"; break;
				
			}
			System.out.println("Coordinate is: " + result);
			
		}
		else{
			System.out.println("Please try again with 3 coordinates");
		}

	}

}
