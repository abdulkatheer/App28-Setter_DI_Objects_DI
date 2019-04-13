package org.katheer.bean;

public class Profile {
    private String name;
    private String email;
    private String mobile;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void showProfile() {
        System.out.println(String.format("%-10s: %s\n%-10s: %s\n%-10s: %s\n%-10s:\n%s, %s\n%s,\n%s, %s,\n%s : %s",
                "Name", this.getName(), "Mobile", this.getMobile(), "Email", this.getEmail(),
                "Address", address.getDoorNo(), address.getStreet(), address.getLocality(),
                address.getDistrict(), address.getState(), "PIN", address.getPin()));
        System.out.println();
    }
}
