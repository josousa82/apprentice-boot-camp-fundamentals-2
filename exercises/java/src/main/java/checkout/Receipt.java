package checkout;

class Receipt {

    private String text = "";
    private int numberOfA = 0;
    private int numberOfB = 0;
    private int total;

    String text() {
        return text + "Total: " + total;
    }

    void scannedA() {
        text += "A: 50";

        if (++numberOfA % 3 == 0) {
            text += " - 30 (3 for 130)";
            total += 30;
        }
        else {
            total += 50;
        }
        text += "\n";
    }

    void scannedB() {
        text += "B: 30";
        if (++numberOfB % 2 == 0) {
            text += " - 15 (2 for 45)";
            total += 15;
        }
        else {
            total += 30;
        }
        text += "\n";
    }

    void scannedC() {
        text += "C: 20\n";
        total += 20;
    }

    void scannedD() {
        text += "D: 15\n";
        total += 15;
    }
}
