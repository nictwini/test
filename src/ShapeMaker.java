import java.util.Scanner;

public class ShapeMaker {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter the shape number (1 square, 2 triangle, 3 flipped triangle, 4 diamond: ");
    int shapeChoice = scanner.nextInt();
    System.out.print("Enter the number of lines for the size of shape: ");
    int numLines = scanner.nextInt();
    
    
    switch(shapeChoice) {
        case 1:
        	
            for(int i=1; i<=numLines; i++) {
                for(int j=1; j<=numLines; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
            break;
            
        case 2:
         
            for(int i=1; i<=numLines; i++) {
                for(int j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
           
            break;
            
        case 3:
           
            for(int i=numLines; i>=1; i--) {
                for(int j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
           
            break;
            
        case 4:
        
            int middleLine = (numLines/2) + 1;
            int starsCount = 1;
            for(int i=1; i<=numLines; i++) {
                for(int j=1; j<=Math.abs(middleLine-i); j++) {
                    System.out.print(" ");
                }
                for(int j=1; j<=starsCount; j++) {
                    System.out.print("*");
                }
                System.out.println();
                if(i < middleLine) {
                    starsCount += 2;
                } else {
                    starsCount -= 2;
                }
            }
            
        default:
            System.out.println("Invalid shape choice.");
    }
    
	}
}