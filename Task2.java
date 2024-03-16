import java.util.Scanner;

public class Task2{
    Scanner sc;

    int sub;
    public Task2(){
        sc = new Scanner(System.in);
        System.out.print("Enter how many subjects you have:");
        sub = sc.nextInt();
    }

    public int[] getMarks(){
        int marks[] = new int[sub];
        for(int i=0;i<sub;i++){
            System.out.print("\nEnter Marks of subject "+(i+1)+" :");
            marks[i] = sc.nextInt();
        }
        return marks;
    }

    public int average(){
        int marks[]= new int[sub];
        marks = getMarks();
        int avg = 0;
        for(int i=0;i<sub;i++){
            avg +=marks[i];
        }
        avg /= sub;
        return avg;
    }

    public void grade(){
        int avg = average();
        if(avg >97)
            System.out.println("Your grade is A+");
        else if(avg>93)
            System.out.println("Your grade is A");
        else if(avg>90)
            System.out.println("Your grade is A-");
        else if(avg>87)
            System.out.println("Your grade is B+");
        else if(avg>83)
            System.out.println("Your grade is B");
        else if(avg>80)
            System.out.println("Your grade is B-");
        else if(avg>77)
            System.out.println("Your grade is C+");
        else if(avg>73)
            System.out.println("Your grade is C");
        else if(avg>70)
            System.out.println("Your grade is C-");
        else if(avg>67)
            System.out.println("Your grade is D+");
        else if(avg>65)
            System.out.println("Your grade is D");
        else if(avg>50) 
            System.out.println("Your grade is E");
        else 
            System.out.println("Your grade is F");
    }

    public static void main(String[] args) {
        Task2 t = new Task2();
        t.grade();
    }
}