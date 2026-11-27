// Write a program to find the average age from the ages collection array
public class Main
{
	public static void main(String[] args) {
		int[] ages = {34,45,32,45,65,43,23,34};
		
		float total=0;
		for(int age : ages){
		    total = total+age;
		}
		
// 		System.out.println(total);
        
        float avg = total/ages.length;
        System.out.println(avg);

        
	}
}
