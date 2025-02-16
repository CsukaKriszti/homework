public class PlaneFigures {

    public static void main(String[] args) {

        String line = "*".repeat(9);
        String line2 = "*".repeat(15);
        System.out.println("Square:");
        System.out.println(line+"\n"+line+"\n"+line+"\n"+line+"\n");
        System.out.println("Rectangle:");
        System.out.println(line2+"\n"+line2+"\n"+line2+"\n"+line2+"\n");
        System.out.println("Parallelogram:");
        String parallelogram = String.format("%18s\n%17s\n%16s\n%15s\n","*".repeat(15),"*".repeat(15),"*".repeat(15),"*".repeat(15));
        System.out.println(parallelogram);
        System.out.println("Trapezium:");
        String trapezium = String.format("%12s\n%13s\n%14s\n%15s\n","*".repeat(9),"*".repeat(11),"*".repeat(13),"*".repeat(15));
        System.out.println(trapezium);
        System.out.println("Rhombus:");
        String rhombus = String.format("%7s\n%8s\n%9s\n%10s\n%11s\n%12s\n%13s\n%12s\n%11s\n%10s\n%9s\n%8s\n%7s\n","*".repeat(1),"*".repeat(3),"*".repeat(5),
                "*".repeat(7),"*".repeat(9),"*".repeat(11),"*".repeat(13),"*".repeat(11),"*".repeat(9),"*".repeat(7),
                "*".repeat(5),"*".repeat(3),"*".repeat(1));
        System.out.println(rhombus);
        System.out.println("Deltoid:");
        String deltoid = String.format("%7s\n%9s\n%11s\n%13s\n%12s\n%11s\n%10s\n%9s\n%8s\n%7s\n","*".repeat(1),"*".repeat(5),"*".repeat(9),
                "*".repeat(13),"*".repeat(11),"*".repeat(9),"*".repeat(7),
                "*".repeat(5),"*".repeat(3),"*".repeat(1));
        System.out.println(deltoid);
        System.out.println("Triangle:");
        String triangle = String.format("%6s\n%7s\n%8s\n%9s\n%10s\n%11s\n","*".repeat(1),"*".repeat(3),"*".repeat(5),
                "*".repeat(7),"*".repeat(9),"*".repeat(11));
        System.out.println(triangle);
    }
}
