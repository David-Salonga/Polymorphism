public class Main {
    public static void main(String[] args) {
            Printer print = new Printer();
            print.print(); // printing standard print
            print.print("Print in black please"); // printing ing black n white

            ColorPrinter coloredPrint = new ColorPrinter();
            coloredPrint.print(); // printing in colored print


    }


}
