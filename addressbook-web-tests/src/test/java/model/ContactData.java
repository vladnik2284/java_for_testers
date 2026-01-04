package model;

public record ContactData (
        String lastName,
        String fistName,
        String address,
        String email,
        String phones
) {
    public ContactData() {this("", "", "", "", "");
    }
}

