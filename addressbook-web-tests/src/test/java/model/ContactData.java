package model;

public record ContactData (
        String lastName,
        String firstName,
        String address,
        String email,
        String phones
) {
    public ContactData() {this("", "", "", "", "");
    }
}

