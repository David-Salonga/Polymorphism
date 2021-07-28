public class Main {
    public static void main(String[] args) {
            // printer will print colored or black n white
            Printer print = new Printer();
            print.print("Print in black please");
            print.print(true);

            // colored printer will print only colored printer
            ColorPrinter coloredPrint = new ColorPrinter();
            coloredPrint.print(); // printing in colored print


    }


}
