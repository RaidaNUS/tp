package seedu.medinote.ui;

public class Ui {

    public static final String UI_LINE_BREAK = "===============================================" +
            "===============================================";
    private static final String MEDINOTE_ART =
            "\t··················································\n" +
            "\t: __  __            _  _  _   _         _        :\n" +
            "\t:|  \\/  |  ___   __| |(_)| \\ | |  ___  | |_  ___ :\n" +
            "\t:| |\\/| | / _ \\ / _` || ||  \\| | / _ \\ | __|/ _ \\:\n" +
            "\t:| |  | ||  __/| (_| || || |\\  || (_) || |_|  __/:\n" +
            "\t:|_|  |_| \\___| \\__,_||_||_| \\_| \\___/  \\__|\\___|:\n" +
            "\t··················································";
    private static final String WELCOME_TO_MEDINOTE =
            "\tWelcome to MediNote! Type command 'help' to see\n" +
            "\tavailable commands.";

    public static void printHelpTable() {
        String format = "%-20s | %-80s%n"; // Formatting for alignment

        System.out.println(UI_LINE_BREAK);
        System.out.printf(format, "Keyword", "Action");
        System.out.println(UI_LINE_BREAK);

        printRow("help", "Shows a list of commands for navigating the database");
        printEmptyRow();

        printRow("register", "Registers new patient with necessary details:");
        printRow("", "• <NAME>");
        printRow("", "• <SYMPTOMS>");
        printRow("", "• <TIMESTAMP>");
        printRow("", "• <MEDICAL HISTORY>");
        printRow("", "Format: register <NAME> / <SYMPTOMS> / <TIMESTAMP> / <MEDICAL HISTORY>");
        printEmptyRow();

        printRow("oncall", "Register on-call doctor(s) with necessary details:");
        printRow("", "• <NAME>");
        printRow("", "• <SPECIALISATION>");
        printRow("", "Format: oncall <NAME> / <SPECIALISATION>");
        printEmptyRow();

        printRow("patient", "Displays specific patient information such as:");
        printRow("", "• Name");
        printRow("", "• Symptoms");
        printRow("", "• Timestamp");
        printRow("", "• Medical history");
        printRow("", "• Treatment status (if any)");
        printRow("", "• Doctors assigned (if any)");
        printRow("", "Note: <NAME> inputted does not need to be case-sensitive");
        printEmptyRow();

        printRow("doctor", "Displays specific doctor information such as:");
        printRow("", "• Specialisation");
        printRow("", "• Availability");
        printRow("", "• Patients under the doctor (if any)");
        printRow("", "Note: <NAME> inputted does not need to be case-sensitive");
        printEmptyRow();

        printRow("list patient", "Displays all the patients in the patients class array that are yet to be discharged");
        printRow("list doctor", "Displays all doctors available in the hospital");
        printEmptyRow();

        printRow("update patient", "Updates corresponding patient’s information on:");
        printRow("", "• <TREATMENT STATUS> whether they are still in queue or being treated");
        printRow("", "• <DOCTOR ASSIGNED> the doctor that they are assigned");
        printEmptyRow();

        printRow("update doctor", "Updates corresponding doctor information on:");
        printRow("", "• <AVAILABILITY> their current working status");
        printRow("", "• <PATIENT NAME> the patient they are currently treating (if any)");
        printEmptyRow();

        printRow("discharge patient", "Deletes patient and corresponding information from the database.");
        printRow("delete doctor", "Deletes doctor and corresponding information from the database");
        printEmptyRow();

        printRow("clear patients", "Clears all patient entries from the database");
        printRow("clear doctors", "Clears all doctor entries from the database");
        printEmptyRow();

        printRow("exit", "Exits the program");

        System.out.println(UI_LINE_BREAK);
    }

    public static void printRow(String keyword, String action) {
        System.out.printf("%-20s | %-80s%n", keyword, action);
    }

    public static void printEmptyRow() {
        System.out.printf("%-20s | %-80s%n", "", "");
    }

    public static void printGreetings() {
        System.out.println(UI_LINE_BREAK);
        System.out.println(MEDINOTE_ART);
        System.out.println(WELCOME_TO_MEDINOTE);
        System.out.println(UI_LINE_BREAK);
    }

}
