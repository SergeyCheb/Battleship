
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !"".equals(firstName)) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null && !"".equals(lastName)) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        if ("".equals(firstName) && "".equals(lastName)) {
            return "Unknown";
        } else if ("".equals(firstName)) {
            return lastName;
        } else  if ("".equals(lastName)) {
            return firstName;
        } else {
            return firstName.concat(" ").concat(lastName);
        }
    }
}