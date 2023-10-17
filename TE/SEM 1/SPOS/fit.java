import java.util.Arrays;
import java.util.Scanner;

public class fit {
    public static void main(String[] args) {
        int Tprocesses = 0, Tblocks = 0, choice, process[] = new int[15], blocks[] = new int[15];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of processes : ");
        Tprocesses = sc.nextInt();
        System.out.println("Enter the number of processes : ");
        Tblocks = sc.nextInt();

        for (int i = 0; i < Tprocesses; i++) {
            System.out.println("Enter the size of " + i + " process");
            process[i] = sc.nextInt();
        }

        for (int i = 0; i < Tblocks; i++) {
            System.out.println("Enter the size of " + i + " block");
            blocks[i] = sc.nextInt();
        }

        System.out.println("Enter your choice :");
        System.out.print("1.First 2.Best 3.Worst 4.Next ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:// call first fit
                FirstFit(process, blocks, Tprocesses, Tblocks);
                break;
            case 2: // call best fit
                break;
            case 3:// call worst fit
                break;
            case 4:// call next fit
                break;
            default:
                break;

        }
    }

    public static void FirstFit(int[] process, int[] blocks, int Nprocesses, int Nblocks) {
        int allocation[] = new int[Nprocesses];
        Arrays.fill(allocation, -1);

        for (int i = 0; i < Nprocesses; i++) {
            for (int j = 0; j < Nblocks; j++) {
                if (blocks[j] >= process[i]) {
                    allocation[i] = j;
                    blocks[j] -= process[i];
                    break;
                }
            }
        }

        System.out.print("\nprocess No \t process size \t block No(allocated)");
        for (int i = 0; i < Nprocesses; i++) {
            System.out.print(i + 1 + "\t\t" + process[i] + "\t\t");
            if (allocation[i] != -1) {
                System.out.print(allocation[i]);
            } else {
                System.out.print("Not Allocated");
            }
        }
    }
}