package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList
        staffList[0] = new Executive("Felix", "321 Placeholder Lane", "555-5006", "890-12-3456", 40.0);
        staffList[1] = new StaffEmployee("Bob", "456 Nowhere Court", "555-5002", "456-78-9012", 30.0);
        staffList[2] = new StaffEmployee("Carl", "789 Somewhere Avenue", "555-5003", "567-89-0123", 31.0);
        staffList[3] = new TempEmploee("David", "987 Example Boulevard", "555-5004", "678-90-1234", 32.0);
        staffList[4] = new TempEmploee("Evelyn", "654 Test Parkway", "555-5005", "789-01-2345", 28.0);
        staffList[5] = new Intern("Alice", "123 Anywhere Street", "555-5001");

        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
