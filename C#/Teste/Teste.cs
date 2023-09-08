namespace Teste {
    class Program {
        static void Main(string[] args) {
            int currentAssignments = 5;

            int[] sophia = { 93, 87, 98, 95, 100 };
            int[] nicolas = { 80, 83, 82, 99, 85 };
            int[] zahirah = { 84, 96, 73, 85, 79 };
            int[] jeong = { 90, 92, 98, 100, 97 };

            int[] sum = new int[4];
            float[] score = new float[4];

            for (int i = 0; i < currentAssignments; i++) {
                sum[0] += sophia[i];
            }
            for (int i = 0; i < currentAssignments; i++) {
                sum[1] += nicolas[i];
            }
            for (int i = 0; i < currentAssignments; i++) {
                sum[2] += zahirah[i];
            }
            for (int i = 0; i < currentAssignments; i++) {
                sum[3] += jeong[i];
            }
            
            for (int i = 0; i < 4; i++) {
                score[i] = (float) sum[i]/currentAssignments;
            }

            string[] average = new string[4];

            for (int i = 0; i < 4; i++) {
                if (score[i] >= 97 && score[i] <= 100) {
                    average[i] = "A+";
                } else if (score[i] >= 93) {
                    average[i] = "A";
                } else if (score[i] >= 90) {
                    average[i] = "A-";
                } else if (score[i] >= 87) {
                    average[i] = "B+";
                } else if (score[i] >= 83) {
                    average[i] = "B";
                } else {
                    average[i] = "F";
                }
            }

            Console.WriteLine($"Student\t\tGrade\n");
            Console.WriteLine($"Sophia\t\t{score[0]}\t{average[0]}");
            Console.WriteLine($"Nicolas\t\t{score[1]}\t{average[1]}");
            Console.WriteLine($"Zahirah\t\t{score[2]}\t{average[2]}");
            Console.WriteLine($"Jeong\t\t{score[3]}\t{average[3]}");
        }
    }
}