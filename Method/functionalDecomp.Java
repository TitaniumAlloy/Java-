        // Needed for the following programming below - splitting the functionality
        int password = 76543210;
        String speakersState;
        String lampState;
        String doorState;

        // reading the password
        System.out.println("Enter password: ");
        int passwordInput = scanner.nextInt();

        // checking if the password is correct
        if (passwordInput != password) {
            System.out.println("Incorrect password!");
        } else {
            // asking the user what they want to do
            System.out.println("Choose the object: 1 – speakers, 2 – lamp, 3 – door");
            String action = scanner.next();
            
            switch (action) {
                case "1":
                    // asking the user about speakers
                    
                    switch (speakersState) {
                        case "on":
                            // ...
                        case "off":
                            // ...
                        default:
                            // ...
                    }
                    break;
                case "2":
                    // asking the user about lights...
                case "3":
                    // asking the user about the door...
                }
        }
