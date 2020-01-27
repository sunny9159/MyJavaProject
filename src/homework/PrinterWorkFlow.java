package homework;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PrinterWorkFlow {

    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.setDetails("Cannon", 100, 1, 2,
                1, 1);
        printer.pagePrinted(0);
        printer.onePagePrinted(0);
        printer.pageCount(0);
        printer.printSummary();

    }



}
