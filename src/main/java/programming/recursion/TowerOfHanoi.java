package programming.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		
		int numOfDisk = 4;
		moveDisk(numOfDisk, 'A' , 'B' , 'C');
		
	}

	public static void moveDisk(int disk , char start, char temp, char end) {
		
		if(disk == 1) {
			System.out.println("Move Disk " + disk + " from " + start + " to " + end);
			return;
		}
		
		moveDisk(disk -1, start, end, temp);
		System.out.println("Move Disk " + disk + " from " + start + " to " + end);
		moveDisk(disk -1, temp, start, end);
	}
}
