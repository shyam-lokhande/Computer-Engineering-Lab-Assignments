import java.util.Scanner;

public class schedAlgo {
    static int no_of_process;
    static int proc_no[] = new int[15];
    static int burst_time[] = new int[15];

    public static void main(String args[]) {
        int choice = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of processors" + "\n");
        no_of_process = sc.nextInt();
        for (int i = 1; i <= no_of_process; i++) {
            System.out.println("Enter Process no: ");
            proc_no[i] = sc.nextInt();
            System.out.println("Enter burst time: ");
            burst_time[i] = sc.nextInt();
        }
        do {
            System.out.println(" Sheduling Algorithms" + "\n");
            System.out
                    .println("1.FCFS" + "\n" + "2.SJF" + "\n" + "3.Priority" + "\n" + "4.RR" + "\n" + "5.Exit" + "\n");
            System.out.println("enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // fcfs();
                    break;
                case 2:
                    // SJF();
                    break;
                case 3:
                    // priority();
                    break;
                case 4:
                    RR();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (choice != 6);
    }

    public static void RR() {
        int rem_bTime[] = new int[no_of_process + 1];
        int waitingTime[] = new int[no_of_process + 1];
    }
}
