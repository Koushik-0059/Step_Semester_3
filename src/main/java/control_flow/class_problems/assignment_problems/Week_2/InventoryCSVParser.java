package control_flow.class_problems.assignment_problems.Week_2;

public class InventoryCSVParser {

    static void parseInventoryRecord(String csvLine) {

        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println("Product: " + fields[0]
                    + " | SKU: " + fields[1]
                    + " | Qty: " + fields[2]);
        }
    }

    public static void main(String[] args) {

        String csvLine = "Wireless Mouse,WM-2201,150";

        parseInventoryRecord(csvLine);
    }
}