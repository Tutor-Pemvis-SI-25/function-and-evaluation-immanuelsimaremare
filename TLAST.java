// 12S25058 - Immanuel Simaremare
// 12S25009 - Angrini Necy Sirait

import java.util.*;
import java.lang.Math;

public class TLAST {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] kodematakuliah = new String[10], matkul = new String[10], dosenpengampu = new String[10], formatnamatugas = new String[10], status = new String[10], harihinggawaktupengumpulan = new String[10], deskripsitugas = new String[10];
        int[] tingkatkesulitan = new int[10], harideadline = new int[10];
        int y, z;
        double[] prioritas = new double[10];

        z = 0;
        for (z = 0; z <= 9; z++) {
            deskripsitugas[z] = input.nextLine();
            if (deskripsitugas[z].equals("---")) {
                z = 10;
            } else {
                kodematakuliah[z] = input.nextLine();
                matkul[z] = input.nextLine();
                dosenpengampu[z] = input.nextLine();
                harihinggawaktupengumpulan[z] = input.nextLine();
                formatnamatugas[z] = input.nextLine();
                tingkatkesulitan[z] = Integer.parseInt(input.nextLine());
                harideadline[z] = Integer.parseInt(input.nextLine());
                status[z] = input.nextLine();
                prioritas[z] = tingkatkesulitan[z] * 1.0 / harideadline[z];
                if (prioritas[z] > 3) {
                    status[z] = "Penting!Anda harus mengerjakan tugas ini segera.";
                } else {
                    if (prioritas[z] >= 1.5 && prioritas[z] < 3) {
                        status[z] = "Tugas ini memiliki prioritas menengah.";
                    } else {
                        if (prioritas[z] < 1.5) {
                            status[z] = "Tugas ini relatif ringan,namun jangan tunda terlalu lama.";
                        }
                    }
                }
                y = z;
            }
        }
        for (z = y; z >= 0; z--) {
            System.out.println(" prioritas:" + toFixed(prioritas[z],2));
            System.out.println(kodematakuliah[z] + "|" + matkul[z] + "|" + dosenpengampu[z] + "|" + harihinggawaktupengumpulan[z] + "|" + formatnamatugas[z] + "|" + status[z]);
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
